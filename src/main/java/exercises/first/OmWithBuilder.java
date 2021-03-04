package exercises.first;

//Immutability
public class OmWithBuilder {
    private final String name; //final-> o data ce a fost asignata o valoare aceasta nu se mai schimba (este o constanta)
    private final int age;

    private OmWithBuilder(String name,int age) {
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

    //prin clasa de builder, am separat complet user-ul/programatorul de clasa OmWithBuilder
    //OmWithBuilderBuilder e practic un DTO
    public static class OmWithBuilderBuilder{ //static nested class
        private String name;
        private int age;

        public static OmWithBuilderBuilder omBuilder(){
            return new OmWithBuilderBuilder();
        }

        public OmWithBuilderBuilder name(String name){
            this.name = name;
            return this; //this=obiectul curent
        }

        public OmWithBuilderBuilder age(int age){
            this.age = age;
            return this;
        }

        public OmWithBuilder build(){ //face build la instanta
            return new OmWithBuilder(name, age); //new OmWithBuilder-> obiect/instanta
        }
    }
}
