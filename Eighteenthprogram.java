public class Eighteenthprogram
{
  public static void main(String args[])
  {
      int i,j;
      outer:for(i=0;i<5;i++)
      {System.out.print("\n ");
          
          for( j=0;j<5;j++)
          {
              if(j>i)
                  continue outer;
              System.out.print(" "+i*j);
          }
          }
      }
  }
   


