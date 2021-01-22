public class Person{
    private String first, last;

    public Person(String first, String last){
        setName(first,last);
    }

    public Person(){
        this("", "");
    }

    public String getFirst(){
        return this.first;
    }

    public String getLast(){
        return this.last;
    }

    public void printLastFirst(){
        System.out.println(last + ", " + first);
    }

    public void setName(String first, String last){
        this.first = first;
        this.last = last;
    }

    public void print(){
        System.out.println(this);
    }

    public String toString(){
        return first + " " + last;
    }

    public Person getCopy(){
        return new Person(first, last);
    }

    public boolean equals(Object o){
        if (!(o instanceof Person)) return false;
        Person other = (Person)o;

        return first.equals(other.getFirst()) && last.equals(other.getLast());
    }
}