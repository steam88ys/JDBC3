package kr.hs.study.JDBC3.dao;

import kr.hs.study.JDBC3.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDAOImpl implements ProductDAO{
    @Autowired
    private JdbcTemplate jdbc;

    @Override
    public void insert(ProductDTO dto) {
        String sql = "insert into product values(?,?)";
        jdbc.update(sql, dto.getProduct_id(), dto.getProduct_name());
    }

    @Override
    public List<ProductDTO> listAll() {
        String sql = "select * from product order by product_id desc";
        List<ProductDTO> list = jdbc.query(sql, new BeanPropertyRowMapper<>(ProductDTO.class));
        return list;
    }

    @Override
    public void del_Product(String id) {
        String sql = "delete from product where product_id="+id;
        jdbc.update(sql);
    }
}
