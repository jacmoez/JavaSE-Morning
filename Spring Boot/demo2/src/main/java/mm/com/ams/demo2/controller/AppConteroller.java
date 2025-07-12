package mm.com.ams.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppConteroller {

    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/error")
    public String error(){
        return "error";
    }
}
