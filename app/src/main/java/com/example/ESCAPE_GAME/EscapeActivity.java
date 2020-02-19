package com.example.ESCAPE_GAME;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;

import static android.text.Layout.JUSTIFICATION_MODE_INTER_WORD;

public class EscapeActivity extends Activity {

    private TextView text;
    private TextView text2;

    private Button video;

    private Vibrator vib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        if(android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.HONEYCOMB) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
        }
        setContentView(R.layout.activity_escape);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        text = findViewById(R.id.escapePresentation_view);
        text2 = findViewById(R.id.escapeInfo_view);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            text.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            text.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
        }

        video = findViewById(R.id.video_btn);
        vib = (Vibrator) getSystemService(MainActivity.VIBRATOR_SERVICE);


        video.setOnClickListener(new View.OnClickListener() {
            @Override

            /* L'utilisateur à cliquer sur le bouton */

            public void onClick(View v) {
                /* L'utilisateur clique sur le bouton qui le redirige vers une nouvelle activité. */
                vib.vibrate(10);
                Intent QuestionnaireActivity = new Intent(EscapeActivity.this, EscapeVideoActivity.class);
                startActivity(QuestionnaireActivity);
            }
        });
    }

    public void onBackPressed() {}

}
