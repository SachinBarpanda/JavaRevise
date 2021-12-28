package com.company;

import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int vol = a*b*c;
        int area = ((a*b)+(b*c)+(c*a));
        System.out.println("Volume : " + vol+" Area : "+area);
        System.out.println();
    }
}
