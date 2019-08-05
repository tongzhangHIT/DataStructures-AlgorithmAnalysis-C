    /**
     * Internal method to remove from a subtree.
     * @param x the item to remove.
     * @param t the node that roots the subtree.
     * @return the new root of the subtree.
     */
    private TreapNode<AnyType> remove( AnyType x, TreapNode<AnyType> t )
    {
        if( t != nullNode )
        {
            int compareResult = x.compareTo( t.element );

            if( compareResult < 0 )
                t.left = remove( x, t.left );
            else if( compareResult > 0 )
                t.right = remove( x, t.right );
            else
            {
                    // Match found
                if( t.left.priority < t.right.priority )
                    t = rotateWithLeftChild( t );
                else
                    t = rotateWithRightChild( t );

                if( t != nullNode )     // Continue on down
                    t = remove( x, t );
                else
                    t.left = nullNode;  // At a leaf
            }
        }
        return t;
    }
