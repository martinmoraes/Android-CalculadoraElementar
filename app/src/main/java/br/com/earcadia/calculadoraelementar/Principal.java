package br.com.earcadia.calculadoraelementar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class Principal extends AppCompatActivity  {

    EditText Et_Vlr1, Et_Vlr2;
    TextView resposta;
    ImageButton btSoma, btSubtracao, btDivisao, btMultiplicacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        Et_Vlr1 = (EditText) findViewById(R.id.edPrimeiro_valor);
        Et_Vlr2 = (EditText) findViewById(R.id.edSegundo_valor);
        resposta = (TextView) findViewById(R.id.txResposta);
    }
    
    public void onClick(View view) {
        float vlr1 = Float.valueOf(Et_Vlr1.getText().toString());
        float vlr2 = Float.valueOf(Et_Vlr2.getText().toString());
        switch (view.getId()){
            case R.id.btSoma:
                resposta.setText(String.valueOf(vlr1 + vlr2));
                break;
            case R.id.btSubtracao:
                resposta.setText(String.valueOf(vlr1 - vlr2));
                break;
            case R.id.btDivisao:
                resposta.setText(String.valueOf(vlr1 / vlr2));
                break;
            case R.id.btMultiplicacao:
                resposta.setText(String.valueOf(vlr1 * vlr2));
                break;
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
