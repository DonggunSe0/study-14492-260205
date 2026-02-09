import java.io.ByteArrayOutputStream;
import java.util.Scanner;

public class AppTestRunner {
    public static String run(String input) {
        Scanner sc = TestUtil.genScanner(input);

        ByteArrayOutputStream outputStream = TestUtil.setOutByteArray(); //=>여기에서 정의 했잖아
        new App(sc).run();

        return outputStream.toString();

    }
}
