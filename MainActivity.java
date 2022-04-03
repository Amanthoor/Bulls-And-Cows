package com.example.myapplicationbac;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;

import zero.BAC;
import zero.BACUser;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    BACUser[] bacUsers = new BACUser[0];
    int accountNum = 0;

    public void createAccount(View v){
        EditText nameView = (EditText) findViewById(R.id.nameBox);
        String nameS = nameView.getText().toString();

        BACUser user1 = new BACUser(nameS);

        bacUsers = BAC.addBACUserArray(bacUsers, user1);
        accountNum++;

        String tips = "Hello! " + nameS;
        ((TextView) findViewById(R.id.tips)).setText(tips);
    }

    public void finish(View v){
        if (bacUsers.length == 0){
            String tips = "Please create an account!";
            ((TextView) findViewById(R.id.tips)).setText(tips);
        }else{
            //accountNum++;
            String tips = "Good Bye!" + "\nPlease create a new account!";
            ((TextView) findViewById(R.id.tips)).setText(tips);
            countE = 0;
            countN = 0;
            countH = 0;
        }

    }


    int countE = 0;
    public void buttonClickedEasy(View v){

        if (bacUsers.length == 0){
            String tips = "Please create an account!";
            ((TextView) findViewById(R.id.tips)).setText(tips);
        }else if (countE == 0){
            String tip1 = bacUsers[accountNum-1].guessNumEasy();
            ((TextView) findViewById(R.id.tips)).setText(tip1);
            countE++;
        }else{

            EditText inputView = (EditText) findViewById(R.id.inputBox);
            String inputS = inputView.getText().toString();

            if ("".equals(inputS)){
                String tips = "Please enter an integer between 1 and 10!";
                ((TextView) findViewById(R.id.tips)).setText(tips);
            }else{
                int inputInt = BAC.toInt(inputS);

                String tips = bacUsers[accountNum-1].guessNumEasy(inputInt);
                ((TextView) findViewById(R.id.tips)).setText(tips);
            }

        }
    }

    int countN = 0;
    public void buttonClickedNormal(View v){

        if (bacUsers.length == 0){
            String tips = "Please create an account!";
            ((TextView) findViewById(R.id.tips)).setText(tips);
        }else if (countN == 0){
            String tip1 = bacUsers[accountNum-1].guessNumNor();
            ((TextView) findViewById(R.id.tips)).setText(tip1);
            countN++;
        }else{

            EditText inputView = (EditText) findViewById(R.id.inputBox);
            String inputS = inputView.getText().toString();

            if ("".equals(inputS)){
                String tips = "Please enter an integer between 1 and 50!";
                ((TextView) findViewById(R.id.tips)).setText(tips);
            }else{
                int inputInt = BAC.toInt(inputS);

                String tips = bacUsers[accountNum-1].guessNumNor(inputInt);
                ((TextView) findViewById(R.id.tips)).setText(tips);
            }
        }
    }

    int countH = 0;
    public void buttonClickedHard(View v){

        if (bacUsers.length == 0){
            String tips = "Please create an account!";
            ((TextView) findViewById(R.id.tips)).setText(tips);
        }else if (countH == 0){
            String tip1 = bacUsers[accountNum-1].guessNumHard();
            ((TextView) findViewById(R.id.tips)).setText(tip1);
            countH++;
        }else{
            EditText inputView = (EditText) findViewById(R.id.inputBox);
            String inputS = inputView.getText().toString();

            if ("".equals(inputS)){
                String tips = "Please enter an integer between 1 and 100!";
                ((TextView) findViewById(R.id.tips)).setText(tips);
            }else{
                int inputInt = BAC.toInt(inputS);

                String tips = bacUsers[accountNum-1].guessNumHard(inputInt);
                ((TextView) findViewById(R.id.tips)).setText(tips);
            }
        }
    }


    public void ranking(View v){

        if (bacUsers.length == 0){
            String tips = "Please create an account!";
            ((TextView) findViewById(R.id.tips)).setText(tips);
        }else{
            Arrays.sort(bacUsers);
            String rk = "";
            for (int i = bacUsers.length - 1; i >= 0; i--){
                rk += bacUsers[i].getName() + " score: " + bacUsers[i].getScore() + "\n";
            }
            ((TextView) findViewById(R.id.rankingBox)).setText(rk);
        }
    }

}

