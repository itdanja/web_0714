package Day08;

import java.util.Scanner;

public class Day08_2_Start {
	
	// main �ۿ� �����ϴ� ���� : ��� �޼ҵ忡�� ����ϱ����� [ �������� ] 
		// main �޼ҵ� �ȿ��� ����� main������ ��밡�� [ �������� ] 
		
	public static Scanner scanner = new Scanner(System.in);
		// static : �޸� �켱�Ҵ� [ ���α׷� ���۰� ���ÿ� �޸� �Ҵ� => ��� ���α׷� ����� �ʱ�ȭ ] 
	
	public static Board[] boardlist = new Board[100];
	
	public static void main(String[] args) {
		
		// 2. �޼ҵ� ȣ�� 
		start(); // main�޼ҵ尡 start �޼ҵ带 ������ [ static ] 
		
		
	} // main end 
	
	
	// 1. �޼ҵ� ���� 
	// ���α׷� ���� �޼ҵ� 
	public static void start() {
		
		Board board = new Board(); // �ʵ尡 null �� ���� ��ü 
		
		while(true) {
			
			board.blist(); // 1. �� ��� 
			
			System.out.println("0.�۾��� 1.�ۻ󼼺��� ");
			int ch = scanner.nextInt();
			
			if( ch == 0 ) board.bwrite(); // 2.�۾��� 
			if( ch == 1 ) {
				System.out.println("[[[ �Խù���ȣ �Է� : ]]]"); 
				int ch2 =scanner.nextInt();
				board.bview( ch2 ); // 3.�� ��������
			}
			
			
		}
		
	}

} //class end 






