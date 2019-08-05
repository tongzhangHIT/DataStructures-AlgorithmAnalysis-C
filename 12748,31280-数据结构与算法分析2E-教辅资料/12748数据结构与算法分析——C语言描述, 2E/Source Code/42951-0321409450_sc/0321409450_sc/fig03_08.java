    public static <AnyType> void print( Collection<AnyType> coll )
    {
        Iterator<AnyType> itr = coll.iterator( );
        while( itr.hasNext( ) )
        {
            AnyType item = itr.next( );
            System.out.println( item );
        }
    }
