//Код позволяет в зависимости от персонажа игры GTA определять размер подконтрольной территории и кол-во кэша.
// При этом, если смениться власть или кто-то станет богаче - код меняет изначальное поведение.
public class TestaGame {
    public static void main(String[] args) {
        Character tommyVersetti = new TommyVersetti();
        Character sonyFarelli = new SonyFarelli();

        tommyVersetti.performCash();
        tommyVersetti.performControl();
        System.out.println();
        sonyFarelli.performCash();
        sonyFarelli.performControl();
        System.out.println();
        tommyVersetti.setControlBehavior(new ControlCity());
        tommyVersetti.performCash();
        tommyVersetti.performControl();
    }
}
