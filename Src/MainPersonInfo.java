public class MainPersonInfo {
    public static void main(String[] args) {
        PersonInfo person1;
        person1 = new PersonInfo("Will","Smith","New York","2936729462846");
        PersonInfo person2;
        person2=new PersonInfo("Jackie","Chan","Shanghai","12312412412");
        PersonInfo person3;
        person3=new PersonInfo("Sherlock","Holmes","London","37742123513");
        System.out.println(person1.personInfo());
        System.out.println(person2.personInfo());
        System.out.println(person3.personInfo());

    }

}
