package noob.noob.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.HealthEndpoint;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class GenericController {
    
    @Autowired
    HealthEndpoint health;
    
    @GetMapping
    public ResponseEntity<Object> getGreeting() {
        return new ResponseEntity<>("Wubba Lubba Dub Dub!", HttpStatus.GONE);
    }
    
    @GetMapping("/actuator/health")
    public ResponseEntity<Object> getHealth() {
        return new ResponseEntity<>(health.health(), HttpStatus.OK);
    }
}
