public class Home_Work_6_2 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 10, 11);
        triangle.calculateSquare();
    }

    static class Triangle {
        int a, b, c;

        public Triangle(int firstSide, int secondSide, int thirdSide) {
            a = firstSide;
            b = secondSide;
            c = thirdSide;
            if (a + b > c & a + c > b & c + b > a) {
                System.out.println("Треугльник существует");
            }
            else {
                System.out.println("Треугольник не существует");
                System.exit(2);
            }
        }

        public void calculateSquare() {
            double square = a * b * c;
            System.out.println("Площадь треугольника: " + square);
        }
    }
}
