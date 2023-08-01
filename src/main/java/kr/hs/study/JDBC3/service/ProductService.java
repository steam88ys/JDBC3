package kr.hs.study.JDBC3.service;

import kr.hs.study.JDBC3.dto.ProductDTO;

import java.util.List;

public interface ProductService {
    //insert
    public void insert(ProductDTO dto);
    //dto의 멤버변수에 들어있는 값을 데이터베이스의 product테이블에 추가하는 메서드
    // select
    public List<ProductDTO> listAll();

    public void del_Product(String id);

    // 1개만 select하는 메서드
    public ProductDTO readOne(String id);
}
