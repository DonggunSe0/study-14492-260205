package com.back.wiseSaying.controller;

import app.AppTestRunner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WiseSayingTest {

    @Test
    @DisplayName("등록")
    void t1() {
        //명언앱 출력

        //등록 시나리오 9-테스트구현
        String out = AppTestRunner.run(""" 
                등록
                현재를 사랑하라.
                작자미상
                """
        );

        assertThat(out).contains("명령)");
        assertThat(out).contains("명언 : ");
        assertThat(out).contains("작가 : ");
    }

    @Test
    @DisplayName("등록 시 명령 등록 번호 노출")
    void t2() {
        String out = AppTestRunner.run(""" 
                등록
                현재를 사랑하라.
                작자미상
                """
        );

        assertThat(out).contains("1번 명령이 등록 되었습니다.");
    }

    @Test
    @DisplayName("등록 시 명령 등록 번호 증가 후 노출")
    void t3() {
        String out = AppTestRunner.run(""" 
                등록
                현재를 사랑하라.
                작자미상
                등록
                현재를 사랑하라.
                작자미상
                """);

        assertThat(out).contains("2번 명령이 등록 되었습니다.");
    }

    @Test
    @DisplayName("목록 테스트")
    void t4() {
        String out = AppTestRunner.run("""
                등록
                현재를 사랑하라.
                작자미상
                등록
                과거에 집착하지 마라.
                작자미상
                목록
                """);

        assertThat(out)
                .contains("번호 / 작가 / 명언")
                .contains("----------------------")
                .containsSubsequence("2 / 작자미상 / 과거에 집착하지 마라."
                        , "1 / 작자미상 / 현재를 사랑하라.");
    }
}
