package guiwebbanking;

import clasesSWB.PersistenceManager;

/**
 *
 * @author MAN-U
 */
public class GUI {
    private PersistenceManager persistenceManager = new PersistenceManager();
   
    /**
     * 
     * @param guiWebBanking 
     */
    public void run(GUI guiWebBanking){
        Login login = new Login();
        login.setVisible(true);
        System.out.print(persistenceManager);
        login.inicializarPersistenceManager(persistenceManager);
        login.inicializarGUI(guiWebBanking);
    }
    
    public static void main(String args[]){
        GUI guiWebBanking = new GUI();
        guiWebBanking.run(guiWebBanking);
    }
}
