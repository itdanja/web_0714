package Domain;

public class BoardDto {
			// Dto : �������� �̵� ��ü 
	// �ʵ�
	private int bno;			// ��ȣ
	private String btitle;		// ���� 
	private String bcountents;	// ����
	private String bwriter;		// �ۼ��� 
	private String bdate;		// �ۼ��� 
	private int bcount;			// ��ȸ�� 

	// ������ [ 1.������� , 2. Ǯ������ 3.�Խù����� ]
	public BoardDto() {}

	public BoardDto(int bno, String btitle, String bcountents, String bwriter, String bdate, int bcount) {
		this.bno = bno;
		this.btitle = btitle;
		this.bcountents = bcountents;
		this.bwriter = bwriter;
		this.bdate = bdate;
		this.bcount = bcount;
	}
	// �Խù����� ������ 
	public BoardDto(String btitle, String bcountents, String bwriter) {
		this.btitle = btitle;
		this.bcountents = bcountents;
		this.bwriter = bwriter;
	}
	// �޼ҵ� [ get , set ] 
	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getBcountents() {
		return bcountents;
	}

	public void setBcountents(String bcountents) {
		this.bcountents = bcountents;
	}

	public String getBwriter() {
		return bwriter;
	}

	public void setBwriter(String bwriter) {
		this.bwriter = bwriter;
	}

	public String getBdate() {
		return bdate;
	}

	public void setBdate(String bdate) {
		this.bdate = bdate;
	}

	public int getBcount() {
		return bcount;
	}

	public void setBcount(int bcount) {
		this.bcount = bcount;
	}

}
