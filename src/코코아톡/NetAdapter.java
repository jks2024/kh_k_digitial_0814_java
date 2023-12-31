package 코코아톡;

public interface NetAdapter {
    void connect();;
    void send(String msg); // 필요한 기능에 대해 추상화 함
}

class WiFi implements NetAdapter {

    @Override
    public void connect() {
        System.out.println("WiFi에 연결 되었습니다.");
    }
    @Override
    public void send(String msg) {
        System.out.println("WiFi >> " +  msg);
    }
}
class FiveG implements NetAdapter {

    @Override
    public void connect() {
        System.out.println("5G에 연결 되었습니다.");
    }
    @Override
    public void send(String msg) {
        System.out.println("5G >> " +  msg);
    }
}
