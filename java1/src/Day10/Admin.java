package Day10;

public class Admin extends Member {
	
	private String position;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String id, String password , String position) {
		super(id, password);
		this.position = position;
	}
	
	@Override
	public void info() {
		super.info();
		System.out.println(" position : " + position );
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	

}
