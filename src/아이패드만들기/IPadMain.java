package 아이패드만들기;

import static 아이패드만들기.Common.PRODUCT;

public class IPadMain {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            IPadPro iPadPro = new IPadPro(PRODUCT);
            if(!iPadPro.continueOrder()) break;
            iPadPro.setScreen();
            iPadPro.setColor();
            iPadPro.setMemory();
            iPadPro.setNetwork();
            iPadPro.setName();
            iPadPro.setSerialNum();
            iPadPro.progressPad();
            iPadPro.productPad();
        }
    }
}
