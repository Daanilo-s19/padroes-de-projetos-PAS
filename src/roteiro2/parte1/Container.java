/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roteiro2.parte1;

public abstract class Container {

    public abstract void addComponent(Component component);

    public abstract void removeComponent(Component component);

    public abstract void doLayout();

    public void dispose() {
        System.out.println("Fechando o Container ");
    }
}
