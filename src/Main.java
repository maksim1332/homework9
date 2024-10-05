public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //task 1
        System.out.println("Task 1");
        int[] payments = {12500, 10000, 9550, 12000, 99000};
        int summaTrate = 0;
        for (int vyplota : payments) {
            summaTrate += vyplota;
        }
        System.out.println("Сумма трат за месяц составила " + summaTrate + " рублей");
        //task2
        System.out.println("Task 2");
        int[] payments1 = {12500, 10000, 9550, 12000, 99000};
        int maxVyplota = payments1[0];
        int minVyplota = payments1[0];
        for (int vyplota1 : payments1) {
            if (vyplota1 > maxVyplota) {
                maxVyplota = vyplota1;
            }
            if (vyplota1 < minVyplota) {
                minVyplota = vyplota1;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minVyplota + " рублей." + " " + "Максимальная сумма трат за неделю составила " + maxVyplota + " рублей");
        //task3
        System.out.println("Task 3");
        double[] payments2 = {12500, 10000, 9550, 12000, 99000};
        int totalExpense = 0;
        for (double vyplota2 : payments2) {
            totalExpense += vyplota2;
        }
        int weeksInMonth = 4;
        double averageExpense = (double) totalExpense / weeksInMonth;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей.\n", averageExpense);
        //task 4
        System.out.println("Task 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
