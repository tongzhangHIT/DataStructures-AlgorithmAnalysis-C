      private void listAll( int depth )
      {
          printName( depth ); // Print the name of the object
          if( isDirectory( ) )
              for each file c in this directory (for each child)
                  c.listAll( depth + 1 );
      }

      public void listAll( )
      {
          listAll( 0 );
      }
