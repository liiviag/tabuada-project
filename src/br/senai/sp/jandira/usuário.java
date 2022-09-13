package br.senai.sp.jandira;
import br.senai.sp.jandira.gui.Frame;
import br.senai.sp.jandira.model.Tabuada;

public class usuário {

	public static void main(String[] args) {
		
		Frame tela = new Frame();
		tela.titulo = "TABUADA";
		tela.altura = 840;
		tela.largura = 430;
		tela.criarTela();
		
			Tabuada tabuada = new Tabuada();
			tabuada.multiplicador = 2;
			tabuada.minimoMultiplicador = 17;
			tabuada.maximoMultiplicador = 20;
			
			String [] resultado = tabuada.getTabuada();
			int i =  0;
			
			while (i < resultado.length) {
				System.out.println(resultado[i]);
				i++;
			}
			
	}

}