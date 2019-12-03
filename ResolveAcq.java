package HW_1;

public class ResolveAcq {
    public static void main(String[] args) {
        resolveAcq(2, 9, 4); //дискриминант >0
//        resolveAcq(2, 5, 4); //дискриминант <0
//        resolveAcq(2, 4, 2); //дискриминант =0
    }

    public static void resolveAcq(float a, float b, float c) {
        float diskriminant = (float) Math.pow(b, 2) - 4 * a * c;
        if (diskriminant > 0) {
            float x1 = (-b + (float) Math.sqrt(diskriminant)) / (2 * a);
            float x2 = (-b - (float) Math.sqrt(diskriminant)) / (2 * a);
            System.out.println("x1 = " + x1 + "\nx2 = " + x2);
        } else if (diskriminant < 0) {
            System.out.println("Уравнение не имеет корней");
        } else {
            float x = -b / (2 * a);
            System.out.println("x = " + x) ;
        }
    }
}