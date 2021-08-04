package Day15;

public class Day15_4 {

	// 동기화 [ synchronized ] 
		// 여러개의 스레드가 하나의 메모리[변수,메소드] 접근할때 순서매기기 
			// 먼저 접근한 스레드가 끝날때까지 다음스레드 대기 
				// 먼저 접근한 스레드가 끝나면 다음스레드 접근
	public static void main(String[] args) {
		
		// 공동 계좌 
		Account account = new Account();
		
		User1 user1 = new User1();
		user1.setaccount(account);
		user1.start();
		
		User2 user2 = new User2();
		user2.setaccount(account);
		user2.start();
		
	}
	
	
}
