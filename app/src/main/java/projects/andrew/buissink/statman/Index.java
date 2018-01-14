package projects.andrew.buissink.statman;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.logging.Logger;

public class Index extends AppCompatActivity {
    //for ease of use in later code each players button are in seperate lists as initialiazed here
    //buttons added in onCreate method
    ArrayList<Button> alP1 = new ArrayList();
    ArrayList<Button> alP2 = new ArrayList();
    ArrayList<Button> alP3 = new ArrayList();
    ArrayList<Button> alP4 = new ArrayList();
    ArrayList<Button> alP5 = new ArrayList();
    ArrayList<Button> alP6 = new ArrayList();
    ArrayList<Button> alP7 = new ArrayList();
    ArrayList<Button> alP8 = new ArrayList();
    ArrayList<ArrayList> button_lists = new ArrayList();

    Button bp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        //LIST POPULATION FOR PLAYER1
        alP1.add((Button)findViewById(R.id.btnP1FGM));
        alP1.add((Button)findViewById(R.id.btnP1FGA));
        alP1.add((Button)findViewById(R.id.btnP13PM));
        alP1.add((Button)findViewById(R.id.btnP13PA));
        alP1.add((Button)findViewById(R.id.btnP1FTM));
        alP1.add((Button)findViewById(R.id.btnP1FTA));
        alP1.add((Button)findViewById(R.id.btnP1REB));
        alP1.add((Button)findViewById(R.id.btnP1AST));
        alP1.add((Button)findViewById(R.id.btnP1STL));
        alP1.add((Button)findViewById(R.id.btnP1TO));
        alP1.add((Button)findViewById(R.id.btnP1PF));
        alP1.add((Button)findViewById(R.id.btnP1PTS));

        //LIST POPULATION FOR PLAYER2
        alP2.add((Button)findViewById(R.id.btnP2FGM));
        alP2.add((Button)findViewById(R.id.btnP2FGA));
        alP2.add((Button)findViewById(R.id.btnP23PM));
        alP2.add((Button)findViewById(R.id.btnP23PA));
        alP2.add((Button)findViewById(R.id.btnP2FTM));
        alP2.add((Button)findViewById(R.id.btnP2FTA));
        alP2.add((Button)findViewById(R.id.btnP2REB));
        alP2.add((Button)findViewById(R.id.btnP2AST));
        alP2.add((Button)findViewById(R.id.btnP2STL));
        alP2.add((Button)findViewById(R.id.btnP2TO));
        alP2.add((Button)findViewById(R.id.btnP2PF));
        alP2.add((Button)findViewById(R.id.btnP2PTS));

        //LIST POPULATION FOR PLAYER3
        alP3.add((Button)findViewById(R.id.btnP3FGM));
        alP3.add((Button)findViewById(R.id.btnP3FGA));
        alP3.add((Button)findViewById(R.id.btnP33PM));
        alP3.add((Button)findViewById(R.id.btnP33PA));
        alP3.add((Button)findViewById(R.id.btnP3FTM));
        alP3.add((Button)findViewById(R.id.btnP3FTA));
        alP3.add((Button)findViewById(R.id.btnP3REB));
        alP3.add((Button)findViewById(R.id.btnP3AST));
        alP3.add((Button)findViewById(R.id.btnP3STL));
        alP3.add((Button)findViewById(R.id.btnP3TO));
        alP3.add((Button)findViewById(R.id.btnP3PF));
        alP3.add((Button)findViewById(R.id.btnP3PTS));

        //LIST POPULATION FOR PLAYER4
        alP4.add((Button)findViewById(R.id.btnP4FGM));
        alP4.add((Button)findViewById(R.id.btnP4FGA));
        alP4.add((Button)findViewById(R.id.btnP43PM));
        alP4.add((Button)findViewById(R.id.btnP43PA));
        alP4.add((Button)findViewById(R.id.btnP4FTM));
        alP4.add((Button)findViewById(R.id.btnP4FTA));
        alP4.add((Button)findViewById(R.id.btnP4REB));
        alP4.add((Button)findViewById(R.id.btnP4AST));
        alP4.add((Button)findViewById(R.id.btnP4STL));
        alP4.add((Button)findViewById(R.id.btnP4TO));
        alP4.add((Button)findViewById(R.id.btnP4PF));
        alP4.add((Button)findViewById(R.id.btnP4PTS));

        //LIST POPULATION FOR PLAYER5
        alP5.add((Button)findViewById(R.id.btnP5FGM));
        alP5.add((Button)findViewById(R.id.btnP5FGA));
        alP5.add((Button)findViewById(R.id.btnP53PM));
        alP5.add((Button)findViewById(R.id.btnP53PA));
        alP5.add((Button)findViewById(R.id.btnP5FTM));
        alP5.add((Button)findViewById(R.id.btnP5FTA));
        alP5.add((Button)findViewById(R.id.btnP5REB));
        alP5.add((Button)findViewById(R.id.btnP5AST));
        alP5.add((Button)findViewById(R.id.btnP5STL));
        alP5.add((Button)findViewById(R.id.btnP5TO));
        alP5.add((Button)findViewById(R.id.btnP5PF));
        alP5.add((Button)findViewById(R.id.btnP5PTS));

        //LIST POPULATION FOR PLAYER6
        alP6.add((Button)findViewById(R.id.btnP6FGM));
        alP6.add((Button)findViewById(R.id.btnP6FGA));
        alP6.add((Button)findViewById(R.id.btnP63PM));
        alP6.add((Button)findViewById(R.id.btnP63PA));
        alP6.add((Button)findViewById(R.id.btnP6FTM));
        alP6.add((Button)findViewById(R.id.btnP6FTA));
        alP6.add((Button)findViewById(R.id.btnP6REB));
        alP6.add((Button)findViewById(R.id.btnP6AST));
        alP6.add((Button)findViewById(R.id.btnP6STL));
        alP6.add((Button)findViewById(R.id.btnP6TO));
        alP6.add((Button)findViewById(R.id.btnP6PF));
        alP6.add((Button)findViewById(R.id.btnP6PTS));

        //LIST POPULATION FOR PLAYER7
        alP7.add((Button)findViewById(R.id.btnP7FGM));
        alP7.add((Button)findViewById(R.id.btnP7FGA));
        alP7.add((Button)findViewById(R.id.btnP73PM));
        alP7.add((Button)findViewById(R.id.btnP73PA));
        alP7.add((Button)findViewById(R.id.btnP7FTM));
        alP7.add((Button)findViewById(R.id.btnP7FTA));
        alP7.add((Button)findViewById(R.id.btnP7REB));
        alP7.add((Button)findViewById(R.id.btnP7AST));
        alP7.add((Button)findViewById(R.id.btnP7STL));
        alP7.add((Button)findViewById(R.id.btnP7TO));
        alP7.add((Button)findViewById(R.id.btnP7PF));
        alP7.add((Button)findViewById(R.id.btnP7PTS));

        //LIST POPULATION FOR PLAYER8
        alP8.add((Button)findViewById(R.id.btnP8FGM));
        alP8.add((Button)findViewById(R.id.btnP8FGA));
        alP8.add((Button)findViewById(R.id.btnP83PM));
        alP8.add((Button)findViewById(R.id.btnP83PA));
        alP8.add((Button)findViewById(R.id.btnP8FTM));
        alP8.add((Button)findViewById(R.id.btnP8FTA));
        alP8.add((Button)findViewById(R.id.btnP8REB));
        alP8.add((Button)findViewById(R.id.btnP8AST));
        alP8.add((Button)findViewById(R.id.btnP8STL));
        alP8.add((Button)findViewById(R.id.btnP8TO));
        alP8.add((Button)findViewById(R.id.btnP8PF));
        alP8.add((Button)findViewById(R.id.btnP8PTS));

        //PUT ALL LISTS INTO LIST FOR EASY ITERATION
        button_lists.add(alP1);
        button_lists.add(alP2);
        button_lists.add(alP3);
        button_lists.add(alP4);
        button_lists.add(alP5);
        button_lists.add(alP6);
        button_lists.add(alP7);
        button_lists.add(alP8);
    }






    public void button_pressed(View view) {

        bp = (Button)findViewById(view.getId());
         bp.setOnLongClickListener(new View.OnLongClickListener() {
             @Override
             public boolean onLongClick(View view) {
                 bp = (Button)findViewById(view.getId());
                 switch(bp.getId()){
                     case R.id.btnP1FGM:
                         if (Integer.valueOf(bp.getText().toString())>0) {
                             decrement((Button) findViewById(R.id.btnP1FGA), 1);
                             decrement((Button) findViewById(R.id.btnP1PTS), 2);
                         }
                         break;
                     case R.id.btnP1FTM:
                         if (Integer.valueOf(bp.getText().toString())>0) {
                             decrement((Button) findViewById(R.id.btnP1FTA), 1);
                             decrement((Button) findViewById(R.id.btnP1PTS), 1);
                         }
                         break;
                     case R.id.btnP13PA:
                         if (Integer.valueOf(bp.getText().toString())>0) {
                             decrement((Button) findViewById(R.id.btnP1FGA), 1);
                         }
                         break;
                     case R.id.btnP13PM:
                         if (Integer.valueOf(bp.getText().toString())>0) {
                             decrement((Button) findViewById(R.id.btnP13PA), 1);
                             decrement((Button) findViewById(R.id.btnP1FGA), 1);
                             decrement((Button) findViewById(R.id.btnP1FGM), 1);
                             decrement((Button) findViewById(R.id.btnP1PTS), 3);
                         }
                         break;
                     case R.id.btnP2FGM:
                         if (Integer.valueOf(bp.getText().toString())>0) {
                             decrement((Button) findViewById(R.id.btnP2FGA), 1);
                             decrement((Button) findViewById(R.id.btnP2PTS), 2);
                         }
                         break;
                     case R.id.btnP2FTM:
                         if (Integer.valueOf(bp.getText().toString())>0) {
                             decrement((Button) findViewById(R.id.btnP2FTA), 1);
                             decrement((Button) findViewById(R.id.btnP2PTS), 1);
                         }
                         break;
                     case R.id.btnP23PA:
                         if (Integer.valueOf(bp.getText().toString())>0) {
                             decrement((Button) findViewById(R.id.btnP2FGA), 1);
                         }
                         break;
                     case R.id.btnP23PM:
                         if (Integer.valueOf(bp.getText().toString())>0) {
                             decrement((Button) findViewById(R.id.btnP23PA), 1);
                             decrement((Button) findViewById(R.id.btnP2FGA), 1);
                             decrement((Button) findViewById(R.id.btnP2FGM), 1);
                             decrement((Button) findViewById(R.id.btnP2PTS), 3);
                         }
                         break;
                     case R.id.btnP3FGM:
                         if (Integer.valueOf(bp.getText().toString())>0) {
                             decrement((Button) findViewById(R.id.btnP3FGA), 1);
                             decrement((Button) findViewById(R.id.btnP3PTS), 2);
                         }
                         break;
                     case R.id.btnP3FTM:
                         if (Integer.valueOf(bp.getText().toString())>0) {
                             decrement((Button) findViewById(R.id.btnP3FTA), 1);
                             decrement((Button) findViewById(R.id.btnP3PTS), 1);
                         }
                         break;
                     case R.id.btnP33PA:
                         if (Integer.valueOf(bp.getText().toString())>0) {
                             decrement((Button) findViewById(R.id.btnP3FGA), 1);
                         }
                         break;
                     case R.id.btnP33PM:
                         if (Integer.valueOf(bp.getText().toString())>0) {
                             decrement((Button) findViewById(R.id.btnP33PA), 1);
                             decrement((Button) findViewById(R.id.btnP3FGA), 1);
                             decrement((Button) findViewById(R.id.btnP3FGM), 1);
                             decrement((Button) findViewById(R.id.btnP3PTS), 3);
                         }
                         break;
                     case R.id.btnP4FGM:
                         if (Integer.valueOf(bp.getText().toString())>0) {
                             decrement((Button) findViewById(R.id.btnP4FGA), 1);
                             decrement((Button) findViewById(R.id.btnP4PTS), 2);
                         }
                         break;
                     case R.id.btnP4FTM:
                         if (Integer.valueOf(bp.getText().toString())>0) {
                             decrement((Button) findViewById(R.id.btnP4FTA), 1);
                             decrement((Button) findViewById(R.id.btnP4PTS), 1);
                         }
                         break;
                     case R.id.btnP43PA:
                         if (Integer.valueOf(bp.getText().toString())>0) {
                             decrement((Button) findViewById(R.id.btnP4FGA), 1);
                         }
                         break;
                     case R.id.btnP43PM:
                         if (Integer.valueOf(bp.getText().toString())>0) {
                             decrement((Button) findViewById(R.id.btnP43PA), 1);
                             decrement((Button) findViewById(R.id.btnP4FGA), 1);
                             decrement((Button) findViewById(R.id.btnP4FGM), 1);
                             decrement((Button) findViewById(R.id.btnP4PTS), 3);
                         }
                         break;
                     case R.id.btnP5FGM:
                         if (Integer.valueOf(bp.getText().toString())>0) {
                             decrement((Button) findViewById(R.id.btnP5FGA), 1);
                             decrement((Button) findViewById(R.id.btnP5PTS), 2);
                         }
                         break;
                     case R.id.btnP5FTM:
                         if (Integer.valueOf(bp.getText().toString())>0) {
                             decrement((Button) findViewById(R.id.btnP5FTA), 1);
                             decrement((Button) findViewById(R.id.btnP5PTS), 1);
                         }
                         break;
                     case R.id.btnP53PA:
                         if (Integer.valueOf(bp.getText().toString())>0) {
                             decrement((Button) findViewById(R.id.btnP5FGA), 1);
                         }
                         break;
                     case R.id.btnP53PM:
                         if (Integer.valueOf(bp.getText().toString())>0) {
                             decrement((Button) findViewById(R.id.btnP53PA), 1);
                             decrement((Button) findViewById(R.id.btnP5FGA), 1);
                             decrement((Button) findViewById(R.id.btnP5FGM), 1);
                             decrement((Button) findViewById(R.id.btnP5PTS), 3);
                         }
                         break;
                     case R.id.btnP6FGM:
                         if (Integer.valueOf(bp.getText().toString())>0) {
                             decrement((Button) findViewById(R.id.btnP6FGA), 1);
                             decrement((Button) findViewById(R.id.btnP6PTS), 2);
                         }
                         break;
                     case R.id.btnP6FTM:
                         if (Integer.valueOf(bp.getText().toString())>0) {
                             decrement((Button) findViewById(R.id.btnP6FTA), 1);
                             decrement((Button) findViewById(R.id.btnP6PTS), 1);
                         }
                         break;
                     case R.id.btnP63PA:
                         if (Integer.valueOf(bp.getText().toString())>0) {
                             decrement((Button) findViewById(R.id.btnP6FGA), 1);
                         }
                         break;
                     case R.id.btnP63PM:
                         if (Integer.valueOf(bp.getText().toString())>0) {
                             decrement((Button) findViewById(R.id.btnP63PA), 1);
                             decrement((Button) findViewById(R.id.btnP6FGA), 1);
                             decrement((Button) findViewById(R.id.btnP6FGM), 1);
                             decrement((Button) findViewById(R.id.btnP6PTS), 3);
                         }
                         break;
                     case R.id.btnP7FGM:
                         if (Integer.valueOf(bp.getText().toString())>0) {
                             decrement((Button) findViewById(R.id.btnP7FGA), 1);
                             decrement((Button) findViewById(R.id.btnP7PTS), 2);
                         }
                         break;
                     case R.id.btnP7FTM:
                         if (Integer.valueOf(bp.getText().toString())>0) {
                             decrement((Button) findViewById(R.id.btnP7FTA), 1);
                             decrement((Button) findViewById(R.id.btnP7PTS), 1);
                         }
                         break;
                     case R.id.btnP73PA:
                         if (Integer.valueOf(bp.getText().toString())>0) {
                             decrement((Button) findViewById(R.id.btnP7FGA), 1);
                         }
                         break;
                     case R.id.btnP73PM:
                         if (Integer.valueOf(bp.getText().toString())>0) {
                             decrement((Button) findViewById(R.id.btnP73PA), 1);
                             decrement((Button) findViewById(R.id.btnP7FGA), 1);
                             decrement((Button) findViewById(R.id.btnP7FGM), 1);
                             decrement((Button) findViewById(R.id.btnP7PTS), 3);
                         }
                         break;
                     case R.id.btnP8FGM:
                         if (Integer.valueOf(bp.getText().toString())>0) {
                             decrement((Button) findViewById(R.id.btnP8FGA), 1);
                             decrement((Button) findViewById(R.id.btnP8PTS), 2);
                         }
                         break;
                     case R.id.btnP8FTM:
                         if (Integer.valueOf(bp.getText().toString())>0) {
                             decrement((Button) findViewById(R.id.btnP8FTA), 1);
                             decrement((Button) findViewById(R.id.btnP8PTS), 1);
                         }
                         break;
                     case R.id.btnP83PA:
                         if (Integer.valueOf(bp.getText().toString())>0) {
                             decrement((Button) findViewById(R.id.btnP8FGA), 1);
                         }
                         break;
                     case R.id.btnP83PM:
                         if (Integer.valueOf(bp.getText().toString())>0) {
                             decrement((Button) findViewById(R.id.btnP83PA), 1);
                             decrement((Button) findViewById(R.id.btnP8FGA), 1);
                             decrement((Button) findViewById(R.id.btnP8FGM), 1);
                             decrement((Button) findViewById(R.id.btnP8PTS), 3);
                         }
                         break;

                 }
                 if (Integer.valueOf(bp.getText().toString())>0) {
                     decrement(bp, 1);
                 }
                 return true;
             }
         });

        switch(bp.getId()){
            case R.id.btnP1FGM:
                increment((Button)findViewById(R.id.btnP1FGA),1);
                increment((Button)findViewById(R.id.btnP1PTS),2);
                break;
            case R.id.btnP1FTM:
                increment((Button)findViewById(R.id.btnP1FTA),1);
                increment((Button)findViewById(R.id.btnP1PTS),1);
                break;
            case R.id.btnP13PA:
                increment((Button)findViewById(R.id.btnP1FGA),1);
                break;
            case R.id.btnP13PM:
                increment((Button)findViewById(R.id.btnP13PA),1);
                increment((Button)findViewById(R.id.btnP1FGA),1);
                increment((Button)findViewById(R.id.btnP1FGM),1);
                increment((Button)findViewById(R.id.btnP1PTS),3);
                break;
            case R.id.btnP2FGM:
                increment((Button)findViewById(R.id.btnP2FGA),1);
                increment((Button)findViewById(R.id.btnP2PTS),2);
                break;
            case R.id.btnP2FTM:
                increment((Button)findViewById(R.id.btnP2FTA),1);
                increment((Button)findViewById(R.id.btnP2PTS),1);
                break;
            case R.id.btnP23PA:
                increment((Button)findViewById(R.id.btnP2FGA),1);
                break;
            case R.id.btnP23PM:
                increment((Button)findViewById(R.id.btnP23PA),1);
                increment((Button)findViewById(R.id.btnP2FGA),1);
                increment((Button)findViewById(R.id.btnP2FGM),1);
                increment((Button)findViewById(R.id.btnP2PTS),3);
                break;
            case R.id.btnP3FGM:
                increment((Button)findViewById(R.id.btnP3FGA),1);
                increment((Button)findViewById(R.id.btnP3PTS),2);
                break;
            case R.id.btnP3FTM:
                increment((Button)findViewById(R.id.btnP3FTA),1);
                increment((Button)findViewById(R.id.btnP3PTS),1);
                break;
            case R.id.btnP33PA:
                increment((Button)findViewById(R.id.btnP3FGA),1);
                break;
            case R.id.btnP33PM:
                increment((Button)findViewById(R.id.btnP33PA),1);
                increment((Button)findViewById(R.id.btnP3FGA),1);
                increment((Button)findViewById(R.id.btnP3FGM),1);
                increment((Button)findViewById(R.id.btnP3PTS),3);
                break;
            case R.id.btnP4FGM:
                increment((Button)findViewById(R.id.btnP4FGA),1);
                increment((Button)findViewById(R.id.btnP4PTS),2);
                break;
            case R.id.btnP4FTM:
                increment((Button)findViewById(R.id.btnP4FTA),1);
                increment((Button)findViewById(R.id.btnP4PTS),1);
                break;
            case R.id.btnP43PA:
                increment((Button)findViewById(R.id.btnP4FGA),1);
                break;
            case R.id.btnP43PM:
                increment((Button)findViewById(R.id.btnP43PA),1);
                increment((Button)findViewById(R.id.btnP4FGA),1);
                increment((Button)findViewById(R.id.btnP4FGM),1);
                increment((Button)findViewById(R.id.btnP4PTS),3);
                break;
            case R.id.btnP5FGM:
                increment((Button)findViewById(R.id.btnP5FGA),1);
                increment((Button)findViewById(R.id.btnP5PTS),2);
                break;
            case R.id.btnP5FTM:
                increment((Button)findViewById(R.id.btnP5FTA),1);
                increment((Button)findViewById(R.id.btnP5PTS),1);
                break;
            case R.id.btnP53PA:
                increment((Button)findViewById(R.id.btnP5FGA),1);
                break;
            case R.id.btnP53PM:
                increment((Button)findViewById(R.id.btnP53PA),1);
                increment((Button)findViewById(R.id.btnP5FGA),1);
                increment((Button)findViewById(R.id.btnP5FGM),1);
                increment((Button)findViewById(R.id.btnP5PTS),3);
                break;
            case R.id.btnP6FGM:
                increment((Button)findViewById(R.id.btnP6FGA),1);
                increment((Button)findViewById(R.id.btnP6PTS),2);
                break;
            case R.id.btnP6FTM:
                increment((Button)findViewById(R.id.btnP6FTA),1);
                increment((Button)findViewById(R.id.btnP6PTS),1);
                break;
            case R.id.btnP63PA:
                increment((Button)findViewById(R.id.btnP6FGA),1);
                break;
            case R.id.btnP63PM:
                increment((Button)findViewById(R.id.btnP63PA),1);
                increment((Button)findViewById(R.id.btnP6FGA),1);
                increment((Button)findViewById(R.id.btnP6FGM),1);
                increment((Button)findViewById(R.id.btnP6PTS),3);
                break;
            case R.id.btnP7FGM:
                increment((Button)findViewById(R.id.btnP7FGA),1);
                increment((Button)findViewById(R.id.btnP7PTS),2);
                break;
            case R.id.btnP7FTM:
                increment((Button)findViewById(R.id.btnP7FTA),1);
                increment((Button)findViewById(R.id.btnP7PTS),1);
                break;
            case R.id.btnP73PA:
                increment((Button)findViewById(R.id.btnP7FGA),1);
                break;
            case R.id.btnP73PM:
                increment((Button)findViewById(R.id.btnP73PA),1);
                increment((Button)findViewById(R.id.btnP7FGA),1);
                increment((Button)findViewById(R.id.btnP7FGM),1);
                increment((Button)findViewById(R.id.btnP7PTS),3);
                break;
            case R.id.btnP8FGM:
                increment((Button)findViewById(R.id.btnP8FGA),1);
                increment((Button)findViewById(R.id.btnP8PTS),2);
                break;
            case R.id.btnP8FTM:
                increment((Button)findViewById(R.id.btnP8FTA),1);
                increment((Button)findViewById(R.id.btnP8PTS),1);
                break;
            case R.id.btnP83PA:
                increment((Button)findViewById(R.id.btnP8FGA),1);
                break;
            case R.id.btnP83PM:
                increment((Button)findViewById(R.id.btnP83PA),1);
                increment((Button)findViewById(R.id.btnP8FGA),1);
                increment((Button)findViewById(R.id.btnP8FGM),1);
                increment((Button)findViewById(R.id.btnP8PTS),3);
                break;
            case R.id.btnSave:
                //System.out.println(isExternalStorageWritable());

                saver(alP1, (TextView)findViewById(R.id.lblPlayer1), view);
                saver(alP2, (TextView)findViewById(R.id.lblPlayer2), view);
                saver(alP3, (TextView)findViewById(R.id.lblPlayer3), view);
                saver(alP4, (TextView)findViewById(R.id.lblPlayer4), view);
                saver(alP5, (TextView)findViewById(R.id.lblPlayer5), view);
                saver(alP6, (TextView)findViewById(R.id.lblPlayer6), view);
                saver(alP7, (TextView)findViewById(R.id.lblPlayer7), view);
                saver(alP8, (TextView)findViewById(R.id.lblPlayer8), view);
                NewPlayer();


                break;

        }
        if (bp!=(Button)findViewById(R.id.btnSave))
        increment(bp,1);



    }

    private void increment(Button b, Integer val)    {
        b.setText(String.valueOf(Integer.valueOf(b.getText().toString())+val));

    }
    private void decrement(Button b, Integer val)    {

            b.setText(String.valueOf(Integer.valueOf(b.getText().toString())-val));

    }

    public boolean isExternalStorageWritable() {
        String state = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(state)) {
            return true;
        }
        return false;
    }

    private void saver(ArrayList<Button> al, TextView tv, View v) {
        StringBuilder lineData = new StringBuilder();


        lineData.append(tv.getText().toString());
            for (Button b : al) {
                lineData.append(",");
                lineData.append(b.getText().toString());
            }
            lineData.append("\n");




        File store = Environment.getExternalStorageDirectory();
        String path = store.getAbsolutePath()+File.separator+"StatMan Data"+File.separator+"statmandata.txt";
        File savefile = new File(path);
        savefile.getParentFile().mkdirs();
        System.out.println(path);

        try {
            savefile.createNewFile();
            FileOutputStream fout = new FileOutputStream(savefile, true);
            OutputStreamWriter out = new OutputStreamWriter(fout);
            out.write(lineData.toString());
            out.close();
            fout.close();
            Toast.makeText(this, "File saved", Toast.LENGTH_LONG).show();
                    }
        catch (IOException e) {
            Log.e("Exception", "File write failed: " + e.toString());

        }




    }

    public String BuildPlayerID(){
        StringBuilder new_id = new StringBuilder("P");
        new_id.append(9);//IMPLEMENT A PLAYER COUNT AND USE THAT NUMBER INSTEAD
        return new_id.toString();
    }


    private void NewPlayer(){
        TableLayout tl;
        TableRow tr = new TableRow(this);
        Button b1 = new Button(this);Button b4 = new Button(this);Button b7 = new Button(this);Button b10 = new Button(this);
        Button b2= new Button(this);Button b5 = new Button(this);Button b8 = new Button(this);Button b11 = new Button(this);
        Button b3 = new Button(this);Button b6 = new Button(this);Button b9 = new Button(this);Button b12 = new Button(this);
        TextView tv = new TextView(this);

        b1.setText("0");b7.setText("0");//getfield from player class
        b2.setText("0");b8.setText("0");
        b3.setText("0");b9.setText("0");
        b4.setText("0");b10.setText("0");
        b5.setText("0");b11.setText("0");
        b6.setText("0");b12.setText("0");



        tv.setText("NEW PLAYERS NAME");


        tl = (TableLayout)findViewById(R.id.tblPlayers);
       // tr.setId(TableRow.generateViewId());
        tr.addView(tv);tr.addView(b1);tr.addView(b2);tr.addView(b3);tr.addView(b4);tr.addView(b5);tr.addView(b6);
        tr.addView(b7);tr.addView(b8);tr.addView(b9);tr.addView(b10);tr.addView(b11);tr.addView(b12);
        tl.addView(tr);
        //ViewGroup.LayoutParams lp = new TableRow.LayoutParams(android.widget.TableRow.LayoutParams.WRAP_CONTENT,android.widget.TableRow.LayoutParams.MATCH_PARENT);
        //b1.setLayoutParams(lp);
        //trying to get button resizer to work out

        //this is a new comment line done on macbook

    }



}
