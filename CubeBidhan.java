public class CubeBidhan {
    private int length;
    private int width;
    private int height;
    private static int instanceCount = 0;

    // No-arg constructor
    public CubeBidhan() {
        this.length = 1;
        this.width = 1;
        this.height = 1;
        instanceCount++;
    }

    // Parameterized constructor (remove int return type)
    public CubeBidhan(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
        instanceCount++;
    }

    // Accessors and mutators
    public int getLengthBidhan() {
        return length;
    }

    public void setLengthBidhan(int length) {
        this.length = length;
    }

    public int getWidthBidhan() {
        return width;
    }

    public void setWidthBidhan(int width) {
        this.width = width;
    }

    public int getHeightBidhan() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    // Instance method to calculate volume
    public int getVolumeInstanceBidhan() {
        return length * width * height;
    }

    // Class method to calculate volume with supplied dimensions
    public static int getVolumeClassBidhan(int length, int width, int height) {
        return length * width * height;
    }

    // Class method to calculate volume using a Cube instance
    public static int getVolumeClassBidhan(CubeBidhan cube) {
        return cube.getLengthBidhan() * cube.getWidthBidhan() * cube.getHeightBidhan();
    }

    // Class method to get the instance count
    public static int getInstanceCountBidhan() {
        return instanceCount;
    }
}
