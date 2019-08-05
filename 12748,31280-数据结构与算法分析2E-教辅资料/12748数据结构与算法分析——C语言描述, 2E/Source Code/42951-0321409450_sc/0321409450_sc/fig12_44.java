    /**
     * Print items satisfying
     * low[ 0 ] <= x[ 0 ] <= high[ 0 ] and
     * low[ 1 ] <= x[ 1 ] <= high[ 1 ].
     */
    public void printRange( AnyType [ ] low, AnyType [ ] high )
    {
        printRange( low, high, root, 0 );
    }

    private void printRange( AnyType [ ] low, AnyType [ ] high,
                             KdNode<AnyType> t, int level )
    {
        if( t != null )
        {
            if( low[ 0 ].compareTo( t.data[ 0 ] ) <= 0 &&
                        low[ 1 ].compareTo( t.data[ 1 ] ) <= 0 &&
                       high[ 0 ].compareTo( t.data[ 0 ] ) >= 0 &&
                       high[ 1 ].compareTo( t.data[ 1 ] ) >= 0 )
                System.out.println( "(" + t.data[ 0 ] + ","
                                        + t.data[ 1 ] + ")" );

            if( low[ level ].compareTo( t.data[ level ] ) <= 0 )
                printRange( low, high, t.left, 1 - level );
            if( high[ level ].compareTo( t.data[ level ] ) >= 0 )
                printRange( low, high, t.right, 1 - level );
        }
    }
