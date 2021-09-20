import java.util.Scanner ;

class Main {  

  public static void main(String args[]) { 
   Scanner x = new Scanner(System.in);
  System.out.println("Entrer une chaine "); 
	 String str = x.nextLine() ; 
	 
	 Scanner y = new Scanner(System.in);
  System.out.println("Entrer un nombre "); 
	 String str2 = y.nextLine() ; 

	  int n = str.length();
	  int n2 = str.length();
	

	  if (n==n2){
		  System.out.println("True"); 

	}else{
		  System.out.println("False "); 

	}
	x.close();
}}
