public class Main {
    public static void main(String[] args) {

        int source = 2200; //начальный счёт
        int adding = 10000; //пополнение
        int bonus = (adding - 1000) / 100; //бонус за каждые 100 руб свыше 1000 руб

        if (adding > 1000) {
            System.out.println("Итоговый счёт: " + (bonus + source + adding));
            System.out.println("Бонус: " + bonus );
        } else {
            System.out.println("Итоговый счёт: " + source );
            System.out.println("Бонус: " + bonus );
        }

    }
}