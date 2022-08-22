package HasA;

public class BankAcc {
	private String bname,bloc;
	public BankAcc(String bname, String bloc) {
		super();
		this.bname = bname;
		this.bloc = bloc;
	}
    public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBloc() {
		return bloc;
	}
	public void setBloc(String bloc) {
		this.bloc = bloc;
	}
	void bankinfo() {
    	System.out.println("The bank name is "+bname+"in the location"+bloc);
    }

}
