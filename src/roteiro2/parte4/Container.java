/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roteiro2.parte4;

public abstract class Container {

    protected Borda borda;

    public Container() {

    }

    public Container(Borda borda) {
        this.borda = borda;
    }

    public abstract void addComponent(Component component);

    public abstract void removeComponent(Component component);

    public abstract void doLayout();

    public void dispose() {
        System.out.println("Fechando o Container ");
    }
}
