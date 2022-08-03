public class Main {
    public static void main(String[] args) {

        int initialAmount = 100;
        int pay = 1500;
        int bonus;
        if (pay > 1000) {
            bonus = pay / 100;
        } else {
            bonus = 0;
        }
        int result = initialAmount + pay + bonus;

        System.out.println("Бонус: " + bonus);
        System.out.println("Итоговый счет: " + result);
    }
}
