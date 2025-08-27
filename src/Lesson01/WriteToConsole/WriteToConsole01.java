package Lesson01.WriteToConsole;

public class WriteToConsole01 { //vores class

    public static void main(String[] args) { //dette kaldes metoden - compileren skal bruge en main metode
        // public: modifier, (static, void) main. Package->Class->Metode
        // vi bruger en speciel metode, der heddder main
        System.out.print("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}