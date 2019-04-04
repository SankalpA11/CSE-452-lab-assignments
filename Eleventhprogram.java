import javax.swing.JOptionPane;
public class Eleventhprogram
{
    public static void main(String args[])
    {
        int i;
        String a;
       a= JOptionPane.showInputDialog("Enter a number= ");
        i=Integer.parseInt(a);
        if(i%2==0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}
