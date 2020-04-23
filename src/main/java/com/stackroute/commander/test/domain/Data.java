package com.stackroute.commander.test.domain;

public class Data {
    private Summary summary;

    private UnofficialSummary[] unofficialSummary;

    private Regional[] regional;

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    public UnofficialSummary[] getUnofficialSummary() {
        return unofficialSummary;
    }

    public void setUnofficialSummary(UnofficialSummary[] unofficialSummary) {
        this.unofficialSummary = unofficialSummary;
    }

    public Regional[] getRegional() {
        return regional;
    }

    public void setRegional(Regional[] regional) {
        this.regional = regional;
    }

    @Override
    public String toString() {
        return "ClassPojo [summary = " + summary + ", unofficial-summary = " + unofficialSummary + ", regional = " + regional + "]";
    }
}

