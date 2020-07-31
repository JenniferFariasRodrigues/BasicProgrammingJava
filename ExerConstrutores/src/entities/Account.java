package entities;

public class Account {
	
	private int  number;
	private String holder;
//	Saldo da conta
	private double balance;


//COnstrutor que recebe number,holderdo problema
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	//COnstrutor que recebe number,holder, initial deposit do problema
	public Account(int number, String holder, double initialDeposit) {
		super();
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
		
	}
	
//	M�TODOS DE ACESSO
//N�mero da conta n�o pode ser alterado. Sem setNumber.
	public int getNumber() {
		return number;
	}

//Nome da conta pode ser alterado
	public void setHolder(String holder) {
		this.holder = holder;
	}

//	So pode mudar por meio de deposito ou saque, por isso get n�o set
	public double getBalance() {
		return balance;
	}

//	Encapsula o m�todo
	public void deposit(double amount) {
		balance +=amount;
	}
	
	public void withDraw(double amount) {
		balance -= amount + 5.0;
	}

	
//	Imprimir os dados da classe
	public String toString() {
		return "Account: " +
						 + number
						 +", holder:"
						 + holder
						 +", Balance:$"
						 + String.format("%.2f",balance);
	}
	
	
}

