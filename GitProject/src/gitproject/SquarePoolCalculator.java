/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitproject;

/**
 *
 * @author alcaldeb
 */
public class SquarePoolCalculator extends SwimmingPoolCalculator{
    int breite;
    
    public SquarePoolCalculator(int tiefe, int breite) {
        super(tiefe);
        this.breite = breite;
    }

    @Override
    protected int computeArea() {
        return this.breite * this.breite;
    }
    
}
