package org.statics;

import java.util.Optional;

import static org.statics.Constant.PRODUCT_NOT_FOUND;

public class PrdService {

    public static void main(String[] args) {
        Prd product =new Prd(1,null);

        Optional.ofNullable(product.prdName).orElseThrow(
                ()->new RuntimeException(PRODUCT_NOT_FOUND)
        );
    }
}
