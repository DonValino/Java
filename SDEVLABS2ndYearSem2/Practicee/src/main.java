/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jake
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int depids[] = { 1, 2, 3, 4 };
		String depnames[] = { "Computing", "Business", "Languages",
				"Engineering" };
		University newUniv = new University("TCD", "Mr Bloggs", "Dublin",
				depids, depnames);
        UniversityGUI u = new UniversityGUI(newUniv);
        u.setVisible(true);
        u.setFirst();
        u.setText1();
    }
    
}
