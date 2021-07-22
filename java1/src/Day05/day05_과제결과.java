package Day05;

public class day05_과제결과 {




}


// 별문제12
/*
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  int N = scan.nextInt();
  int col = 0;
  int space = 2;
  
  for(int i=1; i<=N; i++) {
     for(int j=0; j<i; j++)
        System.out.print("*");
     
     for(int j=(i-1)*2; j<(N*2)-2; j++)
        System.out.print(" ");
     for(int j=0; j<i; j++)
        System.out.print("*");
     
     System.out.println();
  }
  
  for(int i=N; i<(N*2)-1; i++) {
     for(int j=col; j<N-1; j++)
        System.out.print("*");
     
     for(int j=0; j<space; j++)
        System.out.print(" ");
     
     for(int j=col; j<N-1; j++)
        System.out.print("*");
     
     System.out.println();
     col ++;
     space += 2;
  }
  scan.close();
}
}
*/




//별문제13
/*
import java.util.Scanner;

public class Main {
 
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
     
    String map[] = new String[n];
    map[0] = "  *  ";
    map[1] = " * * ";
    map[2] = "*****";
     
    for (int k = 1; 3 * (int)Math.pow(2, k) <= n; ++k) {
        makeBigStar(k, map);
    }
     
    for (int i = 0; i < n; ++i) {
        System.out.println(map[i]);
    }
}
 
	private static void makeBigStar(int k, String map[]) {
	    int bottom = 3 * (int)Math.pow(2, k);
	    int middle = bottom / 2;
	     
	    for (int i = middle; i < bottom; ++i) {
	        map[i] = map[i - middle] + " " + map[i -middle];
	    }
	     
	    String space = "";
	    while (space.length() < middle) {
	        space += " ";
	    }
	    for (int i = 0; i < middle; ++i) {
	        map[i] = space + map[i] + space;
	    }
	}
	}


}
	*/
