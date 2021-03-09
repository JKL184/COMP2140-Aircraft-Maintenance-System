class Operation:
    def __init__(self,opdict):
        self._summ = opdict
        self.update()



    def update(self):
        self._id = self._summ["Inspection"]
        self._freq = self._summ["Frequency"]
        self._hours = self._summ["Hours"]
        self._months = self._summ["Months"]
        self._years = self._summ["Years"]
        self._HCW = self._summ["HCW"]
        self._DCW = self._summ["DCW"]
        self._C_Tach = self._summ["C_Tach"]
        self._NDH = self._summ["NDH"]
        self._NDD = self._summ["NDD"]
        self._T_Rem = self._summ["T_rem"]
        self.note = self._summ["Note"]

    def get_info(self,var):
        return self._summ[var]


    def update_info(self,id,info):
        if id in list(self._summ.keys()):
            self._summ[id] = info
            self.update()

    def toString(self):
        return self._summ
    # def get_id(self):
    #     return self._id
    #
    # def get_freq(self):
    #     return self._freq
    #
    # def get_hours(self):
    #     return self._hours
    #
    # def get_months(self):
    #     return self._months
    #
    # def get_year(self):
    #     return self._years
    #
    # def get_HCW(self):
    #     return self._HCW
    #
    # def get_DCW(self):
    #     return self._DCW
    #
    # def get_c_Tach(self):
    #     return self._C_Tach
    #
    # def get_NDH(self):
    #     return self._NDH
    #
    # def get_NDD(self):
    #     return self._NDD
    #
    # def get_T_Rem(self):
    #     return self._T_Rem
    #
    # def get_note(self):
    #     return self.get_note()