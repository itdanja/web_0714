package Day09;

public class Day09_1 {
	
	// Ŭ���� 
		// ��� : �ʵ� , ������ , �޼ҵ� 
	
		// ���������� : 
			// ���� : �ʵ�[�޸�]�� ������ ��ȣ�� ���� 
			// public : ������Ʈ�� ��� ������ ȣ�� ����[��밡��]
			// protected : ���� ��Ű���������� ȣ�� ����
					// [ �� : ��ӹ��� ����Ŭ������ ����Ŭ������ �ִ� ��Ű���� ���� ]
			// default : ���� ��Ű���������� ȣ�� ���� 
			// private : ���� Ŭ������������ ȣ�� ����
		
		// ���� ���Ǵ� Ű����[ �̸� ���ǵ� �ܾ� ]
			// final : �޸��� ����� [ ������ ] 
				// ���� <----> ��� 
			// static : ���� ���� [ �������� ] 
				// ���α׷� ���۰� ���ÿ� �޸��Ҵ� => static 
				// ���α׷� ����� ���ÿ� �޸��ʱ�ȭ
					// ���� : ���α׷� �������� ���� ���Ǵ� �޸� �Ҵ�� 
				
		// java �޸� ���� 
			// heap : [����/��ü] �޸� : new
			// stack : [�޼ҵ�] �������� : �޼ҵ尡 ����Ǹ� �޸� �ʱ�ȭ 
			// static : [static] �������� 
	

	public static void main(String[] args) {
		
		// Ŭ�������� ù���� �빮�� 
			// ��ü�� Ŭ�������� �ҹ���
		
		// ���Ӽ��� ĳ���� == ��ü
			// ������ ��Ű����
			Character character = new Character();
			character.name = "����it";
			character.lv = 1;
			character.ex = 0;
			//character.power = 10; // ���ٺҰ� 
				// priavate ����� �����ϴ� ���1
				// set,get�޼ҵ� 
			character.setpower(10);
			System.out.println("���� ���ݷ� : "+ character.getpower());
			
			System.out.println("1.final ������� ");
			character.lv = 2; // ���� ���� 
			
			System.out.println("2.final ������� ");
			// character.code = "30";			
			
			
			
			
			
			
			
			
			
			
			
			
	}
	
}
