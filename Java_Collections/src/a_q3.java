import java.util.ArrayList;
import java.util.Vector;

public class a_q3 {

	public static void main(String[] args) {
		// Creating an empty Vector
		
		
		ArrayList<String> alist=new ArrayList<String>();
		alist.add("January");
		alist.add("february");
		alist.add("march");
		alist.add("april");
		alist.add("may");
		alist.add("june");
		alist.add("July");
		alist.add("August");
		alist.add("September");
		alist.add("October");
		alist.add("November");
		alist.add("December"); 
		
        Vector<String> vt = new Vector<String>();
  
        vt.addAll(alist);
        /*vt.add("January");
		vt.add("february");
		vt.add("march");
		vt.add("april");
		vt.add("may");
		vt.add("june");
		vt.add("July");
		vt.add("August");
		vt.add("September");
		vt.add("October");
		vt.add("November");
		vt.add("December");*/
        System.out.println("The Vector is: " + vt);

	}

}
