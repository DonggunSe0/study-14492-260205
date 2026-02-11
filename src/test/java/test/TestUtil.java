package test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class TestUtil {
    //사용하는 쪽(호출하는 곳)에서 new라는 키워드를 직접 쓰지 않게 만드는 것"이 가장 큰 목적
    public static Scanner genScanner(String input) {
        return new Scanner(input);
    }

    public static ByteArrayOutputStream setOutByteArray() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(); //=> 창고만들기
        PrintStream printStream = new PrintStream(byteArrayOutputStream); //printstream 기능 => 창고안에 넣기

        System.setOut(printStream); //setout을 통해 모니터 대신 printstream 기능으로 byteArrayOutputStream에 저장

        return byteArrayOutputStream;
    }

    //    public static String run(String input) {
//
//        // 입력값
//        Scanner scan = new Scanner(input);
//
//        // 명언 프로그램 실행
//
//        // 출력값
//    }
}
