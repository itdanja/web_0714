package Day07;

import java.util.Scanner;

import sun.jvm.hotspot.gc.parallel.PSYoungGen;

public class Day07_ȸ�������α׷� {
	
	// ȸ���� ���α׷� 
	// ȸ������ �� �α��� 
		// [����1] 2�����迭 
		// [����2] �ִ� ȸ�� 100�� ����
			// 1.���̵� , ��й�ȣ �迭�� ���� 
		// [����3] ���ѷ��� [ �ʱ� �޴� ]
			// 1. ȸ������ [�ߺ����̵�x]
			// 2. �α��� 
			// 3. ���� 
		// [����4] �α��ν� �޴� 
			// 1.ȸ��Ż�� 2.�н����庯�� 3.�α׾ƿ�[�ʱ�޴�]
	
	public static void main(String[] args) {
		
		// 0.����[ �ڵ�� �ʿ��� ��ü ]
		Scanner scanner = new Scanner(System.in);
		
		// 1. 2�����迭 [ ȸ��100�� ���̵� ��й�ȣ ] 
			// 100�� ��[ȸ��100��] 2�� ��[���̵�,��й�ȣ]
		String[][] memberlist = new String[100][2];
		
		// 3. ���α׷� ���� �ݺ��� 
		while(true) { // ���ѷ��� [ �������� : 3�� �Է½� break ] 
			
			System.out.println("\n[[[ ȸ���� ���α׷� ]]]");
			System.out.print("[[ 1.ȸ������ 2.�α��� 3.����   ���� : ");
			int ch = scanner.nextInt();
			
			if( ch==1 ) { // ȸ������ 
				
				System.out.println("[[[ ȸ������ ������ ]]]");
				System.out.print("[[ ---> ���̵� : ");	String id = scanner.next();
				System.out.print("[[ ---> ��й�ȣ : ");	String password = scanner.next();
					// �ߺ�üũ 
					boolean idcheck = true;
					for( int i = 0 ; i<memberlist.length ;i++) {
						if( memberlist[i][0] != null && memberlist[i][0].equals(id)) {
							// ����ȸ���� ���̵� null �ƴϸ鼭 ���̵� ������ �Է��� ���̵�� �����ϸ� 
							System.out.println("[[����]] �ߺ��� ���̵� �����մϴ� ");
							idcheck = false;
							break; // ���� ����� �溹�� Ż��
						}
					}
					if( idcheck ) {
						// ȸ������ó�� [ �迭�� ������� ã�Ƽ� ������� ȸ���ֱ�]
						for( int i = 0 ; i<memberlist.length; i++ ) {
							if( memberlist[i][0] == null ) {
								memberlist[i][0] = id;
								memberlist[i][1] = password;
								System.out.println("[[�Ϸ�]] : ȸ�������� �Ǿ����ϴ�");
								break;
							}
						}
					}
			}
			else if( ch==2 ) { // �α��� 
				System.out.println("[[[ �α��� ������ ]]]");
				System.out.print("[[ ---> ���̵� : ");		String id = scanner.next();
				System.out.print("[[ ---> ��й�ȣ : ");	String password = scanner.next();
				
				// �α���ó��
				boolean logincheck = true;
				for( int i = 0 ; i<memberlist.length ; i++ ) {
									// 2�����迭�� ���
									// memberlist.length :  �����
									// memberlist[0].length : ������
					
					if( memberlist[i][0] !=null && memberlist[i][0].equals(id) && memberlist[i][1].equals(password) ) {
						// �α��μ���
						System.out.println("[["+ id +"]] : �α��� ���� ");
						logincheck = false;
						while(true) { // �α��ν� ���ѷ��� [ �������� : �α׾ƿ�[3] �Է½� ]

							System.out.println("\n[[[ ȸ�� �޴� ]]]");
							System.out.print("[[ 1.ȸ��Ż�� 2.��й�ȣ���� 3.�α׾ƿ� 4.�۾��� 5.�۸��  ���� : ");
							int ch2 = scanner.nextInt();
							if( ch2 == 1 ) { // ȸ��Ż�� 
								
								// Ż���� ȸ�� �ڷ� ��ĭ�� ����
								// 1. �α��ε� ȸ��[ Ż��ȸ��] ���� ����� 
								memberlist[i][0] = null;
								memberlist[i][1] = null;
								
								// 2. Ż��ȸ�� �ڷ� ��ĭ�� ���� 
								for( int j = i ; j<memberlist.length ; j++ ) {
									if( memberlist[j+1][0] != null  ) { // ����ȸ�� ���� Ȯ�� 
										memberlist[j][0] = memberlist[j+1][0];	// ������ġ�� j �� ����ȸ�� j+1 ����
										memberlist[j][1] = memberlist[j+1][1];	// ������ġ�� j �� ����ȸ�� j+1 ����
									}else { // ���� ȸ���� ������ 
										memberlist[j][0] = null;
										memberlist[j][1] = null;
										break;
									}
								}
								// 3. �α׾ƿ� 
								System.out.println("[[Ż�𼺰�]] ȸ��Ż�� �Ǿ����ϴ� ");
								break; // �α׾ƿ�

							}
							else if( ch2 == 2 ) { // ��й�ȣ ����
								System.out.println("[[[ �н����庯�� ������ ]]]");
								System.out.print("[[ ---> ���ο��й�ȣ : ");	String newpassword = scanner.next();
								memberlist[i][1] = newpassword;
								System.out.println("[[�˸�]] �н����� ���� �Ϸ� [ �ڵ� �α׾ƿ� �˴ϴ� ] ");
										// i : ���� �α��� ������ ���ȣ[ȸ��]
								break;
							}
							else if( ch2 == 3 ) { System.out.println("[[�α׾ƿ�]] �α׾ƿ� �Ǿ����ϴ�"); break;}
							else {System.out.println("[[�˸�]] �˼����� ��ȣ �Դϴ� ");}
							
						}
						break; // �α׾ƿ� 
					}
				}
				if( logincheck ) System.out.println("[[�α��ν���]] ������ ������ �����ϴ� ");
			}
			else if( ch==3 ) { System.out.println("[[����]] �̿����ּż� �����մϴ� "); break;}
			else {System.out.println("[[�˸�]] �˼����� ��ȣ �Դϴ� ");}
		
		} // while end 
		
		
		
		
		
		
		
	
		
	} // main end
} // class end 
