package ch09nested.book.sec07.exam02;

public class Home {
    private RemoteControl rc = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("TV를 켭니다.");
        }

        @Override
        public void turnOff() {
            System.out.println("TV를 끕니다.");
        }
    };

    public void use2() {
        RemoteControl rc = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("에어컨을 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("에어컨을 끕니다.");
            }
        };
    }

    public void use3(RemoteControl rc) {
        rc.turnOn();
        rc.turnOff();
    }
}
