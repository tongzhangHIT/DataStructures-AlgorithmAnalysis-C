    /**
     * Print the tree contents in sorted order.
     */
    public void printTree( )
    {
        if( isEmpty( ) )
            System.out.println( "Empty tree" );
        else
            printTree( header.right );
    }
    
    /**
     * Internal method to print a subtree in sorted order.
     * @param t the node that roots the subtree.
     */
    private void printTree( RedBlackNode<AnyType> t )
    {
        if( t != nullNode )
        {
            printTree( t.left );
            System.out.println( t.element );
            printTree( t.right );
        }
    }
