/**
 * Package de Gillot-Roux.
 */
package com.gillotroux;
/**
 * Classe vendeur.
 * @author Lockolocko
 *
 */
public class Vendeur extends AllEmploye {
/**
 * Salaire de base.
 */
    private final int base = 2000;
/**
 * Commission.
 */
    private int commission;
/**
 * Constructeur.
 * @param commission2
 */
    public Vendeur(final int commission2) {
        this.commission = commission2;
    }
/**
 * Retourne le salaire.
 * @return salaire
 */
    public double salaire() {
        return base + commission;
    }
}
