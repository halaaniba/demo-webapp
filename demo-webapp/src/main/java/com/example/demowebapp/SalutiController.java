package com.example.demowebapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.OffsetDateTime;
import java.time.format.DateTimeParseException;


@RestController
@RequestMapping("/v1/")
public class SalutiController {

    @GetMapping("ciao")
    public String saluta(@RequestParam(value = "nome", required = false) String nome, @RequestParam(value = "provincia", required = true) String provincia) {
        return "Ciao " + nome + ", com'è il tempo in " + provincia + "?";

    }

    @GetMapping("saluti")
    public User saluti(@RequestParam(value = "nome", required = false) String nome,
                       @RequestParam(value = "provincia", required = true) String provincia,
                       @RequestParam(value = "dataDiNascita",required = false)String dataDiNascita) {

        if (nome == null) {
            return new User();
        } else {
            String saluto = "Ciao " + nome + ", com'è il tempo a " + provincia + "?";
            User user = new User(nome, provincia, saluto,convertStringToDate(dataDiNascita));
            return user;
        }
    }
        private OffsetDateTime convertStringToDate(String dataDiNascita) {
            try {
                OffsetDateTime dDN = OffsetDateTime.parse(dataDiNascita);
                return dDN;
            } catch (DateTimeParseException exception) {
                System.out.println("inserisci correttamente la data di nascita");
                return null;
            }
        }

    }
