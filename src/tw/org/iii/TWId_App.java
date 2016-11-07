package tw.org.iii;

public class TWId_App {

    public static void main(String[] args){
        TWIdBrad id1 = new TWIdBrad('W',true);
        System.out.println(id1.getId());
        if ( TWIdBrad.isCheckOK(id1.getId())){
            System.out.println("OK");
        }else{
            System.out.println("XX");
        }

    }
}