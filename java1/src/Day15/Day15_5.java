package Day15;

import java.util.Scanner;

public class Day15_5 {

		//	����2
		// 	���ѷ��� �޴� 
		//		1. ������� 2.��ȭ���
		//		[����1] 1�� ���ý� 1�ʰ������� ������� ��� 
		//		[����2] 2�� ���ý� 1�ʰ������� ��ȭ��� ��� 
		//		[����3] �̸� ������ ��ȣ�� �ٽ� �����ϸ� �������[ ������ ���� ]
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean sw = true;
		
		while(true) {
			System.out.println("1.���� 2.��ȭ");
			int ch = scanner.nextInt();
			if( ch == 1 ) {
				
				Thread thread = new Music();
				
				if( sw ) {
					Music.Musicstop(sw);
					thread.start();
					//thread.stop(); // ����x : �޸� �ս� [ �ٷ� ���� ]
					sw = false; // ����ġ ������ �̿��� ���� [ �����ϰ� ���� ] 
				}
				else {
					Music.Musicstop(sw);
					sw = true;
				}
			}
		}
		
	}
	
}






