package com.example.appmaya3gl;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ProntuarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 1. Carrega o visual correto
        setContentView(R.layout.activity_prontuario);

        // 2. Vincula o botão de voltar
        TextView btnVoltar = findViewById(R.id.btn_voltar3);

        // 3. Adicionamos uma "proteção" aqui. Só tenta clicar se o botão realmente existir
        if (btnVoltar != null) {
            btnVoltar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish(); // Fecha a tela e volta
                }
            });
        }
    }
}