import javax.swing.*;
public class AplikasiSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame f = new JFrame("title");
                JPanel p = new JPanel();
		JButton b = new JButton("press me");
				
		p.add(b);
		f.setContentPane(p);
				
		f.show();
    }

}
