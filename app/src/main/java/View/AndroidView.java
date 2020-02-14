package View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import nt.com.example.mvvm_demo.R;

public class AndroidView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void enterInput(View view) {
        EditText inputText = (EditText) findViewById(R.id.inputText);
        TextView outputView = (TextView) findViewById(R.id.outputView);

        String input = inputText.getText().toString();
        outputView.setText(input);
    }
}