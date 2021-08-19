package Dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import Domain.List;
import Domain.Member;

public class FileUtil {
	
	// 파일경로 
	static String memberpath = "C:/Users/User/Desktop/H/web0714/javafx_project/src/Dao/memberlist.txt";
	
	public static void filesave( ) {
    	try {
    		FileOutputStream fileOutputStream = new FileOutputStream(memberpath);
    		// 스트림 : 문자열 -> 바이트열 내보내기 
    		for( Member temp : List.members ) {
    			String outstring = temp.getId()+","+temp.getPassword()+","+temp.getName()+","
    								+temp.getEmail()+","+temp.getPhone()+","+temp.getPoint()+"\n";
    			fileOutputStream.write( outstring.getBytes() );
    		}
    		fileOutputStream.close();
    	}
    	catch (Exception e) {}
	}
	
	public static void fileload() {
		
		try {
			FileInputStream fileInputStream = new FileInputStream(memberpath);
			// 바이트열 -> 문자열 변환
			byte[] bytes = new byte[10000];
			fileInputStream.read( bytes );
			
			String instring = new String( bytes );
			String[] Members = instring.split("\n");
			
			for( int i = 0 ; i<Members.length-1 ; i++  ) {
				String[] field = Members[i].split(",");
				Member member = new Member( field[0], field[1],field[2], 
						field[3], field[4], Integer.parseInt(field[5]) );
				List.members.add(member);
			}
			
			fileInputStream.close();
		}
		catch (Exception e) {}
		
	}

}
