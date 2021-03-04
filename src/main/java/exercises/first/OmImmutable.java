package exercises.first;

public class OmImmutable {
    private final String name; //final-> o data ce a fost asignata o valoare aceasta nu se mai schimba (este o constanta)
    private final int age;

    public OmImmutable(String name,int age) {
        this.name = name;
        this.age = age;
    }

    //fara setteri, variabilele sunt finale (constante) acestea nu se schimba

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
