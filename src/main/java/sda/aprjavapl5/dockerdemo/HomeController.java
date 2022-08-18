package sda.aprjavapl5.dockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class HomeController {

    @GetMapping("/")
    public Response get(){
        return Response.builder().message("Aktualny czas").time(LocalDateTime.now()).build();
    }
}
