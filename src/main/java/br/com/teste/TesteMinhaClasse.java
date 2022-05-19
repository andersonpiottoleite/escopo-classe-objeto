package br.com.teste;

import br.com.modelo.MinhaClasse;

public class TesteMinhaClasse {

    public static void main(String[] args) {

        System.out.println("criando o objeto1, a partir da estrutura da classe MinhaClasse");
        MinhaClasse objeto1 = new MinhaClasse();

        System.out.println("setando o valor 100 no meuAtributoDeObjeto do objeto1");
        objeto1.setMeuAtributoDeObjeto(100);
        System.out.println("#######################################################");

        System.out.println("criando o objeto2, a partir da estrutura da classe MinhaClasse");
        MinhaClasse objeto2 = new MinhaClasse();

        System.out.println("setando o valor 200 no meuAtributoDeObjeto do objeto2");
        objeto2.setMeuAtributoDeObjeto(200);
        System.out.println("#######################################################");

        System.out.println("objeto1 - meuAtributoDeObjeto: " + objeto1.getMeuAtributoDeObjeto());
        System.out.println("objeto2 - meuAtributoDeObjeto: " + objeto2.getMeuAtributoDeObjeto());
        System.out.println("#######################################################");

        System.out.println("objeto1 - meuAtributoDeClasse: " +objeto1.getMeuAtributoDeClasse());
        System.out.println("objeto2 - meuAtributoDeClasse: " +objeto2.getMeuAtributoDeClasse());
        System.out.println("#######################################################");

        System.out.println("alterando o atributo de classe, somente usando o objeto1:");
        objeto1.setMeuAtributoDeClasse(2);

        System.out.println("imprimindo o valor atualizado do MeuAtributoDeClasse em objeto1");
        System.out.println("objeto1 - meuAtributoDeClasse: " +objeto1.getMeuAtributoDeClasse());

        System.out.println("e no objeto2, qual será o valor do meuAtributoDeClasse? 1 ou 2?");

        System.out.println("objeto2 - meuAtributoDeClasse: " +objeto2.getMeuAtributoDeClasse());

        System.out.println("#######################################################");

        System.out.println("alterando o atributo de classe, somente usando o objeto2");
        objeto2.setMeuAtributoDeClasse(3);

        System.out.println("imprimindo o valor atualizado do MeuAtributoDeClasse em objeto2");
        System.out.println("objeto2 - meuAtributoDeClasse: " +objeto2.getMeuAtributoDeClasse());

        System.out.println("e no objeto1, qual será o valor do meuAtributoDeClasse? 2 ou 3?");

        System.out.println("objeto1 - meuAtributoDeClasse: " +objeto1.getMeuAtributoDeClasse());

        MinhaClasse objeto3 = new MinhaClasse();
        System.out.println("objeto3 - meuAtributoDeClasse: " +objeto3.getMeuAtributoDeClasse());

        // objeto chamando metodo do escopo de objeto
        objeto1.meuMetodoDeObjeto();
        //MinhaClasse.meuMetodoDeObjeto(); // erro de compilação

        // classe chamando metodo do escopo de classe
        MinhaClasse.meuMetodoEstaticoDeClasse();
        objeto1.meuMetodoEstaticoDeClasse(); // aviso que o metodo é de classe, compila mesmo com o aviso
    }
}
