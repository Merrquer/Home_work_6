import java.util.Scanner;

public class Home_Work_6_1 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Сколько весит ваш кот?");
        double weight = sc1.nextDouble();
        System.out.println("Сколько лет вашему коту?");
        int age = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Какого цвета ваш кот?");
        String color = sc2.nextLine();
        System.out.println("Как зовут вашего кота?");
        String name = sc2.nextLine();
        Cat Dimok = new Cat(weight, age, color, name);
        Dimok.Meow();
        Dimok.CatInfo();

    }

    static class Cat {

        double weight;
        int age;
        String color;
        String name;

        public Cat(double weight, int age, String color, String name) {
            this.weight = weight;
            this.age = age;
            this.color = color;
            this.name = name;
        }

        public void Meow() {
            System.out.println("Meow!");
        }

        public void CatInfo() {
            System.out.println("Color: " + color + ", cat age: " + age + ", cat weight: " + weight + "kg, name: " + name);
        }
    }
}

