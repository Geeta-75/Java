package Constructor;

import java.util.Scanner;

public class Glossary {
    Glossary() {
        this("Water ,salt, flour , ajvain , Turmeric");
        // this ("Boil :- Dal , Termeric , Salt , Water || Fry :- oil , jeera , rai ,
        // onion , turnic , hing , mirchi ,dhaniya");
    }

    Glossary(String Bati) {
        System.out.println("Bati Process : " + Bati);
    }

    static void show() {
        String Dal = "Boil :-  Dal , Termeric , Salt , Water  || Fry :-  oil , jeera , rai , onion , turnic , hing , mirchi ,dhaniya";

        System.out.println("Dal Process :  " + Dal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choice is your : 1. Bati , 2 . Dal");
        int choice = sc.nextInt();
        sc.close();
        if (choice == 1) {
            Glossary g = new Glossary();
        } else if (choice == 2) {
            Glossary.show();
        } else {
            System.out.println("Invalid Choice !");
        }

    }
}
