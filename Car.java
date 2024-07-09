package Vechile;
public class Car extends Vechile {
    public Car(int weightLoad) {
        this.weightLoad = weightLoad;
    }

    // Overriding the getVehicleWeightLoad method
    @Override
    int getVehicleWeightLoad() {
        return weightLoad;
    }
}
