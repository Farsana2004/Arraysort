import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length-i-1;j++){
                if(numbers[j]>numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " "); 
        }

        int secondlowest = numbers[1];
        int secondhighest = numbers[3];

        System.out.println("\nSecond lowest number: " + secondlowest);
        System.out.println("Second highest number: " + secondhighest);
    }
}
