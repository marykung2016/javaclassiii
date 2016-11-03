package tw.org.iii;

public class pokerv1 {
    //洗牌
    public static void main(String[] args){
        int[] poker = new int[52]; //poker[0]...[51] = 0, ....0
//            System.out.println(poker); // int = 0
        for (int i=0; i<poker.length; i++){ //循序的取出陣列中的每個值:初始值i=0,利用迴圈遞增,跑52次; int = 0 - 51;在每次的 i 遞增後，都會作為陣列的索引指定以取出對應的陣列值
//            System.out.println(i); // int = 0 - 51
            int temp = (int)(Math.random()*poker.length); //洗牌需產生亂數,所以將原本 0 - 51的值利用亂數改變值/打亂
//            System.out.println(temp);
//            檢查發出牌是否重複 => 不能重複
            Boolean isRepeat = false;
            for (int j=0; j<i; j++){
                if (poker[j] == temp){ //檢查i值是否等於temp值
                    isRepeat = true; //重複了就中斷,並跳出迴圈
                    break;
                }
            }
            if (isRepeat) {
                i--;
            }else {
                poker[i] = temp;
                System.out.println(poker[i]);
            }
        }

    }

}

