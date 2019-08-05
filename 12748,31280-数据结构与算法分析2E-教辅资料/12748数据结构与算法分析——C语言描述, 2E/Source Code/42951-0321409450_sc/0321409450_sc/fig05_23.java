  public final class String
  {
      public int hashCode( )
      {
          if( hash != 0 )
              return hash;

          for( int i = 0; i < length( ); i++ )
              hash = hash * 31 + (int) charAt( i );
          return hash;
      }

      private int hash = 0;
  }
