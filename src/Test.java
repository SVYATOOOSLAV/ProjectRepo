import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String str = "01:59:45";
        String[] arrStr = str.split(":");
        int sum = 0;

        sum += Integer.parseInt(arrStr[0]) * 3600;
        sum += Integer.parseInt(arrStr[1]) * 60;
        sum += Integer.parseInt(arrStr[2]);

        System.out.println(sum);

        System.out.println("Create new branch");
        System.out.println("This message is from a newBranch");
        System.out.println("Im fine");
    }
}
