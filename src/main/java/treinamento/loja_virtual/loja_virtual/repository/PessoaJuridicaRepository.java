package treinamento.loja_virtual.loja_virtual.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import treinamento.loja_virtual.loja_virtual.model.Acesso;
import treinamento.loja_virtual.loja_virtual.model.PessoaJuridica;

@Repository
@Transactional
public interface PessoaJuridicaRepository extends JpaRepository<PessoaJuridica, Long> {
}
