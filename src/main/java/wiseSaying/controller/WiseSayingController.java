package wiseSaying.controller;

import wiseSaying.entity.WiseSaying;
import wiseSaying.service.WiseSayingService;

import java.util.Scanner;

public class WiseSayingController {
    private Scanner sc;
    private WiseSayingService wiseSayingService;




    public WiseSayingController(Scanner sc) {
        this.sc = sc;
        this.wiseSayingService = new WiseSayingService();
    }
    public void actionAdd() {
        System.out.println("명언 : ");
        String saying = sc.nextLine();
        System.out.println("작가 : ");
        String author = sc.nextLine();

        WiseSaying wiseSaying = wiseSayingService.write(saying, author);
        System.out.println("%d번 명령이 등록 되었습니다.".formatted(wiseSaying.getId()));

    }

    public void actionList() {
        System.out.println("번호 / 작가 / 명언");
        System.out.println("----------------------");

        wiseSayingService.findListDesc()
                .stream()
                .forEach(wiseSaying -> System.out.printf(("%d / %s / %s%n"),
                        wiseSaying.getId(),
                        wiseSaying.getAuthor(),
                        wiseSaying.getSaying()));
    }
}
