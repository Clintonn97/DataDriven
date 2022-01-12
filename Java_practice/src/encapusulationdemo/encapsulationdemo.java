package encapusulationdemo;

public class encapsulationdemo {
	private String customername;
	private int cardno;
	private int cvvno;
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;    
	}
	public int getCardno() {
		return cardno;
	}
	public void setCardno(int cardno) {
		this.cardno = cardno;
	}
	public int getCvvno() {
		return cvvno;
	}
	public void setCvvno(int cvvno) {
		this.cvvno = cvvno;
	}
	public static void main(String[] args) {
		encapsulationdemo obj = new encapsulationdemo();
		obj.setCustomername("clinton");
		obj.setCardno(2324);
        obj.setCvvno(234);
        System.out.println("customer name :"+obj.getCustomername());
        System.out.println("cardno :"+obj.getCardno());
        System.out.println("Cvvno :"+obj.getCvvno());
		
	}
	

}
