package 시스템입력;
// Scanner 클래스를 사용해서 입력 받음
import java.util.Scanner;

public class SystemInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력 하세요 : ");
        String name = sc.next(); // 이름을 입력 받은 후 공백이나 줄바꿈이 일어나면 다음으로 넘어 감
        sc.nextLine(); // 버퍼 비우기
        System.out.print("주소를 입력 하세요 : ");
        String addr = sc.nextLine(); // 줄바꿈이 일어나면 다음 입력으로 넘어감
        System.out.print("성별을 입력 하세요 : ");
        char gender = sc.next().charAt(0); // 입력 받은 문자열에서 맨앞의 문자 1자 추출
        System.out.print("나이를 입력 하세요 : ");
        int age = sc.nextInt();

        System.out.println("==== 회원 정보 출력 ====");
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + addr);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);



    }
}
