public class lnstanceCounter {
    private static int counter;

    public lnstanceCounter() {
        ++counter;
    }

    public static int getCounter() {
        return counter;
    }
}