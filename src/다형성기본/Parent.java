package 다형성기본;

public class Parent {
    protected int num = 1; // 상속관계와 같은 패키지내에서 접근 가능
    protected int money = 1000000;
    public void display() {
        System.out.println("부모 클래스 메소드");
    }
}
