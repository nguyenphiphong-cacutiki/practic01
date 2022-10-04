package com.example.practic01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textviewtop;
    EditText editText1;
    EditText editText2;
    Button button1;
    Button button2;
    Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textviewtop = (TextView) findViewById(R.id.textviewtop);
        editText1 = (EditText) findViewById(R.id.name1);
        editText2 = (EditText) findViewById(R.id.name2);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textviewtop.setText("ok");
                Toast.makeText(MainActivity.this,"ban vua doi ten", Toast.LENGTH_SHORT).show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"ban vua nhap ten", Toast.LENGTH_SHORT).show();

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText2.setText("nguyễn Phi Phong");
                Toast.makeText(MainActivity.this,"ban vua nhap ten",Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this,"toast lan nua",Toast.LENGTH_SHORT).show();
            }
        });

    }
    // cmt test share github 1
    // cmt test share github 2
    // cmt test share github 3
    // cmt test share github 4
}