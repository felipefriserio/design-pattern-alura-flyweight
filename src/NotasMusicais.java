import br.com.alura.pattern.interfaces.Nota;
import br.com.alura.pattern.notas.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public class NotasMusicais {

    private static Map<String, Nota> notas = new HashMap<String, Nota>();
    private static List<Class<? extends Nota>> clazzes;

    static {
         clazzes = (List<Class<? extends Nota>>) Arrays.asList(
                    Do.class, DoSustenido.class, Re.class,ReSustenido.class, Mi.class,MiSustenido.class, Fa.class, FaSustenido.class,
                    Sol.class,SolSustenido.class, La.class,LaSustenido.class, Si.class, SiSustenido.class);
    }

    public Nota pega(String nome) {
        try {
            if(!notas.containsKey(nome)) {
                for(Class<? extends Nota> clazz : clazzes) {
                    if(clazz.getSimpleName().toLowerCase().equals(nome.toLowerCase())) {
                        notas.put(nome, (Nota) clazz.newInstance());
                        break;
                    }
                }
            }

            return notas.get(nome);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

/*
 * Implementação do video 
 package cap2;

import java.util.HashMap;
import java.util.Map;

public class NotasMusicais {
	private static Map<String,Nota> notas = new HashMap<>();
	
	static {
		notas.put("do", new br.com.alura.pattern.notas.Do());
		notas.put("doSustenido", new br.com.alura.pattern.notas.DoSustenido());
		notas.put("re", new br.com.alura.pattern.notas.Re());
		notas.put("reSustenido", new br.com.alura.pattern.notas.ReSustenido());
		notas.put("mi", new br.com.alura.pattern.notas.Mi());
		notas.put("miSustenido", new br.com.alura.pattern.notas.MiSustenido());
		notas.put("fa", new br.com.alura.pattern.notas.Fa());
		notas.put("faSustenido", new br.com.alura.pattern.notas.FaSustenido());
		notas.put("sol", new br.com.alura.pattern.notas.Sol());
		notas.put("solSustenido", new br.com.alura.pattern.notas.SolSustenido());
		notas.put("la", new br.com.alura.pattern.notas.La());
		notas.put("laSustenido", new br.com.alura.pattern.notas.LaSustenido());
		notas.put("si", new br.com.alura.pattern.notas.Si());
		notas.put("siSustenido", new br.com.alura.pattern.notas.SiSustenido());
	}
	
	public Nota pega(String nome){
		return notas.get(nome);
	}
}
*/