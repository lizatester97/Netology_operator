public class Main {
    public static void main(String[] args) {
        int balance = 100;

        int payment = 123;
        int bonus_border = 1000;
        int bonus_rubles = 0;

        if (payment > bonus_border){
            bonus_rubles = payment/100;
            System.out.println("Поздравляю! Вы пополнили баланс больше чем на 1000 рублей!");
            System.out.println("И мы начислим вам бонус в размере " + bonus_rubles + " рублей");
        }
        
        balance = balance + payment + bonus_rubles;
        System.out.println();
        System.out.println("Средства зачислены. Текущий баланс вашего счета: " + balance+ " рублей");
    }
}
