package com.cybtech.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.ColorRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView txtMessage;
    private Button btnMessage;
    private EditText editTxtMessage;
    private String message;

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
        btnMessage=(Button)findViewById(R.id.btnShowMessage);
        editTxtMessage=(EditText)findViewById(R.id.editTxtMessage);

        //-----------TextView Özellikleri-----------
        //txtMessage.setText("Deneme mesajı");
        //txtMessage.setTextColor(Color.parseColor("#000000"));
        //System.out.println(txtMessage.getText().toString());
        //txtMessage.setVisibility(View.INVISIBLE);
        //txtMessage.setTextSize(23.5f);

        //-----------Button Özellikleri -----------
        //btnMessage.setText("Show Message");
        //btnMessage.setTextColor(Color.BLUE);

        //Button Enabled Özelliğini Değiştirme
        //btnMessage.setEnabled(false);

        //Butona 1 kere tıklanınca
        /*
        btnMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int s1=15,s2=5;
                txtMessage.setText(String.valueOf(s1+s2));
            }
        });

         */


        /*
        //Butona basılı tutunca
        btnMessage.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                txtMessage.setBackgroundColor(Color.CYAN);
                return false;
            }
        });

         */

        //-----------Edittext Özellikleri-----------
        //editTxtMessage.setText("Deneme1234");
        //txtMessage.setText(editTxtMessage.getText().toString());
        //editTxtMessage.setHint("Test 123");
        //editTxtMessage.setHintTextColor(Color.RED);


        btnMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                message=editTxtMessage.getText().toString();

                if (!TextUtils.isEmpty(message))
                    txtMessage.setText(message);
                else
                    txtMessage.setText("Girdiğiniz İfade Boş Olamaz");
            }
        });
    }
}