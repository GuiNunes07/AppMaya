package com.example.appmaya3gl;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.card.MaterialCardView;

public class DashboardActivity extends AppCompatActivity {

    // 1. Declaramos os nossos cartões
    private MaterialCardView cardAgendar;
    private MaterialCardView cardExercicios; // Era o antigo card_dicas

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // 2. Conectamos com os IDs lá do XML
        cardAgendar = findViewById(R.id.card_agendar);
        cardExercicios = findViewById(R.id.card_dicas); // Mantivemos o ID original para não dar erro

        // 3. Clique do Agendar (Vai para o Calendário)
        cardAgendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, AgendamentoActivity.class);
                startActivity(intent);
            }
        });

        // 4. Clique dos Exercícios (Vai para o Carrossel de Imagens!)
        cardExercicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, activityExercicios.class);
                startActivity(intent);

                com.google.android.material.bottomnavigation.BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);

                // 2. Dizemos ao menu o que fazer quando um ícone for tocado
                bottomNav.setOnItemSelectedListener(item -> {

                    // ATENÇÃO: Você precisa colocar o ID exato do seu item de menu aqui!
                    if (item.getItemId() == R.id.nav_exercicios) {

                        Intent intent1 = new Intent(DashboardActivity.this, activityExercicios.class);
                        startActivity(intent);
                        return true;
                    }
                    // (No futuro, você pode colocar outros "if" aqui para programar o ícone de Início e Prontuário)
                    return false;
                });
            }
        });

        // PRONTUÁRIO //
        com.google.android.material.card.MaterialCardView cardProntuario = findViewById(R.id.card_prontuario);

        cardProntuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, ProntuarioActivity.class);
                startActivity(intent);
            }
        });

    }
}