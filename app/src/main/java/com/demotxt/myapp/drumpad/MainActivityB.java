package com.demotxt.myapp.drumpad;

import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivityB extends AppCompatActivity {
    private SoundPool sp;
    private int sound1;
    private int sound2;
    private int sound3;
    private int sound4;
    private int sound5;
    private int sound6;
    private int sound7;
    private int sound8;
    private int sound9;
    private int sound10;
    private int sound11;
    private int sound12;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        button = (Button) findViewById(R.id.b);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(view.getContext(), MainActivityA.class);
                view.getContext().startActivity(Intent);
                overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
            }
        });
        sp = new SoundPool(0, AudioManager.STREAM_MUSIC,0);
        sound1 = sp.load(getApplicationContext(),R.raw.waking_up_b_bass_01,1);
        sound2 = sp.load(getApplicationContext(),R.raw.waking_up_b_chords_01,1);
        sound3 = sp.load(getApplicationContext(),R.raw.waking_up_b_chords_02,1);
        sound4 = sp.load(getApplicationContext(),R.raw.waking_up_b_chords_03,1);
        sound5 = sp.load(getApplicationContext(),R.raw.waking_up_b_clap_01,1);
        sound6 = sp.load(getApplicationContext(),R.raw.waking_up_b_flute_01,1);
        sound7 = sp.load(getApplicationContext(),R.raw.waking_up_b_fx_01,1);
        sound8 = sp.load(getApplicationContext(),R.raw.waking_up_b_hat_01,1);
        sound9 = sp.load(getApplicationContext(),R.raw.waking_up_b_kick_01,1);
        sound10 = sp.load(getApplicationContext(),R.raw.waking_up_b_vox_03,1);
        sound11 = sp.load(getApplicationContext(),R.raw.waking_up_a_vox_02,1);
        sound12 = sp.load(getApplicationContext(),R.raw.waking_up_a_vox_03,1);

    }

    public void playsound1 (View v) {
        sp.play(sound1,1.0f,1.0f,0,0,0f);
    }
    public void playsound2 (View v) {
        sp.play(sound2,1.0f,1.0f,0,0,0f);

    }
    public void playsound3 (View v) {
        sp.play(sound3,1.0f,1.0f,0,0,0f);

    }
    public void playsound4 (View v) {
        sp.play(sound4,1.0f,1.0f,0,0,0f);

    }
    public void playsound5 (View v) {
        sp.play(sound5,1.0f,1.0f,0,0,0f);

    }
    public void playsound6 (View v) {
        sp.play(sound6,1.0f,1.0f,0,0,0f);

    }
    public void playsound7 (View v) {
        sp.play(sound7,1.0f,1.0f,0,0,0f);

    }
    public void playsound8 (View v) {
        sp.play(sound8,1.0f,1.0f,0,0,0f);

    }
    public void playsound9 (View v) {
        sp.play(sound9,1.0f,1.0f,0,0,0f);

    }
    public void playsound10 (View v) {
        sp.play(sound10,1.0f,1.0f,0,0,0f);
    }
    public void playsound11 (View v) {
        sp.play(sound11,1.0f,1.0f,0,0,0f);
    }
    public void playsound12 (View v) {
        sp.play(sound12,1.0f,1.0f,0,0,0f);

    }

}
