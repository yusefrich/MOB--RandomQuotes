package com.nativestudies.familia.randomquotes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view)
    {
        String[] frases =
                {
                        "É um fato conhecido de todos que um leitor se distrairá com o conteúdo de texto legível de uma página quando estiver examinando sua diagramação.",
                        "Ao contrário do que se acredita, Lorem Ipsum não é simplesmente um texto randômico.",
                        "Vestibulum eu rutrum odio, eu placerat nunc. Curabitur lacinia vehicula dignissim. Phasellus hendrerit orci in risus interdum feugiat non eget elit.",
                        "Vestibulum tincidunt nisi et sem tempor, eget volutpat quam pellentesque. Fusce sit amet viverra augue. Curabitur auctor mattis lorem, vitae iaculis diam fermentum at."
                };
        TextView frasesTextView = findViewById(R.id.frases);

        frasesTextView.setText(frases[new Random().nextInt(frases.length)]);
    }
}
