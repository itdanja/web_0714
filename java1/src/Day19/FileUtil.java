package Day19;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileUtil {
	
	// ���� ��� 
		// ȸ�����ϰ��
		static String memberpath = "C:/Users/User/git/web_0714/java1/src/Day19/memberlist.txt";
		static String logpath = "C:/Users/User/git/web_0714/java1/src/Day19/logpath.txt";
		
	// �������� �޼ҵ� 
	public static void filesave( int type , int contents) throws Exception {
							// �μ� : type : �������� ���п�
		FileOutputStream outputStream = null ; //���� 
		// ������½�Ʈ�� : FileOutputStream
		if( type == 1 ) {
			outputStream = new FileOutputStream(memberpath);
			// ����Ʈ => �ϳ��� ��ü ������ => ��ü�� �ʵ庰 �з� => ����Ʈ ��ȯ => ���� 
			for( Member member : Consoleprogram.memberlist ) { // "," : �ʵ屸�п� // "\n":ȸ�����п�
				String outstring = member.getNo()+","+member.getId()+","+member.getPassword()+","+member.getName()+","+member.getEmail()+","+member.getPoint() +"\n"; 
				outputStream.write( outstring.getBytes() ); // ����Ʈ�� ��ȯ�� ����
			}
			outputStream.flush(); // �ʱ�ȭ [ ��Ʈ���� �ȿ� �ִ� ����Ʈ ���� ]
			outputStream.close(); // ��Ʈ�� �ݱ� 
		}
		if( type == 0 ) {
			outputStream = new FileOutputStream(logpath);
			String outstring = contents+"\n";
			outputStream.write( outstring.getBytes() );
			
			outputStream.flush(); // �ʱ�ȭ [ ��Ʈ���� �ȿ� �ִ� ����Ʈ ���� ]
			outputStream.close(); // ��Ʈ�� �ݱ� 
		}
		
	}
	// ����ȣ�� �޼ҵ� 
	public static void fileload( int type ) throws Exception {
		
		FileInputStream fileInputStream = null;
		
		if( type == 1 ) {
			fileInputStream = new FileInputStream(memberpath);	
			byte[] bytearr = new byte[1024000]; // ������ ũ�� => ���� 
			fileInputStream.read(bytearr); // ��Ʈ�� ����Ʈ �о�ͼ� �迭�� ����
			// 1. ���ڿ� ��ȯ
			String filecontents = new String(bytearr);
			// 2. ȸ���� �з� 
			String[] members = filecontents.split("\n");
			// 3. �ʵ庰 �з� 
			for( String member : members ) {
				if( member.equals("") ) return;
				String[] fileds = member.split(",");
				// ȸ����ȣ , ����Ʈ => int������ ����ȯ
				// ��ü����
				Member temp = new Member( 
						Integer.parseInt( fileds[0]), 
						fileds[1], fileds[2], fileds[3], fileds[4],
						Integer.parseInt(fileds[5]) );
				// ����Ʈ�� ����
				Consoleprogram.memberlist.add(temp);
			}
			fileInputStream.close();
		}
		if( type == 0 ) {
			fileInputStream = new FileInputStream(logpath);
			byte[] bytearr = new byte[1024]; // ������ ũ�� => ���� 
			fileInputStream.read(bytearr);
			Member.totalno = new Integer( new String(bytearr));
			fileInputStream.close();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
