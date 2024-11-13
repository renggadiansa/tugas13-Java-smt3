package devices;

public class Phone {
    protected String phoneNumber;

    public void call() {
        System.out.println("Memanggil... \n" + phoneNumber);
    }

    public void receiveCall() {
        System.out.println("Menerima panggilan dari " + phoneNumber);
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
