/**
 * Package de Gillot-Roux.
 */
package com.gillotroux;
/**
 * Un employ�.
 * @author Lockolocko
 *
 */
public class Employe extends AllEmploye {
/**
 * Salaire de base.
 */
    private final int salaire = 1500;
/**
 * Ann�e de d�part.
 */
    private int startYear;
/**
 * Constante.
 */
    private final int vingt = 20;
/**
 * Constante.
 */
    private final int anneeCourante = 2020;
/**
 * Constructeur.
 * @param startYear2
 */
    public Employe(final int startYear2) {
        this.startYear = startYear2;
    }
/**
 * Salaire totale de l'employ�.
 * @return salaire
 */
    public double salaire() {
        return salaire + (anneeCourante - startYear) * vingt;
    }
}
