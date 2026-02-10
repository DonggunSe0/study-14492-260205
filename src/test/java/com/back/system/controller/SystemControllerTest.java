package com.back.system.controller;

import app.AppTestRunner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SystemControllerTest {
    @Test
    @DisplayName("'== 명언 앱 ==' 출력")
    void t1() {
        //명언앱 출력

        String out = AppTestRunner.run("""
                종료
                """
        ); // == 명언 앱==


        assertThat(out).contains("== 명언 앱==");
    }
}
