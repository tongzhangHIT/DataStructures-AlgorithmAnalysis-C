class FindMaxDemo
{
    /**
     * Return max item in arr.
     * Precondition: arr.length > 0
     */
    public static Comparable findMax( Comparable [ ] arr )
    {
        int maxIndex = 0;

        for( int i = 1; i < arr.length; i++ )
            if( arr[ i ].compareTo( arr[ maxIndex ] ) > 0 )
                maxIndex = i;

        return arr[ maxIndex ];
    }

    /**
     * Test findMax on Shape and String objects.
     */
    public static void main( String [ ] args )
    {
        Shape [ ] sh1 = { new Circle( 2.0 ),
                          new Square( 3.0 ),
                          new Rectangle( 3.0, 4.0 ) };

        String [ ] st1 = { "Joe", "Bob", "Bill", "Zeke" };

        System.out.println( findMax( sh1 ) );
        System.out.println( findMax( st1 ) );
    }
}
