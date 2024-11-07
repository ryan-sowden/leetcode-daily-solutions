import java.util.Scanner;

public class heatingSystem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // DATA FOR HEAT LOSS
        double wallHeatLoss = 0.5;
        double floorCeilingHeatLoss = 0.3;
        double windowHeatLoss = 3.0;

        //Temperature Difference
        double tempDiff = 22;

        // DATA FOR MEASUREMENT
        //Room Measurements
        double height = 2;
        double length = 4;
        double width = 3;
        //Window Measurement
        double heightWindow = 1;
        double widthWindow = 1.5;

        // Stage 1: Understand Problem
        //Area of the room:
        double floorCellingArea = length * width;

        //Area of Window
        double windowArea = heightWindow * widthWindow;

        //Area of the walls:
        double wallAreaWithoutWindow = length * height;
        double wallAreaWithWindow = (width * height) - windowArea;
        double wallArea = wallAreaWithoutWindow + wallAreaWithWindow;

        // Stage 2: Calculating Total Of HeatLoss
        double heatLossThroughWall = wallArea * wallHeatLoss * tempDiff;
        double heatLossThroughFloorCelling = floorCellingArea * floorCeilingHeatLoss * tempDiff;
        double heatLossThroughWindow = windowArea * windowHeatLoss * tempDiff;

        double energyNeeded = heatLossThroughWall + heatLossThroughFloorCelling + heatLossThroughWindow;
        System.out.println(Math.round(energyNeeded));

        // Stage 3: Heating Rooms
        // DATA FROM HEAT LOSS
        double solidWallHeatLoss = 2.0;
        double cavityWallWithoutInsulationHeatLoss = 1.0;
        double cavityWallWithInsulationHeatLoss = 0.5;
        double singleGlazedWindowHeatLoss = 5.7;
        double doubleGlazedWindowHeatLoss = 3.0;
        double floorAndCeilingHeatLoss = 0.3;

        // Wall Insulation Heat Lost
        System.out.println("Is The Wall solid: ");
        boolean isWallSolid = in.nextBoolean();
        if (isWallSolid){
            System.out.println("Is The Cavity Wall Insulated: ");
            boolean isWallInsulated = in.nextBoolean();
            if (isWallInsulated){
                heatLossThroughWall = wallArea * solidWallHeatLoss * tempDiff;
            } else {
                heatLossThroughWall = wallArea * solidWallHeatLoss * cavityWallWithoutInsulationHeatLoss * tempDiff;
            }
        } else {
            System.out.println("Is The Cavity Wall Insulated: ");
            boolean isWallInsulated = in.nextBoolean();
            if (isWallInsulated){
                heatLossThroughWall = wallArea * cavityWallWithInsulationHeatLoss * tempDiff;
            } else {
                heatLossThroughWall = wallArea * cavityWallWithoutInsulationHeatLoss * tempDiff;
            }
        }

        // Window Double-Glazing Heat Loss
        System.out.println("Is the window doubled glazed: ");
        boolean isWindowDoubledGlazed = in.nextBoolean();
        if (isWindowDoubledGlazed) {
            heatLossThroughWindow = windowArea * doubleGlazedWindowHeatLoss * tempDiff;
        } else {
            heatLossThroughWindow = windowArea * singleGlazedWindowHeatLoss * tempDiff;
        }



        // Stage 4: Outside Walls
        double numOutsideWalls = 3;
        double numLengthOutsideWalls = 1;
        double longWalls = numLengthOutsideWalls;
        double shortWalls = numOutsideWalls - numLengthOutsideWalls;

        energyNeeded = heatLossThroughWall + heatLossThroughFloorCelling + heatLossThroughWindow + floorAndCeilingHeatLoss;
        System.out.println(Math.round(energyNeeded));


    }
}
