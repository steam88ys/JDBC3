package kr.hs.study.JDBC3.dao;

import kr.hs.study.JDBC3.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAOImpl implements ProductDAO{
    @Autowired
    private JdbcTemplate jdbc;

    @Override
    public void insert(ProductDTO dto) {
        String sql = "insert into product values(?,?)";
        jdbc.update(sql, dto.getProduct_id(), dto.getProduct_name());
    }
}
