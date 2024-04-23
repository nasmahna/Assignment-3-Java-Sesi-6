public class AssignSoal5 {
    public double getKeliling() {
        return 0;
    }

    public double getLuas() {
        return 0;
    }

    public static void main(String[] args) {
        Lingkaran circle = new Lingkaran(5);

        // Keliling/Parimeter
        double  kelilingLingkaran = circle.getKeliling();

        // Luas
        double luasLingkaran = circle.getLuas();

        // Menampilkan hasil
        System.out.println("Keliling lingkaran: " + kelilingLingkaran);
        System.out.println("Luas lingkaran: " + luasLingkaran);
    }
}

 class Lingkaran extends AssignSoal5 {
    private double radius;

    public Lingkaran(double radius) {
        this.radius = radius;
    }

    @Override
    public double getKeliling() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getLuas() {
        return Math.PI * radius * radius;
    }
}