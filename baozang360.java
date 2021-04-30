import java.util.Scanner;

public class baozang360 {
    public static int max = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int maxdis = sc.nextInt();
        int times = sc.nextInt();
        int[][] distance = new int[num][2];
        int count = 0;
        if(maxdis == 0 || times == 0){
            System.out.println(0);
            return;
        }
        while(sc.hasNext()){
            distance[count][0] = sc.nextInt();
            distance[count][1] = sc.nextInt();
            count++;
        }
        int[] dp = new int[num];
        for(int i = 0; i < dp.length; i++){
            if(distance[i][0] <= maxdis){
                dp[i] = distance[i][1];
            }
        }
        for(int i = 1; i < dp.length; i++){
            int flytimes = times;
            if(dp[i] > 0){
                for(int j = i + 1; flytimes > 0 && j < dp.length;j++){
                    if(distance[j][0] - distance[i][0] <= maxdis){
                        dp[j] = Math.max(dp[j], dp[i] + distance[j][1]);
                        max = Math.max(max, dp[j]);
                        flytimes--;
                    }
                }
            }
        }
        System.out.println(max);
    }

}
