    public static void removeEvensVer2( List<Integer> lst )
    {
        for( Integer x : lst )
            if( x % 2 == 0 )
                lst.remove( x );
    }
