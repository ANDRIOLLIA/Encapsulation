public final class Cargo {
    private final Dimensions dimensions;
    private final double weight;
    private final String deliveryAddress;
    private final boolean isFlipAllowed;
    private final String registrationNumber;
    private final boolean isFragile;

    public Cargo(Dimensions dimensions, double weight, String deliveryAddress, boolean isFlipAllowed, String registrationNumber, boolean isFragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.isFlipAllowed = isFlipAllowed;
        this.registrationNumber = registrationNumber;
        this.isFragile = isFragile;
    }

    public Cargo withNewDimensions(Dimensions newDimensions) {
        return new Cargo(newDimensions, this.weight, this.deliveryAddress, this.isFlipAllowed, this.registrationNumber, this.isFragile);
    }

    public Cargo withNewWeight(double newWeight) {
        return new Cargo(this.dimensions, newWeight, this.deliveryAddress, this.isFlipAllowed, this.registrationNumber, this.isFragile);
    }

    public Cargo withNewDeliveryAddress(String newAddress) {
        return new Cargo(this.dimensions, this.weight, newAddress, this.isFlipAllowed, this.registrationNumber, this.isFragile);
    }

    public Dimensions getDimensions() { return dimensions; }
    public double getWeight() { return weight; }
    public String getDeliveryAddress() { return deliveryAddress; }
    public boolean isFlipAllowed() { return isFlipAllowed; }
    public String getRegistrationNumber() { return registrationNumber; }
    public boolean isFragile() { return isFragile; }
}