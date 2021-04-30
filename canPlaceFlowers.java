public class canPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {


        for(int i = 0; i < flowerbed.length -1; i++){
            if(i == 0){
                if(flowerbed[0] == 0 && flowerbed[1] == 0){
                    n--;
                    flowerbed[0] = 1;
                    continue;
                }
            }
            if(i == flowerbed.length - 2){
                if(flowerbed[i] == 0 && flowerbed[i + 1] == 0){
                    n--;
                    flowerbed[flowerbed.length - 1] = 1;
                    continue;
                }
            }
            if(flowerbed[i] == 0 & flowerbed[i + 1] == 0 && flowerbed[i + 2] == 0){
                n--;
                flowerbed[i + 1] = 1;
            }

        }
        if(n <= 0){
            return true;
        }
        return false;

    }
}
