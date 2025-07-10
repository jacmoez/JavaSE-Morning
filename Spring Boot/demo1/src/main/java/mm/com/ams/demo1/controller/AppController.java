package mm.com.ams.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
    
    @GetMapping("error")
    public String error(){
        return "error.html";
    }
}
