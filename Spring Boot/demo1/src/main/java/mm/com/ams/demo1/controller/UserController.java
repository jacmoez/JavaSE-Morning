package mm.com.ams.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/users")
public class UserController {
    
    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("msg", "မဂ်လာပါ ကြိုဆိုပါ၏။");
        return "/users/login";
    }

    @PostMapping("/detail")
    public String detail(@RequestParam String email, @RequestParam String password){
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        return "/users/detail";
    }
}
