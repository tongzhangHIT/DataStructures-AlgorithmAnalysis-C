    /**
     * Internal method to remove from a subtree.
     * @param x the item to remove.
     * @param t the node that roots the subtree.
     * @return the new root of the subtree.
     */
    private AANode<AnyType> remove( AnyType x, AANode<AnyType> t )
    {
        if( t != nullNode )
        {
            // Step 1: Search down the tree and set lastNode and deletedNode
            lastNode = t;
            if( x.compareTo( t.element ) < 0 )
                t.left = remove( x, t.left );
            else
            {
                deletedNode = t;
                t.right = remove( x, t.right );
            }

            // Step 2: If at the bottom of the tree and
            //         x is present, we remove it
            if( t == lastNode )
            {
                if( deletedNode == nullNode || 
                                   x.compareTo( deletedNode.element ) != 0 )
                    return t;   // Item not found; do nothing
                deletedNode.element = t.element;
                t = t.right;
            }

            // Step 3: Otherwise, we are not at the bottom; rebalance
            else if( t.left.level < t.level - 1 || t.right.level < t.level - 1 )
            {
                if( t.right.level > --t.level )
                    t.right.level = t.level;
                t = skew( t );
                t.right = skew( t.right );
                t.right.right = skew( t.right.right );
                t = split( t );
                t.right = split( t.right );
            }
        }
        return t;
    }
