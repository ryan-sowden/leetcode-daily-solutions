import java.util.Scanner;
import java.util.ArrayList;

public class HeatingRoom2 {
    // DATA FOR HEAT LOSS
    final static double FLOOR_CEILING_HEAT_LOSS = 0.3;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Double> arr = new ArrayList<>();
        boolean anoterRoom = true;
        double totalEnergy = 0;

        while (anoterRoom) {
            // Wall ////////////////////////////////////////////////////////////////////////////////////////////////////
            OutsideWall wall1 = new OutsideWall();
            System.out.println("WALL");
            wall1.setLength(in, "Length: ");

            wall1.setHeight(in, "Height: ");

            wall1.setWidth(in, "Width: ");

            wall1.setValidType(in);
            System.out.print("Wall HeatLoss = " + wall1.getHeatLoss());
            System.out.println(wall1.toString() + "\n");

            // Window //////////////////////////////////////////////////////////////////////////////////////////////////
            System.out.println("WINDOW");
            Window window1 = new Window();
            window1.setLength(in, "Window Length: ");

            window1.setHeight(in, "Window Height: ");

            window1.setValidType(in);
            System.out.println("Window HeatLoss: " + window1.getHeatLoss());
            System.out.println(window1.toString() + "\n");

            // Energy Needed ///////////////////////////////////////////////////////////////////////////////////////////
            double floorCellingHeatLoss =
                    (wall1.length * wall1.width) * FLOOR_CEILING_HEAT_LOSS * Structure.TEMP_DIFF;
            double energyNeeded = floorCellingHeatLoss + wall1.getHeatLoss() + window1.getHeatLoss();
            arr.add(energyNeeded);

            energyNeeded = totalEnergy = totalEnergy + energyNeeded;

            System.out.println("Energy Needed for this room = " + energyNeeded);
            System.out.println("Room Array: " + arr);
            System.out.println("Total Energy of all room so far: " + totalEnergy + " \n");

            // Another Room ////////////////////////////////////////////////////////////////////////////////////////////
            System.out.print("Do you Check Another Room: ");
            anoterRoom = in.nextBoolean();
            System.out.println();
        }
    }
}
