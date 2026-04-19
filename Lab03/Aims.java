package theAims;

public class Aims {

    public static void main(String[] args) {

        // Tạo giỏ hàng
        Cart cart = new Cart();

        // Tạo các DVD với các constructor khác nhau
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Animation", "Frozen", 19.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Christopher Nolan", "Sci-Fi", "Inception", 24.5f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Interstellar", "Sci-Fi", "Christopher Nolan", 169, 29.99f);

        // Thêm DVD vào giỏ
        cart.addDigitalVideoDisc(dvd1);
        cart.addDigitalVideoDisc(dvd2);
        cart.addDigitalVideoDisc(dvd3);
        cart.addDigitalVideoDisc(dvd4);

        // In tổng tiền
        System.out.println("Total cost: " + cart.totalCost());

        // Xóa 1 DVD
        cart.removeDigitalVideoDisc(dvd2);
        cart.removeDigitalVideoDisc(dvd1);
        // In lại tổng tiền
        System.out.println("Total cost after removal: " + cart.totalCost());
    }
}
