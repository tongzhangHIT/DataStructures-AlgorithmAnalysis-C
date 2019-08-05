    // Computes a map in which the keys are words and values are Lists of words
    // that differ in only one character from the corresponding key.
    // Uses an efficient algorithm that is O(N log N) with a TreeMap.
    public static Map<String,List<String>>
    computeAdjacentWords( List<String> words )
    {
        Map<String,List<String>> adjWords = new TreeMap<String,List<String>>( );
        Map<Integer,List<String>> wordsByLength =
                                           new TreeMap<Integer,List<String>>( );
    
          // Group the words by their length
        for( String w : words )
            update( wordsByLength, w.length( ), w );

          // Work on each group separately
        for( Map.Entry<Integer,List<String>> entry : wordsByLength.entrySet( ) )
        {    
            List<String> groupsWords = entry.getValue( );
            int groupNum = entry.getKey( );
            
            // Work on each position in each group
            for( int i = 0; i < groupNum; i++ )
            {
                // Remove one character in specified position, computing
                // representative.  Words with same representative are
                // adjacent, so first populate a map ...
                Map<String,List<String>> repToWord =
                                            new TreeMap<String,List<String>>( );
                
                for( String str : groupsWords )
                {
                    String rep = str.substring( 0, i ) + str.substring( i + 1 );
                    update( repToWord, rep, str );
                }
                
                // and then look for map values with more than one string
                for( List<String> wordClique : repToWord.values( ) )
                    if( wordClique.size( ) >= 2 )
                        for( String s1 : wordClique )
                            for( String s2 : wordClique )
                                if( s1 != s2 )
                                    update( adjWords, s1, s2 );
            }
        }
        
        return adjWords;
    }
