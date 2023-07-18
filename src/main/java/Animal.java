public abstract class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String makeNoise(); // Abstract method - has no body only a blueprint

    public String eat(){
        return "Mmm, that was tasty!";
    }
}
