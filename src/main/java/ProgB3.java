public class ProgB3
{
    public static void main(String arg[]){
        //３つのFarmerクラスのインスタンスの宣言と代入；
        Farmer fm1 = new Farmer("農民「山田」", 20);
        Farmer fm2 = new Farmer("農民「山本」", 28);
        Farmer fm3 = new Farmer("農民「山本」", 20);
        Farmer fm4 = new Farmer("農民「山本」", 28);
        // toStringメソッドを使う
        System.out.println(fm1.toString());
        System.out.println(fm2.toString());
        System.out.println(fm3.toString());
        System.out.println(fm4.toString());
        // equalsメソッドを使う
        System.out.print("fm2とfm1は");
        if(fm2.equals(fm1)) System.out.println("同じ人です。");
        else                System.out.println("違う人です。");
        System.out.print("fm2とfm3は");
        if(fm2.equals(fm3)) System.out.println("同じ人です。");
        else                System.out.println("違う人です。");
        System.out.print("fm2とfm4は");
        if(fm2.equals(fm4)) System.out.println("同じ人です。");
        else                System.out.println("違う人です。");
    }
}
