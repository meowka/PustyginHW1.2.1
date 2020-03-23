package com.example.hw121;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOk = (Button) findViewById(R.id.btnOK);
        Button btnClear = (Button) findViewById(R.id.btnClear);
        final TextView alertText = (TextView) findViewById(R.id.alertText);
        final EditText userName = (EditText) findViewById(R.id.userName);
        final EditText userEmail = (EditText) findViewById(R.id.userEmail);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                alertText.setText(getString(R.string.alertInfoUserName) + userName.getText() + getString(R.string.alertInfoUserEmail) + userEmail.getText());
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userName.getText().clear();
                userEmail.getText().clear();
                alertText.setText("");
            }
        });
    }
}
