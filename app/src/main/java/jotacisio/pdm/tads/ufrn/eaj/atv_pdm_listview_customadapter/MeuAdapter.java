package jotacisio.pdm.tads.ufrn.eaj.atv_pdm_listview_customadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MeuAdapter extends BaseAdapter {
    private List<Fruta> frutas;
    private Context contexto;

    public MeuAdapter (Context context, List<Fruta> frutas){
        super();
        this.contexto = context;
        this.frutas = frutas;
    }

    @Override
    public int getCount() {
        return frutas != null ? frutas.size() : 0;
    }

    @Override
    public Object getItem(int i) {
        return frutas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(contexto).inflate(R.layout.textview_inflater, viewGroup, false);
        TextView t = (TextView) view.findViewById(R.id.nomeFruta);
        ImageView img = (ImageView) view.findViewById(R.id.imgFruta);
        Fruta fruta = (Fruta)frutas.get(i);
        t.setText(fruta.nome);
        img.setImageResource(fruta.img);
        return view;
    }
}
