public class BmiService {
    public double calculate(int weightKg, double growthMtr) {
        double index = (weightKg / (growthMtr * growthMtr));
        return (int) index;
    }
}
