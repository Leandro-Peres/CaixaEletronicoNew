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
	System.out.println("******* CAIXA ELETR�NICO ******");
	System.out.println("*******************************");
	System.out.println("_______________________________");
	System.out.println("Ol�" + nome + "Bom dia");
	System.out.println("Seu saldo em C/C � R$ " + saldoFinal);
	System.out.println("|------------------------|");
	System.out.println("|     Menu de op��es     |");
	System.out.println("|                        |");
	System.out.println("|     1 - Extrato        |");
	System.out.println("|     2 - Saque          |");
	System.out.println("|     3 - Depositar      |");
	System.out.println("|     4 - Sair           |");
	System.out.println("|------------------------|");
	operacao=ler.nextInt();
				

		if (operacao ==1) {
			System.out.println("Op��o: 1");
			System.out.println("Extato");
			System.out.println("Nome: " + nome);
			System.out.println("Conta: 77565");
			System.out.println("Seu saldo em C/C � R$ " + saldoFinal);
			System.out.println("Saques realizados hoje" + contSaque);
			}
			else {
				if (operacao ==2) {
					System.out.println("Op��o: 2");
					System.out.println("Qual valor deseja sacar?");
					saque=ler.nextDouble();
				

					if (saque > saldoFinal) {
						System.out.println("Saldo insuficiente, voc� possui R$ " + saldoFinal + "dispon�vel na conta corrente");
						System.out.println("Voc� gostaria de um empr�stimo com a taxa de juros de 11% am, agora?");
						System.out.println(" 1 - Sim ou 2 - N�o ");
						escolha=ler.nextInt();
				

						if (escolha == 1) {
							System.out.println(" Qual valor deseja de empr�stimo?");
							emprestimo=ler.nextInt();
							saldoFinal = saldoFinal + emprestimo - saque;
							tarifa=emprestimo*0.11;
							System.out.printf("Empr�stimo realizado com sucesso");
							System.out.println("\nValor sacado R$ " + saque);
							System.out.printf("Seu saldo � de R$ %s.\n", saldoFinal);
							System.out.println("O valor dos juros a ser debitado � de R$ " + tarifa);
							contSaque++;
							}
							else {
							System.out.println("Optou n�o.");
							}
								
							}else {
							saldoFinal = saldoFinal - saque;
							contSaque++;
							System.out.println("Valor sacado: R$" + saque);
							System.out.println("Seu saldo � de R$" + saldoFinal);
							System.out.println("Opera��o realizada com sucesso");
							}
					}
							
			}
						
						if (operacao ==3) {
							System.out.println("Op��o: 3");
							System.out.println("Qual valor deseja depositar?");
							deposito=ler.nextDouble();
							saldoFinal = saldoFinal + deposito;
							System.out.println("Valor depositado: R$ " + deposito);
							System.out.println("Seu saldo � de R$" + saldoFinal);
						}
						else {
							if (operacao == 4) {
								System.out.println("Voc� optou por sair, para continuar reinicie o sistema.");
								contSaque=3;
							}
							else {
								System.out.println(""); //op��o inv�lida1
							}
			}
		}
	}

}
