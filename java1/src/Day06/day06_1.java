package Day06;


public class day06_1 {
	
	//��� : if[������] , switch[������]
	//�ݺ��� : for , while , do~while
		// break; continue;
	
	public static void main(String[] args) {
	
		// switch
			// ���� : switch( key:�˻��� ){ case �˻� : ���๮ }
			// 1. (key) �� �ش��ϴ� case ã���� �Ʒ� case ��� ���� 
			// 2. break; : switch Ȥ�� �ݺ��� Ż�� 
			// 3. ����Ǽ��� �������ִ� switch
			// 	  ����Ǽ��� �˼����°�� if
		// ��1)
		int ���� = 80;
		switch( ���� ) {
			case 90 : System.out.println("90�� �Դϴ� "); break;
			case 80 : System.out.println("80�� �Դϴ� "); break;
			case 70 : System.out.println("70�� �Դϴ� "); break;
			default : System.out.println("Ż�� �Դϴ� "); break;
		}
	/////////////////////////////////////////////////////////////////
		if( ���� == 90 ) System.out.println("90�� �Դϴ�if ");
		else if( ����==80 ) System.out.println("80�� �Դϴ�if ");
		else if( ����==70 ) System.out.println("70�� �Դϴ�if ");
		else System.out.println("Ż�� �Դϴ� ");
		
		// ��2)
		int ��ư = 3 ;
		switch( ��ư ) {
			case 1: System.out.println("1����"); break;
			case 2: System.out.println("2����"); break;
			case 3: System.out.println("3����"); break;
			default :
		}
		
		// ��3) �� ������ ����� 90���̻��̸� "A" 80���̻��̸� "B" ������ Ż�� 
		int ���� = 80 , ���� = 80 , ���� = 90;
		int ��� =  (����+����+����)/3;
				// 87 / 10 => 8.7
		switch( ���/10 ) {		
			case 9 : System.out.println("A���"); break;
			case 8 : System.out.println("B���"); break;
			default : System.out.println("Ż��");
		}
		
		// for : ���ǿ� ���� �ݺ����� 
			//	for( �ʱⰪ ; ���ǹ� ; ������ )
		for( int i = 0 ; i<10 ; i++ ) {
			if( i == 3) continue; // ���� ����� �ݺ��� �̵�
			if( i == 6) break; // ���� ����� �ݺ��� Ż�� 
			System.out.print( i +" ");
		}
System.out.println();
		// while : ���ǿ� ���� �ݺ����� = ���ѷ��� 
			//�ʱⰪ
			//while(���ǹ�) {
			//	������
			//}
		int i = 0;
		while( i<10 ) {
			if( i == 3 ) continue;
			if( i == 6 ) break; // ���� ����� �ݺ��� Ż��
			System.out.print( i+" ");
			i++;
		}
	}
}
