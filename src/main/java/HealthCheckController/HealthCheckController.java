package HealthCheckController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apigateway")
public class HealthCheckController {

    public void createUser() {
      System.out.print("Health Check Running");
    }
}