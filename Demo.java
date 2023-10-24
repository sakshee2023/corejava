import java.util.Scanner;

class InvalidAgeException extends RuntimeException{

 public InvalidAgeException(){

 }
 public InvalidAgeException(String s){

   super(s);
 }


}


class Demo{
	public static void main(String[] args) {
     int age;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Age  ");
     age=sc.nextInt();
    
     if(age>18){
     	System.out.println("Valid Age");
     }
     else{

     	throw new InvalidAgeException("Not a Valid Age  : "+age);
     }


		
	}
}

