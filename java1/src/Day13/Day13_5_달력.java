package Day13;

import java.util.Calendar;

public class Day13_5_�޷� {
	
	// �ֿܼ� �޷� ����ϱ� 
	
	public static void main(String[] args) {
		

		// ����1 : 
			// �Է¹��� ������ ���� �ش��ϴ� �޷� ǥ�� 
		// ����2 :
			// �Է¹��� ���ۿ���/��  ~ ������/�� : ���� �޷� ��� 
		
		�޷¸޼ҵ�();
		
	}
	
	public static void �޷¸޼ҵ�() {
		
		// 1. Ķ���� ��ü ���� 
		Calendar calendar = Calendar.getInstance();
		
		// 2. Ķ�������� ���� , �� , ��  ��������
		int year = calendar.get(calendar.YEAR);
		int month = calendar.get(calendar.MONTH)+1; // 0:1�� ~~ 
		int today = calendar.get( calendar.DAY_OF_MONTH);
		
		// ** : �ش� ���� 1�� ����ã�� 
		calendar.set(year, month-1 , 1 ); // calendar.set( �� , �� , �� ) ��¥ ����ڼ��� 
		int sday = calendar.get( calendar.DAY_OF_WEEK ); // ���� ���� 
		int eday = calendar.getActualMaximum( Calendar.DAY_OF_MONTH ); // �ش���� ������ �� 
	
		// 3. �޷� ��� 
		System.out.println("======================"+year+"��" + month+"�� =====================");
		System.out.println(" ��\t��\tȭ\t��\t��\t��\t��");
		
		// 4. �� ���� 1���� ��ġ �տ� ���� ä��� 
		for( int i = 1 ; i<sday ; i++ ) {
			System.out.print(" \t");
		}
		
		int ssday = sday; // ���� ���� ���� [ ����ϸ��� �ٹٲ� ]
			
		// 5. �� ���Ͽ� ��¥ ǥ�� 
		for( int i = 1 ; i<=eday ; i++ ) {
			
			System.out.print(+i+"\t");
			
			//6. ����� �ڷ� �ٹٲ� ó�� [ 7�ǹ������ ] 
			if( ssday % 7 ==0 ) System.out.println();
				// ������ ������̸� 
			
			ssday++; // ���� ����
		}
	}

}
