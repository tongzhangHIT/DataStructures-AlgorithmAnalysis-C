    /**
     * Print container from itr.
     */
    public static <AnyType> void printList( Iterator<AnyType> itr )
    {
        while( true )
        {
            if( !itr.hasNext( ) )
                return;

            System.out.println( itr.next( ) );
        }
    }
