package treinamento.loja_virtual.loja_virtual;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.web.context.WebApplicationContext;
import treinamento.loja_virtual.loja_virtual.controller.AcessoController;
import treinamento.loja_virtual.loja_virtual.model.Acesso;
import treinamento.loja_virtual.loja_virtual.model.PessoaJuridica;
import treinamento.loja_virtual.loja_virtual.repository.AcessoRepository;
import treinamento.loja_virtual.loja_virtual.repository.PessoaJuridicaRepository;
import treinamento.loja_virtual.loja_virtual.service.AcessoService;

@SpringBootTest( classes = LojaVirtualApplication.class )
class LojaVirtualApplicationTests {


	@Autowired
	private AcessoController acessoController;

	@Autowired
	private PessoaJuridicaRepository pessoaJuridicaRepository;

	@Autowired
	private WebApplicationContext wac;
	/*Teste do end-point de salvar*/
	@Test
	public void testCadastroAcesso() {

		PessoaJuridica pj = new PessoaJuridica();
		pj.setNome("Empresa de Artesanato");
		pj.setCategoria("Artesanato");
		pj.setCnpj("ssssssss");
		pj.setInscEstadual("sssssssss");
		pj.setNomeFantasia("Artesanato sssssss");
		pj.setInscMunicipal("sssssss");
		pj.setRazaoSocial("ssssss");
		pj.setEmail("artesantao@gmail.com");
		pj.setTelefone("(19)99121236");
		pj.setTipoPessoa("PJ");
		pessoaJuridicaRepository.save(pj);


		Acesso acesso = new Acesso();
		acesso.setDescricao("ROLE_ADMIN");
		acesso.setEmpresa( pj );
		acessoController.salvarAcesso( acesso );
	}



}
