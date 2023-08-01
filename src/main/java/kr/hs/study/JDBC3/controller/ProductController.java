package kr.hs.study.JDBC3.controller;

import kr.hs.study.JDBC3.dto.ProductDTO;
import kr.hs.study.JDBC3.service.ProductService;
import kr.hs.study.JDBC3.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping("/")
    public String list(Model model) {
        List<ProductDTO> list = service.listAll();
        model.addAttribute("list1", list);
        return "list";
    }

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
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") String id) {
        service.del_Product(id);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String update_form(@PathVariable("id") String id, Model model) {
        // select로 내용 가져오기
        System.out.println(service.readOne(id));
        ProductDTO dto = service.readOne(id);
        model.addAttribute("dto", dto);
        return "update_form";
    }
//
//    @PostMapping("/update_form")
//    public String update_done() {
//        return "update_done";
//    }
}
