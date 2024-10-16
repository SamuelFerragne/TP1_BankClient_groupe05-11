package com.atoudeft.commun.thread;
/**
 * Cette classe permet de créer des threads capables de lire continuellement sur un un objet de type Lecteur.
 *
 * @author Abdelmoumène Toudeft (Abdelmoumene.Toudeft@etsmtl.ca)
 * @version 1.1
 * @since 2024-06-01
 */
public class ThreadEcouteurDeTexte extends Thread {
	/**
	 * Délai de sleep dans la boucle de lecture.
	 */
	public static int DELAI_SLEEP = 100;
	private Lecteur lecteur;

	/**
	 * Construit un thread sur un lecteur
	 * @param lecteur Le lecteur sur lequel le thread va lire
	 */
	public ThreadEcouteurDeTexte(Lecteur lecteur)
	 {
		 this.lecteur = lecteur;
	 }

	/**
	 * Méthode principale du thread. Cette méthode appelle continuellement la méthode lire() du
	 * lecteur (client ou serveur)
	 */
	public void run()
	 {
		while (!interrupted())
		{
			lecteur.lire();
			try
			{
			  Thread.sleep(DELAI_SLEEP);
			}
			catch (InterruptedException e)
			{
				break;
			}			
		}
	 }
}
