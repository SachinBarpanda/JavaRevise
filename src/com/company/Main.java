package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        double r1,r2;

        r1 = ((-(b))+Math.sqrt((b*b)-(4*a*c)))/2*a;
        r2 = ((-(b))-Math.sqrt((b*b)-(4*a*c)))/2*a;
        System.out.println("Roots are : "+r1+" "+r2);
    }
}
