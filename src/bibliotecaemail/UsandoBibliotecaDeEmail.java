package bibliotecaemail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class UsandoBibliotecaDeEmail {

	public static void main(String[] args) throws EmailException{
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("cursologica.algaworks", "!@#$%qwert"));
		email.setSSLOnConnect(true);
		email.setFrom("ramonrodsouza@gmail.com");
		email.setSubject("Curso de Logica com JAVA");
		email.setMsg("Estudando Logica de programacao com JAVA pela AlgaWOrkd");
		email.addTo("ramonrodsouza@gmail.com");
		email.send();
		
		System.out.println("Fim...");
		
		
	}
	
	
//	Configurações alteradas de porta e host
//	O método enviar da classe Carteiro deve ficar como segue:
//
//		static void enviar(String para, String assunto, String msg) throws EmailException {
//			String username = "";
//			String password = "";
//
//			Email email = new SimpleEmail();
//			email.setHostName("smtp.office365.com");
//			email.setSmtpPort(587);
//			email.setAuthenticator(new DefaultAuthenticator(username, password));
//			email.setFrom(username);
//			email.setSubject(assunto);
//			email.setMsg(msg);
//			email.addTo(para);
//			email.setStartTLSEnabled(true);
//			email.send();
//		}

}
