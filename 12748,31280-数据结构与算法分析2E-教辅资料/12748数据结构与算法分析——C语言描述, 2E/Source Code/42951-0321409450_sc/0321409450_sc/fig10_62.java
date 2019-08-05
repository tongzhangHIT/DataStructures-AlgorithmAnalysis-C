public class Random
{
    private static final int A = 48271;
    private static final int M = 2147483647;
    private static final int Q = M / A;
    private static final int R = M % A;

    /**
     * Return a pseudorandom int, and change the internal state.
     * @return the pseudorandom int.
     */
    public int randomInt( )
    {
        int tmpState = A * ( state % Q ) - R * ( state / Q );

        if( tmpState >= 0 )
            state = tmpState;
        else
            state = tmpState + M;

        return state;
    }

    // Remainder of this class is the same as Figure 10.54
