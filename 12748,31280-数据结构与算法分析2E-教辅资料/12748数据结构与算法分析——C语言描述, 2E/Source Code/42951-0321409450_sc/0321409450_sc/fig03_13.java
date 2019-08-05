public interface ListIterator<AnyType> extends Iterator<AnyType>
{
    boolean hasPrevious( );
    AnyType previous( );

    void add( AnyType x );
    void set( AnyType newVal );
}
