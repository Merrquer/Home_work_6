import java.util.Scanner;

public class Home_Work_6_4 {
    public static void main(String[] args) {
        long[] numberArray = new long[]{681267077, 635938671, 684807994, 667828226, 958108399, 667542653, 502555570};
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введіть свій номер телефону");
        long numberClient = sc1.nextLong();
        System.out.println("Введіть назву свого оператора, можливі наступні варіанти: 'Vodafone', 'Kiyvstar', 'Lifecell'");
        String operatorName = sc2.nextLine();
        Phone myPhone = new Phone(numberClient, operatorName);
        Network net1 = new Network(numberArray);
        net1.regInNet(myPhone, operatorName);
        ;
    }
}


class Phone {
    long number;
    String operator;

    public Phone(long number, String operator) {
        this.number = number;
        this.operator = operator;
    }

    public long[] regitser(long[] numberArray) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Хочете спробувати зареєструватись у мережі?");
        String input = sc1.nextLine();
        if (input.equalsIgnoreCase("Так")) {
            for (int i = 0; i < numberArray.length; i++) {
                if (number == numberArray[i]) {
                    System.out.println("Номер вже зареєстрований");
                    System.out.println("Список доступних номерів: ");
                    for (int k = 0; k < numberArray.length; k++) {
                        System.out.println(numberArray[i]);
                    }
                    return numberArray;
                }
            }
            if (number / 10000000 > 0 & number / 100000000 < 10) {
                long[] newArray = new long[numberArray.length + 1];
                System.arraycopy(numberArray, 0, newArray, 0, numberArray.length);
                newArray[newArray.length - 1] = number;
                numberArray = newArray;
                System.out.println("Реєстрація в мережі успішна");
            } else {
                System.out.println("Ви ввели некоректний номер телефону");
                System.exit(4);
            }
        } else if (input.equalsIgnoreCase("Ні")) {
            System.out.println("Відмова від реєстрації, завершую роботу");
            System.exit(6);
        } else {
            System.out.println("Введіть Так чи Ні");
            System.exit(5);
        }
        System.out.println("Список доступних номерів: ");
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println(numberArray[i]);
        }
        return numberArray;
    }

    public void call(long[] numberArray) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("На який номер бажаєте подзвонити?");
        long numberToCall = sc1.nextLong();
        if (numberToCall == number) {
            System.out.println("Неможливо подзвонити на свій же номер");
            System.exit(2);
        }
        for (int i = 0; i < numberArray.length; i++) {
            if (numberToCall == numberArray[i]) {
                System.out.println("Дзвоню " + numberToCall);
                System.exit(0);
            }
        }
        {
            System.out.println("Номер телефона не зареєстровано");
            System.exit(3);
        }
    }

}

class Network {
    String operatorName;
    long[] numbersArray;

    public Network(long[] numbersArray) {
        this.numbersArray = numbersArray;

    }

    public void regInNet(Phone phone, String operatorName) {
        long[] vodafoneArray = new long[5];
        long[] kiyvstarArray = new long[5];
        long[] lifecellArray = new long[5];
        int k = 0;
        int j = 0;
        int g = 0;
        long[] newArray1;
        for (int i = 0; i < numbersArray.length; i++) {
            float coef = numbersArray[i] / 10000000;
            if (coef >= 66 & coef <= 67 || coef >= 50 & coef <= 51 || coef >= 95 & coef <= 96) {   //Заполнение массива с номерами водафон
                vodafoneArray[k] = numbersArray[i];
                k++;
            } else if (coef >= 68 && coef <= 69) {   //Заполнение массива с номерами киевстар
                kiyvstarArray[k] = numbersArray[i];
                j++;
            } else if (coef >= 63 && coef <= 64) {   //Заполнение массива с номерами лайфселл
                lifecellArray[k] = numbersArray[i];
                g++;
            } else System.out.println("Номер не підходе ні до одного оператора");
        }
        this.operatorName = operatorName;
        if (operatorName.equalsIgnoreCase("Vodafone")) {
            phone.regitser(vodafoneArray);
        } else if (operatorName.equalsIgnoreCase("Kiyvstar")) {
            phone.regitser(kiyvstarArray);
        } else if (operatorName.equalsIgnoreCase("Lifecell")) {
            phone.regitser(lifecellArray);
        }

    }


}
