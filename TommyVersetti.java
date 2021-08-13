public class TommyVersetti extends Character {
    public TommyVersetti() {
        controlBehavior = new ControlArea();
        cashBehavior = new CashSmall();
    }
    @Override
    public void display() {
        System.out.println("Я не давно вернулся в этот город и скоро он станет моим!");
    }
}
