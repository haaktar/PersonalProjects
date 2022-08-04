package Exception;

public class BreakTimeException extends RuntimeException {

    public BreakTimeException(){

        super("it is time for break");
        System.err.println("15 min break");
    }

    public BreakTimeException(String str){
        super(str);
        System.err.println("15 min");
    }
}

class Test2 {

    static public void main(String[] args) {

        //  throw new RuntimeException();
        throw new BreakTimeException();
    }
}