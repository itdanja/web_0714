package Day07;

import java.util.Random;
import java.util.Scanner;

public class Day07_�ζ��Ǻ��� {
	
	// �ζ��Ǻ��� [ 1���� �迭] 
		// 1. ����ڰ� 1~45 ������ ���ڸ� 6�� �Է¹ޱ� 
			// 1. �ߺ��� ���� 2.1~45���̸� ����
		// 2. ��÷��ȣ �������� 1~45 ������ ���� 6�� ���� 
	
		// 3. �� �迭�� ������ ���� ���� üũ
	
	public static void main(String[] args) {
		
		// 0. ����
		Scanner scanner = new Scanner(System.in);
		Random random = new Random(); // ����[����] ���� ��ü 
		
		// 1. �迭���� 
		int[] ��ȣ = new int[6];
		int[] ��÷��ȣ = new int[6];
		
		// 2. �Է¹ޱ�
		for( int i = 0 ; i<6 ; i++ ) {
			System.out.print("[[����]] 1~45 �� �Է� : "); int ���� = scanner.nextInt();
			// 1. 1~45 �������� üũ 
			if( ���� <= 0 || ����>45 ) { 
				System.out.println("[[���]] : 1~45���̸� �Է�[�ٽ��Է�] "); 
				i--; // �������� �Է�x �Է�Ƚ�� ����x
			}else {
				// 2. �̹� �迭�� �����ϴ��� üũ
				boolean �ߺ�üũ = true;
				for( int temp : ��ȣ ) {
					//  for( �ӽú��� : �迭 ) => �迭�� ��� ��Ҹ� �ϳ��� ���� ����
					if( temp == ���� ) {
						System.out.println("[[���]] �̹� ������ ��ȣ �Դϴ�[�ٽ��Է�]");
						i--; // �������� �Է�x �Է�Ƚ�� ����x
						�ߺ�üũ = false;
						break; // ���尡��� �ݺ��� Ż�� 
					} // if end 
				} // for end 
				if( �ߺ�üũ ) ��ȣ[i] = ����;
			}  // else end 
		} // for end 
		
		// 2-1 �Է°� Ȯ�� 
		System.out.print("\n�����Ͻ� ��ȣ�� : ");
		for( int temp : ��ȣ ) {
			System.out.print( temp +" ");
		}
		// 3. ��÷��ȣ ���� 
		for( int i = 0 ; i<6 ;i++) {
			// 1. ���� ���� 
			int ��÷ = random.nextInt(45)+1; // 0~44 +1 => 1~45
			// 2. �ߺ� ���� 
			boolean �ߺ�üũ = true;
			for( int temp : ��÷��ȣ ) {
				if( temp == ��÷ ) {
					i--; 
					�ߺ�üũ = false;
					break;
				}
			}
			if( �ߺ�üũ ) ��÷��ȣ[i] = ��÷;
		}
		// 3-1 ������ Ȯ�� 
		System.out.print("\n��÷��� ��ȣ�� : ");
		for( int temp : ��÷��ȣ ) {
			System.out.print( temp +" ");
		}
		
		
		// 4. ��÷���[ �� �迭 �� ] 
		int ��÷���� = 0;
		for( int temp : ��ȣ ) {
			for( int temp2 : ��÷��ȣ ) {
				if( temp == temp2) ��÷����++;
			}
		}
		System.out.println("\n��÷���� : " + ��÷����);
	
		// ����1 : 2���� �迭 ���� ���� 
			// 1. ���Ӽ� �Է¹ޱ� 
			// 2. �Է¹��� ���Ӽ���ŭ ��ȣ ���� 
				// ���࿡ ���Ӽ� 3 �Է�������
					// 1���� : 1 2 3 4 5 6
					// 2���� : 1 2 35 7 8 9
					// 3���� : 9 20 35 24 31 21
			// 3. ���Ӵ� ��÷������ ��� 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
	}

}
