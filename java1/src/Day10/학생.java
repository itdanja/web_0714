package Day10;

public class �л� extends ��� {
			// ���[�����ϱ�] ����Ŭ����
	
	// �̸�,���̴� ����Ŭ�����κ��� ��ӹ޾ұ� ������ ��밡��
	private int �г�;

	public �л�() {
		super();
	}

	public �л�(String �̸�, int ���� , int �г�) {
		super(�̸�, ����);
		this.�г� = �г�;
	}

	public int get�г�() {
		return �г�;
	}

	public void set�г�(int �г�) {
		this.�г� = �г�;
	}
	
	@Override // ����Ŭ������ ������ ����� ������
	public void ����() {
		super.����();
		System.out.println("�г� : " + �г�);
	}
	
	
}
