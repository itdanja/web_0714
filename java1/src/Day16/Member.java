package Day16;

public class Member<T> {
			// 제네릭 : 외부로부터 들어오는 자료형타입
	
	private String membername;
	private T[] memberlist;
	
	public Member( String membername ) {
		this.membername = membername;
		memberlist = (T[])new Object[10];
			// Object 클래스로 메모리 할당 받고 자료형변환 
	}
	
	public void add( T t ) {
		for( int i = 0 ; i<memberlist.length ;i++) {
			if( memberlist[i]==null) {
				memberlist[i] = t;
				return;
			}
		}
		System.out.println("[[[ 명단이 꽉 찼습니다 ]]]");
	}

	// get , set 메소드 
	public String getMembername() {
		return membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}

	public T[] getMemberlist() {
		return memberlist;
	}

	public void setMemberlist(T[] memberlist) {
		this.memberlist = memberlist;
	}
	
	
	
	
	
}
