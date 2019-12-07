package br.com.roberto.enviadordeinformacoes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

	@Autowired
	JavaMailSender mailSender;

	@Override
	public boolean enviarEmail() {

		SimpleMailMessage mensagem = new SimpleMailMessage();
		mensagem.setTo("carlosmedeiroslima@gmail.com");
		mensagem.setSubject("Teste de Envio de Email via Spring Boot");
		mensagem.setText("Mensagem Gerada Pela Minha App Spring Boot");
		mensagem.setFrom("carlosmedeiroslima1981@gmail.com");

		try {
			mailSender.send(mensagem);
			return true;
		} catch (Exception e) {
			throw new RuntimeException("Erro ao Enviar Email =>" + e);

		}

	}
}
