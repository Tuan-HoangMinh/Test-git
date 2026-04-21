package lab01;
import java.util.Scanner;

public class VeTamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập chiều cao n từ bàn phím
        System.out.print("Nhap chieu cao n: ");
        int n = sc.nextInt();

        // Vòng lặp bên ngoài: chạy từ hàng 1 đến hàng n
        for (int i = 1; i <= n; i++) {
            
            // Vòng lặp 1: In khoảng trắng để đẩy dấu sao ra giữa
            // Càng xuống dưới, số khoảng trắng càng giảm (n-i)
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Vòng lặp 2: In dấu sao (*)
            // Số lượng dấu sao theo công thức: 2 * i - 1
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Sau khi in xong một hàng thì xuống dòng
            System.out.println();
        }

        sc.close();
    }
}