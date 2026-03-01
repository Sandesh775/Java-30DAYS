public class Code04 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,3,4,5,1};
        int longest_streak_length = 0;
        int count = 0;
        for( int i =0; i<arr.length-1; i++){
                if(arr[i+1] > arr[i]){
                    count++;
                }
                else {
                    count = 0;
                }
            if(count > longest_streak_length){
                longest_streak_length = count;
            }
        }
        System.out.println("Longest Increasing Streak in Array output : "+(longest_streak_length+1));
    }
}