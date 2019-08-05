    /**
     * Merge rhs into the priority queue.
     * rhs becomes empty. rhs must be different from this.
     * @param rhs the other leftist heap.
     */
    public void merge( LeftistHeap<AnyType> rhs )
    {
        if( this == rhs )    // Avoid aliasing problems
            return;

        root = merge( root, rhs.root );
        rhs.root = null;
    }

    /**
     * Internal method to merge two roots.
     * Deals with deviant cases and calls recursive merge1.
     */
    private Node<AnyType> merge( Node<AnyType> h1, Node<AnyType> h2 )
    {
        if( h1 == null )
            return h2;
        if( h2 == null )
            return h1;
        if( h1.element.compareTo( h2.element ) < 0 )
            return merge1( h1, h2 );
        else
            return merge1( h2, h1 );
    }
