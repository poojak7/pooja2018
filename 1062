

import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int C = 1;
		while (sc.hasNext()) {
			String s = sc.nextLine();
			if (s.equals("end"))
				break;
			
			int LIS[] = new int[s.length()];
			Arrays.fill(LIS, 1);
			
			int max = 0;
			for (int i = 0; i < s.length(); i++) {
				for (int j = i - 1; j >= 0; j--)
					if (s.charAt(j) < s.charAt(i)) 
						LIS[i] = (LIS[i] > LIS[j]+1) ? (LIS[i]) : (LIS[j]+1);
					
				if (LIS[i] > max)
					max = LIS[i];
			}
			System.out.println("Case " + (C++) + ": " + max);
		}
	}
}
