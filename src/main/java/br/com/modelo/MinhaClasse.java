package br.com.modelo;

public class MinhaClasse{
    private int meuAtributoDeObjeto;
    private static int meuAtributoDeClasse = 1;

    public int getMeuAtributoDeObjeto() {
        return this.meuAtributoDeObjeto;
    }

    public void setMeuAtributoDeObjeto(int meuAtributoDeObjeto) {
        this.meuAtributoDeObjeto = meuAtributoDeObjeto;
    }

    // sem static somente para chamar pelo objeto e vermos o valor do atributo de classe, mas o ideal é que seja static
    public int getMeuAtributoDeClasse() {
        // como pertece a classe, é chamado pelo nome da classe -> MinhaClasse.
        // não podemos fazer this.meuAtributoDeClasse, pois o this é usado SOMENTE  para objetos e seus atributos
        return MinhaClasse.meuAtributoDeClasse;
    }

    // sem static somente para chamar pelo objeto e vermos o valor do atributo de classe, mas o ideal é que seja static
    // para chamarmos pela classe, porque dependendo do cenário um objeto espertinho alterando o valor de um atributo compartilhado em todos os objetos, não é o legal
    public void setMeuAtributoDeClasse(int meuAtributoDeClasse) {
        // como pertece a classe, é chamado pelo nome da classe -> MinhaClasse.
        // não podemos fazer this.meuAtributoDeClasse, pois o this é usado SOMENTE para objetos e seus atributos
        MinhaClasse.meuAtributoDeClasse = meuAtributoDeClasse;
    }

    public void meuMetodoDeObjeto(){
        System.out.println("chamando meu metodo de objeto");
    }

    public static void meuMetodoEstaticoDeClasse(){
        System.out.println("chamando meu metodo de classe");
    }
}
