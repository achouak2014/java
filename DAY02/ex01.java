import java.util.Scanner ;

class Main {  

	
  public static void main(String args[]) { 
   
  Scanner x = new Scanner(System.in);
  System.out.println("Entrer une chaine    "); 
	 String ent = x.nextLine () ; 
 
	  String conver = ent.toLowerCase();
	 System.out.println(conver);
 x.close();
}
}