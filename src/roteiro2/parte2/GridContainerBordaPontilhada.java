/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roteiro2.parte2;

import java.util.ArrayList;

public class GridContainerBordaPontilhada extends Container {
    private ArrayList<Component> elements;

    public GridContainerBordaPontilhada() {
        this.elements = new ArrayList<Component>();
    }

    @Override
    public void addComponent(Component component) {
        this.elements.add(c);
    }

    @Override
    public void removeComponent(Component component) {
        this.elements.remove(c);
    }

    @Override
    public void doLayout() {
        System.out.println("O Container utilizado é o GridContainer");
        System.out.println("Este container contêm bordas pontilhadas");
        System.out.println("Estes são os elementos presentes no container");
        System.out.println(elements);
        System.out.println("Usando o método dispose como herança para fechar o container");
        this.dispose();
        System.out.println("--------------------------------");
    }
}