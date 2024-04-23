public class AssignSoal4 {
    public double getArea() {
        return 0;
    }

    public static void main(String[] args) {
        // Membuat objek Rectangle
        Rectangle rectangle = new Rectangle(25, 12.5);

        // Memanggil metode getArea untuk menghitung luas
        double area = rectangle.getArea();

        // Menampilkan hasil
        System.out.println("Luas persegi panjang: " + area);
    }
}

class Rectangle extends AssignSoal4 {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    //Override
    public double getArea() {
        return length * width;
    }

}
