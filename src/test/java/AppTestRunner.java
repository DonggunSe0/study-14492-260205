import java.io.ByteArrayOutputStream;
import java.util.Scanner;

public class AppTestRunner {
    public static String run(String input) {
        Scanner sc = TestUtil.genScanner(input+"\n종료"); //종료는 입력임

        ByteArrayOutputStream outputStream = TestUtil.setOutByteArray(); //=>여기에서 정의 했잖아
        new App(sc).run();

        return outputStream.toString();

    }
}
