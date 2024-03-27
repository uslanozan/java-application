package com.cybtech.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView txtMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //xml'deki textMessage'ı txtMessage'a bağladık
        txtMessage = (TextView)findViewById(R.id.textMessage);
        //TextView içeriğini burdan da değiştirebiliriz
        txtMessage.setText("Deneme mesajı");
        txtMessage.setTextColor(Color.parseColor("#000000"));
        System.out.println(txtMessage.getText().toString());
        //txtMessage.setVisibility(View.INVISIBLE);
        //txtMessage.setTextSize(23.5f);

    }
}