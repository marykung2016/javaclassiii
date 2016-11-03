package tw.org.iii;

import java.lang.reflect.Array;
import java.util.Arrays;

public class pokerPractice {
    public static void main(String[] args){
        //洗牌
        int[] poker = new int[52];
        //陣列宣告:poker陣列記憶體位置52個,屬性為整數(int),值仍為0,i.e.poker[0]=0, poker[1]=0,...,尚未放值到記憶體位置
        //在上面的宣告中，poker 是個 int[] 型態的參考名稱，程式會為 poker 配置可以儲存 52 個 int 整數的一維陣列物件，索引為 0 到 51，初始值預設為 0，在 Java 中配置陣列之後，若還沒有指定初值，則依資料型態的不同，會預設有不同的初值，如表 5.1 所示。
        int temp; boolean isRepeat; //V2
        for (int i=0; i<poker.length; i++){ //循序的取出陣列中的每個值:初始值i=0,利用迴圈遞增,跑52次; int = 0 - 51;在每次的 i 遞增後，都會作為陣列的索引指定以取出對應的陣列值
            do {
                temp = (int)(Math.random()*poker.length);//洗牌需產生亂數,所以將原本 0 - 51的值利用亂數改變值/打亂
                // 檢查發出牌是否重複 => 不能重複
                isRepeat = false; //假設沒有重複,執行以下for迴圈的動作
                for (int j=0; j<i; j++) { //i=整數0-51;temp=亂數值; j = 第3方/容器
                    if (poker[j] == temp) {//檢查i值是否等於temp值,先比對,然後替換,利用第3方/容器
                        isRepeat = true; //重複了就中斷,並跳出迴圈
                        break;
                    }
                }
            }while (isRepeat); //當沒有重複,i = 換過的數字時,印出i值
            poker[i] = temp;
            System.out.print(poker[i] + "\t");
         }
         System.out.println("----");
        //發牌
        int [][] players = new int[4][13]; //宣告二維陣列,屬性為整數,第一維4個位置,第二維13個位置,值為0
        for (int i=0; i<poker.length; i++){ //循序的取出陣列中的每個值:初始值i=0,利用迴圈遞增,跑52次; int = 0 - 51;在每次的 i 遞增後，都會作為陣列的索引指定以取出對應的陣列值
            players[i%4][i/4] = poker[i]; // 玩家4名;手上各有13張牌;利用[取餘數來取得四個結果:[0][1][2][3]],再利用[取商數得到13個結果]
        }
        //攤牌(理牌)
        String[] suits = {"黑桃", "紅心", "方塊", "梅花"};
        String[] values = {"A", "2", "3", "4", "5", "6",
                "7", "8", "9", "10", "J", "Q", "K"};
        for (int[] player : players){ //foreach 陣列 player(local變數,在此新增) = players
            Arrays.sort(player); //要對 player（一個宣告為player(int) 的 array）作排序
            for (int card : player){ //foreach card = player
                System.out.print(suits[card/13] + values[card%13] + "  ");
                //印出=>花色:4個類別(利用52/13取商:[0],[1],[2],[3]) + 數字:13個類別 (利用52/13取餘:[0]..[12])
            }
            System.out.println();
        }

        }

    }

