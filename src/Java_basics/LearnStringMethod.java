package Java_basics;

public class LearnStringMethod {
    static String student= "Humama";
    public static void main(String[]args){
       int length= student.length();
        System.out.println(length);
        String stu =student.toLowerCase();
        System.out.println(stu);
        student.substring(3);
        System.out.println(student.substring(3));

        System.out.println(student.substring(3,6));
        System.out.println(student.startsWith("h"));
        System.out.println(student.toLowerCase().startsWith("h"));
        String studentName= "Humama";
        System.out.println(student== studentName);

    }

}
