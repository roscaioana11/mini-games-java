package exercises.first;

public class EncapsulationExercise {
    public static void main(String[] args) {
        Om om = new Om("Ioana", 25); //not best practice pt ca eu pot sa fac si set la valori nu doar get
        System.out.println("Name: " + om.name + "\n" + "Age: " + om.age); //prin . accesez fieldurile
        om.name = "Gryg";
        System.out.println("Name: " + om.name + "\n" + "Age: " + om.age);

        OmEncapsulated omE = new OmEncapsulated("Ioana", 25);
        //System.out.println("Name: " + omE.name + "\n" + "Age: " + omE.age); //not working, name has private access
        System.out.println(omE.getName() + "\n" + omE.getAge());

        OmImmutable omI = new OmImmutable("Ioana", 25);
        System.out.println("Name: " + omI.getName() + "\n" + "Age: " + omI.getAge());

        OmWithBuilder omWithBuilder = OmWithBuilder.OmWithBuilderBuilder.omBuilder().name("Ioana").age(25).build(); //builder- forma mai avansata de incapsulare, limitezi accesul
    }
}
