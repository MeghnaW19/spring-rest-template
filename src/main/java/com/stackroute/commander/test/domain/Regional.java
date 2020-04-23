package com.stackroute.commander.test.domain;

public class Regional {
    private String loc;

    private String discharged;

    private String confirmedCasesForeign;

    private String confirmedCasesIndian;

    private String deaths;

    private String totalConfirmed;

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getDischarged() {
        return discharged;
    }

    public void setDischarged(String discharged) {
        this.discharged = discharged;
    }

    public String getConfirmedCasesForeign() {
        return confirmedCasesForeign;
    }

    public void setConfirmedCasesForeign(String confirmedCasesForeign) {
        this.confirmedCasesForeign = confirmedCasesForeign;
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

    public String getTotalConfirmed() {
        return totalConfirmed;
    }

    public void setTotalConfirmed(String totalConfirmed) {
        this.totalConfirmed = totalConfirmed;
    }

    @Override
    public String toString() {
        return "ClassPojo [loc = " + loc + ", discharged = " + discharged + ", confirmedCasesForeign = " + confirmedCasesForeign + ", confirmedCasesIndian = " + confirmedCasesIndian + ", deaths = " + deaths + ", totalConfirmed = " + totalConfirmed + "]";
    }
}
