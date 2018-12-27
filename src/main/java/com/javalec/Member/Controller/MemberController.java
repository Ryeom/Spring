package com.javalec.Member.Controller;

import com.javalec.Member.DTO.MemberDTO;
import com.javalec.Member.Service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

    @Autowired
    MemberService service;

    @RequestMapping(value = "/")
    public String test(Model model){

        MemberDTO m = new MemberDTO();
        m = service.test();
        if(m!=null) {

            model.addAttribute("test",m);
        }else if(m==null) {
            System.out.println("놉");
        }
        System.out.println("이게안나옴?");

        return "index";
    }
}
