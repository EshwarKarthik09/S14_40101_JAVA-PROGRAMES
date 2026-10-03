public class Extreme {
     public static void main(String args[]) {
     int[] marks = {70, 45, 80, 35, 90};
     int highest = marks[0];
     int lowest = marks[0];
     for (int i=1; i<marks.length; i++) {
        if (marks[i] > highest) {
            highest = marks[i];
     }
    if (marks[i] < lowest){
        lowest = marks[i];
    }
}
    System.out.println("highest marks: " +highest);
    System.out.println("lowest marks: " +lowest);
}
    }