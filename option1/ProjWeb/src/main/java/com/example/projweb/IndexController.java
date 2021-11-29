package com.example.projweb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * created by @author Lingzhi Ma.
 * email: lingzhim@andrew.cmu.edu
 * andrewId: lingzhim
 */
@RestController
public class IndexController {
    @RequestMapping(value = "/index")
    public ModelAndView indexPage() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        return mv;
    }

    @Value("${ip.option1}")
    private String option1;
    @Value("${ip.option2}")
    private String option2;
    @Value("${ip.option3}")
    private String option3;
    @Value("${ip.option4}")
    private String option4;

    @PostMapping(value = "/cmd")
    public ModelAndView jump(@RequestParam("command") String input) {
        System.out.println(input);
        ModelAndView mv = new ModelAndView();
        // hadoop
        if (input.equals("1")) {
            mv.setViewName("redirect:" + option1);
        } else if (input.equals("2")) {
            mv.setViewName("redirect:"+option2);
        } else if (input.equals("3")) {
            mv.setViewName("redirect:"+option3);
        } else if (input.equals("4")) {
            mv.setViewName("redirect:"+option4);
        } else {
            mv.setViewName("notfound");
        }

        return mv;
    }
}
