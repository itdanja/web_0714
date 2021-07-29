package Day11;

public class Day11_4 {
	
	public static void main(String[] args) {
		
		자동차 car = new 자동차();
		
		for( int i = 1 ; i<=10 ; i++ ) {
			
			int 위치 = car.드라이브();
			
			switch( 위치 ) {
				case 1 : 
					System.out.println("[[ 금호타이어로 교체 ]]] ");
					car.앞왼쪽타이어 = new 금호타이어("앞왼쪽타이어", 10);
					break; 
				case 2 : 
					System.out.println("[[ 금호타이어로 교체 ]]] ");
					car.앞오른쪽타이어 = new 금호타이어("앞오른쪽타이어", 10);
					break;
				case 3 : 
					System.out.println("[[ 금호타이어로 교체 ]]] ");
					car.뒤왼쪽타이어 = new 금호타이어("뒤왼쪽타이어", 10);
					break; 
				case 4 : 
					System.out.println("[[ 금호타이어로 교체 ]]] ");
					car.뒤오른쪽타이어 = new 금호타이어("뒤오른쪽타이어", 10);
					break; 		
			}
			
		}
		
	}

}
