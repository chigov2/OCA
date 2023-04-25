package HomeWork.Lesson22;

public class Human {
    final String pol;

    public Human(String pol) {
        this.pol = pol;
    }
    private String name;
    private int weight;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >0){
        this.age = age;}
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0){
        this.weight = weight;}
    }
}
class Test{
    public static void main(String[] args) {
        Human human = new Human("man");
        human.setAge(50);
        human.setWeight(100);
        human.setName("Mikee");
        System.out.println(human.getName() + " " + human.getWeight() + " "+ human.getAge());
    }


}
