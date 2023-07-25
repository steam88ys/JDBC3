package kr.hs.study.JDBC3.controller;

import kr.hs.study.JDBC3.dto.ProductDTO;
import kr.hs.study.JDBC3.service.ProductService;
import kr.hs.study.JDBC3.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping("/add")
    public String add_form() {
        return "add_form";
    }

    @PostMapping("/add_done")
    public String add_done(@ModelAttribute ProductDTO dto) {
        // 사용자가 입력한 값을 DTO에 자동주입함
        // 자동으로 멤버변수에 setter메서드 이용해서 들어가게됨
        System.out.println("id: "+dto.getProduct_id());
        System.out.println("name: "+dto.getProduct_name());
        service.insert(dto);
        return "result";
    }
}
