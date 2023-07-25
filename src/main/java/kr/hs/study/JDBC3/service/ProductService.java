package kr.hs.study.JDBC3.service;

import kr.hs.study.JDBC3.dto.ProductDTO;

public interface ProductService {
    //insert
    public void insert(ProductDTO dto);
    //dto의 멤버변수에 들어있는 값을 데이터베이스의 product테이블에 추가하는 메서드
}
