package br.com.caelum.contas.main;
import br.com.caelum.contas.modelo.Tributavel;
import br.com.caelum.contas.modelo.ContaCorrente;
public class TestaTributavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			ContaCorrente cc = new ContaCorrente();
			cc.deposita(10000);
			System.out.println(cc.getValorImposto());
			// testando polimorfismo:
			Tributavel t = cc;
			System.out.println(t.getValorImposto());
			
	}

}
