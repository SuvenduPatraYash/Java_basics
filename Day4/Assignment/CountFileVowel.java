//q.2
import java.util.Scanner;
import java.io.*;

public class CountFileVowel 
{  
    public static void main(String[] args) throws IOException
    {  
        Scanner sc=new Scanner(System.in); 
        String filename;
        System.out.println("Enter file name: ");
        filename=sc.nextLine().trim();
        File file = new File(filename);
		FileInputStream fileInputStream = new FileInputStream(file);
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


        String str;
        int lettercount=0;  
         System.out.println("Enter the Character you want to find frequency:");
         char a = sc.next().charAt(0);
         while ((str = bufferedReader.readLine()) != null) 
		{
			
		str = str.toLowerCase();  
          
        for(int i = 0; i < str.length(); i++) 
        {  
              
            
            if(str.charAt(i) == a)
            {	
                  lettercount++;  
            }
               
         }   
				
		} 
        
        System.out.println("Frequency of element: "+ a +" is: " + lettercount);
        
        
    }  
}  