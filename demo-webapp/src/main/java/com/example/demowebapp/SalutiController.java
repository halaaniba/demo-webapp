package com.example.demowebapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1/")
public class SalutiController {

    @GetMapping("ciao")
    public String saluta(@RequestParam(value = "nome",required = false) String nome, @RequestParam (value = "provincia",required = true)String provincia) {
     return"Ciao " + nome + ", com'è il tempo in " + provincia + "?";

    }

    @GetMapping("saluti")
        public String saluti(@RequestParam(value = "nome",required = false) String nome, @RequestParam (value = "provincia",required = true)String provincia) {
        if(nome==null){
            return "hai dimenticato il nome";
        }else{
            String saluto ="Ciao " + nome + ", com'è il tempo a " + provincia + "?";
            User user = new User(nome,provincia,saluto);
            return user.toString();
        }

    }
}
