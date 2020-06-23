import java.util.Scanner;

public class CaixaEletronicoModify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String nome;
				

	double saque, saldo, emprestimo, emprestimoJuros, saldoFinal, deposito, tarifa,salario;
				

	int escolha,operacao,contSaque;
				

	nome = "Leandro Peres";
	saldo = 2000;
	salario = 8000;
	emprestimo =salario*0.05;
	contSaque = 0;
	saldoFinal = saldo;
	deposito = 0;
				

	Scanner ler = new Scanner (System.in);
				

	while (contSaque<3) {
				

	System.out.println("*******************************");
	System.out.println("******* CAIXA ELETRÔNICO ******");
	System.out.println("*******************************");
	System.out.println("_______________________________");
	System.out.println("Olá" + nome + "Bom dia");
	System.out.println("Seu saldo em C/C é R$ " + saldoFinal);
	System.out.println("|------------------------|");
	System.out.println("|     Menu de opções     |");
	System.out.println("|                        |");
	System.out.println("|     1 - Extrato        |");
	System.out.println("|     2 - Saque          |");
	System.out.println("|     3 - Depositar      |");
	System.out.println("|     4 - Sair           |");
	System.out.println("|------------------------|");
	operacao=ler.nextInt();
				

		if (operacao ==1) {
			System.out.println("Opção: 1");
			System.out.println("Extato");
			System.out.println("Nome: " + nome);
			System.out.println("Conta: 77565");
			System.out.println("Seu saldo em C/C é R$ " + saldoFinal);
			System.out.println("Saques realizados hoje" + contSaque);
			}
			else {
				if (operacao ==2) {
					System.out.println("Opção: 2");
					System.out.println("Qual valor deseja sacar?");
					saque=ler.nextDouble();
				

					if (saque > saldoFinal) {
						System.out.println("Saldo insuficiente, você possui R$ " + saldoFinal + "disponível na conta corrente");
						System.out.println("Você gostaria de um empréstimo com a taxa de juros de 11% am, agora?");
						System.out.println(" 1 - Sim ou 2 - Não ");
						escolha=ler.nextInt();
				

						if (escolha == 1) {
							System.out.println(" Qual valor deseja de empréstimo?");
							emprestimo=ler.nextInt();
							saldoFinal = saldoFinal + emprestimo - saque;
							tarifa=emprestimo*0.11;
							System.out.printf("Empréstimo realizado com sucesso");
							System.out.println("\nValor sacado R$ " + saque);
							System.out.printf("Seu saldo é de R$ %s.\n", saldoFinal);
							System.out.println("O valor dos juros a ser debitado é de R$ " + tarifa);
							contSaque++;
							}
							else {
							System.out.println("Optou não.");
							}
								
							}else {
							saldoFinal = saldoFinal - saque;
							contSaque++;
							System.out.println("Valor sacado: R$" + saque);
							System.out.println("Seu saldo é de R$" + saldoFinal);
							System.out.println("Operação realizada com sucesso");
							}
					}
							
			}
						
						if (operacao ==3) {
							System.out.println("Opção: 3");
							System.out.println("Qual valor deseja depositar?");
							deposito=ler.nextDouble();
							saldoFinal = saldoFinal + deposito;
							System.out.println("Valor depositado: R$ " + deposito);
							System.out.println("Seu saldo é de R$" + saldoFinal);
						}
						else {
							if (operacao == 4) {
								System.out.println("Você optou por sair, para continuar reinicie o sistema.");
								contSaque=3;
							}
							else {
								System.out.println(""); //opção inválida1
							}
			}
		}
	}

}
