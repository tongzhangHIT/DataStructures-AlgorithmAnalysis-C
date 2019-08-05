    public static void printHighChangeables( Map<String,List<String>> adjWords,
                                             int minWords )
    {
        for( Map.Entry<String,List<String>> entry : adjWords.entrySet( ) )
        {
            List<String> words = entry.getValue( );
            
            if( words.size( ) >= minWords )
            {
                System.out.print( entry.getKey( ) + " (" );
                System.out.print( words.size( ) + "):" );
                for( String w : words )
                    System.out.print( " " + w );
                System.out.println( );
            }
        }
    }
