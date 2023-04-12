import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String[] array = {"Are","we","Really","The","World"};
        Arrays.sort(array, new StringCompare());      //Custom sorting
        System.out.println(Arrays.toString(array));
    }
}