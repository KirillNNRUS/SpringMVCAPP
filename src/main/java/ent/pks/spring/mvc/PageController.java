package ent.pks.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalTime;

@Controller

public class PageController {
    @GetMapping("/page")
    public String handleRequest(Model model) {
        model.addAttribute("msg", "A message from the controller");
        model.addAttribute("time", LocalTime.now());
        return "page";
    }
}
