package Seven배수구하기;
// 1 ~ 1000사이의 7의 배수를 구하고 한줄에 10개 항목씩 출력 하기
public class MultipleEx1 {
    public static void main(String[] args) {
//        for(int i = 1; i <= 1000; i++) {
//            if(i % 7 == 0) {
//                System.out.printf("%5d", i);
//                if(i % 70 == 0) System.out.println();
//            }
//        }
        int cnt = 0;
        for(int i = 7; i <= 1000; i+=7) {
            cnt++;
            System.out.printf("%5d", i);
            if(cnt == 10) {
                System.out.println();
                cnt = 0;
            }
        }
    }
}
