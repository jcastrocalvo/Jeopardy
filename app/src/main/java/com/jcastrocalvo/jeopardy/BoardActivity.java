package com.jcastrocalvo.jeopardy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Joaquin Castro on 11/15/16.
 * Created for Jeopardy
 * Included in Package ${PACKAGE_NAME}
 */

public class BoardActivity extends AppCompatActivity{

    Player playerOne;
    Player playerTwo;

    //history buttons
    private Button HistTwoHundredButton;
    private Button HistFourHundredButton;
    private Button HistSixHundredButton;
    private Button HistEightHundredButton;
    private Button HistThousandButton;

    //english
    private Button EnglishTwoHundredButton;
    private Button EnglishFourHundredButton;
    private Button EnglishSixHundredButton;
    private Button EnglishEightHundredButton;
    private Button EnglishThousandButton;

    //science
    private Button ScienceTwoHundredButton;
    private Button ScienceFourHundredButton;
    private Button ScienceSixHundredButton;
    private Button ScienceEightHundredButton;
    private Button ScienceThousandButton;

    //chemistry
    private Button ChemistryTwoHundredButton;
    private Button ChemistryFourHundredButton;
    private Button ChemistrySixHundredButton;
    private Button ChemistryEightHundredButton;
    private Button ChemistryThousandButton;

    //math
    private Button MathTwoHundredButton;
    private Button MathFourHundredButton;
    private Button MathSixHundredButton;
    private Button MathEightHundredButton;
    private Button MathThousandButton;

    //Literature
    private Button LiteratureTwoHundredButton;
    private Button LiteratureFourHundredButton;
    private Button LiteratureSixHundredButton;
    private Button LiteratureEightHundredButton;
    private Button LiteratureThousandButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gamescreen);
        //get ready to deserialize
        Intent i = getIntent();
        //take them out of the intent so we have their info to pass along
        playerOne = i.getParcelableExtra("Player1");
        playerTwo = i.getParcelableExtra("Player2");

        HistTwoHundredButton = (Button) findViewById(R.id.twoButton);
        HistFourHundredButton = (Button) findViewById(R.id.fourButton);
        HistSixHundredButton = (Button) findViewById(R.id.sixButton);
        HistEightHundredButton = (Button) findViewById(R.id.eightButton);
        HistThousandButton = (Button) findViewById(R.id.tenButton);

        EnglishTwoHundredButton = (Button) findViewById(R.id.thirdview_twoButton);
        EnglishFourHundredButton = (Button) findViewById(R.id.thirdview_fourButton);
        EnglishSixHundredButton = (Button) findViewById(R.id.thirdview_sixButton);
        EnglishEightHundredButton = (Button) findViewById(R.id.thirdview_eightButton);
        EnglishThousandButton = (Button) findViewById(R.id.thirdview_tenButton);

        ScienceTwoHundredButton = (Button) findViewById(R.id.secondview_twoButton);
        ScienceFourHundredButton = (Button) findViewById(R.id.secondview_fourButton);
        ScienceSixHundredButton = (Button) findViewById(R.id.secondview_sixButton);
        ScienceEightHundredButton = (Button) findViewById(R.id.secondview_eightButton);
        ScienceThousandButton = (Button) findViewById(R.id.secondview_tenButton);

        ChemistryTwoHundredButton = (Button) findViewById(R.id.fourthview_twoButton);
        ChemistryFourHundredButton = (Button) findViewById(R.id.fourthview_fourButton);
        ChemistrySixHundredButton = (Button) findViewById(R.id.fourthview_sixButton);
        ChemistryEightHundredButton = (Button) findViewById(R.id.fourthview_eightButton);
        ChemistryThousandButton = (Button) findViewById(R.id.fourthview_tenButton);

        MathTwoHundredButton = (Button) findViewById(R.id.fifthview_twoButton);
        MathFourHundredButton = (Button) findViewById(R.id.fifthview_fourButton);
        MathSixHundredButton = (Button) findViewById(R.id.fifthview_sixButton);
        MathEightHundredButton = (Button) findViewById(R.id.fifthview_eightButton);
        MathThousandButton = (Button) findViewById(R.id.fifthview_tenButton);

        LiteratureTwoHundredButton = (Button) findViewById(R.id.sixthview_twoButton);
        LiteratureFourHundredButton = (Button) findViewById(R.id.sixthview_fourButton);
        LiteratureSixHundredButton = (Button) findViewById(R.id.sixthview_sixButton);
        LiteratureEightHundredButton = (Button) findViewById(R.id.sixthview_eightButton);
        LiteratureThousandButton = (Button) findViewById(R.id.sixthview_tenButton);
    }

    public void HistQuestionTwoHundred(View view){
        //get ready to serialize for the next activity
        Intent intent = new Intent(this, QuestionActivity.class);
        //put them on the intent and send them over!
        intent.putExtra("Player1", playerOne);
        intent.putExtra("Player2", playerTwo);
        intent.putExtra("QuestionScore", 2);
        startActivity(intent);
        HistTwoHundredButton.setVisibility(View.GONE);
    }
}
