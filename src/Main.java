public class Main {
    public static void main(String[] args) {
        String[][] words = {{"1", "1"}, {"1", "1"}, {"50", "1"}, {"1", "1"}};
        try {
            System.out.println(ArrayValueCalculator.doCalc(words));
        } catch (Exception e) {
            System.out.println("Calculation error: " + e);
        }
    }
}