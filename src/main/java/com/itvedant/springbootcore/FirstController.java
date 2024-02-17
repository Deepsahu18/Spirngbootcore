package com.itvedant.springbootcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itvedant.Student.Student;




@Controller
public class FirstController {

    @Autowired
    Student s;

    @Autowired
     Employee e;
    
    @RequestMapping("/")
    public String home() {
        System.out.println("Home Method Called");
        s.print();
        e.getSalary();
        return "homepage.html";
    }
    
    @RequestMapping("/about")
    public String about(){
        System.out.println("About method called");
        return "aboutus.html";
    }  

    public String contactUS(){
        return null;
    }
}
