    // Computes a map in which the keys are words and values are Lists of words
    // that differ in only one character from the corresponding key.
    // Uses a quadratic algorithm (with appropriate Map).
    public static Map<String,List<String>>
    computeAdjacentWords( List<String> theWords )
    {
        Map<String,List<String>> adjWords = new TreeMap<String,List<String>>( );
        
        String [ ] words = new String[ theWords.size( ) ];
        
        theWords.toArray( words );    
        for( int i = 0; i < words.length; i++ )
            for( int j = i + 1; j < words.length; j++ )
                if( oneCharOff( words[ i ], words[ j ] ) )
                {
                    update( adjWords, words[ i ], words[ j ] );
                    update( adjWords, words[ j ], words[ i ] );
                }
        
        return adjWords;
    }

    private static <KeyType> void update( Map<KeyType,List<String>> m,
                                          KeyType key, String value )
    {
        List<String> lst = m.get( key );
        if( lst == null )
        {
            lst = new ArrayList<String>( );
            m.put( key, lst );
        }
        
        lst.add( value );
    }
