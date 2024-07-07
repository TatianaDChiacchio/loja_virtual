package treinamento.loja_virtual.loja_virtual.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import treinamento.loja_virtual.loja_virtual.model.Acesso;
import treinamento.loja_virtual.loja_virtual.repository.AcessoRepository;

@Service
public class AcessoService {

    @Autowired
    private AcessoRepository acessoRepository;

    public Acesso save(Acesso acesso){
        return acessoRepository.save( acesso );
    }


}
