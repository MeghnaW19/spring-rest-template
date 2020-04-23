package com.stackroute.commander.test.domain;

public class Summary {
    private String total;

    private String confirmedButLocationUnidentified;

    private String confirmedCasesForeign;

    private String discharged;

    private String confirmedCasesIndian;

    private String deaths;

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getConfirmedButLocationUnidentified() {
        return confirmedButLocationUnidentified;
    }

    public void setConfirmedButLocationUnidentified(String confirmedButLocationUnidentified) {
        this.confirmedButLocationUnidentified = confirmedButLocationUnidentified;
    }

    public String getConfirmedCasesForeign() {
        return confirmedCasesForeign;
    }

    public void setConfirmedCasesForeign(String confirmedCasesForeign) {
        this.confirmedCasesForeign = confirmedCasesForeign;
    }

    public String getDischarged() {
        return discharged;
    }

    public void setDischarged(String discharged) {
        this.discharged = discharged;
    }

    public String getConfirmedCasesIndian() {
        return confirmedCasesIndian;
    }

    public void setConfirmedCasesIndian(String confirmedCasesIndian) {
        this.confirmedCasesIndian = confirmedCasesIndian;
    }

    public String getDeaths() {
        return deaths;
    }

    public void setDeaths(String deaths) {
        this.deaths = deaths;
    }

    @Override
    public String toString() {
        return "ClassPojo [total = " + total + ", confirmedButLocationUnidentified = " + confirmedButLocationUnidentified + ", confirmedCasesForeign = " + confirmedCasesForeign + ", discharged = " + discharged + ", confirmedCasesIndian = " + confirmedCasesIndian + ", deaths = " + deaths + "]";
    }
}