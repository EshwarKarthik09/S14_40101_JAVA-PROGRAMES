public class Counting {
     public static void main(String args[]) {
     int[] marks = {70, 45, 80, 35, 90};
     int count = 0;
     for( int i = 0; i<marks.length; i++){
        if (marks[i] >= 40){
            count++;
        }
     }
     System.out.println("Number of students passed:" + count);
     }

    
}
