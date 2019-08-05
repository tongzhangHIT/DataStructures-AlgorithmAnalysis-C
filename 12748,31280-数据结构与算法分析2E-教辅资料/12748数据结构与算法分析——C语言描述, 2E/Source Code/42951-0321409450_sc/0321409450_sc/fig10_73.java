    /**
     * Same as before, but perform alpha-beta pruning.
     * The main routine should make the call with
     * alpha = COMP_LOSS and beta = COMP_WIN.
     */
    public MoveInfo findCompMove( int alpha, int beta )
    {
        int i, responseValue;
        int value, bestMove = 1;
        MoveInfo quickWinInfo;

        if( fullBoard( ) )
            value = DRAW;
        else
        if( ( quickWinInfo = immediateCompWin( ) ) != null )
            return quickWinInfo;
        else
        {
            value = alpha;
            for( i = 1; i <= 9 && value < beta; i++ )  // Try each square
            {
                if( isEmpty( i ) )
                {
                    place( i, COMP );
                    responseValue = findHumanMove( value, beta ).value;
                    unplace( i );  // Restore board

                    if( responseValue > value )
                    {
                          // Update best move
                        value = responseValue;
                        bestMove = i;
                    }
                }
            }
        }

        return new MoveInfo( bestMove, value );
    }
