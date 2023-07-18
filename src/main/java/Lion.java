public class Lion extends Animal{

    private boolean canWaitToBeKing;

    public Lion(String name, boolean canWaitToBeKing){
        super(name);
        this.canWaitToBeKing = canWaitToBeKing;
    }

    @Override
    public String makeNoise(){
        return "ROAR!";
    }

    public String makeNoise(String message){ // do not need inheritance for overloading
        return "In, my opinion, " + message + ".";
    }

}
