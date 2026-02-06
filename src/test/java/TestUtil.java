import java.util.Scanner;

public class TestUtil {
    //사용하는 쪽(호출하는 곳)에서 new라는 키워드를 직접 쓰지 않게 만드는 것"**이 가장 큰 목적
    public static Scanner genScanner(String input) {
        return new Scanner(input);
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
