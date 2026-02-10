import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test.TestUtil;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class TestUtilTest {

    @Test
    @DisplayName("TestUtil.genScanner()")
    void t1() {
        //테스트 코드에서 매번 new Scanner(...)를 쓰는 것보다, TestUtil.genScanner(...)라고 쓰면
        // 이건 테스트를 위해 스캐너를 만드는 거구나"**라고 의도를 더 명확하게 알 수 있습니다.
        //중복을 줄이고 편하게 쓰기 위해
        Scanner scanner = test.TestUtil.genScanner("""
                등록
                현재를 사랑하라.
                작자미상
                """);

        String cmd = scanner.nextLine();
        String content = scanner.nextLine();
        String author = scanner.nextLine();

        assertThat(cmd).isEqualTo("등록");
        assertThat(content).isEqualTo("현재를 사랑하라.");
        assertThat(author).isEqualTo("작자미상");
    }

    //    @Test
//    @DisplayName("등록")
//    void t1() {
//  //중간에 엉뚱한 값이 들어갈 수도 있으니께
//        final String out = TestUtil.run("""
//                등록
//                현재를 사랑하라.
//                작자미상
//                """);

    // // "아까 받아온 결과(out) 안에 아래 글자들이 포함되어 있는지 확인해 줘."
//        assertThat(out)
//                .contains("명언 :")
//                .contains("작가 :")
//                .contains("1번 명언이 등록되었습니다.");
//    }
    @Test
    @DisplayName("test.TestUtil.setOutByteArray()")
    void t2() {
        ByteArrayOutputStream byteArrayOutputStream = TestUtil.setOutByteArray();

        System.out.println("안녕하세요");

        String rst = byteArrayOutputStream.toString();

        assertThat(rst).contains("안녕하세요");

    }
}
