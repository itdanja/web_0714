package Day14;

import javax.mail.Session;

public class Day14_2 {
	
	// 외부 API : java mail
	// 메일 : SMTP : Simple Mail Transfer Protocol
		//  Protocol : 통신 규약
	
	// 1. 메일 관련 라이브러리 다운로드 
		// 1. activation.jar
		// 2. mail-1.4.7.jar
	// 2. 외부 라이브러리를 현재 프로젝트 추가 
		// 1. 현재 프로젝트 오른쪽클릭
		// 2. build path => configure build path 
		// 3. 탭[메뉴]에서 libraries => add external jars
		// 4. 다운로드 받은 2개 라이브러리 추가 
			// ** jdk11 버전 이상
			// 1. 탭[메뉴]에서 libraries => modulepath선택 => add external jars
			// 2.  module-info 파일에 아래 추가 
	//				requires activation; 
	//				requires mail;
	//				
	//				//opens 라이브러리를 사용할패키지명 to activation , mail;
	//					opens day05 to activation , mail;
	
	
	public static void main(String[] args) {
		Session session;
	}
}
