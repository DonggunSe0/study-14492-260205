import java.util.Scanner;

public class App {
    private Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("== 명언 앱=="); //outputStream에 저장됨 다시돌아가바 =>App

        System.out.println("명령) ");
        String cmd = sc.nextLine();

        System.out.println("1번 명령이 등록 되었습니다.");

        switch (cmd){
            case "등록"->{System.out.println("명언 : ");
                String saying = sc.nextLine();
                System.out.println("작가 : ");
                String author = sc.nextLine();
            }
            case "종료"->{
                return ;
            }

        }
        //등록 구현
    }
}
