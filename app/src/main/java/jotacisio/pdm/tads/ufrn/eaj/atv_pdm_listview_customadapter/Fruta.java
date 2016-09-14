package jotacisio.pdm.tads.ufrn.eaj.atv_pdm_listview_customadapter;

import java.util.ArrayList;
import java.util.List;

public class Fruta {
    public String nome;
    public int img;
    public Fruta (String nome, int img){
        this.nome = nome;
        this.img = img;
    }

    public static List<Fruta> getFrutas(){
        List<Fruta> frutas = new ArrayList<Fruta>();
        frutas.add((new Fruta("Laranja", R.drawable.laranja)));
        frutas.add((new Fruta("Maca", R.drawable.laranja)));
        frutas.add((new Fruta("Pera", R.drawable.laranja)));
        frutas.add((new Fruta("Uva", R.drawable.laranja)));
        frutas.add((new Fruta("Goiaba", R.drawable.laranja)));
        frutas.add((new Fruta("Melao", R.drawable.laranja)));
        frutas.add((new Fruta("Limao", R.drawable.laranja)));
        return frutas;
    }

}
