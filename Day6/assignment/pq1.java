import java.util.Scanner;
class pq1
{
	public static void main(String[] args) 
	{
	 int max,i,n;
	 int a[];
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter n number:");
	 n=sc.nextInt();
	 a=new int[n];
	 System.out.println("Enter the number:");
	 for(i=0;i<n;i++)
	 {
	 	a[i]=sc.nextInt();
	 }
     max=max_num(a,n);
     System.out.println("The largest number: "+max);
	}

static int max_num(int[]a,int n)
{ 
	int j,m=0;
	for(j=0;j<n;j++)
     {
     	if(a[j]>m)
     	{
     		m=a[j];
     	}
     }
     return m;
}
}