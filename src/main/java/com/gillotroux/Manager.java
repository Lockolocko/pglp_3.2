/**
 * Package de Gillot-Roux.
 */
package com.gillotroux;
/**
 * Classe Manager.
 * @author Lockolocko
 *
 */
public class Manager extends AllEmploye {
/**
 * Salaire de base.
 */
    private final int salaire = 1500;
/**
 * Année arrivé.
 */
    private int startYear;
/**
 * Nombre d'employe sous tutelle.
 */
    private int nombreSousOrdre;
/**
 * Constante.
 */
    private final int vingt = 20;
/**
* Constante.
*/
    private final int cent = 20;
/**
 * Constante.
 */
    private final int anneeCourante = 2020;
/**
 * Constructeur.
 * @param startYear2
 * @param nombreSousOrdre2
 */
    public Manager(final int startYear2, final int nombreSousOrdre2) {
        this.startYear = startYear2;
        this.nombreSousOrdre = nombreSousOrdre2;
    }
/**
 * Retourne le salaire.
 * @return salaire
 */
    public double salaire() {
         return salaire + (anneeCourante - this.startYear)
* vingt + nombreSousOrdre * cent;
    }
}
