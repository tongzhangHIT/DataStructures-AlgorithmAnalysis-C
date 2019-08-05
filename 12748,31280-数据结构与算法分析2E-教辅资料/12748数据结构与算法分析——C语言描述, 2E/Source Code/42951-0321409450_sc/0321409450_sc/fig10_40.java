    /**
     * Compute Fibonacci numbers as described in Chapter 1.
     */
    public static int fib( int n )
    {
        if( n <= 1 )
            return 1;
        else
            return fib( n - 1 ) + fib( n - 2 );
    }
