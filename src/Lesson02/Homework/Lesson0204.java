package Lesson02.Homework;

//En kommentar i et program muliggør, at man kan skrive ting i sin kode, som ignoreres af compileren
//Med kommentarer kan vi gøre vores kode mere læsbar, og gøre det nemmere at samarbejde omkring koden.

/*
Længere kommentarer kan også laves med /* for start og stop koden kommer her:

 */


public class Lesson0204 {
    public static void main(String[] args) {
        System.out.println(Comments());
        //System.out.println(Comments());
        //Hvis // skrives foran et statement, så ignoreres dette statement af compileren.

    }

    public static String Comments() {
        String text = "Dette er en test string";
        return text;
    }
}
