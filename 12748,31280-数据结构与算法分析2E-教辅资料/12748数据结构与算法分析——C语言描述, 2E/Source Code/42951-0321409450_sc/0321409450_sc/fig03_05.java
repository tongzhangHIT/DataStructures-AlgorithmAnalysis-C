public interface Collection<AnyType> extends Iterable<AnyType>
{
    int size( );
    boolean isEmpty( );
    void clear( );
    boolean contains( AnyType x );
    boolean add( AnyType x );
    boolean remove( AnyType x );
    java.util.Iterator<AnyType> iterator( );
}
