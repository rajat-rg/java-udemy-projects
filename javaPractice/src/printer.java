public class printer
{
    private int pages , tonerlevel;
    private boolean duplex ;

    public printer( int tonerlevel, boolean duplex) {
        if (tonerlevel >=0 && tonerlevel<=100)
            this.tonerlevel = tonerlevel;
        else
            this.tonerlevel =-1;
        this.duplex = duplex;
    }
    public int addToner(int tonerAmount)
    {
        if (tonerlevel>0 && tonerAmount <=100) {
            if (this.tonerlevel + tonerAmount > 100)
                return -1;

            this.tonerlevel += tonerAmount;
            return this.tonerlevel;
        }
        else
            return -1 ;
    }
    public int printPage (int Page)
    {
         int pagesToPrint = Page ;
         if (this.duplex )
         {
             pagesToPrint=( Page/2)+(Page % 2);
             System.out.println("printing in duplex mode");
             System.out.println(pagesToPrint);
         }
         this.pages+=pagesToPrint;
         return pagesToPrint ;
    }

    public int getPages() {
        return pages;
    }
}
