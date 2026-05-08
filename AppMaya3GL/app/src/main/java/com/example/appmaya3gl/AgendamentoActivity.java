package com.example.appmaya3gl;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

public class AgendamentoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_agendamento);

        com.google.android.material.button.MaterialButton btnConfirmar = findViewById(R.id.btn_confirmar_agendamento);
        android.widget.TextView btnVoltar = findViewById(R.id.btn_voltar);

        btnVoltar.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                finish();
            }
        });

        btnConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.widget.Toast.makeText(AgendamentoActivity.this,
                        "Agendamento realizado com sucesso!",
                        android.widget.Toast.LENGTH_LONG).show();

                // Voltar para o Dashboard após agendar --- AQUI SERÁ OUTRA ACTIVITY PARA CONFIRMAÇÃO DE AGENDAMENTO //
                finish();
            }
        });

    }
}