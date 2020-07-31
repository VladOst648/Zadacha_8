package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner Scan = new Scanner(System.in);
        int CHislo = Scan.nextInt();
        int Delitel = CHislo;
      //System.out.println(" ");
        while(Delitel != 0){
            if ((CHislo % Delitel == 0) && (Delitel != CHislo) && (Delitel != 1))
            {System.out.println("Чило не является простым "); break;}
            --Delitel;
        }
        if (Delitel == 0)
            System.out.println("Число является простым ");
    }
}
