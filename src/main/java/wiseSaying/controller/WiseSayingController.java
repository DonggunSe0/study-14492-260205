package wiseSaying.controller;

import wiseSaying.entity.WiseSaying;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WiseSayingController {
    private Scanner sc;
    private List<WiseSaying> wiseSayings = new ArrayList<>();
    private int lastId = 0;

    public WiseSayingController(Scanner sc) {
        this.sc = sc;
    }
    public void actionAdd() {
        System.out.println("명언 : ");
        String saying = sc.nextLine();
        System.out.println("작가 : ");
        String author = sc.nextLine();

        WiseSaying wiseSaying = new WiseSaying(++lastId, saying, author);
        wiseSayings.add(wiseSaying);
        System.out.println("%d번 명령이 등록 되었습니다.".formatted(lastId));

    }

    public void actionList() {
        System.out.println("번호 / 작가 / 명언");
        System.out.println("----------------------");
        wiseSayings.reversed()
                .stream()
                .forEach(wiseSaying -> System.out.printf(("%d / %s / %s%n"),
                        wiseSaying.getId(),
                        wiseSaying.getAuthor(),
                        wiseSaying.getSaying())
                );
    }
}
