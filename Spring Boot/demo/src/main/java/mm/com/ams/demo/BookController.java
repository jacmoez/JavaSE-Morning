package mm.com.ams.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books")
public class BookController {
    
    @RequestMapping("/all")
    public String allBook(){
        return "all.html";
    }

    @RequestMapping("/single")
    public String singleBook(){
        return "single.html";
    }

    @GetMapping("/bytype")
    public String byTypeBook(){
        return "bytype.html";
    }

    @GetMapping("/byauthour")
    public String byAuthourBook(){
        return "byauthour.html";
    }
}
