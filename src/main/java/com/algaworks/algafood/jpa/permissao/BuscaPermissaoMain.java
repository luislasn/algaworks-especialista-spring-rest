package com.algaworks.algafood.jpa.permissao;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.AlgafoodApiApplication;
import com.algaworks.algafood.domain.exception.PermissaoNaoEncontradoException;
import com.algaworks.algafood.domain.model.Permissao;
import com.algaworks.algafood.domain.repository.PermissaoRepository;

public class BuscaPermissaoMain {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		PermissaoRepository permissaoRepository = applicationContext.getBean(PermissaoRepository.class);
		
		Permissao permissao = permissaoRepository.findById(1L)
				.orElseThrow(() -> new PermissaoNaoEncontradoException(1L));
		
		System.out.println(permissao.getDescricao());
	}

}
