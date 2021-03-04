package exercises.first;

public class OmEncapsulated {
    private String name;
    private int age;

    public OmEncapsulated(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { //se poate citi numele-> numele nu poate fi schimbat din cauza ca lipseste setterul
        return "Name: " + name;
    }

    public String getAge() { //se poate citi varsta
        return "Age: " + age; //concatenare de String
    }

    public void setAge(int age) { //se poate schimba varsta
        if(age > this.age){ //this=obiectul curent
            this.age = age;
        } //conditionare-cand cineva vrea sa schimbe valoarea lui age, aici a fost pusa o constrangere,
        // age-ul nou > age-ul curent, pt ca asta este singura functie de set age, este garantat ca o sa se respecte de fiecare data cand age-ul este schimbat
    }
}
