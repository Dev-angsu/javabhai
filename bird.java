class bird {
    int age;
    String name;

    // constructor
    bird(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {

        // Classname objectname = new Classname();
        bird birb1 = new bird(5, "Gumi");
        birb1.printInfo();
        bird birb2 = new bird(2, "Gumiv2.0");
        birb2.printInfo();
        bird birb3 = new bird(6, "Henry");
        birb3.printInfo();
    }

    private void printInfo() {
        System.out.println("birb's age:" + age);
        System.out.println("birb's name:" + name);
        System.out.println("-------------------------------");
    }
}
