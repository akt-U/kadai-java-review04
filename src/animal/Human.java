package animal;

public class Human extends Animal implements Thinkable {
    private String hobby;//趣味

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Human() {

}
    //superから引っ張り＋コンストラクタ
    public Human(String name, int age, String hobby) {
        super(name, age);
        this.hobby = hobby;
    }

    //thinkを実装
    @Override
    public void think() {
        System.out.println("私は" + this.hobby + "について考えています");

    }
}
