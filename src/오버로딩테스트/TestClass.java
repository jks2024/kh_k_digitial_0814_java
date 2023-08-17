package 오버로딩테스트;

public class TestClass {
    int sum(int x, int y) {
        return x + y;
    }
    String sum(String x, String y) {
        return x + y;
    }
    String sum(String x, int y) {
        return x + y;
    }
}
