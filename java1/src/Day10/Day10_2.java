package Day10;

public class Day10_2 {
	
	// ȸ�� Ŭ������ ��ӹ޾� vipŬ���� , ������Ŭ���� , �Ϲ�Ŭ���� 
		// ����Ŭ���� : ȸ��
			// �ʵ� :  ���̵� , ��й�ȣ 
			// ������ 
			// �޼ҵ� : ȸ������ ��� �޼ҵ� 
		// ����Ŭ���� : vip , ������
			// vip
				// �ʵ� : ȸ����� 
				// �޼ҵ� : ȸ������ �޼ҵ� �������̵� 
			// ������ 
				// �ʵ� : ����������
				// �޼ҵ� : ȸ������ �޼ҵ� �������̵� 

	
	public static void main(String[] args) {
		
		
		// 1. ����Ŭ���� ��ü 
		Member member = new Member("qwe", "qwe");
		
		// 2. ����Ŭ���� ��ü 
		Vip vip = new Vip("asd", "asd", "gold");
		Admin admin = new Admin("zxc","zxc","CEO");
		
		// ����Ŭ������ �迭 
		Member[] members = new Member[3];
			members[0] = member;
			members[1] = vip;
			members[2] = admin;
			// ����Ŭ������ ����� �迭���� ����Ŭ������ ���� ���� 
		// ����Ŭ������ �迭 
		Vip[] vips = new Vip[3];
			// vips[0] = member; // �Ұ�  
			vips[1] = vip;
			// vips[2] = admin; // �Ұ� 
			// ����Ŭ������ ����� �迭���� ����Ŭ������ ���� �Ұ���
		Admin[] admins = new Admin[3];
			// admins[0] = member; // �Ұ�
			// admins[1] = vip; // �Ұ� 
			admins[2] = admin;
		
		
		
		
	}
	

}
