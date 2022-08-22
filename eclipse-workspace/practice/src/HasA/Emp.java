package HasA;

public class Emp extends Person{
	private int empid;
	private String design;
	public Emp(int age, String name, int empid, String design) {
		super(age, name);
		this.empid = empid;
		this.design = design;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	void display()
	{
		super.display();
		System.out.println("The Emp id is :"+empid);
		System.out.println("The Emp designation is :"+design);
		BankAcc b=new BankAcc("ICICI","chennai");
		b.bankinfo();
	}
	
}
