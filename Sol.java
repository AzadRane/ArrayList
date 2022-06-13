
#coded by harish Ranre
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(br.readLine());
    
    for(int i=0;i<n;i++)
    {
        int size  = Integer.parseInt(br.readLine());
        
        ArrayList<Integer> arr = new ArrayList<Integer>(size);
        
        for(int j=0;j<size;j++)
        {
            int value = Integer.parseInt(br.readLine());
            
            arr.add(value);
        }
    }
    
    
    
    
    }
}
