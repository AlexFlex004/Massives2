//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        {
            ////////////////////////////
            System.out.println("CASE 1");
            int[] money = {14000, 24000, 34000, 40000, 20000};
            int sum = 0;
            for (int i = 0; i <= 4; i++) {
                sum = sum + money[i];
            }
            System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        }

        {
            ////////////////////////////
            System.out.println("CASE 2");
            int[] money = {14000, 24000, 34000, 40000, 20000};
            int minMoney = money[0];
            int maxMoney = money[0];

            for (int i = 1; i < money.length; i++) {
                if (money[i] < minMoney) {
                    minMoney = money[i];
                }
                if (money[i] > maxMoney) {
                    maxMoney = money[i];
                }
            }
                System.out.println("Минимальная сумма трат за неделю составила " +
                        minMoney + " рублей. Максимальная сумма трат за неделю составила " +
                        maxMoney + " рублей.");
            }

        {
            ////////////////////////////
            System.out.println("CASE 3");
            int[] money = {14000, 24000, 34000, 40000, 20000};
            int sum = 0;
            int i = 0;
            for (i = 0; i <= 4; i++) {
                sum = sum + money[i];
            }
                double average = sum / i;

                System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");

        }

        {
            ////////////////////////////
            System.out.println("CASE 4");
            char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            int left = 0;
            int right = reverseFullName.length - 1;

            while (left < right) {
                char temp = reverseFullName[left];
                reverseFullName[left] = reverseFullName[right];
                reverseFullName[right] = temp;
                left++;
                right--;
            }
            for (char c : reverseFullName) {
                System.out.print(c);
            }

        }

        }
    }