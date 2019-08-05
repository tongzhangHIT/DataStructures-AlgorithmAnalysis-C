public interface List<AnyType> extends Collection<AnyType>
{
    AnyType get( int idx );
    AnyType set( int idx, AnyType newVal );
    void add( int idx, AnyType x );
    void remove( int idx );

    ListIterator<AnyType> listIterator( int pos );
}
