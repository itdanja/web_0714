package Day11;

public class Ÿ�̾� {

	// �ʵ� [ ���� ] 
	int Ÿ�̾���� ; 
	int ȸ���� ;
	String Ÿ�̾���ġ;
	
	// ������ [ ��ü�� �ʱⰪ ] 
	public Ÿ�̾�( String Ÿ�̾���ġ , int Ÿ�̾���� ) {
		this.Ÿ�̾���� = Ÿ�̾����;
		this.Ÿ�̾���ġ = Ÿ�̾���ġ;
	}
	// �޼ҵ� [ �ൿ ] 
	public boolean ȸ��() {
			ȸ����++;
			if( ȸ���� < Ÿ�̾���� ) { // ���� ����
				System.out.println( Ÿ�̾���ġ + " Ÿ�̾� ���� " + (Ÿ�̾����-ȸ����) + "ȸ ����");
				return true;
			}else { // ���� �� 
				System.out.println( Ÿ�̾���ġ + " Ÿ�̾� ��ũ [ ��ü �ٶ� ] ");
				return false;
			}
	}
	
	
	
	
}
