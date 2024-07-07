package treinamento.loja_virtual.loja_virtual.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import treinamento.loja_virtual.loja_virtual.model.Acesso;
import treinamento.loja_virtual.loja_virtual.service.AcessoService;

@Controller
public class AcessoController {

    @Autowired
    private AcessoService acessoService;

    @PostMapping("/salvarAcesso")
    public Acesso salvarAcesso( Acesso acesso){
        return acessoService.save( acesso );
    }
}
