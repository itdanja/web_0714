package Day19;

import java.io.FileOutputStream;

public class FileUtil {
	
	// ���� ��� 
		// ȸ�����ϰ��
		static String memberpath = "C:/Users/User/git/web_0714/java1/src/Day19/memberlist.txt";
		static String logpath = "C:/Users/User/git/web_0714/java1/src/Day19/logpath.txt";
	// �������� �޼ҵ� 
	public static void filesave( int type , int contents) throws Exception {
							// �μ� : type : �������� ���� ��
		FileOutputStream outputStream = null ; //���� 
		if( type == 1 ) {
			outputStream = new FileOutputStream(memberpath);
			// ����Ʈ => �ϳ��� ��ü ������ => ��ü�� �ʵ庰 �з� => ����Ʈ ��ȯ => ���� 
			for( Member member : Consoleprogram.memberlist ) {
				String outstring = member.getNo()+","+member.getId()+","+member.getPassword()+","+member.getName()+","+member.getEmail()+","+member.getPoint() +"\n"; 
				outputStream.write( outstring.getBytes() ); // ����Ʈ�� ��ȯ�� ����
			}
		}
		if( type == 0 ) {
			outputStream = new FileOutputStream(logpath);
			String outstring = contents+"\n";
			outputStream.write( outstring.getBytes() );
		}
	}
	// ����ȣ�� �޼ҵ� 
}
