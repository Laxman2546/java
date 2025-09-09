package arraysprac;


public class Switch {
    public static boolean Arm(int n) {
        boolean isStrong = false;
        int original = n;
        int sum = 0;
        while(n !=0){
            int num = n % 10;
            int powSum =(int)Math.pow(num,3);
            sum += powSum;
            n = n / 10;
        }
        if(sum == original){
            isStrong = true;
            return isStrong;
        }
        return isStrong;
    }


    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Eneter the day: ");
        // int day = sc.nextInt();
        // switch (day) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        //     default:
        //         System.out.println("Invalid");
        // }
        int n = 153;
        System.out.println(Arm(n));
    }

 }
       

