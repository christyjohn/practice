package sec09.innerclass_abstractclass_interfaces;

public interface Telephone {
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}