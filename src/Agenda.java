/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author julio.gabardo
 */
public class Agenda {

    private int dia;//Atributos clase Agenda//modificador de acesso :Private outras classes nao vem os atributos ou metodos
    private int mes;
    private int ano;
    private String anotacao;

    void anotar(int d, int m, String nota) {
        dia = d;//referencia atributo
        //this.dia
        mes = m;
        anotacao = nota;
        validaData();//chama metodo para validar
    }

    private void validaData() {//metodo para validação
        if ((dia < 1) || (dia > 31) || (mes > 12)) {
            dia = 0;
            mes = 0;
            anotacao = "Anotação não inserida devido a data invalida";
        }
    }

    public void mostraAnotacao() {//modificador de acesso :public outras classes conseguem ver o metodo
        System.out.println(dia + "/" + mes + " : " + anotacao);
    }

}
