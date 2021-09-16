import java.util.Scanner ;


class ex02 {  

	
  public static void main(String args[]) { 
   
  Scanner x = new Scanner(System.in);
  System.out.println("entrer un nombre romain "); 
 String ent = x.nextLine () ; 
int valeur=0 ; 
	//String ent = "MDC"  ;
	
	  int N = ent.length();

for (int i=0 ; i < N ; i++ ){
  char y = ent.charAt(i);
	switch(y){
			case('M'):
			valeur = valeur + 1000 ; 
			break;
			case('D'):
			valeur = valeur + 500 ; 
			break;
			case('C'):
			valeur = valeur + 100 ; 
			break;
			case('L'):
			valeur = valeur + 50 ; 
			break;
			case('X'):
			valeur = valeur + 10 ; 
			break;
			case('V'):
			valeur = valeur + 5 ; 
			break;
			case('I'):
			valeur = valeur + 1 ; 
			break;
	}

	}System.out.println(valeur); 
}
}