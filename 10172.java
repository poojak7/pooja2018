import java.io.*;
import java.util.*;
 
class Main {
	
	public static void main (String [] args) throws Exception 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		
		for (int i=0;i<t;i++)
		{
			StringTokenizer st=new StringTokenizer(br.readLine());
			int N=Integer.parseInt(st.nextToken());
			int S=Integer.parseInt(st.nextToken());
			int Q=Integer.parseInt(st.nextToken());
			
			LinkedList<Integer> [] platformB=new LinkedList[N];
			
			for (int n=0;n<N;n++) 
			platformB[n]=new LinkedList<>();
 
			Stack<Integer> carrier=new Stack<>();
			for (int n=0;n<N;n++) 
			{
				st=new StringTokenizer(br.readLine());
				int B=Integer.parseInt(st.nextToken());
				for (int b=0;b<B;b++) 
				platformB[n].addLast(Integer.parseInt(st.nextToken())-1);
			}
			
			int Time=0;
			int currN=0;
			while (true) {
				while (!carrier.isEmpty() && (platformB[currN].size()<Q || carrier.peek()==currN))
				{
					int dest=carrier.pop();
					if (dest!=currN)
					platformB[currN].addLast(dest);
					Time++;
				}
				
				while (!platformB[currN].isEmpty() && carrier.size()<S) 
				{
					carrier.push(platformB[currN].removeFirst());
					Time++;
				}
				
				currN=(currN+1)%N;
				
				boolean done=carrier.isEmpty();
				for (int n=0;n<N;n++) 
				done &= platformB[n].isEmpty();
				
				if (done) break;
				
				Time+=2;
			}
			
			System.out.println(Time);
		}
	}
 
}
 
