package com.pi.controller;

import com.pi.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")
@ResponseBody
public class TestController {

    @Autowired
    private TestMapper testMapper;

    @GetMapping("/hallo")
    public ModelAndView getHelloWorld(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }
    @GetMapping("/test")
    public List<Map<String,Object>> test(){
        return testMapper.test();
    }
}
