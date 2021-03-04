package exercises.first;

//desi nu foloseste mai multa memorie, nu este la fel de safe ca metoda cu fielduri duplicated in builder
//deoarece fieldurile nu sunt final, daca cineva reuseste sa treaca prin private fieldurile se pot schimba
public class OmNoDuplicates {
    private String name;
    private int age;

    //fara setteri, variabilele sunt finale (constante) acestea nu se schimba

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //prin clasa de builder, am separat complet user-ul/programatorul de clasa OmWithBuilder
    //OmWithBuilderBuilder e practic un DTO
    public static class OmNoDuplicatesBuilder{ //static nested class
        private OmNoDuplicates omReturned = new OmNoDuplicates(); //fara constructor la clasa de sus

        public static OmNoDuplicatesBuilder omBuilder(){
            return new OmNoDuplicatesBuilder();
        }

        public OmNoDuplicatesBuilder name(String name){
            omReturned.name = name;
            return this; //this=obiectul curent
        }

        public OmNoDuplicatesBuilder age(int age){
            omReturned.age = age;
            return this;
        }

        public OmNoDuplicates build(){ //face build la instanta
            return omReturned; //dupa ce am dat return la asta, am access numa la obiectul in sine(OmNoDuplicates) care are fielduri private, deci sunt innaccesibile
        }
    }
}
