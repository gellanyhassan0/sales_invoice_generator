
package com.udacity.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author https://github.com/gellanyhassan0/sales_invoice_generator
 */
public class InvoiceHeader {
    private int invnumLBL;
    private String customernameTF;
    private Date invdateTF;
    private ArrayList<InvoiceLine> lines; 
    
    
    

    public InvoiceHeader(int invnumLBL, String customernameTF, Date invdateTF) {
        this.invnumLBL = invnumLBL;
        this.customernameTF = customernameTF;
        this.invdateTF = invdateTF;
        this.lines = new ArrayList<>(); //eager creation
    }

    public Date getInvdateTF() {
        return invdateTF;
    }

    public void setInvdateTF(Date invdateTF) {
        this.invdateTF = invdateTF;
    }

    public int getInvnumLBL() {
        return invnumLBL;
    }

    public void setInvnumLBL(int invnumLBL) {
        this.invnumLBL = invnumLBL;
    }

    public String getCustomernameTF() {
        return customernameTF;
    }

    public void setCustomernameTF(String customernameTF) {
        this.customernameTF = customernameTF;
    }

    @Override
    public String toString() {
        return "InvoiceHeader{" + "invnumLBL=" + invnumLBL + ", customernameTF=" + customernameTF + ", invdateTF=" + invdateTF + '}';
    }

    public ArrayList<InvoiceLine> getLines() {
        return lines;
    }

    public void setLines(ArrayList<InvoiceLine> lines) {
        this.lines = lines;
    }

    public double getInvtotalLBL() {
        return 0.0;
    }

    
    public void addInvoiceLine(InvoiceLine lines) {
        getLines().add(lines);
    }
   
    
  
    
}