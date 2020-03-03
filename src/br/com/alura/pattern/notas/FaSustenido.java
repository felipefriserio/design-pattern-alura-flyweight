package br.com.alura.pattern.notas;

import br.com.alura.pattern.interfaces.Nota;

public class FaSustenido implements Nota {

	@Override
	public String simbolo() {
		return "F#";
	}
}