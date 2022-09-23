package Java_basics;

public class LearnJava {

  public static void main(String[] args){
      doAddition();
  }
   public static void doAddition(){
    int a= 5;
    int b= 10;
       System.out.println(a + b);

   }
   public static class TestClass{

      public static void main(String[]args){
          LearnMethods.doAddition();
      }


   }



}