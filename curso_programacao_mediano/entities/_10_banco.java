package entities;

public class _10_banco {
	private int nConta;
	private String name;
	private double vDepositado;
	
	public _10_banco (int nConta, String name) {
		this.nConta = nConta;
		this.name = name;
	}
	
	
	public _10_banco (int nConta, String name, double depositoInicial){
		this.nConta = nConta;
		this.name = name;
		setvDepositado(depositoInicial);

	}
	
	public int getNConta() {
		return nConta;
	}
	
	public String getName() {
		return name;
	}

	public double getvDepositado() {
		return vDepositado;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setvDepositado(double calculo) {
		vDepositado += calculo;
	}
	
	public void setvRetirado(double calculo) {
		vDepositado -= calculo +5;
	}
	
	
	 public String toString() {
		 return "Account: " +
				 nConta 	+
				 ", Holder:  "	+
				 name		+
				 ", Balance: $ " +
				 vDepositado;
	 }
}
