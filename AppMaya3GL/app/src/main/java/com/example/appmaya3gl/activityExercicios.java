package com.example.appmaya3gl;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast; // Importamos a ferramenta de mensagens
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton; // Importamos o botão

public class activityExercicios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicios);

        // 1. Encontramos o botão lá do seu XML pelo ID dele
        MaterialButton btnConcluir = findViewById(R.id.btn_concluir_exercicio);

        // 2. Criamos o "ouvinte" de cliques para ele
        btnConcluir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 3. Criamos e mostramos a mensagem de sucesso!
                Toast.makeText(activityExercicios.this,
                        "Parabéns! Exercício concluído com sucesso.",
                        Toast.LENGTH_LONG).show();

                // 4. Fechamos a tela de exercícios para o paciente voltar ao Dashboard
                finish();
            }
        });
    }
}