import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        //매번 키보드로 타자를 치는 수고를 덜고, 테스트를 빠르게 하기 위해서 (입력시간 단축)
        Scanner scan = new Scanner(""" 
                등록
                과거에 집착하지 마라.
                작자미상
                """);
        String str1 = scan.nextLine(); //등록
        String str2 = scan.nextLine(); //과거에 집착하지마라
        String str3 = scan.nextLine(); //작자 미상

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

    }
}
