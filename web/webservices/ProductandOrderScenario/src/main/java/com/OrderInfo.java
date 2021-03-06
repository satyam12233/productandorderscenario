package com;

public class OrderInfo {
private Integer id;
private String userid;
private String sessionid;
private String token;
private Double itemdiscount;
private Double tax;
private Integer quantity;
private Double total;
private String promo;
private Double Grandtotal;

public OrderInfo() {
super();
}


public OrderInfo(Integer id, String userid,String sessionid,String token,Integer quantity,Double itemdiscount,Double tax,Double total,Double Grandtotal,String promo) {
super();
this.id = id;
this.userid =userid;
this.sessionid =sessionid;
this.token=token;
this.quantity = quantity;
this.total=total;
this.itemdiscount=itemdiscount;
this.quantity=quantity;
this.promo=promo;
this.tax=tax;
this.Grandtotal=Grandtotal;
}
//id
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

 
// session id
public String getSessionid() {
return sessionid;
}

 

public void setSessionid(String sessionid) {
this.sessionid = sessionid;
}

 
// token id
public String getToken() {
return token;
}

 

public void setToken(String token) {
this.token = token;
}

 
// discount
public Double getItemdiscount() {
return itemdiscount;
}

 

public void setItemdiscount(Double itemdiscount) {
this.itemdiscount = itemdiscount;
}

 
// tax
public Double getTax() {
return tax;
}

 

public void setTax(Double tax) {
this.tax = tax;
}

 // quantity

public Integer getQuantity() {
return quantity;
}

 

public void setQuantity(Integer quantity) {
this.quantity = quantity;
}

 // total

public Double getTotal() {
return total;
}

 

public void setTotal(Double total) {
this.total = total;
}

 
// Promo
public String getPromo() {
return promo;
}

 

public void setPromo(String promo) {
this.promo = promo;
}

 // grand total

public Double getGrandtotal() {
return Grandtotal;
}

 

public void setGrandtotal(Double grandtotal) {
Grandtotal = grandtotal;
}
}

