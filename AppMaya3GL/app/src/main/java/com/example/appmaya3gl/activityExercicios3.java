package com.example.appmaya3gl;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;

public class activityExercicios3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicios3);

        TextView btnVoltar = findViewById(R.id.btn_voltar_ex3);
        MaterialButton btnConcluir = findViewById(R.id.btn_concluir_exercicio3);

        // Volta para a Tela 2
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        // Finaliza o treino e volta para o Dashboard
        btnConcluir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Exibe uma mensagem de sucesso na tela
                Toast.makeText(activityExercicios3.this, "Parabéns! Treino finalizado.", Toast.LENGTH_LONG).show();

                // Cria a intenção de ir para o Dashboard
                Intent intent = new Intent(activityExercicios3.this, DashboardActivity.class);

                // Esse código mágico avisa o Android para "limpar" as telas de exercícios da memória,
                // para que a pessoa não clique em voltar no Dashboard e caia no treino de novo!
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);

                startActivity(intent);
            }
        });
    }
}