package com.back;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        lab2();

    }

    public static void lab2() {
        //화면에 출력될 글자들을 잠시 가로채서, 변수에 저장하는 코드

        //나중에 다시 모니터로 출력해야 하니까,
        //현재 모니터 연결 설정을 잠깐 다른 곳에 저장
        PrintStream ORIGINAL_OUT = System.out;


        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(); //데이터를 저장할 빈 공간(방)
        //위에서 만든 '저장 공간'에 글자를 편하게 쓸 수 있는 기능(println, print)을 덧붙입니다.
        PrintStream printStream = new PrintStream(byteArrayOutputStream);

        //이제부터 System.out.println을 하면 모니터로 가지 말고,
        // 우리가 만든 ByteArrayOutputStream이라는 메모리 공간으로 가라고 명령
        System.setOut(printStream); //=> 도착지 설정


        System.out.println("hihi");
        System.out.println("byebye");
        System.out.print("ok");


        //이제 볼일 다 봤으니, 출력이 다시 모니터로 나오도록 ①번에서 저장해둔 설정으로 되돌립니다.
        System.setOut(ORIGINAL_OUT);

        String result = byteArrayOutputStream.toString();

       // 아까 모니터 대신 메모리에 쌓아뒀던 "hihi" 등의 글자들을 String 변수로 꺼냅니다.
        System.out.println(result);
    }

    public void lab1() {
        Scanner scan = new Scanner(""" 
                등록
                과거에 집착하지 마라.
                작자미상
                """);
        String str1 = scan.nextLine(); //등록
        String str2 = scan.nextLine(); //과거에 집착하지마라
        String str3 = scan.nextLine(); //작자 미상

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

    }
}

