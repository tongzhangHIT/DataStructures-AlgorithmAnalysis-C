    public static double totalArea( Shape [ ] arr )
    {
        double total = 0;
        
        for( Shape s : arr )
            if( s != null )
                total += s.area( );
        
        return total;
    }
