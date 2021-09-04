package com;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class ProductService {
static HashMap<Integer, ProductInfo> productIdMap = getProductIdMap();// map list
public ProductService() {
super();
{
if(productIdMap == null) {
productIdMap = new HashMap<Integer, ProductInfo>();

 



ProductInfo AllenProduct = new ProductInfo(1, "-------", "--------", "jeans",
200.00, 200.00,1, "BigBazar");
ProductInfo ZoccyProduct = new ProductInfo(2, "------", "----------", "shirt",
50.00, 80.00,2, "V Mart");
ProductInfo ZaraProduct = new ProductInfo(3, "-----", "--------", "Lower",
10.00, 20.00,1, "Kolkata Bazar");
ProductInfo TommyProduct = new ProductInfo(4, "----------", "--------", "Jacket",
50.00,500.00,1, "NCM");

 
productIdMap.put(1, AllenProduct);
productIdMap.put(2, ZoccyProduct);
productIdMap.put(3, ZaraProduct);
productIdMap.put(4, TommyProduct);
}
}
}
public List<ProductInfo> getAllProductlist() {
List<ProductInfo> productlist = new ArrayList<ProductInfo>(productIdMap.values());
return productlist;
}
public ProductInfo getProduct(int id) {
ProductInfo product= productIdMap.get(id);
return product;
}
public ProductInfo addProduct(ProductInfo product) {
product.setId(getMaxId() + 1);
productIdMap.put(product.getId(), product); /// logic class
return product;
}
public ProductInfo updateProduct(ProductInfo product) {
if (product.getId() <= 0)
return null;
productIdMap.put(product.getId(), product);
return product;
}
public void deleteProduct(int id) {
productIdMap.remove(id);
}
public static HashMap<Integer, ProductInfo> getProductIdMap() {
return productIdMap;
}
public static int getMaxId() {
int max = 0;
for (int id :productIdMap.keySet()) {
if (max <= id)
max = id;
}
return max;
}
}











