public class Main {
    public static void main(String[] args) {
        int balance = 17;
        int add = 1345;
        int balancefin = balance + add;
        int bonus;
        bonus = balancefin / 100;
        if (balancefin > 1000) {
            System.out.println("Итоговый счёт:" + balancefin + ". Количество бонусных рублей: " + bonus);
        } else {
            System.out.println("Итоговый счёт: " + balancefin);
        }


    }
}