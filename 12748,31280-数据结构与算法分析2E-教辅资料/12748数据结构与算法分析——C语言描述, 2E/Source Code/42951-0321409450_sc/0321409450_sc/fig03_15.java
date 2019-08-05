public class MyArrayList<AnyType> implements Iterable<AnyType>
{
    private static final int DEFAULT_CAPACITY = 10;
    
    private int theSize;
    private AnyType [ ] theItems;

    public MyArrayList( )
      { clear( ); }

    public void clear( )
    {
        theSize = 0;
        ensureCapacity( DEFAULT_CAPACITY );
    }
    
    public int size( )
      { return theSize; }
    public boolean isEmpty( )
      { return size( ) == 0; }
    public void trimToSize( )
      { ensureCapacity( size( ) ); }

    public AnyType get( int idx )
    {
        if( idx < 0 || idx >= size( ) )
            throw new ArrayIndexOutOfBoundsException( );
        return theItems[ idx ];    
    }
        
    public AnyType set( int idx, AnyType newVal )
    {
        if( idx < 0 || idx >= size( ) )
            throw new ArrayIndexOutOfBoundsException( );
        AnyType old = theItems[ idx ];    
        theItems[ idx ] = newVal;
        return old;    
    }

    public void ensureCapacity( int newCapacity )
    {
        if( newCapacity < theSize )
            return;

        AnyType [ ] old = theItems;
        theItems = (AnyType []) new Object[ newCapacity ];
        for( int i = 0; i < size( ); i++ )
            theItems[ i ] = old[ i ];
    }
