package Day11;

public class 자동차 implements 기어변속 {
	
	// 필드 
	타이어 앞왼쪽타이어 = new 타이어("앞왼쪽", 10);
	타이어 앞오른쪽타이어 = new 타이어("앞오른쪽",8);
	타이어 뒤왼쪽타이어 = new 타이어("뒤왼쪽" , 9 );
	타이어 뒤오른쪽타이어 = new 타이어("뒤오른쪽" , 4);
	// 생성자 
	
	// 메소드
	@Override
	public int 드라이브() {
		
		System.out.println(" 드라이브 ");
		
		if( 앞왼쪽타이어.회전() == false ) {
			주차();
			return 1 ; // 고장난 위치 
		}
		if( 앞오른쪽타이어.회전() == false ) {
			주차();
			return 2; // 고장난 위치 
		}
		if( 뒤왼쪽타이어.회전() == false ) {
			주차();
			return 3 ; // 고장난 위치 
		}
		if( 뒤오른쪽타이어.회전() == false ) {
			주차();
			return 4; // 고장난 위치 
		}
		
		return 0 ; // 이상없으면
	}
	@Override
	public void 주차() {
		System.out.println(" 주차 ");
		
	}
	
	@Override
	public int 후진() {
		System.out.println(" 후진 ");
		
		if( 앞왼쪽타이어.회전() == false ) {
			주차();
			return 1 ; // 고장난 위치 
		}
		if( 앞오른쪽타이어.회전() == false ) {
			주차();
			return 2; // 고장난 위치 
		}
		if( 뒤왼쪽타이어.회전() == false ) {
			주차();
			return 3 ; // 고장난 위치 
		}
		if( 뒤오른쪽타이어.회전() == false ) {
			주차();
			return 4; // 고장난 위치 
		}
		
		return 0 ; // 이상없으면
	}
	@Override
	public int 중립() {
		return 0;
	}
	

}
