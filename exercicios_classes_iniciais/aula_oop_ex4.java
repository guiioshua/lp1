public class Main {
    public static void main(String[] args) {
        double p1 = 7.0;
        double e1 = 6.0;
        double e2 = 9.5;
        double x = 0.5;
        double sub = 3.0;
        double api = 6.5;
        double exf = 0.0;

        double base = (p1 * 0.5) + (e1 * 0.2) + (e2 * 0.3) + x + (sub * 0.15);
        double diff = base - 5.9;
        double indicator = Math.max(diff, 0) / (diff == 0 ? 1 : diff);
        
        double mediaFinal = Math.max((base * 0.5) + (indicator * api * 0.5), exf);

        System.out.println("Media Final: " + mediaFinal);
    }
}
