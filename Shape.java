abstract class Shape{
	abstract void getArea(int r);
			void f1(){
				System.out.println("hello f1");
			}

}
interface Instrument{
	public void play();

}
class ShapeDemo{
 public static void main(String[] args) {
 	//Shape s2= new Shape();
 	/*Shape s1 = new Shape(){

      void getArea(int r){
      	System.out.println("Area is "+r*r*Math.PI);
      }
   
 void f1(){ 
 	System.out.println("hii i am f1");
 }

 	};
 	s1.getArea(3);
 	s1.f1();*/

 	Instrument i1= new Instrument(){

 	 public	void play(){
 			System.out.println("default song is play");
 		}

 	};
 	i1.play();
 }


}
