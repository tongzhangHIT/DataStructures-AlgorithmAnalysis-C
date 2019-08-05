    /**
     * Insert into the priority queue, and return a Position
     * that can be used by decreaseKey. Duplicates are allowed.
     * @param x the item to insert.
     * @return the Position (PairNode) containing the newly inserted item.
     */
    public Position<AnyType> insert( AnyType x )
    {
        PairNode<AnyType> newNode = new PairNode<AnyType>( x );

        if( root == null )
            root = newNode;
        else
            root = compareAndLink( root, newNode );
            
        theSize++;
        return newNode;
    }

    /**
     * Change the value of the item stored in the pairing heap.
     * @param pos any Position returned by insert.
     * @param newVal the new value, which must be smaller than the currently stored value.
     * @throws IllegalArgumentException if pos is null, deleteMin has
     *       been performed on pos, or new value is larger than old.
     */
    public void decreaseKey( Position<AnyType> pos, AnyType newVal )
    {
        PairNode<AnyType> p = (PairNode<AnyType>) pos;
        
        if( p == null || p.element == null || p.element.compareTo( newVal ) < 0 )
            throw new IllegalArgumentException( );
            
        p.element = newVal;
        if( p != root )
        {
            if( p.nextSibling != null )
                p.nextSibling.prev = p.prev;
            if( p.prev.leftChild == p )
                p.prev.leftChild = p.nextSibling;
            else
                p.prev.nextSibling = p.nextSibling;

            p.nextSibling = null;
            root = compareAndLink( root, p );
        }
    }
