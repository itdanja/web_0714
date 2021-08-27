package Domain;

public class ProductDto {
				// 이동 객체
	// 필드
	private int pno;			// 제품 번호 
	private String pname;		// 제품 명
	private String pimage;		// 제품 이미지 
	private String pcontents;	// 제품 설명 
	private String pcategory;	// 제품 카테고리 
	private int pprice;		// 제품 가격 
	private int pstock;			// 제품 재고 
	private int pactivation;	// 제품 활성화 
	private int  pquantity;		// 제품 판매수량 
	
	// 생성자 
	public ProductDto() {}

	public ProductDto(int pno, String pname, String pimage, String pcontents, String pcategory, int pprice, int pstock,
			int pactivation, int pquantity) {
		this.pno = pno;
		this.pname = pname;
		this.pimage = pimage;
		this.pcontents = pcontents;
		this.pcategory = pcategory;
		this.pprice = pprice;
		this.pstock = pstock;
		this.pactivation = pactivation;
		this.pquantity = pquantity;
	}
	// 등록시 사용되는 생성자 
	public ProductDto( String pname, String pimage, String pcontents, String pcategory, int pprice, int pstock,
			int pactivation) {
		this.pname = pname;
		this.pimage = pimage;
		this.pcontents = pcontents;
		this.pcategory = pcategory;
		this.pprice = pprice;
		this.pstock = pstock;
		this.pactivation = pactivation;
	}

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPimage() {
		return pimage;
	}

	public void setPimage(String pimage) {
		this.pimage = pimage;
	}

	public String getPcontents() {
		return pcontents;
	}

	public void setPcontents(String pcontents) {
		this.pcontents = pcontents;
	}

	public String getPcategory() {
		return pcategory;
	}

	public void setPcategory(String pcategory) {
		this.pcategory = pcategory;
	}

	public int getPprice() {
		return pprice;
	}

	public void setPprice(int pprice) {
		this.pprice = pprice;
	}

	public int getPstock() {
		return pstock;
	}

	public void setPstock(int pstock) {
		this.pstock = pstock;
	}

	public int getPactivation() {
		return pactivation;
	}

	public void setPactivation(int pactivation) {
		this.pactivation = pactivation;
	}

	public int getPquantity() {
		return pquantity;
	}

	public void setPquantity(int pquantity) {
		this.pquantity = pquantity;
	}
	
}
