
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


-----------------------------------------------------------
    
    import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    
    int n = Integer.parseInt(br.readLine());
    
    ArrayList<ArrayList<Integer>> aob = new ArrayList<ArrayList<Integer>>();
    
    for(int i=0;i<n;i++)
    {
        int size  = Integer.parseInt(br.readLine());
        
        ArrayList<Integer> arr = new ArrayList<Integer>(size);
        
        for(int j=0;j<size;j++)
        {
            int value = Integer.parseInt(br.readLine());
            
            arr.add(value);
        }
        
        aob.add(arr);
    }
    
    int m = Integer.parseInt(br.readLine());
    
    for(int i=0;i<m;i++)
    {
        int r = Integer.parseInt(br.readLine());
        int col = Integer.parseInt(br.readLine());
        
        try{
            System.out.println(aob.get(r-1).get(col-1));
        }
        catch(Exception e)
        {
            System.out.println("ERROR!");
        }    
    }
    
    
    
    }
}
======================================================================================================
    OP ANSERR

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    ArrayList<ArrayList<Integer>> aob = new ArrayList<ArrayList<Integer>>();
    
    for(int i=0;i<n;i++)
    {
        int size  = sc.nextInt();
        
        ArrayList<Integer> arr = new ArrayList<Integer>(size);
        
        for(int j=0;j<size;j++)
        {
            int value = sc.nextInt();
            
            arr.add(value);
        }
        
        aob.add(arr);
    }
    
    int m = sc.nextInt();
    
    for(int i=0;i<m;i++)
    {
        int r = sc.nextInt();
        int col = sc.nextInt();
        
        try{
            System.out.println(aob.get(r-1).get(col-1));
        }
        catch(Exception e)
        {
            System.out.println("ERROR!");
        }    
    }
    
    
    
    }
}
