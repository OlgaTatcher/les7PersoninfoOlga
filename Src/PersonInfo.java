public class PersonInfo {
    private String name;
    private String surname;
    private String city;
    private String phoneNum;

    public PersonInfo(String name, String surname, String city, String phoneNum) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.phoneNum = phoneNum;
    }
    public String personInfo(){
        return "Зателефонувати громадянину "+name+" "+surname+" із міста "+city+" можна за номером "+phoneNum;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", city='" + city + '\'' +
                ", phoneNum=" + phoneNum +
                '}';

    }

}
