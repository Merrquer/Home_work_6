import java.util.Scanner;

public class Home_Work_6_3 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введіть значення координат (x/y/z) для першого вектора");
        int x1 = sc1.nextInt();
        int y1 = sc1.nextInt();
        int k1 = sc1.nextInt();
        int[] arrVec1 = new int[3];
        Vector vec1 = new Vector(x1, y1, k1, arrVec1);
        System.out.println("Введіть значення координат х/y/z для другого вектора");
        int x2 = sc1.nextInt();
        int y2 = sc1.nextInt();
        int k2 = sc1.nextInt();
        int[] arrVec2 = new int[3];
        Vector vec2 = new Vector(x2, y2, k2, arrVec2);
        vec1.additionVectors(arrVec2, arrVec1);
//        vec1.scalarVectros(arrVec1, arrVec2);
        vec1.scalarVectrosSumm(arrVec1,arrVec2);
        vec1.vectorVectors(arrVec1, arrVec2);
    }
}

class Vector {
    int x, y, z;

    public Vector(int x, int y, int z, int[] array) {
        int[] arr = {this.x = x, this.y = y, this.z = z};
        for (int i = 0; i < array.length; i++) {
            array[i] = arr[i];
        }
    }

    public void infoVector(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public void additionVectors(int[] arrVec1, int[] arrVec2) {
        double res = 0;
        double[] arrRes = new double[3];
        for (int i = 0; i < arrVec1.length & i < arrVec2.length; i++) {
            res = arrVec1[i] + arrVec2[i];
            arrRes[i] = res;
        }
        System.out.print("Складення векторів дорівнює ");
        for (int i = 0; i < arrRes.length; i++) {
            System.out.print(arrRes[i] + " ");
        }
        System.out.println();
    }

    public void scalarVectros(int[] arrVec1, int[] arrVec2) {
        double res = 0;
        double[] arrRes = new double[3];
        for (int i = 0; i < arrVec1.length & i < arrVec2.length; i++) {
            res = arrVec1[i] * arrVec2[i];
            arrRes[i] = res;
        }
        System.out.print("Скалярний добуток(координати) векторів дорівнює ");
        for (int i = 0; i < arrRes.length; i++) {
            System.out.print(arrRes[i] + " ");
        }
        System.out.println();
    }

    public void vectorVectors(int[] arrVec1, int[] arrVec2) {
        double x= (arrVec1[1]*arrVec2[2]-arrVec1[2]*arrVec2[1]);
        double y= (arrVec1[2]*arrVec2[0]-arrVec1[0]*arrVec2[2]);
        double z= (arrVec1[0]*arrVec2[1]-arrVec1[1]*arrVec2[0]);
        System.out.println("Векторний добуток векторів дорівнює "+x+" "+y+" "+z);
    }
    public void scalarVectrosSumm(int[] arrVec1, int[] arrVec2) {
        double res = 0;
        for (int i = 0; i < arrVec1.length & i < arrVec2.length; i++) {
            res = arrVec1[i] * arrVec2[i]+res;
        }
        System.out.println("Скалярний добуток векторів дорівнює "+res);

    }
}
