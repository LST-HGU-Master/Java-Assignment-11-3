# 課題11-3: オブジェクトクラス

### 課題の説明
すべてのクラスはオブジェクトクラスを祖先に持っており、toString()メソッドとequals()メソッドは宣言なしに利用できるというので、下記のFarmerクラスを作成してProgB3.main()で使ってみたが「変更前の実行例」のようになってしまい期待通りの動作にならない。

そこでtoString()とequals()をオーバーライドし、「変更後の実行例」になるようにしなさい。ただし、equals()ではFarmerクラスのすべてのフィールドの値が一致しているかを比較すること。

### Farmer.java（toString()とequals()をオーバーライドする）
```java
public class Farmer
{
    String name;
    int hp;

    Farmer(String name, int hp){
        this.name = name;
        this.hp=hp;
    }

    public void run() {
        System.out.println(this.name + "は逃げ出した！");
    }
}
```

### ProgB3.java（変更・提出不要）
```java
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
```

### 変更前の実行例
```
Farmer@6504e3b2
Farmer@379619aa
Farmer@cac736f
Farmer@5e265ba4
fm2とfm1は違う人です。
fm2とfm3は違う人です。
fm2とfm4は違う人です。
```

### 変更後の実行例
```
Name：農民「山田」/HP:20
Name：農民「山本」/HP:28
Name：農民「山本」/HP:20
Name：農民「山本」/HP:28
fm2とfm1は違う人です。
fm2とfm3は違う人です。
fm2とfm4は同じ人です。
```
