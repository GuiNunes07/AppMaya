package com.example.appmaya3gl;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;

public class activityLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        MaterialButton btnConfirmar = findViewById(R.id.btn_confirmar_login);
        TextView tvIrParaCadastro = findViewById(R.id.tv_ir_para_cadastro);
        TextView tvEsqueceuSenha = findViewById(R.id.tv_esqueceu_senha);

        // Ao clicar em CONFIRMAR, vai para a tela principal (Landing/MainActivity)
        btnConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ATENÇÃO: Verifique se a sua tela de Landing se chama MainActivity mesmo!
                Intent intent = new Intent(activityLogin.this, MainActivity.class);
                startActivity(intent);
                finish(); // Fecha a tela de login para não voltar pra cá no botão de voltar
            }
        });

        // Ao clicar em Cadastre-se, vai para a tela de Cadastro
        tvIrParaCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Vamos criar essa CadastroActivity no próximo passo!
                Intent intent = new Intent(activityLogin.this, activityCadastro.class);
                startActivity(intent);
            }
        });

        tvEsqueceuSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activityLogin.this, "Recuperação de senha em breve!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}