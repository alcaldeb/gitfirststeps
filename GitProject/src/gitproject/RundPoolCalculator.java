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
public class RundPoolCalculator extends SwimmingPoolCalculator{

    int radius;

   
    public RundPoolCalculator(int radius, int tiefe) {
        super(tiefe);
        this.radius = radius;
    }
    
    @Override
    protected int computeArea() {
        return (int)(2*this.radius*Math.PI);
    }
    
}
