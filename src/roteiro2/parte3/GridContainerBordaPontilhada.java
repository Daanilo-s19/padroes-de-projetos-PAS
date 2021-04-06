/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roteiro2.parte3;

import java.util.ArrayList;

public class GridContainerBordaPontilhada extends GridContainer {

    public GridContainerBordaPontilhada(int lineMax, int ColumnMax) {
        super(lineMax, ColumnMax);
    }

    @Override
    public void doLayout() {
        System.out.println("O Container utilizado é o GridContainer");
        System.out.println("Este container contêm bordas pontilhadas");
        System.out.println("Estes são os elementos presentes no container");
        System.out.println(super.elements);
        System.out.println("Usando o método dispose como herança para fechar o container");
        this.dispose();
        System.out.println("--------------------------------");
    }
}
