    /**
     * Perform a find.
     * Error checks omitted again for simplicity.
     * @param x the element being searched for.
     * @return the set containing x.
     */
    public int find( int x )
    {
        if( s[ x ] < 0 )
            return x;
        else
            return find( s[ x ] );
    }
