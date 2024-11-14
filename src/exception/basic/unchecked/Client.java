package exception.basic.unchecked;

public class Client {
    public void call() throws MyUncheckedException{
        throw new MyUncheckedException("ex");
    }
}
