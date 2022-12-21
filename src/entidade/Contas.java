package entidade;

public class Contas {

	private String nome;
	private int  numero;
	private double saldo;
	
	public Contas(String nome, int numero, double deposito) {
		
		this.nome = nome;
		this.numero = numero;
		deposito(deposito);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double saldo) {
		this.saldo+=saldo;
	}
	public void saque(double saldo) {
		this.saldo-=(saldo+5.00);
	}
	@Override
	public String toString() {
		return "nome: "+nome
				+", numero da conta: "+numero
				+", saldo: $"+saldo;
	}
	
}
