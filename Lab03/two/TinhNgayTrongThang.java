package lab01;
import java.util.Scanner;

public class TinhNgayTrongThang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = -1;
        int month = -1;

        // 1. Vòng lặp yêu cầu nhập Năm cho đến khi đúng (số không âm)
        while (true) {
            System.out.print("Nhap nam (vi du 1999): ");
            String inputYear = sc.nextLine();
            
            // Kiểm tra xem chuỗi nhập vào có phải là số và không âm không
            try {
                year = Integer.parseInt(inputYear);
                if (year >= 0) break; // Năm hợp lệ thì thoát vòng lặp
                else System.out.println("Nam phai la so khong am. Vui long nhap lai!");
            } catch (Exception e) {
                System.out.println("Nam khong hop le (phai la so). Vui long nhap lai!");
            }
        }

        // 2. Vòng lặp yêu cầu nhập Tháng cho đến khi đúng
        while (true) {
            System.out.print("Nhap thang (Full name, Abbreviation, 3 letters, hoặc Number): ");
            String inputMonth = sc.nextLine().trim().toLowerCase(); // Chuẩn hóa về chữ thường

            // Dùng Switch-case để ánh xạ tất cả các kiểu nhập về số tháng từ 1-12
            switch (inputMonth) {
                case "january": case "jan.": case "jan": case "1": month = 1; break;
                case "february": case "feb.": case "feb": case "2": month = 2; break;
                case "march": case "mar.": case "mar": case "3": month = 3; break;
                case "april": case "apr.": case "apr": case "4": month = 4; break;
                case "may": case "5": month = 5; break;
                case "june": case "jun.": case "jun": case "6": month = 6; break;
                case "july": case "jul.": case "jul": case "7": month = 7; break;
                case "august": case "aug.": case "aug": case "8": month = 8; break;
                case "september": case "sept.": case "sep": case "9": month = 9; break;
                case "october": case "oct.": case "oct": case "10": month = 10; break;
                case "november": case "nov.": case "nov": case "11": month = 11; break;
                case "december": case "dec.": case "dec": case "12": month = 12; break;
                default: month = -1; // Không khớp cái nào thì coi như sai
            }

            if (month != -1) break; // Tháng hợp lệ thì thoát vòng lặp
            else System.out.println("Thang khong hop le. Vui long nhap lai!");
        }

        // 3. Tính toán số ngày trong tháng
        int days = 0;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = 31;
                break;
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                // Kiểm tra năm nhuận theo quy tắc đề bài
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
        }

        // 4. In kết quả
        System.out.println("Thang " + month + " nam " + year + " co " + days + " ngay.");
        sc.close();
    }
}