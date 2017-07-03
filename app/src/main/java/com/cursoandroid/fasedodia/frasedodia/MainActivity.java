package com.cursoandroid.fasedodia.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textoNovaFrase;
    private Button botaoNovaFrase;

    private String[] quotes =
            {
                "Que o vento leve o necessário e me traga o suficiente.",
                "Nunca saberemos o quão forte somos até que ser forte seja a única escolha.",
                "Se a caminhada está difícil, é porque você está no caminho certo.",
                "Chique é ser feliz. Elegante é ser honesto. Bonito é ser caridoso. Sábio é saber ser grato. O resto é inversão de valores.",
                "Ame seus pais, sua vida e seus amigos. Seus pais, porque são únicos. Sua vida, porque é curta demais. Seus amigos, porque são raros.",
                "Seja você mesmo, todos os outros já existem."
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoNovaFrase = (TextView) findViewById(R.id.textoNovaFraseID);
        botaoNovaFrase = (Button) findViewById(R.id.botaoNovaFraseID);


        botaoNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random  random = new Random();
                int randoNumber = random.nextInt(quotes.length);

                textoNovaFrase.setText(quotes[randoNumber]);
            }
        });
    }
}
