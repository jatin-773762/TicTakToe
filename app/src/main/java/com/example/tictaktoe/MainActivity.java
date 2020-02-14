package com.example.tictaktoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    static Button btn00,btn01,btn02,btn10,btn11,btn12,btn20,btn21,btn22,reset;
    static EditText player_one,player_two;
    static TextView winner_name;
    static int count=0;
    static int[][] arr = new int[3][3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn00=(Button)findViewById(R.id.btn00);
        btn01=(Button)findViewById(R.id.btn01);
        btn02=(Button)findViewById(R.id.btn02);
        btn10=(Button)findViewById(R.id.btn10);
        btn11=(Button)findViewById(R.id.btn11);
        btn12=(Button)findViewById(R.id.btn12);
        btn20=(Button)findViewById(R.id.btn20);
        btn21=(Button)findViewById(R.id.btn21);
        btn22=(Button)findViewById(R.id.btn22);
        player_one=(EditText)findViewById(R.id.textView3);
        player_two=(EditText)findViewById(R.id.textView4);
        winner_name=(TextView)findViewById(R.id.winner);
        reset=(Button)findViewById(R.id.reset);

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
                arr[i][j]=-1;
        }

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn00.setClickable(true);
                btn01.setClickable(true);
                btn02.setClickable(true);
                btn10.setClickable(true);
                btn11.setClickable(true);
                btn12.setClickable(true);
                btn20.setClickable(true);
                btn21.setClickable(true);
                btn22.setClickable(true);
                btn00.setText(" ");
                btn01.setText(" ");
                btn02.setText(" ");
                btn10.setText(" ");
                btn11.setText(" ");
                btn12.setText(" ");
                btn20.setText(" ");
                btn21.setText(" ");
                btn22.setText(" ");
                for(int i=0;i<3;i++)
                {
                    for(int j=0;j<3;j++)
                        arr[i][j]=-1;
                }
                winner_name.setText("Noone");
                count=0;
            }
        });
        btn00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn00.setClickable(false);
                if(count%2==0)
                {
                    btn00.setText("X");
                    arr[0][0]=1;
                }
                else

                {
                    btn00.setText("O");
                    arr[0][0]=0;
                }
                count++;
                method();
            }
        });
        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn01.setClickable(false);
                if(count%2==0)
                {
                    btn01.setText("X");
                    arr[0][1]=1;
                }
                else
                {
                    btn01.setText("O");
                    arr[0][1]=0;
                }
                count++;
                method();

            }
        });
        btn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn02.setClickable(false);
                if(count%2==0)
                {
                    btn02.setText("X");
                    arr[0][2]=1;
                }
                else
                {
                    btn02.setText("O");
                    arr[0][2]=0;
                }
                count++;
                method();

            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn10.setClickable(false);
                if(count%2==0)
                {
                    btn10.setText("X");
                    arr[1][0]=1;
                }
                else
                {
                    btn10.setText("O");
                    arr[1][0]=0;
                }
                count++;
                method();

            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn11.setClickable(false);
                if(count%2==0)
                {
                    btn11.setText("X");
                    arr[1][1]=1;
                }
                else
                {
                    btn11.setText("O");
                    arr[1][1]=0;
                }
                count++;
                method();

            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn00.setClickable(false);
                if(count%2==0)
                {
                    btn12.setText("X");
                    arr[1][2]=1;
                }
                else
                {
                    btn12.setText("O");
                    arr[1][2]=0;
                }
                count++;
                method();

            }
        });
        btn20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn20.setClickable(false);
                if(count%2==0)
                {
                    btn20.setText("X");
                    arr[2][0]=1;
                }
                else
                {
                    btn20.setText("O");
                    arr[2][0]=0;
                }
                count++;
                method();

            }
        });
        btn21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn21.setClickable(false);
                if(count%2==0)
                {
                    btn21.setText("X");
                    arr[2][1]=1;
                }
                else
                {
                    btn21.setText("O");
                    arr[2][1]=0;
                }
                count++;
                method();

            }
        });
        btn22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn22.setClickable(false);
                if(count%2==0)
                {
                    btn22.setText("X");
                    arr[2][2]=1;
                }
                else
                {
                    btn22.setText("O");
                    arr[2][2]=0;
                }
                count++;
                method();

            }
        });



    }
    static void method()
    {
        for(int i=0;i<3;i++) {
            if ((arr[i][0] == arr[i][1] && arr[i][1] == arr[i][2])&&(arr[i][0] != -1 || arr[i][1] !=-1|| arr[i][2]!=-1)) {
                if(arr[i][0]==1)
                    winner_name.setText(player_one.getText().toString());
                else
                    winner_name.setText(player_two.getText().toString());

                btn00.setClickable(false);
                btn01.setClickable(false);
                btn02.setClickable(false);
                btn10.setClickable(false);
                btn11.setClickable(false);
                btn12.setClickable(false);
                btn20.setClickable(false);
                btn21.setClickable(false);
                btn22.setClickable(false);
                break;
            }
            else if((arr[0][i] == arr[1][i] && arr[1][i] == arr[2][i])&&(arr[0][i] != -1 || arr[1][i] !=-1|| arr[2][i]!=-1))
            {
                if(arr[0][i]==1)
                    winner_name.setText(player_one.getText().toString());
                else
                    winner_name.setText(player_two.getText().toString());
                btn00.setClickable(false);
                btn01.setClickable(false);
                btn02.setClickable(false);
                btn10.setClickable(false);
                btn11.setClickable(false);
                btn12.setClickable(false);
                btn20.setClickable(false);
                btn21.setClickable(false);
                btn22.setClickable(false);
                break;
            }
        }
        if(arr[0][0]==arr[1][1]&&arr[0][0]==arr[2][2]&&arr[0][0]!=-1)
        {
            if(arr[0][0]==1)
                winner_name.setText(player_one.getText().toString());
            else
                winner_name.setText(player_two.getText().toString());
            btn00.setClickable(false);
            btn01.setClickable(false);
            btn02.setClickable(false);
            btn10.setClickable(false);
            btn11.setClickable(false);
            btn12.setClickable(false);
            btn20.setClickable(false);
            btn21.setClickable(false);
            btn22.setClickable(false);
        }
        if(arr[0][2]==arr[1][1]&&arr[1][1]==arr[2][0]&&arr[0][2]!=-1)
        {
            if(arr[1][1]==1)
                winner_name.setText(player_one.getText().toString());
            else
                winner_name.setText(player_two.getText().toString());
            btn00.setClickable(false);
            btn01.setClickable(false);
            btn02.setClickable(false);
            btn10.setClickable(false);
            btn11.setClickable(false);
            btn12.setClickable(false);
            btn20.setClickable(false);
            btn21.setClickable(false);
            btn22.setClickable(false);
        }

    }


}


