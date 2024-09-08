package tool;

public interface ISet<E> {

    boolean add(E element);
    
    void clear( );

    boolean contains(E element);

    boolean isEmpty( );

    boolean remove(E element);

    int size( );
    
}
