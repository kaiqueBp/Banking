package aplicacao;

import java.util.Scanner;

import entidade.Contas;

public class Programa {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados:");
		System.out.print("Informe o nome do usuario: ");
		String nome= sc.nextLine();
		System.out.print("Informe o numero da conta: ");
		final int numero= sc.nextInt();
		Contas contas= new Contas(nome, numero, 0);
		
		System.out.print("\nDeseja fazer um deposito inicial s/n? ");
		char opcao= sc.next().charAt(0);
		if(opcao=='s') {
			System.out.print("Insira o valor: ");
			contas.deposito(sc.nextDouble());
			System.out.println("Conta efetuada com sucesso!!\n"+contas);
			
		}
		else {
			System.out.println("Conta efetuada com sucesso!!\n"+contas);
		}
		int movimentacoes=1;
		while(movimentacoes != 0){
			
			System.out.print("\nPara fazer deposito digite- 1\n"
					+ "Para fazer saque digite- 2\n"
					+ "Para sair digite- 0\n"
					+ "Digite a opcao:");
			movimentacoes= sc.nextInt();
			switch (movimentacoes) {
			case 1:
				System.out.print("Informe o valor do deposito: ");
				contas.deposito(sc.nextDouble());
				System.out.println("Conta atualizada com sucesso!!\n"+contas);
				break;
			case 2:
				System.out.print("Informe o valor de saque: ");
				double valor= sc.nextDouble();
				if(contas.getSaldo()-valor<-100) {
					System.out.println("\nSaldo insuficiente, digite outro valor!!!");
				}
				else {
					contas.saque(valor);
					System.out.println("Conta atualizada com sucesso!!\n"+contas);
				}
				break;
			case 0:
				System.out.println("\nOperacao finalizada com sucesso!!");
				break;
			default:
				System.out.println("\nOpcao indiponivel, informe novamente outra opcao!!");
				break;
			}			
		}
		sc.close();
	}
}
