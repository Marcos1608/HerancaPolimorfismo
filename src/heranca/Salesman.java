package heranca;

public final class Salesman extends Employee{

	public Salesman(String code, String name, String address, int age, double salary) {
		super(code, name, address, age, salary);
	}
	
	public Salesman() {
			
	}
	
	@Override
	public String getCode() {
		return "SL" + this.code;
	}
	
	@Override
	public double getFullSalary() {
		return this.salary + ((soldAmount * percentPerSold)/100);
	}

	private double percentPerSold;
	
	private double soldAmount;

	public double getPercentPerSold() {
		return percentPerSold;
	}

	public void setPercentPerSold(double percentPerSold) {
		this.percentPerSold = percentPerSold;
	}

	public double getSoldAmount() {
		return soldAmount;
	}

	public void setSoldAmount(double soldAmount) {
		this.soldAmount = soldAmount;
	}
	
	
	
}
