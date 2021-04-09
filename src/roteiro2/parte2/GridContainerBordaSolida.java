/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roteiro2.parte2;

import java.util.ArrayList;

public class GridContainerBordaSolida extends Container {
    private ArrayList<Component> elements;

    public GridContainerBordaSolida() {
        this.elements = new ArrayList<Component>();
    }

    @Override
    public void addComponent(Component component) {
        this.elements.add(component);
    }

    @Override
    public void removeComponent(Component component) {
        this.elements.remove(component);
    }

    @Override
    public void doLayout() {
        System.out.println("O Container utilizado é o GridContainer");
        System.out.println("Este container contêm bordas solidas");
        System.out.println("Estes são os elementos presentes no container");
        System.out.println(elements);
        System.out.println("Usando o método dispose como herança para fechar o container");
        this.dispose();
        System.out.println("--------------------------------");
    }
}
