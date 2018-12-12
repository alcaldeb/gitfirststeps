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
public abstract class SwimmingPoolCalculator {
    int tiefe;

    public SwimmingPoolCalculator(int tiefe) {
        this.tiefe = tiefe;
    }
    
    final int computeVolume(){
        return computeArea()*tiefe;
    }
    
    protected abstract int computeArea();
}
