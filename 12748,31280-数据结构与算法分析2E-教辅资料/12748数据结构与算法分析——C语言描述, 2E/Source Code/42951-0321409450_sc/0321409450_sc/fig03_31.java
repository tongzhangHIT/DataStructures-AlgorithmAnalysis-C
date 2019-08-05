    /**
     * Gets the Node at position idx, which must range from 0 to size( ).
     * @param idx index of node being obtained.
     * @return internal node corresponding to idx.
     * @throws IndexOutOfBoundsException if idx is not between 0 and size().
     */
    private Node<AnyType> getNode( int idx )
    {
        Node<AnyType> p;
        
        if( idx < 0 || idx > size( ) )
            throw new IndexOutOfBoundsException( );
            
        if( idx < size( ) / 2 )
        {
            p = beginMarker.next;
            for( int i = 0; i < idx; i++ )
                p = p.next;            
        }
        else
        {
            p = endMarker;
            for( int i = size( ); i > idx; i-- )
                p = p.prev;
        } 
        
        return p;
    }
