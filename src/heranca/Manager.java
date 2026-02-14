package heranca;

public final class Manager extends Employee{

	public Manager(String code, String name, String address, int age, double salary) {
		super(code, name, address, age, salary);
	}
	
	public Manager() {
			
		}

	private String login;
	
	private String password;
	
	private double comission;
	
	@Override
	public String getCode() {
		return "MN" + this.code;
	}
	
	@Override
	public double getFullSalary() {
		return this.salary + this.comission;
	}
	
	public double getFullSalary(double extra) {
		return this.getFullSalary() + extra;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getComission() {
		return comission;
	}

	public void setComission(double comission) {
		this.comission = comission;
	}
	
	
}
