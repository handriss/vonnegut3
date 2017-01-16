package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        System.out.println("valami");
        return "login";
    }

    @GetMapping("/")
    public String renderIndex() {
        System.out.println("valami");
        return "index";
    }


    @PostMapping("/login")
    public String getLoginData(@ModelAttribute Login login) {
        return "result";

    }
}