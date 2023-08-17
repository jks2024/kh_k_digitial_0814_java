package 오버로딩테스트;

public class OverTest {
    public static void main(String[] args) {
        TestClass tt = new TestClass();
        System.out.println(tt.sum(12, 34));
        System.out.println(tt.sum("Seoul", "강남"));
        System.out.println(tt.sum("Seoul", 200));

    }
}
