    public static void removeEvensVer1( List<Integer> lst )
    {
        int i = 0;
        while( i < lst.size( ) )
            if( lst.get( i ) % 2 == 0 )
                lst.remove( i );
            else
                i++;
    }
