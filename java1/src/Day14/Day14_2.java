package Day14;

import javax.mail.Session;

public class Day14_2 {
	
	// �ܺ� API : java mail
	// ���� : SMTP : Simple Mail Transfer Protocol
		//  Protocol : ��� �Ծ�
	
	// 1. ���� ���� ���̺귯�� �ٿ�ε� 
		// 1. activation.jar
		// 2. mail-1.4.7.jar
	// 2. �ܺ� ���̺귯���� ���� ������Ʈ �߰� 
		// 1. ���� ������Ʈ ������Ŭ��
		// 2. build path => configure build path 
		// 3. ��[�޴�]���� libraries => add external jars
		// 4. �ٿ�ε� ���� 2�� ���̺귯�� �߰� 
			// ** jdk11 ���� �̻�
			// 1. ��[�޴�]���� libraries => modulepath���� => add external jars
			// 2.  module-info ���Ͽ� �Ʒ� �߰� 
	//				requires activation; 
	//				requires mail;
	//				
	//				//opens ���̺귯���� �������Ű���� to activation , mail;
	//					opens day05 to activation , mail;
	
	
	public static void main(String[] args) {
		Session session;
	}
}
