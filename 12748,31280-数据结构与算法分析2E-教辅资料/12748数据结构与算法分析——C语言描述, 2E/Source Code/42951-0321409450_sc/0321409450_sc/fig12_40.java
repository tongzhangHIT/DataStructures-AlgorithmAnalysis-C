    /**
     * Internal method to insert into a subtree.
     * @param x the item to insert.
     * @param t the node that roots the subtree.
     * @return the new root of the subtree.
     */
    private TreapNode<AnyType> insert( AnyType x, TreapNode<AnyType> t )
    {
        if( t == nullNode )
            return new TreapNode<AnyType>( x, nullNode, nullNode );

        int compareResult = x.compareTo( t.element );

        if( compareResult < 0 )
        {
            t.left = insert( x, t.left );
            if( t.left.priority < t.priority )
                t = rotateWithLeftChild( t );
        }
        else if( compareResult > 0 )
        {
            t.right = insert( x, t.right );
            if( t.right.priority < t.priority )
                t = rotateWithRightChild( t );
        }
        // Otherwise, it's a duplicate; do nothing

        return t;
    }
