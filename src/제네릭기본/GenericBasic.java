package 제네릭기본;
import java.util.ArrayList;
import java.util.List;

public class GenericBasic {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("hello");
        String str = (String) list.get(0);
        System.out.println(str);
        // 제네릭 타입으로 변환
        List<String> list2 = new ArrayList<>();
        list2.add("Java");
        String str2 = list2.get(0);
        System.out.println(str2);
    }
}
