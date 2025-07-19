package mm.com.ams.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/todos")
public class TodoController {
    
    @GetMapping()
    public String all(){
        return "/todos/all";
    }
  

    @GetMapping("add")
    public String add(){
        return "/todos/add";
    }

    @PostMapping("add")
    public String create(){
        return "redirect:/todos";
    }

    @GetMapping("edit/{id}")
    public String update(@PathVariable int id){
        return "todos/edit";
    }

    @GetMapping("drop/{id}")
    public String drop(@PathVariable int id){
       System.out.println("Delete is: " + id);
        return "todos";
    }
}
