public class Person implements Comparable<Person>
{
    private String name;
    private double height;
    private int age;

    public Person(String name, double height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public int compareTo(Person p)
    {
        if (this.age > p.age)
        {
            return -1;
        }
        if (this.age < p.age)
        {
            return 1;
        }
        if (this.height > p.height)
        {
            return -1;
        }
        return 1;
    }

    @Override
    public String toString()
    {
        return "\nName: " + name + ", Height: " + height + ", Age: " + age + " \n";
    }
}
