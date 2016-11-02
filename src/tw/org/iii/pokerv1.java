package tw.org.iii;

public class pokerv1 {
    //洗牌
    public static void main(String[] args){
        int[] poker = new int[52]; //新增poker陣列記憶體位置52個,屬性為整數(int),值仍為0,i.e.poker[0]=0, poker[1]=0,...,尚未放值到記憶體位置
//            System.out.println(poker);
        for (int i=0; i<poker.length; i++){ //將陣列記憶體位置帶入值:初始值i=0,利用迴圈遞增,跑52次
//            System.out.println(i); // int = 0 - 51
            //洗牌需產生亂數,所以將原本 0 - 51的值利用亂數改變值
            int temp = (int)(Math.random()*poker.length);
//            System.out.println(temp);

//            檢查發出牌是否重複 => 不能重複
            Boolean isRepeat = false;
            for (int j=0; j<i; j++){ //檢查i值是否等於temp值
                if (poker[j] == temp){
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

