import javax.rmi.CORBA.Util;
import java.util.Random;

public class NeuralNetworks {
    private double density;
    private double velocity;
    private double wingArea;
    private double liftCoef;
    private double liftForce;
    private double bias;
    private double weight1;
    private double weight2;
    private Random random;


    public NeuralNetworks(double density, double velocity){
        random = new Random();
        bias = random.nextDouble();
        weight1 = random.nextDouble();
        weight2 = random.nextDouble();
        wingArea = 174;
        this.velocity = velocity;
        this.density = density;
    }

    public class Util {
        public static double sigmoid(double in){
            return 1 / (1 + Math.exp(-in));
        }
    }

    public double calculate(double input1, double input2){
        double preActivation = (weight1*input1) + (weight2*input2) + bias;
        double output = Util.sigmoid(preActivation);
        return liftForce;
    }



    public double getWingArea() {
        return wingArea;
    }

    public double getDensity() {
        return density;
    }

    public double getLiftCoef() {
        return liftCoef;
    }

    public double getVelocity() {
        return velocity;
    }
}
