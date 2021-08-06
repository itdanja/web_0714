package Day08;

import java.util.Date;
import java.util.Scanner;

public class Board {
	// 게시물 클래스 
	
	// 1. 필드
		int bno;			// 1. 번호 
		String btitle;		// 2. 제목 
		String bcontents;	// 3. 내용
		String bwriter;		// 4. 작성자 
		String bdate;		// 5. 작성일
		int bcount;			// 6. 조회수
	// 2. 생성자 
		// [ 생성자명 == 클래스명 동일]
		// 1. 빈생성자 [ ctrl+스페이바 ]
		public Board() {} 
		// 2. 모든 필드를 받는 생성자[ 오른쪽클릭 => source =>  generated constructor ] 
		public Board(int bno, String btitle, String bcontents,
				String bwriter, String bdate, int bcount) {
			
			this.bno = bno; 
			this.btitle = btitle;
			this.bcontents = bcontents;
			this.bwriter = bwriter;
			this.bdate = bdate;
			this.bcount = bcount; 
		}
		// 3. 기타 생성자 등등
	// 3. 메소드 : 
		// 1. 글쓰기 
		public void bwrite() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("[[[ 글쓰기 페이지 ]]]");
			System.out.print("글제목 : "); String btitle =  scanner.nextLine(); 
			System.out.print("글내용 : "); String bcontents =  scanner.nextLine(); 
			System.out.print("작성자 : "); String bwriter=  scanner.next();
			
			// 1. 객체 생성 
			int bno = -1; // 인덱스 -1 없음 
				// 게시물번호 [ 1. 자동[DB] 2. 수동 ]
				for( int i = 0 ; i<Day08_2_Start.boardlist.length ; i++ ) {
					if( Day08_2_Start.boardlist[i] == null ) {
						
						// 1. 첫번째 게시물인 경우 1부터 시작 
						if( i == 0 )  {
							bno = 1; break;
						}
						// 2. 첫번째 게시물이 아닌경우는 마지막 게시물의 +1
						else {
							bno = Day08_2_Start.boardlist[i-1].bno + 1 ; break; 
											// 마지막 게시물의 번호 +1
						}
					}
				}
				Date date = new Date(); // 오늘날짜/시간 클래스
			String bdate = date.toString(); // 날짜객체의 정보 
			int bcount = 1; // 게시물 작성시 조회수 1 부터 시작 
			
			Board board = new Board(bno, btitle, bcontents, bwriter, bdate, bcount);
			
			// 2. 여러개 객체 저장할 메모리??(주기억장치) [ 배열 , 리스트 등 ]
			for( int i = 0 ;i<Day08_2_Start.boardlist.length ; i ++ ) {
				if( Day08_2_Start.boardlist[i] == null ) {
					Day08_2_Start.boardlist[i] = board;
					break;
				}
			}
			
			// 3. 프로그램 종료시 저장되는 메모리(보조기억장치) [ 파일처리 , database 등 ] 
				// 생략 
			
		}
		// 2. 글목록 
		public void blist() {
			
			System.out.println("[[[[ 커뮤니티 ]]]]");
			System.out.println("번호\t제목\t\t작성자\t조회수\t작성일");
			
			for( int i = 0 ; i<Day08_2_Start.boardlist.length ; i++ ) {
				
				if( Day08_2_Start.boardlist[i] == null ) return; // 메소드 끝내기 
				System.out.print(Day08_2_Start.boardlist[i].bno + "\t");
				System.out.print(Day08_2_Start.boardlist[i].btitle + "\t\t");
				System.out.print(Day08_2_Start.boardlist[i].bwriter + "\t");
				System.out.print(Day08_2_Start.boardlist[i].bcount + "\t");
				System.out.print(Day08_2_Start.boardlist[i].bdate + "\t" );
				System.out.println();
			}
			
		}
		// 3. 글수정 
		public void bupdate( int bno  ) { // 현재 메소드 외부로부터 현재 메소드로 들어오는 데이터 ( 자료형 동일하게 ) [ 인수 :  ] 
			Scanner scanner = new Scanner(System.in);
			System.out.println("[[[ 글수정 페이지 ]]]");
			
			int index = findboard(bno);
			if( index == -1 ) return;
			
			System.out.print(" 제목 : ");
			Day08_2_Start.boardlist[index].btitle = scanner.nextLine();
			
			System.out.print(" 내용 : ");
			Day08_2_Start.boardlist[index].bcontents = scanner.nextLine();
			
			System.out.println("[[[ 글수정 ]] 완료 ");
			
		}
		// 4. 글삭제 
		public void bdelete( int bno ) {
			// System.out.println("[[[ 글삭제 페이지 ]]]");
			System.out.println("[[ 해당 게시물이 삭제 되었습니다 ]] ");
			
			int index = findboard(bno); // 게시물 찾기 메소드 호출 
			if( index == -1 ) return; // 만약에 게시물이 없으면 메소드 종료 
			
			// 해당 게시물번호의 객체 삭제 
			Day08_2_Start.boardlist[index] = null; // 찾은 게시물 삭제 
			// 삭제된 게시물 뒤로 한칸씩 당기기 
			for( int j = index ; j<Day08_2_Start.boardlist.length ; j++ ) {
					// j 는 삭제된 게시물 뒤 게시물들
				// 다음 객체가 있으면 
				if( Day08_2_Start.boardlist[j+1] != null ) {
					Day08_2_Start.boardlist[j] = Day08_2_Start.boardlist[j+1];
				}else {
					Day08_2_Start.boardlist[j] = null;
					break;
				}
			}
			
		}
		// 5. 조회수증가 
		public void bcount() {
			//System.out.println("[[[ 조회수증가 페이지 ]]]");
			this.bcount++; // 조회수 증가
		}
		// 6. 글 상세페이지
		public void bview( int bno ) { // 인수o
			
			int index =  findboard(bno); // 게시물찾기 메소드 호출 
			if( index == -1 ) return; // 만약에 -1 이면 현재 메소드 종료
			
			Board board  = Day08_2_Start.boardlist[index]; // 찾은 게시물의 위치의 게시물 가져오기
			board.bcount(); // 조회수 증가 메소드 호출 

			System.out.println("[[[ 상세페이지 페이지 ]]]");
			System.out.println(" 제목 : " + board.btitle );
			System.out.println(" 작성자 : "+board.bwriter+"  조회수 : "+board.bcount +" 작성일 : " + board.bdate);
			System.out.println(" 내용 : " + board.bcontents );
			System.out.println(" 1.수정 2.삭제 3.댓글작성 4.뒤로가기");
			Scanner scanner = new Scanner(System.in);
			int ch = scanner.nextInt();
			if( ch == 1 ) { bupdate( bno );}
			if( ch == 2 ) { bdelete( bno ); return; }
			if( ch == 3 ) {}
			if( ch == 4 ) { 
				return; //메소드 종료
			}
		}
		
		// 7. 게시물번호의 해당하는 배열의 위치를 찾는 메소드 
		public int findboard( int bno ) {
			// 반환타입 : 찾은 배열의 위치 반환 
			for( int i = 0 ; i<Day08_2_Start.boardlist.length ; i++  ) {	
				if( Day08_2_Start.boardlist[i] !=null && Day08_2_Start.boardlist[i].bno == bno ) {
						/// i번째 인덱스의 배열값이 널이 아니면서 i번째 인덱스의 배열값의 게시물번호가 선택한 게시물번호와 같으면 
					return i ; // 찾은 게시물의 배열위치 반환 
				}
			}
			System.out.println("[[오류]] 해당 게시물 번호가 없습니다 ..");
			return -1; // 배열 인덱스 시작 0부터 -1
		}
		

		/*
		 * 1. 댓글 클래스 설계  
				1. 필드
					1. 게시물번호
					2. 내용
					3. 작성자 
				2. 생성자
					임의
				3. 메소드 
					1. 댓글쓰기
					2. 댓글목록[ 게시물 상세페이지 하단 표시 ]
					3. 댓글삭제
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
