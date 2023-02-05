package animal;

public class Animal {
   private String name; //名前
   private int age;     //年齢

   public Animal() {
   }

   //コンストラクタ
   public Animal(String name, int age) {
       this.name = name;
       this.age = age;

   }

   public void say(){
       System.out.println(this.name + "です。年齢は" + this.age + "歳です。");

   }

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public int getAge() {
    return age;
}

public void setAge(int age) {
    this.age = age;
}


   }
