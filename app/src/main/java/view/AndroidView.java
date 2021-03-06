package view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.Observer;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import Model.Model;
import nt.com.example.mvvm_demo.R;

public class AndroidView extends AppCompatActivity {

    private AndroidLowerCaseViewModel lowerCaseViewModel;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        observeViewModel();

        EditText inputText = (EditText) findViewById(R.id.inputText);
        inputText.setText(lowerCaseViewModel.getPresentableData().getValue());
    }

    private void observeViewModel(Model model) {
        lowerCaseViewModel = new ViewModelProvider(this).get(AndroidLowerCaseViewModel.class);
        final Observer<String> stringObserver = new Observer<String>() {
            @Override
            public void onChanged(String s) {
                TextView outputView = (TextView) findViewById(R.id.outputView);
                outputView.setText(s);
            }
        };
        lowerCaseViewModel.getPresentableData().observe(this, stringObserver);
    }
    public void enterInput(View view) {
     EditText inputText = (EditText) findViewById(R.id.inputText);

     String input = inputText.getText().toString();
     lowerCaseViewModel.setData(input);
    }
}