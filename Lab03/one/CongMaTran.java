package lab01;
import java.util.Scanner;

public class CongMaTran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Nhập kích thước ma trận
        System.out.print("Nhap so hang (rows): ");
        int rows = sc.nextInt();
        System.out.print("Nhap so cot (columns): ");
        int cols = sc.nextInt();

        // Khởi tạo 2 ma trận A, B và ma trận kết quả Sum
        int[][] matrixA = new int[rows][cols];
        int[][] matrixB = new int[rows][cols];
        int[][] matrixSum = new int[rows][cols];

        // 2. Nhập dữ liệu cho ma trận A
        System.out.println("\nNhap cac phan tu cho Ma tran A:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                matrixA[i][j] = sc.nextInt();
            }
        }

        // 3. Nhập dữ liệu cho ma trận B
        System.out.println("\nNhap cac phan tu cho Ma tran B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                matrixB[i][j] = sc.nextInt();
            }
        }

        // 4. Thuc hien phep cong hai ma tran
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrixSum[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        // 5. Hien thi ket qua
        System.out.println("\nMa tran ket qua (A + B):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrixSum[i][j] + "\t"); // \t de tao khoang cach tab cho dep
            }
            System.out.println(); // Xuong dong sau khi in het mot hang
        }

        sc.close();
    }
}