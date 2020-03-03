package br.com.alura.pattern.notas;

import br.com.alura.pattern.interfaces.Nota;

public class ReSustenido implements Nota {

	@Override
	public String simbolo() {
		return "D#";
	}
}