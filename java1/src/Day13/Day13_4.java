package Day13;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Day13_4 {
	
	public static void main(String[] args) {
		
		
		// ��¥ �� �ð� ���õ� Ŭ���� 
		
		// 1. Date Ŭ���� 
		Date date = new Date(); // �ý��� ���ó�¥/�ð� ��ü ���� 
		System.out.println(" ���ó�¥/�ð� : " + date );
		
		// 3. SimpleDateFormat Ŭ���� : ��¥ ���� ��ȯ
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy��MM��dd�� HH��mm��ss��");
		System.out.println( " ���ĺ�ȯ : " + simpleDateFormat.format(date) );
		
		// 2. Calendar Ŭ���� 
		Calendar calendar = Calendar.getInstance(); // Ŭ������ �̸� ������� ��ü �������� 
		System.out.println(" Ķ���� : " + calendar );
		
		int ���� = calendar.get( Calendar.YEAR);
		System.out.println(" ���� : " + ���� );
		System.out.println(" �� : " + ( calendar.get(calendar.MONTH)+1 )   ); // 0:1�� ~~~ 
		System.out.println(" ��[������] : " + calendar.get( calendar.DAY_OF_MONTH ));
		System.out.println(" ��[�ִ���] : " + calendar.get( calendar.DAY_OF_WEEK) ); // 1:�� ~~ 
		if( calendar.get(calendar.DAY_OF_WEEK) == 1 ) { System.out.println("�Ͽ���"); }
		if( calendar.get(calendar.DAY_OF_WEEK) == 2 ) { System.out.println("������"); }
		if( calendar.get(calendar.DAY_OF_WEEK) == 3 ) { System.out.println("ȭ����"); }
		if( calendar.get(calendar.DAY_OF_WEEK) == 4 ) { System.out.println("������"); }
		if( calendar.get(calendar.DAY_OF_WEEK) == 5 ) { System.out.println("�����"); }
		if( calendar.get(calendar.DAY_OF_WEEK) == 6 ) { System.out.println("�ݿ���"); }
		if( calendar.get(calendar.DAY_OF_WEEK) == 7 ) { System.out.println("�����"); }
		
		// �ð� 
		System.out.println(" ����/���� : " + calendar.get( calendar.AM_PM) );
		if( calendar.get(calendar.AM_PM) == 0 ) {System.out.println("����");}
		if( calendar.get(calendar.AM_PM) == 1 ) {System.out.println("����");}
		
		System.out.println(" �� : "+ calendar.get( calendar.HOUR ) );
		System.out.println(" �� : "+ calendar.get( calendar.MINUTE) );
		System.out.println(" �� : "+ calendar.get( calendar.SECOND) );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
