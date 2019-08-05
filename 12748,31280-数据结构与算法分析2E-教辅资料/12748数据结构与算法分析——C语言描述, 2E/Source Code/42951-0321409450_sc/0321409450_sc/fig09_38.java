    // Runs the shortest path calculation from the adjacency map, returns a List
    // that contains the sequence of word changes to get from first to second.
    // Returns null if no sequence can be found for any reason.
    public static List<String>
    findChain( Map<String,List<String>> adjacentWords, String first, String second )
    {
        Map<String,String> previousWord = new HashMap<String,String>( );
        LinkedList<String> q = new LinkedList<String>( );

        q.addLast( first );
        while( !q.isEmpty( ) )
        {
            String current = q.removeFirst( );
            List<String> adj = adjacentWords.get( current );

            if( adj != null )
                for( String adjWord : adj )
                    if( previousWord.get( adjWord ) == null )
                    {
                        previousWord.put( adjWord, current );
                        q.addLast( adjWord );
                    } 
        }
 
        previousWord.put( first, null );

        return getChainFromPreviousMap( previousWord, first, second );
    }

    // After the shortest path calculation has run, computes the List that
    // contains the sequence of word changes to get from first to second.
    // Returns null if there is no path.
    public static List<String> getChainFromPreviousMap( Map<String,String> prev,
                                                  String first, String second )
    {
        LinkedList<String> result = null;

        if( prev.get( second ) != null )
        {
            result = new LinkedList<String>( );
            for( String str = second; str != null; str = prev.get( str ) )
                result.addFirst( str );
        }

        return result;
    }
