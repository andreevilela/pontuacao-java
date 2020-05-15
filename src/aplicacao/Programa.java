package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int qtdCompras, qtdAtraso;
		double ticket;
		char formaDePagamento;
		
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
		
	}

}
