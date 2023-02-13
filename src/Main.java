public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double growthMtr = 1.90;
        int weightKg = 98;
        double index = service.calculate(weightKg,growthMtr);

        System.out.println((int)index + " bmi-индекс");
    }
}

