package Day16;

public class �ڽ�<�Ű�Ŭ����> {

	// �ʵ� 
	private String ������;
	private �Ű�Ŭ����[] ȸ�����;
			// �ܺηκ��� ����Ŭ������ ���� �ڷ���/Ŭ���� ���� �迭 ���� 
	// ������ 
	public �ڽ�( String ������ , int �ο��� ) {
		this.������ = ������;
		// this.����Ŭ�������
		this.ȸ����� = (�Ű�Ŭ����[])new Object[�ο���]; //�ο�����ŭ �迭�� ũ�� �Ҵ� 
				// ���׸� Ÿ������ �޸��Ҵ� X
	}
	// �迭�� ��� �߰��ϴ� �޼ҵ� [ �ڽ��� �ο� �߰� ]
	public void �߰�( �Ű�Ŭ���� �Ű���ü ) {
		// private vs public : ���������� 
		
		for( int i = 0 ; i<ȸ�����.length ; i++  ) {
			// i�� 0���� �迭��ũ�� ������ 1�� ���� 
			if( ȸ�����[i] == null ) {
				ȸ�����[i] =  �Ű���ü;
				break;
			}
		}
	}
	// get , set 
	public String get������() {
		return ������;
	}
	public void set������(String ������) {
		this.������ = ������;
	}
	public �Ű�Ŭ����[] getȸ�����() {
		return ȸ�����;
	}
	public void setȸ�����(�Ű�Ŭ����[] ȸ�����) {
		this.ȸ����� = ȸ�����;
	}
	
	
	
	
	
	
	

}
