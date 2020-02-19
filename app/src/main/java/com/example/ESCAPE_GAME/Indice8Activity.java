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
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Indice8Activity extends Activity {
    private TextView question;
    private EditText reponse;
    private Button valider;
    private TextView commentaire;
    private String test;
    private CheckBox Box1;
    private CheckBox Box2;
    private CheckBox Box3;
    private CheckBox Box4;
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
        setContentView(R.layout.activity_indice8);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        question = findViewById(R.id.question8_view);
        valider = findViewById(R.id.indice8_btn);
        commentaire = findViewById(R.id.IndiceReponse8_view);
        Box1 = findViewById(R.id.checkbox8_1);
        Box2 = findViewById(R.id.checkbox8_2);
        Box3 = findViewById(R.id.checkbox8_3);
        Box4 = findViewById(R.id.checkbox8_4);
        indice = findViewById(R.id.image8View);

        vib=(Vibrator)getSystemService(MainActivity.VIBRATOR_SERVICE);
        retour = findViewById(R.id.retour_btn);

        SharedPreferences sharedPreferences = getPreferences(MODE_PRIVATE);
        Boolean cc1 = sharedPreferences.getBoolean("1", false);
        if (cc1) {
            indice.setVisibility(View.VISIBLE);
        } else {
            indice.setVisibility(View.INVISIBLE);
        }

        Box1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vib.vibrate(10);
                if (Box1.isChecked()) {
                    Box2.setChecked(false);
                    Box3.setChecked(false);
                    Box4.setChecked(false);
                } else {
                    Box2.setChecked(false);
                    Box3.setChecked(false);
                    Box4.setChecked(false);
                }
            }
        });

        Box2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vib.vibrate(10);
                if (Box2.isChecked()) {
                    Box1.setChecked(false);
                    Box3.setChecked(false);
                    Box4.setChecked(false);
                } else {
                    Box1.setChecked(false);
                    Box3.setChecked(false);
                    Box4.setChecked(false);
                }
            }
        });

        Box3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vib.vibrate(10);
                if (Box3.isChecked()) {
                    Box2.setChecked(false);
                    Box1.setChecked(false);
                    Box4.setChecked(false);
                } else {
                    Box2.setChecked(false);
                    Box1.setChecked(false);
                    Box4.setChecked(false);
                }
            }
        });

        Box4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vib.vibrate(10);
                if (Box4.isChecked()) {
                    Box2.setChecked(false);
                    Box3.setChecked(false);
                    Box1.setChecked(false);
                } else {
                    Box2.setChecked(false);
                    Box3.setChecked(false);
                    Box1.setChecked(false);
                }
            }
        });

        valider.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                vib.vibrate(10);
                if (Box3.isChecked()) {
                    commentaire.setText("Bonne réponse !\n\nVoici votre indice :");
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
                Intent intent = new Intent(Indice8Activity.this, Enigme8Activity.class);
                startActivity(intent);
            }
        });
    }

    public void onBackPressed() {}

}
