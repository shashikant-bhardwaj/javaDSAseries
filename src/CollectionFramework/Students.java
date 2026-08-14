package CollectionFramework;

public class Students implements Comparable<Students>{
    public int age;
    public String name;
    public int weight;

    public Students(int age , String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Students{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Students that) {
        // this method is call for current object
        //we will define our sorting logic here

        //sort basics on age
        if(this.age == that.age){
            return this.name.compareTo(that.name);
        }
        return this.age - that.age;
    }


}
