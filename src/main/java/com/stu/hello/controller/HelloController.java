package com.stu.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by pc on 2018/11/14.
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value = "/doPost",method = RequestMethod.POST)
    public String doPost(Integer id){
        System.out.println("doPost:"+id);
        return "success";
    }
    @RequestMapping(value = "/doDelete/{id}",method = RequestMethod.DELETE)
    public String doDelete(@PathVariable(value = "id") Integer id){
        System.out.println("doDelete:"+id);
        return "success";
    }
    @RequestMapping(value = "/doPut/{id}",method = RequestMethod.PUT)
    public String doPut(@PathVariable(value = "id") Integer id){
        System.out.println("doPut:"+id);
        return "success";
    }
    @RequestMapping(value = "/doGet/{id}",method = RequestMethod.GET)
    public String doGet(@PathVariable(value = "id") Integer id){
        System.out.println("doGet:"+id);
        return "success";
    }


    /**
     * @PathVariable可以将url中的占位符映射到参数列表中
     * @param id
     * @return
     */
    @RequestMapping("/testPathVariable/{id}")
    public String testPathVariable(@PathVariable(value = "id") Integer id){
        System.out.println(id);
        return "success";
    }

    /**
     * 测试requestMapping param属性
     * @return
     */
    @RequestMapping(value = "/testParam",params = {"userName","age!=10"})
    public String testParam(String userName,Integer age){
        System.out.println(userName+":"+age);
        return "success";
    }

    /**
     * 测试requestMapping method属性
     * @return
     */
    @RequestMapping(value = "/testMethod",method = RequestMethod.POST)
    public String testMethod(){
        System.out.println("testMethod...");
        return "success";
    }

    @RequestMapping("/sayHello")
    public String sayHello(){
        System.out.println("hello world...");
        return "success";
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        System.out.println("modelandview...");
        return new ModelAndView("success");
    }
}
