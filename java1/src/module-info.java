module java1 {
	
	// ���� ������Ʈ�� ���̺귯�� �߰� 
	requires activation;
	requires mail;
	
	// ����� ��Ű���� ���� 
	// opens ��Ű���� to ���̺귯����
	opens Day14 to activation , mail;
	
}