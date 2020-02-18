package id.ac.polinema.intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ExplicitIntentActivity extends AppCompatActivity {

    EditText etHasil;
    Button bHasil;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);

        etHasil=findViewById(R.id.input_name);
        bHasil=findViewById(R.id.submit);
        tvHasil=findViewById(R.id.text_output);

        bHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String hasil=etHasil.getText().toString();
                tvHasil.setText("Hello " +hasil+", Congratulations!");
            }
        });
    }

}
