public class SonyFarelli extends Character {
    public SonyFarelli() {
        controlBehavior = new ControlCity();
        cashBehavior = new CashMore();
    }

    @Override
    public void display() {
        System.out.println("У меня все схвачено, я тут главный.");
    }
}
