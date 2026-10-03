import java.util.Scanner;
public class MunicipalWasteOptimizer {
    public static void checkCollectionStatus(double waste) {
        if (waste >= 100.0) {
            System.out.println("Collection Target Achieved");
        } else {
            System.out.println("More Waste Collection Required");
        }
    }