public class MyArrayList<AnyType> implements Iterable<AnyType>
{
    private int theSize;
    private AnyType [ ] theItems;
        ...
    public java.util.Iterator<AnyType> iterator( )
      { return new ArrayListIterator<AnyType>( ); }
}
class ArrayListIterator<AnyType> implements java.util.Iterator<AnyType>
{
    private int current = 0;
        ...
    public boolean hasNext( )
      { return current < size( ); }
    public AnyType next( )
      { return theItems[ current++ ]; }
}
