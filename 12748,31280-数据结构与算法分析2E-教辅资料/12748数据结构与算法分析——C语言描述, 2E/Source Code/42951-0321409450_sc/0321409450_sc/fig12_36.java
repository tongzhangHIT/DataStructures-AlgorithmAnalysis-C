    /**
     * Internal method to insert into a subtree.
     * @param x the item to insert.
     * @param t the node that roots the subtree.
     * @return the new root of the subtree.
     */
    private AANode<AnyType> insert( AnyType x, AANode<AnyType> t )
    {
        if( t == nullNode )
            return new AANode<AnyType>( x, nullNode, nullNode );

        int compareResult = x.compareTo( t.element );

        if( compareResult < 0 )
            t.left = insert( x, t.left );
        else if( compareResult > 0 )
            t.right = insert( x, t.right );
        else
            return t;

        t = skew( t );
        t = split( t );
        return t;
    }
