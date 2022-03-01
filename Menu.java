package es.ua.eps.examenmodulo2;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;

import es.ua.eps.examenmodulo2.MainActivity;
import es.ua.eps.examenmodulo2.R;

public class Menu extends Fragment {
    Button carta, contacto, inicio;
    View rootView;

    @Override
    public android.view.View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container, @NonNull Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment, container, false);

        inicio = rootView.findViewById(R.id.inicio);
        carta = rootView.findViewById(R.id.menu);
        contacto = rootView.findViewById(R.id.contacto);

        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent IntentInicio = new Intent(getActivity(), MainActivity.class);
                startActivity(IntentInicio);
            }
        });

        contacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri llamar = Uri.parse("tel:+34628877441");
                Intent firstTry = new Intent(Intent.ACTION_DIAL, llamar);
                startActivity(firstTry);

            }
        });



        return rootView;
    }
}
