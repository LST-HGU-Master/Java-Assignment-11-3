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