    // Returns true if word1 and word2 are the same length
    // and differ in only one character.
    private static boolean oneCharOff( String word1, String word2 )
    {
        if( word1.length( ) != word2.length( ) )
            return false;
        
        int diffs = 0;
        
        for( int i = 0; i < word1.length( ); i++ )
            if( word1.charAt( i ) != word2.charAt( i ) )
                if( ++diffs > 1 )
                    return false;
                    
        return diffs == 1;
    }
