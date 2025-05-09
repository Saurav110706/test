package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText user;
    EditText pass;
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

        //hello jou ma se poes, i need to test somethings.
        //iuytrityu
        //one last edit
        //ballllls bro ipb


        String word = "Bring lozenges";
        TextView out = findViewById(R.id.editUsername);
        out.setText(word);

    }

    public void process(View v){

        user = findViewById(R.id.editUsername);

        pass = findViewById(R.id.editPassword);

        TextView uOut = findViewById(R.id.userOut);
        uOut.setText(user.getText());

        TextView pOut = findViewById(R.id.passOut);
        pOut.setText(pass.getText());

    }
}