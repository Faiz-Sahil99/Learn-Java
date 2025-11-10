 
import java.util.*; 

public class Hello{
  public static void main(String[] args) {

    System.out.println("hello world!");

    Scanner sc = new Scanner (System.in);
    int button = sc. nextInt();
    


   
    /* 

    if(a ==b ){
      System.out.println("Equal");
    } else if (a >b ){
      System.out.println("a is greater");

    }
  else{
    System.out.println("a is lesser");
    sc.close();
  }
   */
switch(button){
    case 1 : System.out.println("hello");
    break;
    case 2 : System.out.println("namaste");
    break;
    case 3 : System.out.println("bonjour");
    break;
    default:System.out.println("invalid button");
    sc.close();


   }   
  }
}

    
       
     




