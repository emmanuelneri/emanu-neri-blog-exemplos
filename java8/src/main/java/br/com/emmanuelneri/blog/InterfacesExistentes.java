package br.com.emmanuelneri.blog;

import br.com.emmanuelneri.blog.classes.Pessoa;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Toda interface do Java que possui apenas um método abstrado pode ser instanciada
// como um código InterfacesExistentes by Paulo Silveira - Java 8 Prático
public class InterfacesExistentes {

    // Interface
    private void intefaceRunnable() {
        //Sem Lambda
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i  <= 1000; i++) {
                    System.out.println(i);
                }
            }
        };

        new Thread(r).start();

        // com Lambda
        new Thread(() -> {
            for(int i = 0; i  <= 1000; i++) {
                System.out.println(i);
            }
        }).start();
    }

    //Toda interface funcionar pode ser representada como InterfacesExistentes
    private void listeners() {

        //sem InterfacesExistentes
        Button button = new Button();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("evento click");
            }
        });

        //com InterfacesExistentes
        button.addActionListener(
                event -> System.out.println("evento click"));

    }

    private void comparator() {
        List<Pessoa> pessoas = new ArrayList<>();

        //sem lambda
        Collections.sort(pessoas, new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa o1, Pessoa o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });

        //com lambda
        Collections.sort(pessoas,
                (Pessoa p1, Pessoa p2) -> p1.getNome().compareTo(p2.getNome()));

        // com lambda + novo metodo estatico de Comparator
        pessoas.sort(Comparator.comparing(p -> p.getNome()));

    }
}
