    /**
     * Internal method to perform a top-down splay.
     * The last accessed node becomes the new root.
     * @param x the target item to splay around.
     * @param t the root of the subtree to splay.
     * @return the subtree after the splay.
     */
    private BinaryNode<AnyType> splay( AnyType x, BinaryNode<AnyType> t )
    {
        BinaryNode<AnyType> leftTreeMax, rightTreeMin;

        header.left = header.right = nullNode;
        leftTreeMax = rightTreeMin = header;

        nullNode.element = x;   // Guarantee a match

        for( ; ; )
            if( x.compareTo( t.element ) < 0 )
            {
                if( x.compareTo( t.left.element ) < 0 )
                    t = rotateWithLeftChild( t );
                if( t.left == nullNode )
                    break;
                // Link Right
                rightTreeMin.left = t;
                rightTreeMin = t;
                t = t.left;
            }
            else if( x.compareTo( t.element ) > 0 )
            {
                if( x.compareTo( t.right.element ) > 0 )
                    t = rotateWithRightChild( t );
                if( t.right == nullNode )
                    break;
                // Link Left
                leftTreeMax.right = t;
                leftTreeMax = t;
                t = t.right;
            }
            else
                break;

        leftTreeMax.right = t.left;
        rightTreeMin.left = t.right;
        t.left = header.right;
        t.right = header.left;
        return t;
    }
