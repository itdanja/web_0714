package Day15;

public class Day15_4 {

	// ����ȭ [ synchronized ] 
		// �������� �����尡 �ϳ��� �޸�[����,�޼ҵ�] �����Ҷ� �����ű�� 
			// ���� ������ �����尡 ���������� ���������� ��� 
				// ���� ������ �����尡 ������ ���������� ����
	public static void main(String[] args) {
		
		// ���� ���� 
		Account account = new Account();
		
		User1 user1 = new User1();
		user1.setaccount(account);
		user1.start();
		
		User2 user2 = new User2();
		user2.setaccount(account);
		user2.start();
		
	}
	
	
}
