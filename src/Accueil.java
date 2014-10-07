import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class Accueil extends JFrame implements ActionListener{
	
	private JPanel panel ;
	private JButton btnajouter;
	private JButton btnsupprimer;
	private JButton btnvoir;
	private JButton btndispo;
	private JButton btnrechercher;
	
    // Constructeur 
    public Accueil(){
    	
		//Petite instruction faite pour un commit en mode graphique
    	
    	  // Création de la barre de menu
          JMenuBar menu= new JMenuBar();

		  // Création d'un "bouton" dans la barre de menu
		        JMenu menuFichier = new JMenu("Fichier");
		  // Création d'un élément du menu « Fichier »
		        JMenuItem sauvCompte = new JMenuItem("Sauvegarder");
		  // Ajout d'un élément (nommé sauvCompte) au menu nommé menuFichier
		        menuFichier.add(sauvCompte);
		  // Création d'un deuxième élément du menu « Fichier »
		        JMenuItem ouvrirCompte = new JMenuItem("Ouvrir");
		  // Ajout d'un élément (nommé ouvrirCompte) au menu nommé menuFichier
		        menuFichier.add(ouvrirCompte);
		  // Ajout du "bouton" menuPdt à la barre de menu
		        menu.add(menuFichier);
		
		        JMenu menuEdit = new JMenu("Edition");
		        JMenuItem quitter = new JMenuItem("Quitter");
		        menuEdit.add(quitter);
		  // Ajout d'un listener appelant la classe menuAction lorsque l'on clique sur Quitter
		  //      quitter.addActionListener(new menuAction());
		        JMenuItem aPropos=  new JMenuItem("A propos");
		        menuEdit.add(aPropos);
		
		  // Ajout du "bouton" menuEdit à la barre de menu
		        menu.add(menuEdit);
		
		  // Permet de définir le menu utilisé dans la JFrame
		        this.setJMenuBar(menu);

    	
    	
    	this.setSize(400, 300);

        // Définition du titre
        this.setTitle("Gestion des comptes bancaires");
        
        //positionnement de la fenetre
        this.setLocationRelativeTo(null);
        
        //fermeture de la fenetre avec la croix
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        // On instancie l'objet JPanel
        panel = new JPanel ( ) ;
        // Définition de la couleur de fond du JPanel
        panel.setBackground(Color.white);
        
        // Définition du GridLayout et du nombre de lignes (3) et de colonnes (2)
        panel.setLayout(new GridLayout(5, 1));
        btnajouter = new JButton("Ajouter un compte");
        btnsupprimer = new JButton("Supprimer un compte");
        btnvoir = new JButton("Voir tous les comptes");
        btndispo = new JButton("Disponibilités de la banque");
        btnrechercher = new JButton("Rechercher un compte");
        
       
        panel.add(btnajouter);
        panel.add(btnsupprimer);
        panel.add(btnvoir);
        panel.add(btndispo);
        panel.add(btnrechercher);
        
        btnajouter.addActionListener(this);
        btnsupprimer.addActionListener(this);
        btnvoir.addActionListener(this);
        btndispo.addActionListener(this);
        btnrechercher.addActionListener(this);
        
        // On ajoute le JPanel au conteneur principal :
        this.getContentPane().add(panel);
        
        
        this.setVisible(true); // Par défaut la fenêtre est invisible.
    }

    public void actionPerformed ( ActionEvent e ) {
    //	if()
    }
    
}
