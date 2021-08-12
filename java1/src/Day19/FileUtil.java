package Day19;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileUtil {
	
	// ���� ��� 
		static String memberpath = "C:/Users/User/git/web_0714/java1/src/Day19/memberlist.txt";
		static String boardpath = "C:/Users/User/git/web_0714/java1/src/Day19/boardpath.txt";
		static String replypath = "C:/Users/User/git/web_0714/java1/src/Day19/replylist.txt";
		
		static String logpath = "C:/Users/User/git/web_0714/java1/src/Day19/logpath.txt";
		static String logpath2 = "C:/Users/User/git/web_0714/java1/src/Day19/logpath2.txt";
		static String logpath3 = "C:/Users/User/git/web_0714/java1/src/Day19/logpath3.txt";
		
	// �������� �޼ҵ� 
	public static void filesave( int type , int contents) throws Exception {
							// �μ� : type : �������� ���п�
		FileOutputStream outputStream = null ; //���� 
		// ������½�Ʈ�� : FileOutputStream
		
		if( type == 1 ) { // ȸ������Ʈ ���Ͽ� ���� 
			outputStream = new FileOutputStream(memberpath);
			// ����Ʈ => �ϳ��� ��ü ������ => ��ü�� �ʵ庰 �з� => ����Ʈ ��ȯ => ���� 
			for( Member member : Consoleprogram.memberlist ) { // "," : �ʵ屸�п� // "\n":ȸ�����п�
				String outstring = member.getNo()+","+member.getId()+","+member.getPassword()+","+member.getName()+","+member.getEmail()+","+member.getPoint() +"\n"; 
				outputStream.write( outstring.getBytes() ); // ����Ʈ�� ��ȯ�� ����
			}
			outputStream.flush(); // �ʱ�ȭ [ ��Ʈ���� �ȿ� �ִ� ����Ʈ ���� ]
			outputStream.close(); // ��Ʈ�� �ݱ� 
		}
		
		if( type == 2 ) { // �Խù�����Ʈ ���Ͽ� ���� 
			outputStream = new FileOutputStream(boardpath);
			
			for( Board board : Consoleprogram.boardlist ) {
				String outstring = board.getBno() +","+board.getBtitle() +","+board.getBcontents() + ","+
								board.getBwriter()+","+board.getBdate()+","+board.getBcount()+"\n";
				outputStream.write( outstring.getBytes() );
			}
			outputStream.flush(); // �ʱ�ȭ [ ��Ʈ���� �ȿ� �ִ� ����Ʈ ���� ]
			outputStream.close(); // ��Ʈ�� �ݱ� 
		}
		
		if( type == 4 ) {  // ��۸���Ʈ ���Ͽ� ���� 
			outputStream = new FileOutputStream( replypath );
			
			for( Reply reply : Consoleprogram.replylist  ) {
				String outstring = reply.getRno() +","+reply.getBno() +","+
								reply.getRcontents()+","+reply.getRwriter()+"\n";
				outputStream.write( outstring.getBytes() );
			}
			outputStream.flush();
			outputStream.close();
		}
		
		if( type == 0 ) { // ȸ����ü�� ���Ͽ� ���� 
			outputStream = new FileOutputStream(logpath);
			String outstring = contents+"\n";
			outputStream.write( outstring.getBytes() );
			
			outputStream.flush(); // �ʱ�ȭ [ ��Ʈ���� �ȿ� �ִ� ����Ʈ ���� ]
			outputStream.close(); // ��Ʈ�� �ݱ� 
		}
		
		if( type == 3 ) { // �Խù���ü�� ���Ͽ� ���� 
			outputStream = new FileOutputStream(logpath2);
			String outstring = contents+"\n";
			outputStream.write( outstring.getBytes() );
			outputStream.flush(); // �ʱ�ȭ [ ��Ʈ���� �ȿ� �ִ� ����Ʈ ���� ]
			outputStream.close(); // ��Ʈ�� �ݱ� 
		}
		
		if( type == 5 ) {  // �����ü�� ���Ͽ� ���� 
			outputStream = new FileOutputStream(logpath3);
			String outstring = contents+"\n";
			outputStream.write( outstring.getBytes() );
			outputStream.flush(); // �ʱ�ȭ [ ��Ʈ���� �ȿ� �ִ� ����Ʈ ���� ]
			outputStream.close(); // ��Ʈ�� �ݱ� 
		}
		
	}

	// ����ȣ�� �޼ҵ� 
	public static void fileload( int type ) throws Exception {
		
		FileInputStream fileInputStream = null;
		
		if( type == 1 ) { // ȸ�� �ҷ����� 
	 
			fileInputStream = new FileInputStream(memberpath); // �����Է½�Ʈ���� ���Ͽ��� [ �޸� �Ҵ� ]
			// 2. ��Ʈ��(����:����Ʈ) ����Ʈ �� �о����
			byte[] bytes = new byte[10000]; // 10kb ���� �迭
			fileInputStream.read( bytes );
			// 3. ���ڿ� ��ȯ [ ����Ʈ => ���ڿ� ]
			String instring = new String(bytes);
			// 4. ȸ�� �и��ϱ� \n
			String[] members = instring.split("\n"); // [������ ȸ���� ����]
			// 5. �ݺ��� �̿��� ȸ���� �ʵ� �и�
			for( int i = 0 ; i<members.length-1 ; i++  ) {
				String[] field = members[i].split(","); // ȸ������ �ʵ尣 �и� 
				// 6. ���ص� �ʵ带 ��ü�� ���� 
				Member member = new Member( 
						Integer.parseInt(field[0]),
						field[1] , field[2] , field[3] , field[4],
						Integer.parseInt(field[5]) );
				// 7. �� ��ü�� ����Ʈ ���
				Consoleprogram.memberlist.add(member);
			}
			fileInputStream.close(); // ��Ʈ�� �ݱ� 
		}
		
		if( type == 2 ) {  // �Խù� �ҷ����� 
			fileInputStream = new FileInputStream(boardpath);
			byte[] bytes = new byte[10000];
			fileInputStream.read( bytes );
			String instring = new String( bytes );
			String[] boards = instring.split("\n"); // �Խù� �и�  
			for( int i = 0 ; i<boards.length-1 ; i++ ) {
								// ������(����) ���� 
				String[] field = boards[i].split(",");
				Board board = new Board( 
							Integer.parseInt( field[0] ),
							field[1] , field[2] , field[3] , field[4] ,
							Integer.parseInt( field[5] )
						);
				Consoleprogram.boardlist.add(board);
			}
			fileInputStream.close(); // ��Ʈ�� �ݱ� 
		}
		
		if( type == 4 ) {  // ��� �ҷ����� 
			fileInputStream = new FileInputStream(replypath);
			byte[] bytes = new byte[10000];
			fileInputStream.read(bytes);
			String instring = new String(bytes);
			String[] replys = instring.split("\n");
			for( int i = 0 ; i<replys.length-1 ; i++ ) {
				String[] field = replys[i].split(",");
				Reply reply = new Reply( Integer.parseInt( field[0] ) ,
						Integer.parseInt( field[1] ), field[2], field[3]);
				
				Consoleprogram.replylist.add(reply);
			}
			fileInputStream.close();//��Ʈ�� �ݱ� 
		}

		if( type == 0 ) { // ȸ�� ��ü�� �ҷ�����
			fileInputStream = new FileInputStream(logpath); 
			// 2. ��Ʈ��(����:����Ʈ) ����Ʈ �� �о����
			byte[] bytes = new byte[1024];
			fileInputStream.read(bytes);
			// 3. ���ڿ� ��ȯ [ ����Ʈ => ���ڿ� ]
			String instring = new String(bytes);
			String[] log = instring.split("\n");
			// 4. ���ڿ� ��ȯ �� ȸ����ȣ �ֱ� 
			Member.totalno = Integer.parseInt(log[0]);
			fileInputStream.close();
		}
		
		if( type == 3 ) { // �Խù� ��ü�� �ҷ�����
			fileInputStream = new FileInputStream(logpath2);
			byte[] bytes = new byte[1024];
			fileInputStream.read(bytes);
			String instring = new String(bytes);
			String[] log = instring.split("\n");
			Board.totalno = Integer.parseInt(log[0]);
			fileInputStream.close();
		}
		
		if( type == 5 ) { // ��� ��ü�� �ҷ����� 
			fileInputStream = new FileInputStream(logpath3);
			byte[] bytes = new byte[1024];
			fileInputStream.read(bytes);
			String instring = new String(bytes);
			String[] log = instring.split("\n");
			Reply.totalno = Integer.parseInt(log[0]);
			fileInputStream.close();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
