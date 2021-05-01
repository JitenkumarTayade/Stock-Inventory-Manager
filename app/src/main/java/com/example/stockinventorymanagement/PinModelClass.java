package com.example.stockinventorymanagement;

public class PinModelClass {


    Integer id;
    String date;
    String pnames;
    String transtype;
    String cs;
    String q;


    public PinModelClass( String date,String pnames,String transtype,String cs,String q) {
        this.date = date;
        this.pnames = pnames;
        this.transtype=transtype;
        this.cs=cs;
        this.q=q;
    }

    public PinModelClass(Integer id,String date,String pnames,String transtype,String cs,String q) {
        this.id = id;
        this.date = date;
        this.pnames = pnames;
        this.transtype=transtype;
        this.cs=cs;
        this.q=q;
    }

    public PinModelClass(String stringDate, String stringTranstype, String stringCs, String stringQ) {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPnames() {
        return pnames;
    }

    public void setPnames(String pnames) {
        this.pnames = pnames;
    }
    public String getTranstype() {
        return transtype;
    }

    public void setTranstype(String transtype) {
        this.transtype = transtype;
    }
    public String getCs() {
        return cs;
    }

    public void setCs(String cs) {
        this.cs = cs;
    }
    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }
}
