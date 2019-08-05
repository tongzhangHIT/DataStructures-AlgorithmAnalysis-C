    void kruskal( )
    {
        int edgesAccepted = 0;
        DisjSet ds = new DisjSets( NUM_VERTICES );
        PriorityQueue<Edge> pq = new PriorityQueue<Edge>( getEdges( ) );
        Edge e;
        Vertex u, v;

        while( edgesAccepted < NUM_VERTICES - 1 )
        {
            e = pq.deleteMin( );      // Edge e = (u. v)
            SetType uset = ds.find( u );
            SetType vset = ds.find( v );
            if( uset != vset )
            {
                // Accept the edge
                edgesAccepted++;
                ds.union( uset, vset );
            }
        }
    }
