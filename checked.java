
import java.io.File;
import java.io.IOException;

class Checked{

    static void f1()  throws IOException,InterruptedException{

          f2();
   System.out.println("F1 Function.."); 
    }

    static void f2() throws IOException,InterruptedException {

        File file=new File("songs.txt");
        file.createNewFile();
        System.out.println("File Created...");
         
        Thread.sleep(1000);

 		System.out.println("File Created...");
    }


	public static void main(String[] args) throws IOException,InterruptedException {
		
        f1();



	}
}

