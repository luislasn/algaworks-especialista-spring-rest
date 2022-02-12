package com.algaworks.algafood.jpa.estado;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.algaworks.algafood.domain.model.Estado;
import com.algaworks.algafood.domain.repository.EstadoRepository;
import com.algaworks.algafood.AlgafoodApiApplication;

public class InclusaoEstadoMain {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		EstadoRepository estadoRepository = applicationContext.getBean(EstadoRepository.class);
		
		Estado estado1 = new Estado();
		estado1.setNome("Pernambuco");
		
		Estado estado2 = new Estado();
		estado2.setNome("Paraíba");
		
		estado1 = estadoRepository.save(estado1);
		estado2 = estadoRepository.save(estado2);
		
		System.out.printf("%d - %s\n", estado1.getId(), estado1.getNome());
		System.out.printf("%d - %s\n", estado2.getId(), estado2.getNome());
	}

}
