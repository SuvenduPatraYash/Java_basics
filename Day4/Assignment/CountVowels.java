//q.2
//Q_3
import java.io.*;

public class CountVowels 
{  
    public static void main(String[] args) throws IOException
    {  

        File file = new File("C:/Users/dell/Desktop/YASH Technology/Day4/yash.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


        String str;
        int vCount = 0, cCount = 0, a = 0, e = 0, io = 0, o = 0,u = 0;  
         
         
         while ((str = bufferedReader.readLine()) != null) 
		{
			
		str = str.toLowerCase();  
          
        for(int i = 0; i < str.length(); i++) 
        {  
              
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') 
            {  
                  vCount++;  
            }
            if(str.charAt(i) == 'a')
            {	
                  a++;  
            }
            if(str.charAt(i) == 'e')
            {	
                  e++;  
            }
            if(str.charAt(i) == 'i')
            {	
                  io++;  
            }
            if(str.charAt(i) == 'o')
            {	
                  o++;  
            }
            if(str.charAt(i) == 'u')
            {	
                  u++;  
            }            
            
        }   
				
		} 
        
        System.out.println("Number of vowels: " + vCount);
        System.out.println("Number of 'a': " + a);  
        System.out.println("Number of 'e': " + e);
        System.out.println("Number of 'i': " + io);
        System.out.println("Number of 'o': " + o);
        System.out.println("Number of 'u': " + u);

        
    }  
}  