package nt.com.example.mvvm_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editName;
    TextView result;
    Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName  =  findViewById(R.id.editName);
        result = findViewById(R.id.tvResult);
        buttonSubmit = findViewById(R.id.buttonSubmit);
        /*
            Submit Button
        */
        buttonSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String name = editName.getText().toString();

                result.setText("Name:\t" + name + "\n\t" );

            }
        });
    }
}