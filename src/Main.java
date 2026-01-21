public class Main {

    public static void main(String[] args) {

        //Задание 1

        int firstFriday = 4;

        for (int day = 1; day <= 31; day++) {
            if ((day - firstFriday) % 7 == 0 && day >= firstFriday) {
                System.out.println(
                        "Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет"
                );
            }
        }

        //Задание 2

        int distance = 0;
        int marathon = 42_195;

        do {
            int remaining = marathon - distance;
            System.out.println("Держитесь! Осталось " + remaining + " метров");
            distance += 500;
        } while (distance < marathon);

        for (int d = 0; d < marathon; d += 500) {
            int remaining = marathon - d;
            System.out.println("Держитесь! Осталось " + remaining + " метров");
        }

        //Задание 3

        int money = 3_000;
        int day = 1;
        int daysCountWhile = 0;

        while (money > 0) {

            if (day % 5 == 0) {
                day++;
                daysCountWhile++;
                continue;
            }

            money -= 100;
            day++;
            daysCountWhile++;
        }

        System.out.println("Бюджета хватит на " + daysCountWhile + " дней");


        int moneyFor = 3_000;
        int daysCountFor = 0;

        for (int d = 1; moneyFor > 0; d++) {

            if (d % 5 == 0) {
                daysCountFor++;
                continue;
            }

            moneyFor -= 100;
            daysCountFor++;
        }

        System.out.println("Бюджета хватит на " + daysCountFor + " дней");

        //Задание 4

        int month = 0;
        double total = 0;
        double target = 12_000_000;

        while (true) {
            month++;
            total += 15_000;

            if (month % 6 == 0) {
                total *= 1.07;
            }

            System.out.println("Месяц " + month + ", сумма = " + (long) total);

            if (total >= target) {
                break;
            }
        }

        //Задание 5

        int charge = 20;
        int minute = 0;
        int overheats = 0;

        while (charge < 100 && overheats <= 3) {
            minute++;

            if (minute % 10 == 0) {
                overheats++;
                System.out.println("Перегрев! Зарядка приостановлена. Перегревов: " + overheats);
                minute += 2;

                if (overheats > 3) {
                    System.out.println("Зарядка прекращена. Текущий заряд: " + charge + "%");
                    break;
                }
                continue;
            }

            charge += 2;

            if (charge > 100) {
                charge = 100;
            }
        }

        System.out.println("Время зарядки составило " + minute + " минут");
    }
}