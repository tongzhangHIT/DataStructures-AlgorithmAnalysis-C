    /**
     * Print container from itr.
     */
    public static <AnyType> void printList( Iterator<AnyType> itr )
    {
        if( !itr.hasNext( ) )
            return;

        System.out.println( itr.next( ) );
        printList( itr );
    }
