package br.com.caelum.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Interface que modela l�gica de todos servlet.
 * Utilizado por Gera��o de classes l�gicas dos servlet.
 * @author Rafael
 *
 */
public interface Logica {
	String executa(HttpServletRequest request,HttpServletResponse response) throws Exception;
}
