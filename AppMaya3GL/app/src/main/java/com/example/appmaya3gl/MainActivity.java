package com.example.appmaya3gl;

// TUDO DAQUI PARA BAIXO É O CÓDIGO NOVO COLADO
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    // 1. Criamos uma variável para representar o botão
    private MaterialButton btnHistorico;
    private MaterialButton btnAgendar; // O botão de agendar que adicionamos depois

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Isso carrega o visual da tela principal

        // 2. Conectamos a variável Java com o botão real lá do XML através do ID
        btnHistorico = findViewById(R.id.historico_button);
        btnAgendar = findViewById(R.id.agendar_button);

        // 3. Clique do Histórico (Vai para o Dashboard)
        btnHistorico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DashboardActivity.class);
                startActivity(intent);
            }
        });

        // 4. Clique do Agendar (Vai para o Agendamento)
        btnAgendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AgendamentoActivity.class);
                startActivity(intent);
            }
        });
    }
}

