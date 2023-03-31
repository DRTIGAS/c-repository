package Controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/thiago/exemplo")

public class Controller {

        @GetMapping(value = "/{nome}")
                public String exemplo(@PathVariable("nome") String nome){

            return "Teste" + nome;

        }
    }