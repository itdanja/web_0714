package Day19;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileUtil {
	
	// 파일 경로 
		// 회원파일경로
		static String memberpath = "C:/Users/User/git/web_0714/java1/src/Day19/memberlist.txt";
		static String logpath = "C:/Users/User/git/web_0714/java1/src/Day19/logpath.txt";
		
	// 파일저장 메소드 
	public static void filesave( int type , int contents) throws Exception {
							// 인수 : type : 저장파일 구분용
		FileOutputStream outputStream = null ; //선언만 
		// 파일출력스트림 : FileOutputStream
		if( type == 1 ) {
			outputStream = new FileOutputStream(memberpath);
			// 리스트 => 하나씩 객체 꺼내기 => 객체를 필드별 분류 => 바이트 변환 => 쓰기 
			for( Member member : Consoleprogram.memberlist ) { // "," : 필드구분용 // "\n":회원구분용
				String outstring = member.getNo()+","+member.getId()+","+member.getPassword()+","+member.getName()+","+member.getEmail()+","+member.getPoint() +"\n"; 
				outputStream.write( outstring.getBytes() ); // 바이트로 변환후 쓰기
			}
			outputStream.flush(); // 초기화 [ 스트림에 안에 있는 바이트 제거 ]
			outputStream.close(); // 스트림 닫기 
		}
		if( type == 0 ) {
			outputStream = new FileOutputStream(logpath);
			String outstring = contents+"\n";
			outputStream.write( outstring.getBytes() );
			
			outputStream.flush(); // 초기화 [ 스트림에 안에 있는 바이트 제거 ]
			outputStream.close(); // 스트림 닫기 
		}
		
	}
	// 파일호출 메소드 
	public static void fileload( int type ) throws Exception {
		
		FileInputStream fileInputStream = null;
		
		if( type == 1 ) {
			fileInputStream = new FileInputStream(memberpath);	
			byte[] bytearr = new byte[1024000]; // 파일의 크기 => 임의 
			fileInputStream.read(bytearr); // 스트림 바이트 읽어와서 배열에 저장
			// 1. 문자열 변환
			String filecontents = new String(bytearr);
			// 2. 회원별 분류 
			String[] members = filecontents.split("\n");
			// 3. 필드별 분류 
			for( String member : members ) {
				if( member.equals("") ) return;
				String[] fileds = member.split(",");
				// 회원번호 , 포인트 => int형으로 형변환
				// 객체생성
				Member temp = new Member( 
						Integer.parseInt( fileds[0]), 
						fileds[1], fileds[2], fileds[3], fileds[4],
						Integer.parseInt(fileds[5]) );
				// 리스트에 저장
				Consoleprogram.memberlist.add(temp);
			}
			fileInputStream.close();
		}
		if( type == 0 ) {
			fileInputStream = new FileInputStream(logpath);
			byte[] bytearr = new byte[1024]; // 파일의 크기 => 임의 
			fileInputStream.read(bytearr);
			Member.totalno = new Integer( new String(bytearr));
			fileInputStream.close();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
