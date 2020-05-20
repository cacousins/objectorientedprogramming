/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cacousins
 */
public class TempEmployee extends Employee {

    public TempEmployee(String name) {
        super(name);
    }

    public TempEmployee(String name, double salary) {
        super(name, salary);
    }
    
    

    @Override
    public void baseSalary() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void baseBonus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
