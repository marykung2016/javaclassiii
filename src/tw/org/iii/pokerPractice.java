package tw.org.iii;

public class pokerPractice {
    //洗牌
    public static void main(String[] args){
        int[] poker = new int[52]; //新增poker陣列記憶體位置52個,屬性為整數(int),值仍為0,i.e.poker[0]=0, poker[1]=0,...,尚未放值到記憶體位置
        int temp; boolean isRepeat; //V2
        for (int i=0; i<poker.length; i++){ //將陣列記憶體位置帶入值:初始值i=0,利用迴圈遞增,跑52次; int = 0 - 51
            do {
                temp = (int)(Math.random()*poker.length);//洗牌需產生亂數,所以將原本 0 - 51的值利用亂數改變值/打亂
                // 檢查發出牌是否重複 => 不能重複
                isRepeat = false;
                for (int j=0; j<i; j++) {
                    if (poker[j] == temp) {//檢查i值是否等於temp值,先比對,然後替換,利用第3方/容器
                        isRepeat = true; //重複了就中斷,並跳出迴圈
                        break;
                    }
                }
            }while (isRepeat);
            poker[i] = temp;
//            System.out.print(poker[i] + "\t");
         }
         System.out.println("----");
        }

    }

