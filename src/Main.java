import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        BmiService bmi = new BmiService();
        DecimalFormat dF = new DecimalFormat("#.##");
        double bodyMass = bmi.calculate(180, 1.84);
        System.out.println("ИМТ равен " + dF.format(bodyMass) + " кг/м2");
    }
}
