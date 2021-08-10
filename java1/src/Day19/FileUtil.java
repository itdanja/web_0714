package Day19;

import java.io.FileOutputStream;

public class FileUtil {
	
	// 파일 경로 
		// 회원파일경로
		static String memberpath = "C:/Users/User/git/web_0714/java1/src/Day19/memberlist.txt";
		static String logpath = "C:/Users/User/git/web_0714/java1/src/Day19/logpath.txt";
	// 파일저장 메소드 
	public static void filesave( int type , int contents) throws Exception {
							// 인수 : type : 저장파일 구분 용
		FileOutputStream outputStream = null ; //선언만 
		if( type == 1 ) {
			outputStream = new FileOutputStream(memberpath);
			// 리스트 => 하나씩 객체 꺼내기 => 객체를 필드별 분류 => 바이트 변환 => 쓰기 
			for( Member member : Consoleprogram.memberlist ) {
				String outstring = member.getNo()+","+member.getId()+","+member.getPassword()+","+member.getName()+","+member.getEmail()+","+member.getPoint() +"\n"; 
				outputStream.write( outstring.getBytes() ); // 바이트로 변환후 쓰기
			}
		}
		if( type == 0 ) {
			outputStream = new FileOutputStream(logpath);
			String outstring = contents+"\n";
			outputStream.write( outstring.getBytes() );
		}
	}
	// 파일호출 메소드 
}
