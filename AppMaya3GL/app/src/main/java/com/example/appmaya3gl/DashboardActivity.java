package com.example.appmaya3gl;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // =====================================================================
        // 1. VINCULANDO OS ELEMENTOS DA TELA
        // =====================================================================
        MaterialCardView cardExercicios = findViewById(R.id.card_dicas);
        MaterialCardView cardProntuario = findViewById(R.id.card_prontuario);
        MaterialCardView cardAgendar = findViewById(R.id.card_agendar);
        android.widget.ImageView fotoPerfil = findViewById(R.id.iv_profile_pic);
        android.widget.TextView btnVoltar = findViewById(R.id.btn_voltar4);
        android.widget.ImageView btnConfiguracoes = findViewById(R.id.iv_settings);

        // Mantemos apenas UMA variável para a barra inferior
        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);

        // =====================================================================
        // 2. CLIQUES NOS CARTÕES GIGANTES DO MEIO DA TELA
        // =====================================================================
        cardExercicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentExercicioCard = new Intent(DashboardActivity.this, activityExercicios.class);
                startActivity(intentExercicioCard);
            }
        });

        cardProntuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentProntuarioCard = new Intent(DashboardActivity.this, ProntuarioActivity.class);
                startActivity(intentProntuarioCard);
            }
        });

        cardAgendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAgendarCard = new Intent(DashboardActivity.this, AgendamentoActivity.class);
                startActivity(intentAgendarCard);
            }
        });

        // =====================================================================
        // 3. CLIQUES NO TOPO (Botão de Voltar e Foto de Perfil)
        // =====================================================================
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Fecha a tela
            }
        });

        fotoPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPerfil = new Intent(DashboardActivity.this, PerfilActivity.class);
                startActivity(intentPerfil);
            }
        });

        // =====================================================================
        // 4. MENU INFERIOR (Toda a lógica unificada aqui!)
        // =====================================================================
        bottomNav.setOnItemSelectedListener(item -> {

            int idClicado = item.getItemId();

            // Clicou em Exercícios
            if (idClicado == R.id.nav_exercicios) {
                Intent intentNavExercicios = new Intent(DashboardActivity.this, activityExercicios.class);
                startActivity(intentNavExercicios);
                return true;
            }

            // Clicou em Prontuário
            else if (idClicado == R.id.nav_historico) {
                Intent intentNavProntuario = new Intent(DashboardActivity.this, ProntuarioActivity.class);
                startActivity(intentNavProntuario);
                return true;
            }

            // Clicou em Perfil
            else if (idClicado == R.id.nav_perfil) {
                Intent intentPerfil = new Intent(DashboardActivity.this, PerfilActivity.class);
                startActivity(intentPerfil);
                return true;
            }

            // DICA: Se você tiver o botão "Início/Dashboard", você pode adicionar aqui:
            // else if (idClicado == R.id.nav_inicio) { return true; }

            return false;
        });

        btnConfiguracoes.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                Intent intent = new Intent(DashboardActivity.this, activityConfiguracoes.class);
                startActivity(intent);
            }
        });
    }
}