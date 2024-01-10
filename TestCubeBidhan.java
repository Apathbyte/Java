public class TestCubeBidhan {
    public static void main(String[] args) {
        // Creating cubes with dimensions 2, 3, and 5
        CubeBidhan cube1 = new CubeBidhan();
        CubeBidhan cube2 = new CubeBidhan(2, 3, 5);

        // Displaying volume of each cube
        System.out.println("Volume of Cube 1: " + cube1.getVolumeInstanceBidhan());
        System.out.println("Volume of Cube 2: " + cube2.getVolumeInstanceBidhan());

        // Displaying instance count
        System.out.println("Number of instances created is : " + CubeBidhan.getInstanceCountBidhan());
    }
}
