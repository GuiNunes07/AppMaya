package com.example.appmaya3gl;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.card.MaterialCardView;

public class activityAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        ImageView btnLogout = findViewById(R.id.iv_logout_admin);
        MaterialCardView btnProntuarios = findViewById(R.id.card_admin_prontuarios);
        MaterialCardView btnExercicios = findViewById(R.id.card_admin_exercicios);

        // Sair do admin //
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activityAdmin.this, activityLogin.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });

        // Botões //
        btnProntuarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activityAdmin.this, "Abrindo lista de pacientes...", Toast.LENGTH_SHORT).show();
            }
        });

        btnExercicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activityAdmin.this, "Tela de cadastro de exercícios em breve", Toast.LENGTH_SHORT).show();
            }
        });
    }
}