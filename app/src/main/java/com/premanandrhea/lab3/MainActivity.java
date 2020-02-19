package com.premanandrhea.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView uno, dos, tres, quatro, center;
    int c1, c2, c3, c4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        center=findViewById(R.id.mid);
        uno=findViewById(R.id.one);
        dos=findViewById(R.id.two);
        tres=findViewById(R.id.three);
        quatro=findViewById(R.id.four);

        c1=0;
        c2=0;
        c3=0;
        c4=0;

        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c1+=1;
                uno.setText(c1+" ");
                center.setText("the bottom right corner has been pressed");
            }
        });
        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c2+=1;
                dos.setText(c2+" ");
                center.setText("the bottom left corner has been pressed");
            }
        });
        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c3+=1;
                tres.setText(c3+" ");
                center.setText("the top left corner has been pressed");
            }
        });
        quatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c4+=1;
                quatro.setText(c4+" ");
                center.setText("the top right corner has been pressed");
            }
        });

    }
}
