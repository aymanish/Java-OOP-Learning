package tool.counter;

public interface IAdvancedCounter extends ITallyCounter{
    public int decrement() throws InvalidOperationException;
}