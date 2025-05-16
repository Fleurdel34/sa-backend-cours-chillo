package tech.chilo.sa.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "test")
public class TestController {

    /*attention revoir le pom jpa et database mis en commentaire pour les tests*/

    @GetMapping
    public List<String> getList(){
        return List.of("Chaine de caractère", "transmise par SA");
    }

    @GetMapping(path ="string")
    public String getString(){
        return "Chaine de caractère transmise par SA";
    }


}
