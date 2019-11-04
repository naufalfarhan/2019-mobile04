package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ExplicitIntentActivity extends AppCompatActivity {

    private EditText teksInput;
    private TextView teksOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);
        teksInput = findViewById(R.id.input_name);
        teksOutput = findViewById(R.id.text_output);
    }


    public void handleSubmit(View view) {
        String teks = teksInput.getText().toString();
        teksOutput.setText("Hallo" + teks);
    }
}
