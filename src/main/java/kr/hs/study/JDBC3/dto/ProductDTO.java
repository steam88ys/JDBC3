package kr.hs.study.JDBC3.dto;

import lombok.Data;

@Data
public class ProductDTO {
    private String product_id;
    private String product_name;

    public String getProduct_id() {
        return product_id;
    }

    public String getProduct_name() {
        return product_name;
    }
}
