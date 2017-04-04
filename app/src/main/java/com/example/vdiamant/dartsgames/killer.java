package com.example.vdiamant.dartsgames;

import android.content.Intent;
import android.content.res.XmlResourceParser;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.vdiamant.dartsgames.model.Player;

import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.util.List;

public class killer extends AppCompatActivity {

    List<Player> players;
    Player whoIsPlaying;
    int maxDarts=3;
    int playingDartsLeft=3;
    int numberOfPlayer=0;
    int gamePoints;
    String game;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_killer);

        Intent myIntent = getIntent();
        players = (List<Player>) myIntent.getSerializableExtra("LIST");
        game=myIntent.getStringExtra(DartsGames.EXTRA_MESSAGE);
        gamePoints=Integer.parseInt(game);

        //setOterPlayers();
        //initialize();
        //setFirstInPointsTop();

    }

}