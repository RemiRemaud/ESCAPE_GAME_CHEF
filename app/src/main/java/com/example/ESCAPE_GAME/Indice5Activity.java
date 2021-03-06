package com.example.ESCAPE_GAME;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Indice5Activity extends Activity {
    private TextView question;
    private EditText reponse;
    private Button valider;
    private TextView commentaire;
    private String test;
    private ImageView indice;
    private Boolean trouve;

    private Button retour;
    private Vibrator vib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.HONEYCOMB) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
        }
        setContentView(R.layout.activity_indice5);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        question = findViewById(R.id.question5_view);
        reponse = findViewById(R.id.reponse5_txt);
        valider = findViewById(R.id.indice5_btn);
        commentaire = findViewById(R.id.IndiceReponse5_view);
        indice = findViewById(R.id.image5View);

        vib=(Vibrator)getSystemService(MainActivity.VIBRATOR_SERVICE);
        retour = findViewById(R.id.retour_btn);

        SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
        Boolean cc1 = sharedPreferences.getBoolean("1", false);
        if (cc1) {
            indice.setVisibility(View.VISIBLE);
        } else {
            indice.setVisibility(View.INVISIBLE);
        }
        valider.setEnabled(false);

        reponse.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            /* Lorsque le champ de saisie est modifié */
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                test = s.toString();
                valider.setEnabled(true);
            }
            /* Après que le champ de saisie ait été modifié */
            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        valider.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                vib.vibrate(10);
                if (test.contains("proginov") || test.contains("Proginov") || test.contains("PROGINOV") ) {
                    commentaire.setText("Bonne réponse! Voici votre Indice:");
                    commentaire.setTextColor(Color.GREEN);
                    valider.setEnabled(false);
                    trouve = true;
                    indice.setVisibility(View.VISIBLE);
                    SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putBoolean("1", trouve);
                    editor.apply();
                    indice.setVisibility(View.VISIBLE);
                } else if (test.contains("capgemini") || test.contains("Capgemini") || test.contains("CAPGEMINI")) {
                    commentaire.setText("Bonne réponse! Voici votre Indice:");
                    commentaire.setTextColor(Color.GREEN);
                    valider.setEnabled(false);
                    trouve = true;
                    indice.setVisibility(View.VISIBLE);
                    SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putBoolean("1", trouve);
                    editor.apply();
                    indice.setVisibility(View.VISIBLE);
                } else if (test.contains("cgi") || test.contains("CGI") || test.contains("Cgi")) {
                    commentaire.setText("Bonne réponse! Voici votre Indice:");
                    commentaire.setTextColor(Color.GREEN);
                    valider.setEnabled(false);
                    trouve = true;
                    indice.setVisibility(View.VISIBLE);
                    SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putBoolean("1", trouve);
                    editor.apply();
                    indice.setVisibility(View.VISIBLE);
                } else if (test.contains("sopra") || test.contains("Sopra") || test.contains("SOPRA") || test.contains("Sopra Steria") || test.contains("sopra steria") ) {
                    commentaire.setText("Bonne réponse! Voici votre Indice:");
                    commentaire.setTextColor(Color.GREEN);
                    valider.setEnabled(false);
                    trouve = true;
                    indice.setVisibility(View.VISIBLE);
                    SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putBoolean("1", trouve);
                    editor.apply();
                    indice.setVisibility(View.VISIBLE);
                } else if (test.contains("atos") || test.contains("Atos") || test.contains("ATOS")) {
                    commentaire.setText("Bonne réponse! Voici votre Indice:");
                    commentaire.setTextColor(Color.GREEN);
                    valider.setEnabled(false);
                    trouve = true;
                    indice.setVisibility(View.VISIBLE);
                    SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putBoolean("1", trouve);
                    editor.apply();
                    indice.setVisibility(View.VISIBLE);
                } else if (test.contains("orange") || test.contains("Orange") || test.contains("ORANGE")) {
                    commentaire.setText("Bonne réponse! Voici votre Indice:");
                    commentaire.setTextColor(Color.GREEN);
                    valider.setEnabled(false);
                    trouve = true;
                    indice.setVisibility(View.VISIBLE);
                    SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putBoolean("1", trouve);
                    editor.apply();
                    indice.setVisibility(View.VISIBLE);
                } else if (test.contains("i-bp") || test.contains("I-BP") || test.contains("I-bp") || test.contains("i-BP")) {
                    commentaire.setText("Bonne réponse !\n\nVoici votre Indice :");
                    commentaire.setTextColor(Color.GREEN);
                    valider.setEnabled(false);
                    trouve = true;
                    indice.setVisibility(View.VISIBLE);
                    SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putBoolean("1", trouve);
                    editor.apply();
                    indice.setVisibility(View.VISIBLE);
                } else {
                    commentaire.setText("Mauvaise réponse ! Réessayer.");
                    commentaire.setTextColor(Color.RED);
                }
            }
        });

        retour.setOnClickListener(new View.OnClickListener() {
            /* Si l'utilisateur clique */
            public void onClick(View v) {
                vib.vibrate(10);
                Intent intent = new Intent(Indice5Activity.this, Enigme5Activity.class);
                startActivity(intent);
            }
        });
    }

    public void onBackPressed() {}

}
