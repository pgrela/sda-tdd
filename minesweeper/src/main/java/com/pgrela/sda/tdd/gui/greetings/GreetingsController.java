package com.pgrela.sda.tdd.gui.greetings;

import com.pgrela.sda.tdd.gui.greetings.model.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Map;

@Controller
public class GreetingsController {
    private Greeting greeting;

    public GreetingsController(Greeting greeting) {
        this.greeting = greeting;
    }

    @GetMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("welcomeText", "Hi there!");
        model.put("displayWelcomeText", true);
        model.put("greeting", greeting);
        model.put("items", new String[]{"one", "two", "three", "four"});
        return "welcome";
    }

    @PostMapping("/")
    public RedirectView echo(@RequestParam Map<String,String> allRequestParams) {
        greeting.setCity(allRequestParams.get("city"));
        greeting.setName(allRequestParams.get("name"));
        return new RedirectView("/");
    }
}

