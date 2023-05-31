//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String A = sc.next();
                    String B = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.UncommonChars(A, B));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String UncommonChars(String A, String B)
    {
        
		 Set<Character> set=new HashSet<>();
		 PriorityQueue<Character> q=new PriorityQueue<>();
		 int n=Math.max(A.length(),B.length());
    
		 
		 for(int i=0;i<n;i++)
		 {
          if(i<A.length())
          {
			 if(B.indexOf(A.charAt(i))==-1&&!set.contains(A.charAt(i)))
			 {
				 set.add(A.charAt(i));
				 q.add(A.charAt(i));
			 }	
          }
			 if(i<B.length())
			 {
				 if(A.indexOf(B.charAt(i))==-1&&!set.contains(B.charAt(i)))
				 {
					 set.add(B.charAt(i));
					 q.add(B.charAt(i));
				 }	 
			 }
		 }
		 if(q.isEmpty())return "-1";
		 String s=""+q.remove();
	      while(!q.isEmpty())
	      {
	        s+=q.remove();
		    
			 }
	      return s;
	     
    }
}