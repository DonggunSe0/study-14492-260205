package com.back.global;

import com.back.wiseSaying.controller.WiseSayingController;
import com.back.wiseSaying.repository.WiseSayingRepository;
import com.back.wiseSaying.service.WiseSayingService;
import system.controller.SystemController;

import java.util.Scanner;
//앱에서 사용할 객체들을 미리 만들어서 보관해두는 조립 창고
//✔ new를 각 클래스 내부에서 하지 않고
//✔ AppContext가 대신 new를 하고
//✔ 다른 클래스는 AppContext에 있는 객체를 참조해서 사용

public class AppContext {
    public static Scanner sc;
    public static SystemController systemController;
    public static WiseSayingController wiseSayingController;
    public static WiseSayingService wiseSayingService;
    public static WiseSayingRepository wiseSayingRepository;

    public static void init(Scanner _sc){
        AppContext.sc = _sc;

        AppContext.wiseSayingRepository = new WiseSayingRepository();
        AppContext.wiseSayingService = new WiseSayingService();
    }

    public static void init() {
        init(new Scanner(System.in));
    }
}
