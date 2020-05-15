package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int qtdCompras, qtdAtraso, ptsCompras, ptsInadimplencia, ptsPagamento, scoreTotal;
		double ticket, volumeDeCompras;
		char formaDePagamento;
		String classificacao;
		
		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("--------------------------------");
		System.out.println("INFORME OS DADOS DO ÚLTIMO ANO");
		
		System.out.println();
		System.out.println("Quantas compras o cliente fez no último ano?");
		qtdCompras = sc.nextInt();
		System.out.println("Qual o ticket médio?");
		ticket = sc.nextDouble();
		
		System.out.println();
		System.out.println("Quantas vezes o cliente atrasou o pagamento?");
		qtdAtraso = sc.nextInt();
		System.out.println("A maioria das compras foi em dinheiro, cartão, ou boleto (D/C/B)?");
		formaDePagamento = sc.next().charAt(0);
		
		volumeDeCompras = ticket * qtdCompras;
		
		if (volumeDeCompras <= 0) {
			ptsCompras = 0;
		} else if (volumeDeCompras <= 3000 && qtdCompras > 2) {
			ptsCompras = 40;
		} else if (volumeDeCompras <= 3000) {
			ptsCompras = 20;
		} else {
			ptsCompras = 60;
		}
		
		if (qtdAtraso > 1 || qtdCompras == 0) {
			ptsInadimplencia = 0;
		} else if (qtdCompras > 0 && qtdAtraso >= 1) {
			ptsInadimplencia = 15;
		} else {
			ptsInadimplencia = 30;
		}
		
		if (formaDePagamento == 'D' || formaDePagamento == 'd') {
			ptsPagamento = 5;
		} else {
			ptsPagamento = 10;
		}
		
		scoreTotal = ptsCompras + ptsInadimplencia + ptsPagamento;
		
		if (scoreTotal <= 25) {
			classificacao = "BRONZE";
		} else if (scoreTotal > 25 && scoreTotal <= 75) {
			classificacao = "PRATA";
		} else {
			classificacao = "OURO";
		}
		
		System.out.println();
		System.out.println("Score de volume de compras = " + ptsCompras + " pontos");
		System.out.println();
		System.out.println("Score de inadimplência = " + ptsInadimplencia + " pontos");
		System.out.println("Score de forma de pagamento " + ptsPagamento);
		System.out.println();
		System.out.println("Classificação final = CLIENTE " + classificacao);
		
		sc.close();
		
	}

}
