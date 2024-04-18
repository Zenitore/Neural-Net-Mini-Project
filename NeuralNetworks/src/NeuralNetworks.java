public class NeuralNetworks {
    private double density;
    private double velocity;
    private double wingArea;
    private double liftCoef;
    private double liftForce;


    public NeuralNetworks(double density, double velocity){
        liftCoef = 0.4;
        wingArea = 174;
        this.velocity = velocity;
        this.density = density;
    }

    public double calculate(){
        liftForce = liftCoef * (density*velocity*velocity)/2.0 * wingArea;
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
