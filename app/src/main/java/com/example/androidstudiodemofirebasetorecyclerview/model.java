package com.example.androidstudiodemofirebasetorecyclerview;

public class model {
    String addDate,address,altMobile,balanceAmt,dpUrl,dueAmt,mobile,name,order;
    model(){

    }
    public model(String addDate, String address, String altMobile, String balanceAmt, String dpUrl, String dueAmt, String mobile, String name, String order) {
        this.addDate = addDate;
        this.address = address;
        this.altMobile = altMobile;
        this.balanceAmt = balanceAmt;
        this.dpUrl = dpUrl;
        this.dueAmt = dueAmt;
        this.mobile = mobile;
        this.name = name;
        this.order = order;
    }

    public String getAddDate() {
        return addDate;
    }

    public void setAddDate(String addDate) {
        this.addDate = addDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAltMobile() {
        return altMobile;
    }

    public void setAltMobile(String altMobile) {
        this.altMobile = altMobile;
    }

    public String getBalanceAmt() {
        return balanceAmt;
    }

    public void setBalanceAmt(String balanceAmt) {
        this.balanceAmt = balanceAmt;
    }

    public String getDpUrl() {
        return dpUrl;
    }

    public void setDpUrl(String dpUrl) {
        this.dpUrl = dpUrl;
    }

    public String getDueAmt() {
        return dueAmt;
    }

    public void setDueAmt(String dueAmt) {
        this.dueAmt = dueAmt;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
