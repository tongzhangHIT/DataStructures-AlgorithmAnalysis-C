    /**
     * Compute all-shortest paths.
     * a[ ][ ] contains the adjacency matrix with
     * a[ i ][ i ] presumed to be zero.
     * d[ ] contains the values of the shortest path.
     * Vertices are numbered starting at 0; all arrays
     * have equal dimension. A negative cycle exists if
     * d[ i ][ i ] is set to a negative value.
     * Actual path can be computed using path[ ][ ].
     * NOT_A_VERTEX is -1
     */
    public static void allPairs( int [ ][ ] a, int [ ][ ] d, int [ ][ ] path ) 
    {
        int n = a.length;

        // Initialize d and path
        for( int i = 0; i < n; i++ )
            for( int j = 0; j < n; j++ )
            {
                d[ i ][ j ] = a[ i ][ j ];
                path[ i ][ j ] = NOT_A_VERTEX;
            }

        for( int k = 0; k < n; k++ )
            // Consider each vertex as an intermediate
            for( int i = 0; i < n; i++ )
                for( int j = 0; j < n; j++ )
                    if( d[ i ][ k ] + d[ k ][ j ] < d[ i ][ j ] )
                    {
                        // Update shortest path
                        d[ i ][ j ] = d[ i ][ k ] + d[ k ][ j ];
                        path[ i ][ j ] = k;
                    }
    }
