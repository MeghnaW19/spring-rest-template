package com.stackroute.commander.test.domain;

public class CovidStat {
    private String lastRefreshed;

    private Data data;

    private String success;

    private String lastOriginUpdate;

    public String getLastRefreshed() {
        return lastRefreshed;
    }

    public void setLastRefreshed(String lastRefreshed) {
        this.lastRefreshed = lastRefreshed;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getLastOriginUpdate() {
        return lastOriginUpdate;
    }

    public void setLastOriginUpdate(String lastOriginUpdate) {
        this.lastOriginUpdate = lastOriginUpdate;
    }

    @Override
    public String toString() {
        return "ClassPojo [lastRefreshed = " + lastRefreshed + ", data = " + data + ", success = " + success + ", lastOriginUpdate = " + lastOriginUpdate + "]";
    }
}
