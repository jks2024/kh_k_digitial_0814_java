package 클론오브젝트;
// clone()은 Cloneable 인터페이스를 상속 받은 경우에만 가능
public class Member {
    String id;
    String name;
    String password;
    int age;
    boolean adult;
    void viewInfo() {
        System.out.println("ID " + id);
        System.out.println("이름 " + name);
        System.out.println("비밀번호 " + password);
    }

    public Member(String id, String name, String password, int age, boolean adult) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.adult = adult;
    }
    public Member getMember() {
        Member cloned = null;
        try {
            cloned = (Member) clone(); // 클론 메소드는 Object 클래스 타입이르모 형변환
        } catch (CloneNotSupportedException e ) {
            e.printStackTrace();
        }
        return cloned;
    }
}
