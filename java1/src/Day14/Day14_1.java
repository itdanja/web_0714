package Day14;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Random;

public class Day14_1 {
	
	public static void main(String[] args) {
		
		// �����ð� 
		ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("UTC") ) ;
			System.out.println(" �����ð� �ð� : " + zonedDateTime );
		ZonedDateTime newyork = zonedDateTime.now( ZoneId.of("America/New_York") );
			System.out.println(" ���� �ð� : " + newyork );
		
		// Math Ŭ���� : ���� ��� ���� �޼ҵ� ���� 
			int ����1 = Math.abs(-5);
				System.out.println(" ���밪 : " + ����1 );
			double �Ǽ�1 = Math.abs(-3.14);
				System.out.println(" ���밪 : " + �Ǽ�1 );
			double �Ǽ�2 = Math.ceil(5.3);
				System.out.println(" �ø� " + �Ǽ�2);
			double �Ǽ�3 = Math.ceil(-5.3);
				System.out.println(" �ø� " + �Ǽ�3);
				
			System.out.println(" ���� : " + Math.floor(5.3) );
			System.out.println(" ���� : " + Math.floor(-5.3) );
			
			System.out.println(" �ִ� : " + Math.max(5, 9) );
			System.out.println(" �ּڰ� : " + Math.min(5, 9) );
			 
			Random random = new Random();
			System.out.println(" ������ü : " + random.nextInt() );
			System.out.println(" ����[0~1] : " + Math.random() );
			
			System.out.println(" ����� ������ �Ǽ��� : " + Math.rint(5.5) );
			System.out.println(" ����� ������ �Ǽ��� : " + Math.rint(-5.5) );
			
			System.out.println(" �ݿø� : " + Math.round(5.5) );
			System.out.println(" �ݿø� : " + Math.round(-5.5) );
			
			// ����1 : 12.3456;  �Ҽ� ��°¥������ �ݿø� => 12.35
			double �Ǽ�4 = 12.3756;
				// 1. �ڸ��� �ø��� 
				double temp =  �Ǽ�4 * 10;
				// 2. �ݿø� => �ڸ��� ������ 
				�Ǽ�4 = ( Math.round(temp) ) /10.0;
				
				System.out.println("�ݿø� �� : " + �Ǽ�4 );
			
			// ����2 : ������ȣ �������� 0000 ~ 9999 ������ ������ 10�� ���� 
					// 1. [������ȣ] ���� 10�� �迭�� ���� 
					// 2. ������ȣ ���ڸ��� Ȧ�� // ������ȣ ���ڸ� ¦�� ��� 
			
				// 1. ������ü ���� 
				Random ���� = new Random();
				//int[] ������ȣ = new int[10];
				String[] ������ȣ = new String[10];  // ������ȣ 4�ڸ� 10�� �����ϴ� �迭 
				String[] Ȧ������ = new String[10];	// Ȧ������ ��ȣ�� �����ϴ� �迭
				String[] ¦������ = new String[10];	// ¦������ ��ȣ�� �����ϴ� �迭 
				
				// 2. ���� ���� 10�� 
				for( int i = 0 ; i<10 ; i++ ) {
					//������ȣ[i]= ����.nextInt(10000); // 0~9999 ������ ���� ���� 
					
					������ȣ[i] = String.format( "%04d" , ����.nextInt(10000) );
								// String.format( "���Ĺ���" , ��ü[������] )
									// * ���Ĺ��� 
										// %d : ���� 	%f : �Ǽ� 	%s : ���ڿ�
										// �ڸ��� 
											// %����d : �����Ͱ� �����ϴ� �ڸ��� 
											// %0����d : �����̸� 0 ä��� 
				}
				// 3. ����ȣ�� Ȧ��/¦�� ���� 
				for( int i = 0 ; i<10 ; i++ ) {
					int ����ȣ = Integer.parseInt(������ȣ[i].substring(3) ) ;
					if( ����ȣ%2 == 1 ) {
						for( int j = 0 ; j<10 ; j++ ) {
							if( Ȧ������[j] == null ) {
								Ȧ������[j] = ������ȣ[i]; break;
							}
						}
					}
					else { 
						for( int j = 0 ; j<10 ; j++ ) {
							if( ¦������[j] ==null ) {
								¦������[j] = ������ȣ[i]; break;
							}
						}
					}
				}
				// 4. ��� 
				System.out.println("-------- Ȧ������ ��� ----------");
				for( String string : Ȧ������ ) { if(string !=null)System.out.println( string ); }
				// for Ȱ�� 
				// for( �ڷ��� �ӽð�ü : �迭�� ) 
					// �迭�� �ε��� 0������ ������ �ϳ��� �ӽð�ü�� ���� 
				
				System.out.println("-------- ¦������ ��� ----------");
				for( String string  : ¦������ ) { if(string !=null)System.out.println( string ); }
				
				
				// ���ڿ� => �����ڷ��� ��ȯ
					// 1. ������ : Integer.parseInt("���ڿ�")
					// 2. �Ǽ��� : Double.parseDouble("���ڿ�")
					// 3. ���� : Boolean.parseBoolean("���ڿ�")
				
			
			
			
			
			 
	}

}
