package com.example.appmaya3gl;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.bottomnavigation.BottomNavigationView; // Adicionei essa importação

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // =========================================================================
        // 1. INICIALIZAÇÃO DOS COMPONENTES VISUAIS (Find Views)
        // Conectamos as variáveis do Java com os IDs que desenhamos no XML.
        // =========================================================================

        // Cartões grandes do meio da tela
        MaterialCardView cardExercicios = findViewById(R.id.card_dicas);
        MaterialCardView cardProntuario = findViewById(R.id.card_prontuario);
        MaterialCardView cardAgendar = findViewById(R.id.card_agendar);

        // A Barra de Navegação Inferior (NAV)
        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);

        // =========================================================================
        // 2. PROGRAMAÇÃO DOS CLIQUES: CARTÕES CENTRAIS (Cards)
        // Definimos o que acontece quando o usuário toca nos cartões grandes.
        // =========================================================================

        // Clique no cartão grande "Meus Exercícios"
        cardExercicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Abre a tela de carrossel de exercícios
                Intent intentExercicioCard = new Intent(DashboardActivity.this, activityExercicios.class);
                startActivity(intentExercicioCard);
            }
        });

        // Clique no cartão grande "Meu Prontuário"
        cardProntuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Abre a tela de prontuário
                Intent intentProntuarioCard = new Intent(DashboardActivity.this, ProntuarioActivity.class);
                startActivity(intentProntuarioCard);
            }
        });

        // Clique no cartão grande "Agendar Sessão"
        cardAgendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Abre a tela de Calendário
                Intent intentAgendarCard = new Intent(DashboardActivity.this, AgendamentoActivity.class);
                startActivity(intentAgendarCard);
            }
        });

        // =========================================================================
        // 3. PROGRAMAÇÃO DOS CLIQUES: MENU INFERIOR (NAV)
        // IMPORTANTE: Este bloco está solto diretamente no onCreate, o que faz com
        // que ele funcione assim que o aplicativo abrir, independentemente de
        // qual cartão o usuário clicou antes.
        // =========================================================================

        bottomNav.setOnItemSelectedListener(item -> {

            // Verifica se o ícone clicado foi o de "Exercícios" (o pesinho)
            if (item.getItemId() == R.id.nav_exercicios) {
                // Abre a tela de exercícios pelo NAV
                Intent intentNavExercicios = new Intent(DashboardActivity.this, activityExercicios.class);
                startActivity(intentNavExercicios);
                return true; // Retorna true para avisar o Android que o clique foi processado
            }

            // ✅ ADICIONEI ESTE BLOCO AQUI PARA O PRONTUÁRIO FUNCIONAR ✅
            // Verifica se o ícone clicado foi o de "Prontuário" (o reloginho)
            if (item.getItemId() == R.id.nav_historico) { // Verifique se o ID está certinho!
                // Abre a tela de prontuário pelo NAV
                Intent intentNavProntuario = new Intent(DashboardActivity.this, ProntuarioActivity.class);
                startActivity(intentNavProntuario);
                return true; // Retorna true para avisar o Android que o clique foi processado
            }

            // (No futuro, você pode colocar outros "if" aqui para programar o ícone de Início ou Configurações)

            return false; // Retorna false caso o ícone clicado não tenha uma ação programada
        });
    }
}