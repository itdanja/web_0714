package Day19;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileUtil {
	
	// 파일 경로 
		static String memberpath = "C:/Users/User/git/web_0714/java1/src/Day19/memberlist.txt";
		static String boardpath = "C:/Users/User/git/web_0714/java1/src/Day19/boardpath.txt";
		static String replypath = "C:/Users/User/git/web_0714/java1/src/Day19/replylist.txt";
		
		static String logpath = "C:/Users/User/git/web_0714/java1/src/Day19/logpath.txt";
		static String logpath2 = "C:/Users/User/git/web_0714/java1/src/Day19/logpath2.txt";
		static String logpath3 = "C:/Users/User/git/web_0714/java1/src/Day19/logpath3.txt";
		
	// 파일저장 메소드 
	public static void filesave( int type , int contents) throws Exception {
							// 인수 : type : 저장파일 구분용
		FileOutputStream outputStream = null ; //선언만 
		// 파일출력스트림 : FileOutputStream
		
		if( type == 1 ) { // 회원리스트 파일에 저장 
			outputStream = new FileOutputStream(memberpath);
			// 리스트 => 하나씩 객체 꺼내기 => 객체를 필드별 분류 => 바이트 변환 => 쓰기 
			for( Member member : Consoleprogram.memberlist ) { // "," : 필드구분용 // "\n":회원구분용
				String outstring = member.getNo()+","+member.getId()+","+member.getPassword()+","+member.getName()+","+member.getEmail()+","+member.getPoint() +"\n"; 
				outputStream.write( outstring.getBytes() ); // 바이트로 변환후 쓰기
			}
			outputStream.flush(); // 초기화 [ 스트림에 안에 있는 바이트 제거 ]
			outputStream.close(); // 스트림 닫기 
		}
		
		if( type == 2 ) { // 게시물리스트 파일에 저장 
			outputStream = new FileOutputStream(boardpath);
			
			for( Board board : Consoleprogram.boardlist ) {
				String outstring = board.getBno() +","+board.getBtitle() +","+board.getBcontents() + ","+
								board.getBwriter()+","+board.getBdate()+","+board.getBcount()+"\n";
				outputStream.write( outstring.getBytes() );
			}
			outputStream.flush(); // 초기화 [ 스트림에 안에 있는 바이트 제거 ]
			outputStream.close(); // 스트림 닫기 
		}
		
		if( type == 4 ) {  // 댓글리스트 파일에 저장 
			outputStream = new FileOutputStream( replypath );
			
			for( Reply reply : Consoleprogram.replylist  ) {
				String outstring = reply.getRno() +","+reply.getBno() +","+
								reply.getRcontents()+","+reply.getRwriter()+"\n";
				outputStream.write( outstring.getBytes() );
			}
			outputStream.flush();
			outputStream.close();
		}
		
		if( type == 0 ) { // 회원전체수 파일에 저장 
			outputStream = new FileOutputStream(logpath);
			String outstring = contents+"\n";
			outputStream.write( outstring.getBytes() );
			
			outputStream.flush(); // 초기화 [ 스트림에 안에 있는 바이트 제거 ]
			outputStream.close(); // 스트림 닫기 
		}
		
		if( type == 3 ) { // 게시물전체수 파일에 저장 
			outputStream = new FileOutputStream(logpath2);
			String outstring = contents+"\n";
			outputStream.write( outstring.getBytes() );
			outputStream.flush(); // 초기화 [ 스트림에 안에 있는 바이트 제거 ]
			outputStream.close(); // 스트림 닫기 
		}
		
		if( type == 5 ) {  // 댓글전체수 파일에 저장 
			outputStream = new FileOutputStream(logpath3);
			String outstring = contents+"\n";
			outputStream.write( outstring.getBytes() );
			outputStream.flush(); // 초기화 [ 스트림에 안에 있는 바이트 제거 ]
			outputStream.close(); // 스트림 닫기 
		}
		
	}

	// 파일호출 메소드 
	public static void fileload( int type ) throws Exception {
		
		FileInputStream fileInputStream = null;
		
		if( type == 1 ) { // 회원 불러오기 
	 
			fileInputStream = new FileInputStream(memberpath); // 파일입력스트림에 파일연결 [ 메모리 할당 ]
			// 2. 스트림(단위:바이트) 바이트 로 읽어오기
			byte[] bytes = new byte[10000]; // 10kb 정도 배열
			fileInputStream.read( bytes );
			// 3. 문자열 변환 [ 바이트 => 문자열 ]
			String instring = new String(bytes);
			// 4. 회원 분리하기 \n
			String[] members = instring.split("\n"); // [마지막 회원은 공백]
			// 5. 반복문 이용한 회원내 필드 분리
			for( int i = 0 ; i<members.length-1 ; i++  ) {
				String[] field = members[i].split(","); // 회원마다 필드간 분리 
				// 6. 분해된 필드를 객체로 생성 
				Member member = new Member( 
						Integer.parseInt(field[0]),
						field[1] , field[2] , field[3] , field[4],
						Integer.parseInt(field[5]) );
				// 7. 각 객체를 리스트 담기
				Consoleprogram.memberlist.add(member);
			}
			fileInputStream.close(); // 스트림 닫기 
		}
		
		if( type == 2 ) {  // 게시물 불러오기 
			fileInputStream = new FileInputStream(boardpath);
			byte[] bytes = new byte[10000];
			fileInputStream.read( bytes );
			String instring = new String( bytes );
			String[] boards = instring.split("\n"); // 게시물 분리  
			for( int i = 0 ; i<boards.length-1 ; i++ ) {
								// 마지막(공백) 제외 
				String[] field = boards[i].split(",");
				Board board = new Board( 
							Integer.parseInt( field[0] ),
							field[1] , field[2] , field[3] , field[4] ,
							Integer.parseInt( field[5] )
						);
				Consoleprogram.boardlist.add(board);
			}
			fileInputStream.close(); // 스트림 닫기 
		}
		
		if( type == 4 ) {  // 댓글 불러오기 
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
			fileInputStream.close();//스트림 닫기 
		}

		if( type == 0 ) { // 회원 전체수 불러오기
			fileInputStream = new FileInputStream(logpath); 
			// 2. 스트림(단위:바이트) 바이트 로 읽어오기
			byte[] bytes = new byte[1024];
			fileInputStream.read(bytes);
			// 3. 문자열 변환 [ 바이트 => 문자열 ]
			String instring = new String(bytes);
			String[] log = instring.split("\n");
			// 4. 숫자열 변환 후 회원번호 넣기 
			Member.totalno = Integer.parseInt(log[0]);
			fileInputStream.close();
		}
		
		if( type == 3 ) { // 게시물 전체수 불러오기
			fileInputStream = new FileInputStream(logpath2);
			byte[] bytes = new byte[1024];
			fileInputStream.read(bytes);
			String instring = new String(bytes);
			String[] log = instring.split("\n");
			Board.totalno = Integer.parseInt(log[0]);
			fileInputStream.close();
		}
		
		if( type == 5 ) { // 댓글 전체수 불러오기 
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
