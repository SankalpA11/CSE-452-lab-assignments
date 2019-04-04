import javax.swing.JOptionPane;
public class Ninethprogram
{
    public static void main(String args[])
    {
        int a=7;
        int b=a>>2;
        int c=a<<2;
        JOptionPane.showMessageDialog(null," value of a is"+a);
        JOptionPane.showMessageDialog(null,"right shift of a is "+b);
        JOptionPane.showMessageDialog(null," left shift of a is "+c );
    }
}
