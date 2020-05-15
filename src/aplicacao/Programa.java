package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int qtdCompras, qtdAtraso;
		double ticket, volumeDeCompras, ptsCompras, ptsInadimplencia, ptsPagamento;
		char formaDePagamento;
		
		System.out.println("SISTEMA DE PERFIL DE CLIENTE");
		System.out.println("--------------------------------");
		System.out.println("INFORME OS DADOS DO �LTIMO ANO");
		
		System.out.println();
		System.out.println("Quantas compras o cliente fez no �ltimo ano?");
		qtdCompras = sc.nextInt();
		System.out.println("Qual o ticket m�dio?");
		ticket = sc.nextDouble();
		
		System.out.println();
		System.out.println("Quantas vezes o cliente atrasou o pagamento?");
		qtdAtraso = sc.nextInt();
		System.out.println("A maioria das compras foi em dinheiro, cart�o, ou boleto (D/C/B)?");
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
		
		System.out.println();
		System.out.println("Score de volume de compras = " + ptsCompras + " pontos");
		System.out.println();
		System.out.println("Score de inadimpl�ncia = " + ptsInadimplencia + " pontos");
		System.out.println("Score de forma de pagamento " + ptsPagamento);
		
	}

}
