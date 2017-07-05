package com.example.stevenmacdonald.roxkpapergame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    EditText inputEditText;
    TextView outputText;
    Button playButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        inputEditText = (EditText) findViewById(R.id.input_text);
        outputText = (TextView) findViewById(R.id.output_text);
        playButton = (Button) findViewById(R.id.play_button);

    }

    public void onPlayButtonClicked(View button) {
        String choice = inputEditText.getText().toString();
        Game game = new Game(choice);
        String computer = game.getRandCompChoice();
        String result = game.getWinner(computer);
        outputText.setText(result);
    }
}
