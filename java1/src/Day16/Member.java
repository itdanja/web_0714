package Day16;

public class Member<T> {
			// ���׸� : �ܺηκ��� ������ �ڷ���Ÿ��
	
	private String membername;
	private T[] memberlist;
	
	public Member( String membername ) {
		this.membername = membername;
		memberlist = (T[])new Object[10];
			// Object Ŭ������ �޸� �Ҵ� �ް� �ڷ�����ȯ 
	}
	
	public void add( T t ) {
		for( int i = 0 ; i<memberlist.length ;i++) {
			if( memberlist[i]==null) {
				memberlist[i] = t;
				return;
			}
		}
		System.out.println("[[[ ����� �� á���ϴ� ]]]");
	}

	// get , set �޼ҵ� 
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
