import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private Scanner sc;
    int lastId = 0; //등록번호 증가를 위한 lastId
    List<WiseSaying> wiseSayings = new ArrayList<>();

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("== 명언 앱=="); //outputStream에 저장됨 다시돌아가바 =>App


        //추가 등록을 위한 반복문
    while (true){
        System.out.println("명령) ");
        String cmd = sc.nextLine();
        switch (cmd){
            case "등록"->{System.out.println("명언 : ");
                String saying = sc.nextLine();
                System.out.println("작가 : ");
                String author = sc.nextLine();

                WiseSaying wiseSaying = new WiseSaying(++lastId, saying, author);
                wiseSayings.add(wiseSaying);
                System.out.println("%d번 명령이 등록 되었습니다.".formatted(lastId));
            }
            case "목록" ->{
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

            case "종료"->{
                return ;
            }

        }
    }
    }
}
