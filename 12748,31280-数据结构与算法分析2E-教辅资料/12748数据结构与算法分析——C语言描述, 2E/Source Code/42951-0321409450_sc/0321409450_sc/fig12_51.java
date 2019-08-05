    /**
     * Remove the smallest item from the priority queue.
     * @return the smallest item.
     * @throws UnderflowException if pairing heap is empty.
     */
    public AnyType deleteMin( )
    {
        if( isEmpty( ) )
            throw new UnderflowException( );

        AnyType x = findMin( );
        root.element = null; // null it out in case used in decreaseKey
        if( root.leftChild == null )
            root = null;
        else
            root = combineSiblings( root.leftChild );

        theSize--;
        return x;
    }
