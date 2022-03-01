package es.ua.eps.examenmodulo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "DATO";

    EditText email, pasword;
    Button entrar, nuevo, facebook;
    TextView olvidar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "Espero que funcione");

        email = findViewById(R.id.mail);
        pasword = findViewById(R.id.contrasenya);
        entrar = findViewById(R.id.login);
        nuevo = findViewById(R.id.signUp);
        facebook = findViewById(R.id.facebook);
        olvidar = findViewById(R.id.forgot);


        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent IntentLogin = new Intent(MainActivity.this, Login.class);
                startActivity(IntentLogin);

            }
        });

        olvidar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Introduce tu email", Toast.LENGTH_SHORT).show();
            }
        });

    }

        protected void onStart() {
            super.onStart();
            Log.d(TAG, "Hemos ejecutado el método onStart");
        }

        protected void onResume() {
            super.onResume();
        }

        protected void onStop() {
            super.onStop();
        }


        protected void onPause() {
            super.onPause();
        }

        protected void onDestroy() {
            super.onDestroy();
        }

    }
