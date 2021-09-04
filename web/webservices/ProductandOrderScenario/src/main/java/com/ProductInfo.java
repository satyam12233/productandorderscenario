package com;

public class ProductInfo {

private Integer id;
private String userid;
private String title;
private String type;
private Double price;
private Double discount;
private Integer quantity;
private String vendor;

public ProductInfo() {
super();
}
public ProductInfo(Integer id, String userid,String title,String type,Double price,Double discount,Integer quantity,String ventor) {
super();
this.id = id;
this.userid =userid;
this.title=title;
this.type =type;
this.price= price;
this.discount= discount;
this.quantity=quantity;
this.vendor=vendor;
}
// id
public Integer getId() {
return id;
}

 

public void setId(Integer id) {
this.id = id;
}

 

public String getUserid() {
return userid;
}

 

public void setUserid(String userid) {
this.userid = userid;
}

 
// title
public String getTitle() {
return title;
}

 

public void setTitle(String title) {
this.title = title;
}

 

public String getType() {
return type;
}

 

public void setType(String type) {
this.type = type;
}

 
// price
public Double getPrice() {
return price;
}

 

public void setPrice(Double price) {
this.price = price;
}

 //discount

public Double getDiscount() {
return discount;
}

 

public void setDiscount(Double discount) {
this.discount = discount;
}

 //quantity

public Integer getQuantity() {
return quantity;
}

 

public void setQuantity(Integer quantity) {
this.quantity = quantity;
}

 // vendor

public String getVendor() {
return vendor;
}

 

public void setVendor(String vendor) {
this.vendor = vendor;
}

}
















