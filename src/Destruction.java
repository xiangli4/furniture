public class Destruction {
    public static void main(String[] args) {


        // Create two instances of Furniture, a Plywood Chair and a Glass table
        // Apply each kind of damage to each instance of your furniture,
        // printing its status at each step

        Furniture fu1 = new Furniture("Table", "glas");
        System.out.println("The " + fu1 + " is not broken and not burnt.");
        System.out.println("Thwacking the " + fu1.getType() + "...");
        fu1.setBlunt();
        System.out.print("The " + fu1 +" is ");
        if (fu1.getBroken()== false) {
            System.out.print("not");
        };
        System.out.print(" broken, and it is ");
        if (fu1.getBurnt()== false) {
            System.out.print("not");
        };
        System.out.print(" burnt.");
        System.out.println();
        System.out.println("Setting fire to the " + fu1.getType() + "...");
        fu1.setFire();
        System.out.print("The " + fu1 +" is ");
        if (fu1.getBroken()== false) {
            System.out.print("not");
        };
        System.out.print(" broken, and it is ");
        if (fu1.getBurnt()== false) {
            System.out.print("not");
        };
        System.out.print(" burnt.");
        System.out.println();

    }
}
