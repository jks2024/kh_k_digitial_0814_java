package 상속TV;
// 이전에 만들었던 TV에서 상속 관계를 적용하고 오버라이딩 이점을 확인
public class InheritanceTV {
    public static void main(String[] args) {
       PrototypeTV prototypeTV = new PrototypeTV();
       ProductTV productTV = new ProductTV("우리집 TV");
       productTV.setPower(true);
       productTV.setVolume(120);
       productTV.setChannel(1500, true);
       productTV.viewTV();

    }
}
