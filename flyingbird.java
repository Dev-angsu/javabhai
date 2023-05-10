// import hello.calculator;

class flyingbird {
    int age;
    String name;
    int flyingpower;

    // constructor
    flyingbird(int age, String name, int flypow) {
        this.age = age;
        this.name = name;
        this.flyingpower = flypow;
    }

    public static void main(String[] args) {

        // Classname objectname = new Classname();

        // Flying power 1=low 2=mid 3=high
        flyingbird birb = new flyingbird(5, "Gumi", 2);
        birb.printInfo();
        // calculator.cal();
    }

    private void printInfo() {
        System.out.println("flyingbirb's age:" + age);
        System.out.println("flyingbirb's name:" + name);
        System.out.println("flyingbirb's Flying Power:" + flyingpower);
    }
}
