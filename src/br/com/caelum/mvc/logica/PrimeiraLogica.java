package br.com.caelum.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Essa � a primeira l�gica de servlet.
 * � usada para testes da interface <b>Logica</b>.
 * Retorna uma simples <i>string</i> da p�gina JSP que ser� executada a l�gica.
 * @author Rafael
 * @see Logica
 *
 */
public class PrimeiraLogica implements Logica {

	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("Executando a primeira l�gica...");
		System.out.println("Retornando o nome da p�gina JSP...");
		return "primeira-logica.jsp";
	}

}
