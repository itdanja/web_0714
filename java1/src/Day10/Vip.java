package Day10;

public class Vip extends Member {
	
	private String grade;
	
//	public void Ȯ��() {
//		this.getId(); // ����Ŭ���� ��� ��� ���� 
//	}
	
	public Vip() {
		super();
	}

	public Vip(String id, String password , String grade) {
		super(id, password);
		this.grade = grade;
	}
	
	@Override
	public void info() {
		super.info();
		System.out.println(" grade : " + grade);
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}
