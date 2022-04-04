import java.util.Scanner;

class growth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//y= a(1 +r)^x
//a= initial value
//r = growth rate
//x = time interval
        System.out.println("Let's Calculate Forecast Followers");
        System.out.println("This program uses y = a(1 +r)^x");
        System.out.println("Enter Initial Value a: (hint: number of current followers)");
        int a = sc.nextInt();

        System.out.println("Enter growth rate r:");
        double r = sc.nextDouble();

        System.out.println("Enter time interval (in days)");
        double x = sc.nextDouble();
        System.out.println("==========================================");
        System.out.printf("%,d\n", (calcualteSubs(a, r, x)));
        System.out.println(" # of followers forecast in " + x + " days");
        System.out.println("==========================================");

        System.out.println("That is a growth of: ");
        System.out.printf("%,d\n", (calcualteSubs(a, r, x) - a));
        System.out.println("==========================================");
    }

    public static int calcualteSubs(int a, double r, double x) {

        return
                (int) (a * Math.pow((1 + r), x));

    }

}
//based on video tutorial by Alex Lee 