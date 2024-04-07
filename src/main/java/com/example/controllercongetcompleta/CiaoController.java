package com.example.controllercongetcompleta;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class CiaoController {
    @RequestMapping(method = RequestMethod.GET, path = "/ciao/{regione}")

    public com.example.controllerqueryparameter.User ciao(
            @PathVariable(value = "regione", required = true) String regione,
            @RequestParam(value = "nome", required = true) String nome) {
        String saluto = "Ciao " + nome + ", com'è il tempo in" + regione + "?";
        com.example.controllerqueryparameter.User user = new com.example.controllerqueryparameter.User(nome, regione, saluto);
        return user;
    }
}