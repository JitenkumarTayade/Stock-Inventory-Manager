package com.example.stockinventorymanagement;

public class EmployeeModelClass {

    Integer id;
    String pname;
    String brate;

    public EmployeeModelClass(String pname, String brate) {
        this.pname = pname;
        this.brate = brate;
    }

    public EmployeeModelClass(Integer id, String pname, String brate) {
        this.id = id;
        this.pname = pname;
        this.brate = brate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getBrate() {
        return brate;
    }

    public void setEmail(String brate) {
        this.brate = brate;
    }
}



