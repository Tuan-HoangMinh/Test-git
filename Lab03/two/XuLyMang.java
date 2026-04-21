package lab01;
import java.util.Scanner;
import java.util.Arrays; // Thư viện để sắp xếp và in mảng nhanh chóng

public class XuLyMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Nhập kích thước mảng
        System.out.print("Nhap so luong phan tu cua mang: ");
        int n = scanner.nextInt();

        // Khởi tạo mảng với kích thước n
        double[] my_array = new double[n];

        // 2. Nhập các phần tử cho mảng
        System.out.println("Nhap cac phan tu cho mang:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu index " + i + ": ");
            my_array[i] = scanner.nextDouble();
        }

        // 3. Hiển thị mảng ban đầu
        System.out.println("\nMang ban dau: " + Arrays.toString(my_array));

        // 4. Sắp xếp mảng (Tăng dần)
        Arrays.sort(my_array);
        System.out.println("Mang sau khi sap xep: " + Arrays.toString(my_array));

        // 5. Tính Tổng và Trung bình cộng
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += my_array[i]; // Cộng dồn từng phần tử vào sum
        }
        
        double average = sum / n;

        // 6. In kết quả
        System.out.println("\n--- KET QUA ---");
        System.out.println("Tong cac phan tu: " + sum);
        System.out.println("Trung binh cong: " + average);

        scanner.close();
    }
}