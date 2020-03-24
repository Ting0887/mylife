package com.example.skystargame;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    TextView tv_p1, tv_p2;
    ImageView iv_11, iv_12, iv_13, iv_14, iv_21, iv_22, iv_23, iv_24, iv_31, iv_32, iv_33, iv_34;

    Integer[] cardarray = {101, 102, 103, 104, 105, 106, 201, 202, 203, 204, 205, 206};
    int image1, image2, image3, image4, image5, image6,
            image7, image8, image9, image10, image11, image12;

    int firstcard, secondcard;
    int clickfirst, clicksecond;
    int cardNum = 1;

    int turn = 1;
    int playerpoints = 0, cpupoints = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tv_p1 = (TextView) findViewById(R.id.tv_p1);
        tv_p2 = (TextView) findViewById(R.id.tv_p2);

        iv_11 = (ImageView) findViewById(R.id.iv_11);
        iv_12 = (ImageView) findViewById(R.id.iv_12);
        iv_13 = (ImageView) findViewById(R.id.iv_13);
        iv_14 = (ImageView) findViewById(R.id.iv_14);
        iv_21 = (ImageView) findViewById(R.id.iv_21);
        iv_22 = (ImageView) findViewById(R.id.iv_22);
        iv_23 = (ImageView) findViewById(R.id.iv_23);
        iv_24 = (ImageView) findViewById(R.id.iv_24);
        iv_31 = (ImageView) findViewById(R.id.iv_31);
        iv_32 = (ImageView) findViewById(R.id.iv_32);
        iv_33 = (ImageView) findViewById(R.id.iv_33);
        iv_34 = (ImageView) findViewById(R.id.iv_34);

        iv_11.setTag("0");
        iv_12.setTag("1");
        iv_13.setTag("2");
        iv_14.setTag("3");
        iv_21.setTag("4");
        iv_22.setTag("5");
        iv_23.setTag("6");
        iv_24.setTag("7");
        iv_31.setTag("8");
        iv_32.setTag("9");
        iv_33.setTag("10");
        iv_34.setTag("11");

        frontOfCardResource();

        Collections.shuffle(Arrays.asList(cardarray));

        tv_p2.setTextColor(Color.GRAY);

        iv_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int thecard = Integer.parseInt((String) view.getTag());
                doStuff(iv_11, thecard);
            }

        });
        iv_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_12, theCard);

            }

        });
        iv_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_13, theCard);
            }

        });
        iv_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_14, theCard);
            }

        });
        iv_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_21, theCard);
            }

        });
        iv_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_22, theCard);
            }

        });
        iv_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_23, theCard);
            }

        });
        iv_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_24, theCard);
            }

        });
        iv_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_31, theCard);
            }

        });
        iv_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_32, theCard);
            }

        });
        iv_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_33, theCard);
            }

        });
        iv_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_34, theCard);
            }
        });
    }
    private void doStuff(ImageView iv, int card) {
        if (cardarray[card] == 101) {
            iv.setImageResource(image1);
        } else if (cardarray[card] == 102) {
            iv.setImageResource(image2);
        } else if (cardarray[card] == 103) {
            iv.setImageResource(image3);
        } else if (cardarray[card] == 104) {
            iv.setImageResource(image4);
        } else if (cardarray[card] == 105) {
            iv.setImageResource(image5);
        } else if (cardarray[card] == 106) {
            iv.setImageResource(image6);
        } else if (cardarray[card] == 201) {
            iv.setImageResource(image7);
        } else if (cardarray[card] == 202) {
            iv.setImageResource(image8);
        } else if (cardarray[card] == 203) {
            iv.setImageResource(image9);
        } else if (cardarray[card] == 204) {
            iv.setImageResource(image10);
        } else if (cardarray[card] == 205) {
            iv.setImageResource(image11);
        } else if (cardarray[card] == 206) {
            iv.setImageResource(image12);
        }
        if (cardNum == 1) {
            firstcard = cardarray[card];
            if (firstcard > 200) {
                firstcard = firstcard - 100;
            }
            cardNum = 2;
            clickfirst = card;

            iv.setEnabled(false);
        } else if (cardNum == 2) {
            secondcard = cardarray[card];
            if (secondcard > 200) {
                secondcard = secondcard - 100;
            }
            cardNum = 1;
            clicksecond = card;

            iv_11.setEnabled(false);
            iv_12.setEnabled(false);
            iv_13.setEnabled(false);
            iv_14.setEnabled(false);
            iv_21.setEnabled(false);
            iv_22.setEnabled(false);
            iv_23.setEnabled(false);
            iv_24.setEnabled(false);
            iv_31.setEnabled(false);
            iv_32.setEnabled(false);
            iv_33.setEnabled(false);
            iv_34.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    calculate();
                }
            }, 1000);


        }
    }

    private void calculate() {
        if (firstcard == secondcard) {
            if (clickfirst == 0) {
                iv_11.setVisibility(View.INVISIBLE);
            } else if (clickfirst == 1) {
                iv_12.setVisibility(View.INVISIBLE);
            } else if (clickfirst == 2) {
                iv_13.setVisibility(View.INVISIBLE);
            } else if (clickfirst == 3) {
                iv_14.setVisibility(View.INVISIBLE);
            } else if (clickfirst == 4) {
                iv_21.setVisibility(View.INVISIBLE);
            } else if (clickfirst == 5) {
                iv_22.setVisibility(View.INVISIBLE);
            } else if (clickfirst == 6) {
                iv_23.setVisibility(View.INVISIBLE);
            } else if (clickfirst == 7) {
                iv_24.setVisibility(View.INVISIBLE);
            } else if (clickfirst == 8) {
                iv_31.setVisibility(View.INVISIBLE);
            } else if (clickfirst == 9) {
                iv_32.setVisibility(View.INVISIBLE);
            } else if (clickfirst == 10) {
                iv_33.setVisibility(View.INVISIBLE);
            } else if (clickfirst == 11) {
                iv_34.setVisibility(View.INVISIBLE);
            }


            if (clicksecond == 0) {
                iv_11.setVisibility(View.INVISIBLE);
            } else if (clicksecond == 1) {
                iv_12.setVisibility(View.INVISIBLE);
            } else if (clicksecond == 2) {
                iv_13.setVisibility(View.INVISIBLE);
            } else if (clicksecond == 3) {
                iv_14.setVisibility(View.INVISIBLE);
            } else if (clicksecond == 4) {
                iv_21.setVisibility(View.INVISIBLE);
            } else if (clicksecond == 5) {
                iv_22.setVisibility(View.INVISIBLE);
            } else if (clicksecond == 6) {
                iv_23.setVisibility(View.INVISIBLE);
            } else if (clicksecond == 7) {
                iv_24.setVisibility(View.INVISIBLE);
            } else if (clicksecond == 8) {
                iv_31.setVisibility(View.INVISIBLE);
            } else if (clicksecond == 9) {
                iv_32.setVisibility(View.INVISIBLE);
            } else if (clicksecond == 10) {
                iv_33.setVisibility(View.INVISIBLE);
            } else if (clicksecond == 11) {
                iv_34.setVisibility(View.INVISIBLE);
            }

            if (turn == 1) {
                playerpoints++;
                tv_p1.setText("P1:  " + playerpoints + "分");
            } else if (turn == 2) {
                cpupoints++;
                tv_p2.setText("P2:  " + cpupoints + "分");
            }
        } else {
            iv_11.setImageResource(R.drawable.seventree);
            iv_12.setImageResource(R.drawable.seventree);
            iv_13.setImageResource(R.drawable.seventree);
            iv_14.setImageResource(R.drawable.seventree);
            iv_21.setImageResource(R.drawable.seventree);
            iv_22.setImageResource(R.drawable.seventree);
            iv_23.setImageResource(R.drawable.seventree);
            iv_24.setImageResource(R.drawable.seventree);
            iv_31.setImageResource(R.drawable.seventree);
            iv_32.setImageResource(R.drawable.seventree);
            iv_33.setImageResource(R.drawable.seventree);
            iv_34.setImageResource(R.drawable.seventree);

            if (turn == 1) {
                turn = 2;
                tv_p1.setTextColor(Color.GRAY);
                tv_p2.setTextColor(Color.BLACK);
            } else if (turn == 2) {
                turn = 1;
                tv_p2.setTextColor(Color.GRAY);
                tv_p1.setTextColor(Color.BLACK);

            }
        }


        iv_11.setEnabled(true);
        iv_12.setEnabled(true);
        iv_13.setEnabled(true);
        iv_14.setEnabled(true);
        iv_21.setEnabled(true);
        iv_22.setEnabled(true);
        iv_23.setEnabled(true);
        iv_24.setEnabled(true);
        iv_31.setEnabled(true);
        iv_32.setEnabled(true);
        iv_33.setEnabled(true);
        iv_34.setEnabled(true);

        checkEnd();

    }
    private void checkEnd() {
        if(iv_11.getVisibility()==View.INVISIBLE &&
                iv_12.getVisibility()==View.INVISIBLE&&
                iv_13.getVisibility()==View.INVISIBLE&&
                iv_14.getVisibility()==View.INVISIBLE&&
                iv_21.getVisibility()==View.INVISIBLE&&
                iv_22.getVisibility()==View.INVISIBLE&&
                iv_23.getVisibility()==View.INVISIBLE&&
                iv_24.getVisibility()==View.INVISIBLE&&
                iv_31.getVisibility()==View.INVISIBLE&&
                iv_32.getVisibility()==View.INVISIBLE&&
                iv_33.getVisibility()==View.INVISIBLE&&
                iv_34.getVisibility()==View.INVISIBLE){

            AlertDialog.Builder alertDialogBulider = new AlertDialog.Builder(MainActivity.this);
            alertDialogBulider
                    .setMessage("Game Over!\nP1:" + playerpoints + "分" + "\nP2:" + cpupoints+"分")
                    .setCancelable(false)
                    .setPositiveButton("NEW", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                            startActivity(intent);
                            finish();

                        }
                    })
                    .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });
            AlertDialog alertDialog = alertDialogBulider.create();
            alertDialog.show();

        }
    }

    private void frontOfCardResource() {

        image1 = R.drawable.rfb;
        image2 = R.drawable.cms;
        image3 = R.drawable.k5;
        image4 = R.drawable.g28;
        image5 = R.drawable.m14;
        image6 = R.drawable.wa2000;
        image7 = R.drawable.rfb1;
        image8 = R.drawable.cms1;
        image9 = R.drawable.k52;
        image10 = R.drawable.g281;
        image11 = R.drawable.m141;
        image12 = R.drawable.wa20001;
    }
}
