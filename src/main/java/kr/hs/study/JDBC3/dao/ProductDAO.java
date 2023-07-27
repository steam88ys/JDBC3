package kr.hs.study.JDBC3.dao;

import kr.hs.study.JDBC3.dto.ProductDTO;

import java.util.List;

public interface ProductDAO {
    // insert
    public void insert(ProductDTO dto);
    // select
    public List<ProductDTO> listAll();

    public void del_Product(String id);
}
