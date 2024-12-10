class Person {
    String name;
    int age;

    public Person(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public void print() {
        System.out.println(name + " is " + age + " years old.");
    }
}
