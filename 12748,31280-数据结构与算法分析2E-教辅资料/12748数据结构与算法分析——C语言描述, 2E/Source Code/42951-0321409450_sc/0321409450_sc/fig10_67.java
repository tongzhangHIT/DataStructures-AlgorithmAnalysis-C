    public MoveInfo findHumanMove( )
    {
        int i, responseValue;
        int value, bestMove = 1;
        MoveInfo quickWinInfo;

        if( fullBoard( ) )
            value = DRAW;
        else
        if( ( quickWinInfo = immediateHumanWin( ) ) != null )
            return quickWinInfo;
        else
        {
            value = COMP_WIN;
            for( i = 1; i <= 9; i++ )  // Try each square
            {
                if( isEmpty( i ) )
                {
                    place( i, HUMAN );
                    responseValue = findCompMove( ).value;
                    unplace( i );  // Restore board

                    if( responseValue < value )
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
