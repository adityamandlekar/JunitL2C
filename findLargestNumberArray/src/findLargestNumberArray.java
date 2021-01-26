import java.util.*;

public class findLargestNumberArray {

    public static int [] readNums() {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the numbers :");
        int count = s.nextInt();
        s.nextLine();

        int [] numbers = new int[count];
        System.out.println("Enter the numbers :");
        Scanner numScanner = new Scanner(s.nextLine());
        for (int i = 0; i < count; i++) {
            if (numScanner.hasNextInt()) {
                numbers[i] = numScanner.nextInt();
            }
        }

        return numbers;
    }

    public static int findLargestNumber(int[] numbers) {

        int max = -1;

        if (numbers.length==0)
            throw new IllegalArgumentException();
        else if (numbers.length==1)
            return numbers[0];
        else if (numbers.length==2)
                return numbers[0] > numbers[1] ? numbers[0]:numbers[1];
        else if (numbers.length > 2)
        {
            max = numbers[0];
            for(int i =1; i < numbers.length; i++)
            {
                    if (numbers[i] > max)
                        max = numbers[i];
            }
        }

        return max;
    }
    
    public static void main(String[] args) {
        int[] numbers = readNums();
        int largestNum= findLargestNumber(numbers);
        System.out.println("largest number in the array is "+ largestNum);
    }
}
