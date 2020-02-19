package com.example.ESCAPE_GAME;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Vibrator;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import static android.text.Layout.JUSTIFICATION_MODE_INTER_WORD;


public class EscapeVideoActivity extends AppCompatActivity {

    private TextView text;
    private TextView text2;

    private Button videoEscape;

    private Vibrator vib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        if(android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.HONEYCOMB) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
        }
        setContentView(R.layout.activity_escape_video);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        text = findViewById(R.id.videoPresentation_view);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            text.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
        }

        text2 = findViewById(R.id.videoInfo_view);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            text2.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);
        }

        videoEscape = findViewById(R.id.play_video_btn);
        vib = (Vibrator) getSystemService(EscapeVideoActivity.VIBRATOR_SERVICE);

        videoEscape.setOnClickListener(new View.OnClickListener() {
            @Override

            /* L'utilisateur à cliquer sur le bouton */

            public void onClick(View v) {
                /* L'utilisateur clique sur le bouton qui le redirige vers une nouvelle activité. */
                vib.vibrate(10);
                Intent VideoActivity = new Intent(EscapeVideoActivity.this, VideoActivity.class);
                startActivity(VideoActivity);
            }
        });
    }

    public void onBackPressed() {}

}
