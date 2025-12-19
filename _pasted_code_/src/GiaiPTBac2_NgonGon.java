import java.util.Scanner;

public class GiaiPTBac2_NgonGon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: "); double a = sc.nextDouble();
        System.out.print("Nhập b: "); double b = sc.nextDouble();
        System.out.print("Nhập c: "); double c = sc.nextDouble();

        if (a == 0) { // thành phương trình bậc nhất
            System.out.println(b == 0 ? (c == 0 ? "Vô số nghiệm" : "Vô nghiệm")
                                      : "Nghiệm x = " + (-c / b));
        } else {
            double delta = b * b - 4 * a * c;
            if (delta > 0)
                System.out.println("x1 = " + ((-b + Math.sqrt(delta)) / (2 * a)) +
                                   ", x2 = " + ((-b - Math.sqrt(delta)) / (2 * a)));
            else if (delta == 0)
                System.out.println("Nghiệm kép x = " + (-b / (2 * a)));
            else
                System.out.println("Vô nghiệm thực");
        }
        sc.close();
    }
}