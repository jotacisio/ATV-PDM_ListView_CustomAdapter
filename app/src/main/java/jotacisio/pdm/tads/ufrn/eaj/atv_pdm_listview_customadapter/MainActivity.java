package jotacisio.pdm.tads.ufrn.eaj.atv_pdm_listview_customadapter;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener {
    private ListView lista;
    private List<Fruta> frutas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista = (ListView) findViewById(R.id.listafrutas);
        frutas = Fruta.getFrutas();
        lista.setAdapter(new MeuAdapter(this, frutas));
        lista.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Fruta f = this.frutas.get(i);
        Toast.makeText(this, "Fruta selecionada: "+ f.nome + ", posicao: " +
                i, Toast.LENGTH_SHORT).show();

    }
}
