      public int size( )
      {
          int totalSize = sizeOfThisFile( );

          if( isDirectory( ) )
              for each file c in this directory (for each child)
                  totalSize += c.size( );

          return totalSize;
      }
