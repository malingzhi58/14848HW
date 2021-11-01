package com.example.projweb;

import org.springframework.web.bind.annotation.RequestMapping;
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
}
