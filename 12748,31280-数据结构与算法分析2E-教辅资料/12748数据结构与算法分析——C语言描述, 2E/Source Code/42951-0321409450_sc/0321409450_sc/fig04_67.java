    // Computes a map in which the keys are words and values are Lists of words
    // that differ in only one character from the corresponding key.
    // Uses a quadratic algorithm (with appropriate Map), but speeds things by
    // maintaining an additional map that groups words by their length.
    public static Map<String,List<String>>
    computeAdjacentWords( List<String> theWords )
    {
        Map<String,List<String>> adjWords = new TreeMap<String,List<String>>( );
        Map<Integer,List<String>> wordsByLength =
                                           new TreeMap<Integer,List<String>>( );
        
          // Group the words by their length
        for( String w : theWords )
            update( wordsByLength, w.length( ), w );
        
          // Work on each group separately
        for( List<String> groupsWords : wordsByLength.values( ) )
        {
            String [ ] words = new String[ groupsWords.size( ) ];
        
            groupsWords.toArray( words );    
            for( int i = 0; i < words.length; i++ )
                for( int j = i + 1; j < words.length; j++ )
                    if( oneCharOff( words[ i ], words[ j ] ) )
                    {
                        update( adjWords, words[ i ], words[ j ] );
                        update( adjWords, words[ j ], words[ i ] );
                    }
        }
        
        return adjWords;
    }
