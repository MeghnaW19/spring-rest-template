package com.stackroute.commander.test.domain;

public class UnofficialSummary {
    private String total;

    private String recovered;

    private String active;

    private String source;

    private String deaths;

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getRecovered() {
        return recovered;
    }

    public void setRecovered(String recovered) {
        this.recovered = recovered;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDeaths() {
        return deaths;
    }

    public void setDeaths(String deaths) {
        this.deaths = deaths;
    }

    @Override
    public String toString() {
        return "ClassPojo [total = " + total + ", recovered = " + recovered + ", active = " + active + ", source = " + source + ", deaths = " + deaths + "]";
    }
}