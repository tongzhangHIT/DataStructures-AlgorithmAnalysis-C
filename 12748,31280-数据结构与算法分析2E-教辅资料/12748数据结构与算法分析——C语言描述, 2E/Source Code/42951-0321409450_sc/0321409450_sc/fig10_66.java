public class MoveInfo
{
    public int move;
    public int value;

    public MoveInfo( int m, int v )
      { move = m; value = v; }
}

    /**
     * Recursive method to find best move for computer.
     * MoveInfo.move returns a number from 1-9 indicating square.
     * Possible evaluations satisfy COMP_LOSS < DRAW < COMP_WIN.
     * Complementary method findHumanMove is Figure 10.67.
     */
    public MoveInfo findCompMove( )
    {
        int i, responseValue;
        int value, bestMove = 1;
        MoveInfo quickWinInfo;

        if( fullBoard( ) )
            value = DRAW;
        else if( ( quickWinInfo = immediateCompWin( ) ) != null )
            return quickWinInfo;
        else
        {
            value = COMP_LOSS;
            for( i = 1; i <= 9; i++ )  // Try each square
                if( isEmpty( i ) )
                {
                    place( i, COMP );
                    responseValue = findHumanMove( ).value;
                    unplace( i );  // Restore board

                    if( responseValue > value )
                    {
                          // Update best move
                        value = responseValue;
                        bestMove = i;
                    }
                }
        }

        return new MoveInfo( bestMove, value );
    }
