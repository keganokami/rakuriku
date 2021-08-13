package com.rakuriku.rakuriku.controller;

import java.util.List;

import com.rakuriku.rakuriku.entities.NameEntity;
import com.rakuriku.rakuriku.service.NameService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IndexController {
    @Autowired private NameService service; // ←追加

    @RequestMapping({ "/", "/index" })
    public ModelAndView get(ModelAndView mav) {
        mav.addObject("names", service.getAll()); // ←追加
        mav.setViewName("index");
        return mav;
    }

    @GetMapping("/test")
    public List<NameEntity> getMethodName(@RequestParam(value = "id") String id) {
        System.out.println(id);
        return service.getAll();
    }
    
}
