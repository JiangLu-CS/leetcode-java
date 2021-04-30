import java.util.Scanner;

public class alibaba2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            int city = sc.nextInt();
            int road = sc.nextInt();
            int distance = sc.nextInt();
            int[][] citydistance = new int[road][3];
            for(int i = 0; i < citydistance.length; i++){
                for(int j = 0; j < 3; j++){
                    citydistance[i][j] = sc.nextInt();
                }
            }
            int[] cityreach = new int[city];
            for(int i = 0; i < cityreach.length; i++){
                for(int j = 0; j < citydistance.length; j++){
                    if(citydistance[j][0] == i){
                        dfs(citydistance, citydistance[j][2], distance, citydistance[j][1], cityreach, i);
                    }
                }
            }
            int min = Integer.MAX_VALUE;
            int res = -1;
            for(int i = cityreach.length - 1; i >= 0; i--){
                if(min > cityreach[i]){
                    min = cityreach[i];
                    System.out.println(cityreach[i]);
                    res = i;
                }
            }
            System.out.println(res);
        }
    }
    public static void dfs(int[][] citydistance, int curdistance, int distance,
                           int curcity, int[] cityreach, int nowcity){
        if(curdistance >= distance){
            return;
        }
        cityreach[nowcity]++;
        for(int i = 0;i < citydistance.length; i++){
            if(citydistance[i][0] == curcity){
                dfs(citydistance, curdistance + citydistance[i][2], distance, citydistance[i][1]
                        ,cityreach, nowcity);
            }
        }

    }
}
