package com.example.militarywar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class GamePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamepage);
        TextView playerScore = (TextView) findViewById(R.id.playerScore);
        ImageView toopImage = (ImageView) findViewById(R.id.toopImage1);
        ImageView gunImage = (ImageView) findViewById(R.id.gunImage2);
        ImageView tankImage = (ImageView) findViewById(R.id.tankImage3);
        ImageView computerChoice = (ImageView) findViewById(R.id.computerChoice);
        ImageView playerChoice = (ImageView) findViewById(R.id.playerChoice);
        Random randomNum = new Random();


        //Toop
        toopImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerChoice.setImageResource(R.drawable.toop2_image);
                int computerChoiceNumber = randomNum.nextInt(3);
                if (computerChoiceNumber==0){
                    computerChoice.setImageResource(R.drawable.toop2_image);
                    Toast.makeText(GamePage.this,"no one won.",Toast.LENGTH_SHORT).show();
                }
                else if (computerChoiceNumber==1){
                    computerChoice.setImageResource(R.drawable.gun_image);
                    Toast.makeText(GamePage.this,"You lost.",Toast.LENGTH_SHORT).show();
                }
                else if (computerChoiceNumber==2){
                    computerChoice.setImageResource(R.drawable.tank_image);
                    Toast.makeText(GamePage.this,"You won",Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Gun
        gunImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerChoice.setImageResource(R.drawable.gun_image);
                int computerChoiceNumber = randomNum.nextInt(3);
                if (computerChoiceNumber==0){
                    computerChoice.setImageResource(R.drawable.toop2_image);
                    Toast.makeText(GamePage.this,"You won.",Toast.LENGTH_SHORT).show();
                }
                else if (computerChoiceNumber==1){
                    computerChoice.setImageResource(R.drawable.gun_image);
                    Toast.makeText(GamePage.this,"No one won.",Toast.LENGTH_SHORT).show();
                }
                else if (computerChoiceNumber==2){
                    computerChoice.setImageResource(R.drawable.tank_image);
                    Toast.makeText(GamePage.this,"You lost.",Toast.LENGTH_SHORT).show();
                }
            }
        });


        tankImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                playerChoice.setImageResource(R.drawable.tank_image);
                int computerChoiceNumber = randomNum.nextInt(3);
                if (computerChoiceNumber==0){
                    computerChoice.setImageResource(R.drawable.toop2_image);
                    Toast.makeText(GamePage.this,"You lost.",Toast.LENGTH_SHORT).show();
                }
                else if (computerChoiceNumber==1){
                    computerChoice.setImageResource(R.drawable.gun_image);
                    Toast.makeText(GamePage.this,"You won.",Toast.LENGTH_SHORT).show();
                }
                else if (computerChoiceNumber==2){
                    computerChoice.setImageResource(R.drawable.tank_image);
                    Toast.makeText(GamePage.this,"No one won.",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}