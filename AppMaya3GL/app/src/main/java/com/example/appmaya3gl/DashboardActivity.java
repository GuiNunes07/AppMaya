package com.example.appmaya3gl;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.card.MaterialCardView; // Importamos o Cartão

public class DashboardActivity extends AppCompatActivity {

    // 1. Criamos a variável do tipo MaterialCardView
    private MaterialCardView cardAgendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // 2. Conectamos com o ID que demos ao cartão lá no XML
        cardAgendar = findViewById(R.id.card_agendar);

        // 3. O código de clique é exatamente igual ao de um botão!
        cardAgendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardActivity.this, AgendamentoActivity.class);
                startActivity(intent);
            }
        });
    }
}