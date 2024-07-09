

package Vechile;
public class Truck extends Vechile
{
    public Truck(int weightLoad) {
        this.weightLoad = weightLoad ;
    }

    // Overriding the getVehicleWeightLoad method
    @Override
    int getVehicleWeightLoad() {
        return weightLoad * 4;
    }
}
