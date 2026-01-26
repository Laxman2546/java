public class Jobsandmachines {
    public static int JobsAndMachines(int n, int k, int[] a, int[] b) {
        int left = 0;
        int right = 0;
        int result = 0;
            while(left <= n && right<=n){
                if(a[left] < b[right]){
                result += a[left];
                left++;
                right++;
            }
            if(b[right] < a[left] && left > 1 && a[left]+k<b[right]){
                result += a[right];
                left++;
                right++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] a = {11, 34, 50, 29, 17};
        int[] b = {36, 48, 27, 13, 18};
        int k = 8;
        int n = a.length;
        int res = JobsAndMachines(n ,k,  a, b);
        System.out.println(res);
    }
}
