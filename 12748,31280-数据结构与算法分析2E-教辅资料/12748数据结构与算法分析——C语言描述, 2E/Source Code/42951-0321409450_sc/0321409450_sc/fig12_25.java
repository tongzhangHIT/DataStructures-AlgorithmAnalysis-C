    /**
     * Insert into the DSL.
     * @param x the item to insert.
     */
    public void insert( AnyType x )
    {
        SkipNode<AnyType> current = header;

        bottom.element = x;
        while( current != bottom )
        {
            while( current.element.compareTo( x ) < 0 )
                current = current.right;

            // If gap size is 3 or at bottom level and
            // must insert, then promote middle element
            if( current.down.right.right.element.compareTo( current.element ) < 0 )
            {
                current.right = new SkipNode<AnyType>( current.element, current.right,
                                              current.down.right.right );
                current.element = current.down.right.element;
            }
            else
                current = current.down;
        }

        // Raise height of DSL if necessary
        if( header.right != tail )
            header = new SkipNode<AnyType>( infinity, tail, header );
    }
