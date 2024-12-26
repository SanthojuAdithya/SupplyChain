package com.wecp.progressive.entity;

public class Supplier implements Comparable<Supplier> {
int supplierId;
String supplierName;
String contactEmail;
String contactPhone;
String address;
public Supplier() {
}
public Supplier(int supplierId, String supplierName, String contactEmail, String contactPhone, String address) {
    this.supplierId = supplierId;
    this.supplierName = supplierName;
    this.contactEmail = contactEmail;
    this.contactPhone = contactPhone;
    this.address = address;
}
public int getSupplierId() {
    return supplierId;
}
public void setSupplierId(int supplierId) {
    this.supplierId = supplierId;
}
public String getSupplierName() {
    return supplierName;
}
public void setSupplierName(String supplierName) {
    this.supplierName = supplierName;
}
public String getContactEmail() {
    return contactEmail;
}
public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
}
public String getContactPhone() {
    return contactPhone;
}
public void setContactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
}
public String getAddress() {
    return address;
}
public void setAddress(String address) {
    this.address = address;
}
@Override
public int compareTo(Supplier o) {
    return this.getSupplierName().compareTo(o.getSupplierName());
}





}