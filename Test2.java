import java.util.Scanner;
class Test2{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

       try{

        int x=11/0;

       }
       catch (Exception e) {
       	System.out.println("catch Block");
       }
       finally{
       	System.out.println("finally Block");
        sc.close();
       }

   
      System.out.println("---------------");



	}
}

