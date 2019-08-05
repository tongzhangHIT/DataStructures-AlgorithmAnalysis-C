    /**
     * Find an item in the DSL.
     * @param x the item to search for.
     * @return the true if not found.
     */
    public boolean contains( AnyType x )
    {
        SkipNode<AnyType> current = header;

        bottom.element = x;
        for( ; ; )
        {
            int compareResult = x.compareTo( current.element );

            if( compareResult < 0 )
                current = current.down;
            else if( compareResult > 0 )
                current = current.right;
            else
                return current != bottom;
        }
    }
