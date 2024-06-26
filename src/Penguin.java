public class Penguin extends Animal implements  Comparable, Copyable{

    private String name;
    private double height;

    public Penguin(int age, String name, double height){
        this.age = age;
        this.name = name;
        this.height = height;
    }

    @Override
    public int compareTo(Penguin other){
        if(age != other.age){
            return age - other.age;
        }
        if (height != other.height){
            return (int) Math.signum(height - other.height);
        }
        return name.compareTo(other.name);
    }

    @Override
    public Penguin copy() {
        return new Penguin(age,name,height);
    }
}
