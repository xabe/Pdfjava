package com.xabe.pdf;

import javax.swing.SwingUtilities;

/**
 * Clase que inicializa el aplicació de escritorio
 * @author Chabir Atrahouch
 *
 */
public class Main {


	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {			
			public void run() {
				new LectorPdf();
			}
		});

	}

}
