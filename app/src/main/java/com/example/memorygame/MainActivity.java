package com.example.memorygame;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    TextView tv_p1,tv_p2;
    ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12; //total de cartas
    // Array para las imagenes
    Integer[] cardsArray = {101,102,103,104,105,106,201,202,203,204,205,206};
    int image101,image102,image103,image104,image105,image106,
    image201,image202,image203,image204,image205,image206; //cartas diferentes
    int firstCard, secondCard;
    int clickedFirst, clickedSecond;
    int cardNumber = 1;

    int turn = 1;
    int playerPoints = 0, cpuPoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_p1 = (TextView) findViewById(R.id.tv_1);
        tv_p2 = (TextView) findViewById(R.id.tv_2);

        img1 = (ImageView) findViewById(R.id.img1);
        img2 = (ImageView) findViewById(R.id.img2);
        img3 = (ImageView) findViewById(R.id.img3);
        img4 = (ImageView) findViewById(R.id.img4);
        img5 = (ImageView) findViewById(R.id.img5);
        img6 = (ImageView) findViewById(R.id.img6);
        img7 = (ImageView) findViewById(R.id.img7);
        img8 = (ImageView) findViewById(R.id.img8);
        img9 = (ImageView) findViewById(R.id.img9);
        img10 = (ImageView) findViewById(R.id.img10);
        img11 = (ImageView) findViewById(R.id.img11);
        img12 = (ImageView) findViewById(R.id.img12);

        img1.setTag("0");
        img2.setTag("1");
        img3.setTag("2");
        img4.setTag("3");
        img5.setTag("4");
        img6.setTag("5");
        img7.setTag("6");
        img8.setTag("7");
        img9.setTag("8");
        img10.setTag("9");
        img11.setTag("10");
        img12.setTag("11");

        //load the card images
        frontOfCardsResources();

        //Shuffle the images
        Collections.shuffle(Arrays.asList(cardsArray));

        //Change the color of the second player to inactive
        tv_p2.setTextColor(Color.GRAY);

        //Listeners de las imagenes
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(img1,theCard);
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(img2,theCard);
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(img3,theCard);
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(img4,theCard);
            }
        });
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(img5,theCard);
            }
        });
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(img6,theCard);
            }
        });
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(img7,theCard);
            }
        });
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(img8,theCard);
            }
        });
        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(img9,theCard);
            }
        });
        img10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(img10,theCard);
            }
        });
        img11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(img11,theCard);
            }
        });
        img12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doStuff(img12,theCard);
            }
        });
    }

    private void doStuff(ImageView img, int card){
        if(cardsArray[card] == 101){
            img.setImageResource(image101);
        }else if(cardsArray[card] == 102){
            img.setImageResource(image102);
        }
        else if(cardsArray[card] == 103){
            img.setImageResource(image103);
        }
        else if(cardsArray[card] == 104){
            img.setImageResource(image104);
        }
        else if(cardsArray[card] == 105){
            img.setImageResource(image105);
        }
        else if(cardsArray[card] == 106){
            img.setImageResource(image106);
        }
        else if(cardsArray[card] == 201){
            img.setImageResource(image201);
        }
        else if(cardsArray[card] == 202){
            img.setImageResource(image202);
        }
        else if(cardsArray[card] == 203){
            img.setImageResource(image203);
        }
        else if(cardsArray[card] == 204){
            img.setImageResource(image204);
        }
        else if(cardsArray[card] == 205){
            img.setImageResource(image205);
        }
        else if(cardsArray[card] == 206){
            img.setImageResource(image206);
        }
        if(cardNumber==1){
            firstCard = cardsArray[card];
            if(firstCard>200){
                firstCard = firstCard - 100;
            }
            cardNumber = 2;
            clickedFirst = card;
            img.setEnabled(false);
        } else if (cardNumber == 2){
            secondCard = cardsArray[card];
            if(secondCard > 200){
                secondCard = secondCard-100;
            }
            cardNumber = 1;
            clickedSecond = card;

            img1.setEnabled(false);
            img2.setEnabled(false);
            img3.setEnabled(false);
            img4.setEnabled(false);
            img5.setEnabled(false);
            img6.setEnabled(false);
            img7.setEnabled(false);
            img8.setEnabled(false);
            img9.setEnabled(false);
            img10.setEnabled(false);
            img11.setEnabled(false);
            img12.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    calculate();
                }
            }, 1000);
        }
    }

    private void calculate(){
        if(firstCard==secondCard){
            if(clickedFirst == 0){
                img1.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 1){
                img2.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 2){
                img3.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 3){
                img4.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 4){
                img5.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 5){
                img6.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 6){
                img7.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 7){
                img8.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 8){
                img9.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 9){
                img10.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 10){
                img11.setVisibility(View.INVISIBLE);
            }else if(clickedFirst == 11){
                img12.setVisibility(View.INVISIBLE);
            }
            if(clickedSecond == 0){
                img1.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 1){
                img2.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 2){
                img3.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 3){
                img4.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 4){
                img5.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 5){
                img6.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 6){
                img7.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 7){
                img8.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 8){
                img9.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 9){
                img10.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 10){
                img11.setVisibility(View.INVISIBLE);
            }else if(clickedSecond == 11){
                img12.setVisibility(View.INVISIBLE);
            }
            //Add points to the correct player
            if(turn == 1){
                playerPoints++;
                tv_p1.setText("P1"+ playerPoints);
            } else if(turn == 2){
                cpuPoints++;
                tv_p2.setText("P2"+ playerPoints);
            }
        } else {
            img1.setImageResource(R.drawable.sims);
            img2.setImageResource(R.drawable.sims);
            img3.setImageResource(R.drawable.sims);
            img4.setImageResource(R.drawable.sims);
            img5.setImageResource(R.drawable.sims);
            img6.setImageResource(R.drawable.sims);
            img7.setImageResource(R.drawable.sims);
            img8.setImageResource(R.drawable.sims);
            img9.setImageResource(R.drawable.sims);
            img10.setImageResource(R.drawable.sims);
            img11.setImageResource(R.drawable.sims);
            img12.setImageResource(R.drawable.sims);

            if(turn == 1){
                turn = 2;
                tv_p1.setTextColor(Color.GRAY);
                tv_p2.setTextColor(Color.BLACK);
            } else if(turn == 2){
                turn = 1;
                tv_p2.setTextColor(Color.GRAY);
                tv_p1.setTextColor(Color.BLACK);
            }
        }
        img1.setEnabled(true);
        img2.setEnabled(true);
        img3.setEnabled(true);
        img4.setEnabled(true);
        img5.setEnabled(true);
        img6.setEnabled(true);
        img7.setEnabled(true);
        img8.setEnabled(true);
        img9.setEnabled(true);
        img10.setEnabled(true);
        img11.setEnabled(true);
        img12.setEnabled(true);
        checkEnd();
    }
    private void checkEnd(){
        if(img1.getVisibility() == View.INVISIBLE
                && img2.getVisibility() == View.INVISIBLE
                && img3.getVisibility() == View.INVISIBLE
                && img4.getVisibility() == View.INVISIBLE
                && img5.getVisibility() == View.INVISIBLE
                && img6.getVisibility() == View.INVISIBLE
                && img7.getVisibility() == View.INVISIBLE
                && img8.getVisibility() == View.INVISIBLE
                && img9.getVisibility() == View.INVISIBLE
                && img10.getVisibility() == View.INVISIBLE
                && img11.getVisibility() == View.INVISIBLE
                && img12.getVisibility() == View.INVISIBLE){

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
            alertDialogBuilder
                    .setMessage("GAME OVER!\nP1" + playerPoints + "\nP2" + cpuPoints)
                    .setCancelable(false)
                    .setPositiveButton("NEW", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();

        }
    }
    private void frontOfCardsResources(){
        image101 = R.drawable.bart;
        image102 = R.drawable.marge;
        image103 = R.drawable.homero;
        image104 = R.drawable.lisa;
        image105 = R.drawable.nelson;
        image106 = R.drawable.burns;
        image201 = R.drawable.bart2;
        image202 = R.drawable.marge2;
        image203 = R.drawable.homero2;
        image204 = R.drawable.lisa2;
        image205 = R.drawable.nelson2;
        image206 = R.drawable.burns2;
    }
}