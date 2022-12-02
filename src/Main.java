public class Main {
    public static void main(String[] args) {
        int startsMany = 200; // начальный счет
        int summ = 2190; // сумма пополнения

        int bonus;
        if (summ > 1000) {
            bonus = summ / 100;
        } else {
            bonus = 0;
        }

        int finishSumm = startsMany + summ + bonus; // итоговый счет с бонусами
        System.out.println("Итоговый счет: " + finishSumm);
        System.out.println("Количество бонусов: " + bonus);
    }
}
