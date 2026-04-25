package Pratik.StudentApi_5.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
    @GetMapping("/")
    public String checkHealth(){
        return "Everything is ok";
    }
}
