package com.example.appmaya3gl;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;

public class activityEvolucao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evolucao);

        // 1. Vincula os botões
        TextView btnVoltar = findViewById(R.id.btn_voltar_evolucao);
        MaterialButton btnCompartilhar = findViewById(R.id.btn_compartilhar_evolucao);

        // 2. Ação de Voltar
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Volta para a tela de Perfil
            }
        });

        // 3. Ação de Compartilhar
        btnCompartilhar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Montamos a mensagem que será enviada
                String mensagem = "Confira minha evolução na Clínica Maya RPG!\n" +
                        "📉 Nível de Dor: de 8.5 para 2.0\n" +
                        "📈 Alívio Lombar: 95%\n" +
                        "Estou muito feliz com os resultados!";

                // Criamos uma intenção (Intent) especial de ENVIO DE TEXTO (ACTION_SEND)
                Intent intentCompartilhar = new Intent(Intent.ACTION_SEND);
                intentCompartilhar.setType("text/plain"); // Dizemos que é um texto simples
                intentCompartilhar.putExtra(Intent.EXTRA_TEXT, mensagem); // Colocamos a mensagem dentro

                // Abre a gavetinha do Android perguntando onde a pessoa quer mandar
                startActivity(Intent.createChooser(intentCompartilhar, "Compartilhar evolução via:"));
            }
        });
    }
}