package tool.counter;

public interface ITallyCounter{
    public int increment() throws InvalidOperationException;
    public int read();
    public int reset();
}