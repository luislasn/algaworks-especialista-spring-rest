package com.algaworks.algafood.jpa.permissao;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import com.algaworks.algafood.domain.model.Permissao;
import com.algaworks.algafood.domain.repository.PermissaoRepository;
import com.algaworks.algafood.AlgafoodApiApplication;

public class InclusaoPermissaoMain {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		PermissaoRepository permissaoRepository = applicationContext.getBean(PermissaoRepository.class);
		
		Permissao permissao1 = new Permissao();
		permissao1.setNome("CONSULTAR_RESTAURANTES");
		permissao1.setDescricao("Permite consultar restaurantes");
		
		Permissao permissao2 = new Permissao();
		permissao2.setNome("EDITAR_RESTAURANTES");
		permissao2.setDescricao("Permite editar restaurantes");
		
		permissao1 = permissaoRepository.save(permissao1);
		permissao2 = permissaoRepository.save(permissao2);
		
		System.out.printf("%d - %s\n", permissao1.getId(), permissao1.getDescricao(), permissao1.getDescricao());
		System.out.printf("%d - %s\n", permissao2.getId(), permissao2.getDescricao(), permissao2.getDescricao());
	}

}
