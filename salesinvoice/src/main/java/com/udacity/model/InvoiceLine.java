
package com.udacity.model;

/**
 *
 * @author https://github.com/gellanyhassan0/sales_invoice_generator
 */
public class InvoiceLine {
    private String itemName;
    private double itemPrice;
    private int itemCount;
    private InvoiceHeader headers;

    public InvoiceLine(String itemName, double itemPrice, int itemCount, InvoiceHeader headers) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemCount = itemCount;
        this.headers = headers;
    }
    

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public InvoiceHeader getHeaders() {
        return headers;
    }

    public void setHeaders(InvoiceHeader headers) {
        this.headers = headers;
    }

    @Override
    public String toString() {
        return "InvoiceLine{" + "itemName=" + itemName + ", itemPrice=" + itemPrice + ", itemCount=" + itemCount + '}';
    }
    
    public double getlineTotal() {
        return itemCount * itemPrice;
    }
}