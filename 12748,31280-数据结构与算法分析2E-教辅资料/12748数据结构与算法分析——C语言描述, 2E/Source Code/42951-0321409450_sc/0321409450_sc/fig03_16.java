    public boolean add( AnyType x )
    {
        add( size( ), x );
        return true;
    }

    public void add( int idx, AnyType x )
    {
        if( theItems.length == size( ) )
            ensureCapacity( size( ) * 2 + 1 );
        for( int i = theSize; i > idx; i-- )
            theItems[ i ] = theItems[ i - 1 ];
        theItems[ idx ] = x;

        theSize++;  
    }

    public AnyType remove( int idx )
    {
        AnyType removedItem = theItems[ idx ];
        for( int i = idx; i < size( ) - 1; i++ )
            theItems[ i ] = theItems[ i + 1 ];

        theSize--;    
        return removedItem;
    }

    public java.util.Iterator<AnyType> iterator( )
      { return new ArrayListIterator( ); }
        
    private class ArrayListIterator implements java.util.Iterator<AnyType>
    {
        private int current = 0;
        
        public boolean hasNext( )
          { return current < size( ); }
        
        public AnyType next( )
        {
            if( !hasNext( ) ) 
                throw new java.util.NoSuchElementException( ); 
            return theItems[ current++ ];
        }
        
        public void remove( )
          { MyArrayList.this.remove( --current ); }
    }
}
