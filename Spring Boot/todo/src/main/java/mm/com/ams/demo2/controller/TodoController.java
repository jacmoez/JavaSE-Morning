package mm.com.ams.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todos")
public class TodoController {
    
    @GetMapping("/all")
    public String all(){
        return "/todos/all";
    }

    @GetMapping("/add")
    public String add(){
        return "/todos/add";
    }
}
