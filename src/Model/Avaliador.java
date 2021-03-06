
package Model;

import java.util.ArrayList;

public class Avaliador extends Usuario {
    
    private String area;
    private String formacao;
    private ArrayList<Projeto> avalia;
    private ArrayList<Projeto> avaliou;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public ArrayList<Projeto> getAvalia() {
        return avalia;
    }

    public void setAvalia(ArrayList<Projeto> avalia) {
        this.avalia = avalia;
    }

    public ArrayList<Projeto> getAvaliou() {
        return avaliou;
    }

    public void setAvaliou(ArrayList<Projeto> avaliou) {
        this.avaliou = avaliou;
    }
    
    
}
