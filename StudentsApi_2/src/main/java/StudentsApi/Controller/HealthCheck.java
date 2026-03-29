package StudentsApi.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HealthCheck {
    @GetMapping("/")
    public String Health(){
        return "perfect!!";
    }
}
