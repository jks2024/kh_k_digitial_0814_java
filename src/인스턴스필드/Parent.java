package 인스턴스필드;

public class Parent {
    public static String name;
    protected String money; // default는 같은 패키지 내에 있어야 접근 허용
    protected String addr;
    public Parent() {
        name = "Parent";
        money = "100억";
        addr = "서울시 강남구 역삼동";
    }
}
