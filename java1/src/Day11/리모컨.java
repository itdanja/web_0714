package Day11;

public interface ������ {

	// ��� : ��� , �߻�޼ҵ� , default �޼ҵ�
	
	// �ʵ� 
	int �ִ���� = 10;
	int �ּҼ��� = 0;
	
	// �߻�޼ҵ� : ����o ����x 
	public abstract void ����();
	public void ����();
	public void ��������(int ����);
	
	// default �޼ҵ� : ����o ���� o
	public default void ä�κ���() {
		System.out.println("ä�κ���");
	}
	
}
