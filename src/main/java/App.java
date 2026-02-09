import java.util.Scanner;

public class App {
    private Scanner sc;
    int lastId = 0; //등록번호 증가를 위한 lastId

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
                lastId++;

                System.out.println("%d번 명령이 등록 되었습니다.".formatted(lastId));
            }
            case "목록" ->{}

            case "종료"->{
                return ;
            }

        }
    }
    }
}
