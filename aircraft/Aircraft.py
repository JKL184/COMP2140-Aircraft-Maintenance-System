import Imp

class Aircraft:
    def __init__(self, airdict,compdict,compodict,opdict):
        self._summ = airdict
        self._components = compdict
        self._operations = opdict
        self._componentso = compodict
        self.update()


    def update(self):
        self._make = self._summ["Aircraft Make"]
        self._model = self._summ["Model"]
        self._serial_no = self._summ["Serial #"]
        self._registration_no = self._summ["Registration #"]
        self._dop = self._summ["Date made"]
        self._tach = self._summ["Tach"]
        self._hobbs = self._summ["Hobbs adjust"]

    def get_info(self,var):
        if var == "Components":
            return self._components
        elif var == "Operations":
            return self._operations
        elif var == "Componentso":
            return self._componentso
        elif var in list(self._summ.keys()):
            return self._summ[var]
        return None

    def update_air_info(self,id,info):
        if id in self._summ:
            self._summ[id] = info
            self.update()

    def update_comp_info(self,compid,id,info):
        if compid in list(self._components.keys()):
            self._components[compid].update_info(id,info)
            return True
        else:
            return False
        pass

    def update_compo_info(self,compoid,id,info):
        if compoid in list(self._componentso.keys()):
            self._componentso[compoid].update_info(id,info)
            return True
        else:
            return False
        pass

    def update_operation_info(self,opid,id,info):
        if opid in list(self._operations.keys()):
            self._operations[opid].update_info(id,info)
            return True
        else:
            return False

    def add_component(self,component):
        if component.getinfo("Item") not in list(self._components.keys()):
            self._components[component.getinfo("Item")] = component
        else:
            print(f"Are you sure you would like to override the information for {component.getinfo('Item')}?")

    def add_operation(self,operation):
        if operation.getinfo("Inspection") not in list(self._operations.keys()):
            self._operations[operation.getinfo("Inspection")] = operation
        else:
            print(f"Are you sure you would like to override the information for {operation.getinfo('Inspection')}?")
