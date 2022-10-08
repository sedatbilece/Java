package org.example;

public class Product {

  final private int productId;//define in line  or define in ctor

    final static  int categoryId=12;//static not used in ctor
    public Product(int id) {
        productId = id;
    }

    public int getProductId() {
        return productId;
    }

    public static void main(String[] args) {

        Product product=new Product(9);
      // product.productId=12;
        System.out.println(product.productId);
    }
}
