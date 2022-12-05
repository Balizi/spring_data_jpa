package com.example.controller;

import com.example.model.Product;
import com.example.service.ProductService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;


    @GetMapping(value = "/" ,produces = "application/json")
    public ModelAndView home(HttpServletRequest request){
        ModelAndView mv = new ModelAndView("/index");
        List<Product> listProduits = productService.getAllProduct();
        mv.addObject("listProduit",listProduits);
        request.setAttribute("listProduit",listProduits);
        System.out.println("hello");
        for (Product p:listProduits) {
            System.out.println(p.toString());
        }
        return mv;
    }


    @GetMapping("/new")
    public String addProduct(Map<String, Object> model){
        model.put("product",new Product());
        return "addProduct";
    }

    @PostMapping(path = "/save")
    public String Save(@ModelAttribute("product") Product product){
        productService.save(product);
        return "redirect:/";
    }


    @GetMapping("/edit")
    public ModelAndView editProduct(@RequestParam Long id){
        ModelAndView mv = new ModelAndView("/editProduct");
        Product product = productService.getProduct(id);
        mv.addObject("product",product);
        return mv;
    }

    @GetMapping("/delete")
    public String deleteProduct(@RequestParam Long id){
        productService.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/search")
    public ModelAndView search(HttpServletRequest request, @RequestParam(defaultValue = "0") Long id){
        ModelAndView mv = new ModelAndView("search");
        List<Product> productList = productService.getPro(id);
        mv.addObject("result",productList);
        request.setAttribute("productList",productList);
        return mv;
    }


}
