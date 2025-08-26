package br.com.apirest.apirest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api")
public class SampleRestController {
    
    @GetMapping("/greeting")
    public String getGreeting() {
        return "Hello, World!";
    }

    @PostMapping("echo")
    public String echoMessage(@RequestBody String message) {
        
        return "You sent: " + message;
    }


    
    
}
