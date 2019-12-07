package br.com.roberto.enviadordeinformacoes.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.roberto.enviadordeinformacoes.service.EmailServiceImpl;

@RestController
@RequestMapping("api/email")
public class EmailResource {
	
	@Autowired
	EmailServiceImpl emailService;
	
	@GetMapping
	public String enviarEmail() {
		boolean enviouEmail = emailService.enviarEmail();
		return enviouEmail ? "O Email foi Enviado com Sucesso" : "O Email Não foi Enviado"; 
	}

}
