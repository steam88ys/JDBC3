package kr.hs.study.JDBC3.service;

import kr.hs.study.JDBC3.dao.ProductDAO;
import kr.hs.study.JDBC3.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductDAO dao;

    @Override
    public void insert(ProductDTO dto) {
        dao.insert(dto);
    }
}
