public abstract class Character {
    public Character() {
    }
    ControlBehavior controlBehavior;
    CashBehavior cashBehavior;

    public void performControl() {
        controlBehavior.control();
    }
    public void performCash() {
        cashBehavior.cash();
    }
    public abstract void display();

    public void setControlBehavior(ControlBehavior controlBehavior) {
        this.controlBehavior = controlBehavior;
    }

    public void setCashBehavior(CashBehavior cashBehavior) {
        this.cashBehavior = cashBehavior;
    }
}
