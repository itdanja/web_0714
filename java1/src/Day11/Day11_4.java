package Day11;

public class Day11_4 {
	
	public static void main(String[] args) {
		
		�ڵ��� car = new �ڵ���();
		
		for( int i = 1 ; i<=10 ; i++ ) {
			
			int ��ġ = car.����̺�();
			
			switch( ��ġ ) {
				case 1 : 
					System.out.println("[[ ��ȣŸ�̾�� ��ü ]]] ");
					car.�տ���Ÿ�̾� = new ��ȣŸ�̾�("�տ���Ÿ�̾�", 10);
					break; 
				case 2 : 
					System.out.println("[[ ��ȣŸ�̾�� ��ü ]]] ");
					car.�տ�����Ÿ�̾� = new ��ȣŸ�̾�("�տ�����Ÿ�̾�", 10);
					break;
				case 3 : 
					System.out.println("[[ ��ȣŸ�̾�� ��ü ]]] ");
					car.�ڿ���Ÿ�̾� = new ��ȣŸ�̾�("�ڿ���Ÿ�̾�", 10);
					break; 
				case 4 : 
					System.out.println("[[ ��ȣŸ�̾�� ��ü ]]] ");
					car.�ڿ�����Ÿ�̾� = new ��ȣŸ�̾�("�ڿ�����Ÿ�̾�", 10);
					break; 		
			}
			
		}
		
	}

}
