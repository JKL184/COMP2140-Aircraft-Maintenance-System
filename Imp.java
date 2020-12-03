import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Imp {
    public HashMap<String, String> Aircraft_info = new HashMap<String, String>();
    public HashMap<String, HashMap<String, String>> Operations = new HashMap<String, HashMap<String, String>>();
    public HashMap<String, HashMap<String, String>> Components = new HashMap<String, HashMap<String, String>>();


    public Imp(String File_location){
        try {
            String[] validSheets = {"Aircraft Information", "Operations", "Component Maintenance Record"};
            FileInputStream file = new FileInputStream(new File(File_location));
            Workbook workbook = new XSSFWorkbook(file);

            int sheets = workbook.getNumberOfSheets();
            for(int i = 0; i < sheets; i++){
                Sheet sheet = workbook.getSheetAt(i);
                if(Arrays.asList(validSheets).contains(sheet.getSheetName())){
                    int rows = sheet.getPhysicalNumberOfRows();
                    System.out.println(sheet.getSheetName() + " Has " + rows + " rows");
                    switch (sheet.getSheetName()){
                        case "Aircraft Information":
                            iAircraft(sheet);
                            break;
                        case "Operations":
                            iOperations(sheet);
                            break;
                        case "Component Maintenance Record":
                            iComponent(sheet);

                    }
                }
            }
            workbook.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }



    private String cellinfo(Cell cell){
        try{
            if(cell.getCellType() == CellType.FORMULA){
                switch(cell.getCachedFormulaResultType()) {
                    case BOOLEAN:
                        return Boolean.toString(cell.getBooleanCellValue());
                    case NUMERIC:
                        return Double.toString(cell.getNumericCellValue());
                    case STRING:
                        return(cell.getStringCellValue());
                }
            }else{
                switch(cell.getCellType()){
                    case BOOLEAN:
                        return Boolean.toString(cell.getBooleanCellValue());
                    case NUMERIC:
                        return Double.toString(cell.getNumericCellValue());
                    case STRING:
                        return(cell.getStringCellValue());
                }
            }
            return "";
        }catch(Exception e){
            return "";
        }

    }

    private void iAircraft(Sheet sheet) {

        Iterator<Row> rowIterator = sheet.iterator();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            Iterator<Cell> cellIterator = row.iterator();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                switch(cellinfo(cell)){
                    case "Aircraft Make":
                        Aircraft_info.put(cellinfo(cell), cellinfo(row.getCell(cell.getColumnIndex() + 1)));
                        break;
                    case "Model":
                        Aircraft_info.put(cellinfo(cell), cellinfo(row.getCell(cell.getColumnIndex() + 1)));
                        break;
                    case "Serial #":
                        Aircraft_info.put(cellinfo(cell), cellinfo(row.getCell(cell.getColumnIndex() + 1)));
                        break;
                    case "Registration #":
                        Aircraft_info.put(cellinfo(cell), cellinfo(row.getCell(cell.getColumnIndex() + 1)));
                        break;
                    case "Date Made":
                        Aircraft_info.put(cellinfo(cell), cellinfo(row.getCell(cell.getColumnIndex() + 1)));
                        break;
                    case "Hobbs adjust":
                        Aircraft_info.put(cellinfo(cell), cellinfo(row.getCell(cell.getColumnIndex() + 1)));
                        break;
                    case "Tach":
                        Aircraft_info.put(cellinfo(cell), cellinfo(row.getCell(cell.getColumnIndex() + 1)));
                        break;
                    case "Hobbs":
                        Aircraft_info.put(cellinfo(cell), cellinfo(row.getCell(cell.getColumnIndex() + 1)));
                        break;
                    case "Next Inspection":
                        Aircraft_info.put(cellinfo(cell), cellinfo(row.getCell(cell.getColumnIndex() + 1)));
                        break;
                    case "Propeller T.T.":
                        Aircraft_info.put(cellinfo(cell), cellinfo(row.getCell(cell.getColumnIndex() + 1)));
                        break;
                    case "Prop.  SMOH":
                        Aircraft_info.put(cellinfo(cell), cellinfo(row.getCell(cell.getColumnIndex() + 1)));
                        break;
                    case "NEXT INSP DUE":
                        Aircraft_info.put(cellinfo(cell), cellinfo(row.getCell(cell.getColumnIndex() + 1)));
                        break;
                    case "Engine T.T.":
                        Aircraft_info.put(cellinfo(cell), cellinfo(row.getCell(cell.getColumnIndex() + 1)));
                        break;
                    case "Eng. SMOH":
                        Aircraft_info.put(cellinfo(cell), cellinfo(row.getCell(cell.getColumnIndex() + 1)));
                        break;
                    case "Time Remtaining To Next Insp.":
                        Aircraft_info.put(cellinfo(cell), cellinfo(row.getCell(cell.getColumnIndex() + 1)));
                        break;
                }
            }

        }
    }

    private void iOperations(Sheet sheet) {
        String[] keys = {"Inspection", "Frequency", "Hours", "Years", "Months", "HCW", "DCW", "C_Tach", "NDH", "NDD", "T_rem", "Note"};
        ArrayList<HashMap<String, String>> opHashes = new ArrayList<HashMap<String, String>>();
        Iterator<Row> rowIterator = sheet.iterator();
        int con = 0;
        int oh = 0;
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            Iterator<Cell> cellIterator = row.iterator();
            con = 0;
            HashMap<String, String> Operation_nfo = new HashMap<String, String>();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                if(row.getRowNum() > 4 && !(cellinfo(row.getCell(0)).equals("")) && con < keys.length){
                    if(cell.getColumnIndex() != 0){
                        Operation_nfo.put(keys[con], cellinfo(cell));
                        opHashes.add(Operation_nfo);

                    }
                }
                con++;
            }
            if(row.getRowNum() > 4 && !(cellinfo(row.getCell(0)).equals(""))){
                Operations.put(cellinfo(row.getCell(0)), opHashes.get(oh));

                oh++;
            }
        }
    }

    private void iComponent(Sheet sheet) {
        String[] keys = {"Item", "P_No", "S_No", "Date", "RY", "RM", "RH", "RO", "Tot_I", "Past_T", "Comp_cycle", "Date_CW", "T_Remove","Sched_Remove", "T_RemH", "T_remD" };
        ArrayList<HashMap<String, String>> opHashes = new ArrayList<HashMap<String, String>>();
        Iterator<Row> rowIterator = sheet.iterator();
        int con = 0;
        int oh = 0;
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            Iterator<Cell> cellIterator = row.iterator();
            con = 1;
            HashMap<String, String> Comp_nfo = new HashMap<String, String>();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                if(row.getRowNum() > 3 && row.getRowNum() != 16 && !(cellinfo(row.getCell(0)).equals("")) && con < keys.length){
                    if(cell.getColumnIndex() != 0){
                        Comp_nfo.put(keys[con], cellinfo(cell));
                        con++;
                    }

                }
            }
            if(row.getRowNum() > 3 && row.getRowNum() != 16 && !(cellinfo(row.getCell(0)).equals(""))){
                Components.put(cellinfo(row.getCell(0)), Comp_nfo);
            }
        }
        System.out.println(Components);
    }
}
