    public static void printOut( int n )  /* Print nonnegative n */
    {
        if( n >= 10 )
            printOut( n / 10 );
        printDigit( n % 10 );
    }
