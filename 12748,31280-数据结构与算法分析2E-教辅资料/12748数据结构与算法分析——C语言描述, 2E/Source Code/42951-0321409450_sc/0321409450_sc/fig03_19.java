public class MyArrayList<AnyType> implements Iterable<AnyType>
{
    private int theSize;
    private AnyType [ ] theItems;
        ...
    public java.util.Iterator<AnyType> iterator( )
      { return new ArrayListIterator<AnyType>( this ); }

    private static class ArrayListIterator<AnyType>
                                          implements java.util.Iterator<AnyType>
    {
        private int current = 0;
        private MyArrayList<AnyType> theList;
              ...
        public ArrayListIterator( MyArrayList<AnyType> list )
          { theList = list; }

        public boolean hasNext( )
          { return current < theList.size( ); }
        public AnyType next( )
          { return theList.theItems[ current++ ]; }
    }
}
