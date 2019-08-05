    public static void removeEvensVer3( List<Integer> lst )
    {
        Iterator<Integer> itr = lst.iterator( );

        while( itr.hasNext( ) )
            if( itr.next( ) % 2 == 0 )
                itr.remove( );
    }
