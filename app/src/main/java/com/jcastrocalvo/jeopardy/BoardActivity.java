package com.jcastrocalvo.jeopardy;

import android.bluetooth.BluetoothDevice;
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
    BluetoothDevice Device;
	QuestionBank bank = new QuestionBank();

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
        Device = i.getParcelableExtra("Device");

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

	//-----------------------------------------------------------
    public void HistQuestionTwoHundred(View view){
        //get ready to serialize for the next activity
        Intent intent = new Intent(this, QuestionActivity.class);
        //put them on the intent and send them over!
        intent.putExtra("Player1", playerOne);
        intent.putExtra("Player2", playerTwo);
        intent.putExtra("QuestionScore", 2);
        intent.putExtra("Device", Device);
	    intent.putExtra("Question", bank.GetHistoryQuestion(2)[0]);
	    intent.putExtra("Answer", bank.GetHistoryQuestion(2)[1]);
        startActivity(intent);
        HistTwoHundredButton.setVisibility(View.GONE);
    }

    public void HistQuestionFourHundred(View view){
        //get ready to serialize for the next activity
        Intent intent = new Intent(this, QuestionActivity.class);
        //put them on the intent and send them over!
        intent.putExtra("Player1", playerOne);
        intent.putExtra("Player2", playerTwo);
        intent.putExtra("QuestionScore", 4);
        intent.putExtra("Device", Device);
	    intent.putExtra("Question", bank.GetHistoryQuestion(4)[0]);
	    intent.putExtra("Answer", bank.GetHistoryQuestion(4)[1]);
        startActivity(intent);
        HistFourHundredButton.setVisibility(View.GONE);
    }

    public void HistQuestionSixHundred(View view){
        //get ready to serialize for the next activity
        Intent intent = new Intent(this, QuestionActivity.class);
        //put them on the intent and send them over!
        intent.putExtra("Player1", playerOne);
        intent.putExtra("Player2", playerTwo);
        intent.putExtra("QuestionScore", 6);
        intent.putExtra("Device", Device);
	    intent.putExtra("Question", bank.GetHistoryQuestion(6)[0]);
	    intent.putExtra("Answer", bank.GetHistoryQuestion(6)[1]);
        startActivity(intent);
        HistSixHundredButton.setVisibility(View.GONE);
    }

    public void HistQuestionEightHundred(View view){
        //get ready to serialize for the next activity
        Intent intent = new Intent(this, QuestionActivity.class);
        //put them on the intent and send them over!
        intent.putExtra("Player1", playerOne);
        intent.putExtra("Player2", playerTwo);
        intent.putExtra("QuestionScore", 8);
        intent.putExtra("Device", Device);
	    intent.putExtra("Question", bank.GetHistoryQuestion(8)[0]);
	    intent.putExtra("Answer", bank.GetHistoryQuestion(8)[1]);
        startActivity(intent);
        HistEightHundredButton.setVisibility(View.GONE);
    }

    public void HistQuestionThousand(View view) {
	    //get ready to serialize for the next activity
	    Intent intent = new Intent(this, QuestionActivity.class);
	    //put them on the intent and send them over!
	    intent.putExtra("Player1", playerOne);
	    intent.putExtra("Player2", playerTwo);
	    intent.putExtra("QuestionScore", 10);
	    intent.putExtra("Device", Device);
	    intent.putExtra("Question", bank.GetHistoryQuestion(10)[0]);
	    intent.putExtra("Answer", bank.GetHistoryQuestion(10)[1]);
	    startActivity(intent);
	    HistThousandButton.setVisibility(View.GONE);
    }
	    //-----------------------------------------------------------

	public void ScienceQuestionTwoHundred(View view){
		//get ready to serialize for the next activity
		Intent intent = new Intent(this, QuestionActivity.class);
		//put them on the intent and send them over!
		intent.putExtra("Player1", playerOne);
		intent.putExtra("Player2", playerTwo);
		intent.putExtra("QuestionScore", 2);
		intent.putExtra("Device", Device);
		intent.putExtra("Question", bank.GetScienceQuestion(2)[0]);
		intent.putExtra("Answer", bank.GetScienceQuestion(2)[1]);
		startActivity(intent);
		ScienceTwoHundredButton.setVisibility(View.GONE);
	}

	public void ScienceQuestionFourHundred(View view){
		//get ready to serialize for the next activity
		Intent intent = new Intent(this, QuestionActivity.class);
		//put them on the intent and send them over!
		intent.putExtra("Player1", playerOne);
		intent.putExtra("Player2", playerTwo);
		intent.putExtra("QuestionScore", 4);
		intent.putExtra("Device", Device);
		intent.putExtra("Question", bank.GetScienceQuestion(4)[0]);
		intent.putExtra("Answer", bank.GetScienceQuestion(4)[1]);
		startActivity(intent);
		ScienceFourHundredButton.setVisibility(View.GONE);
	}

	public void ScienceQuestionSixHundred(View view){
		//get ready to serialize for the next activity
		Intent intent = new Intent(this, QuestionActivity.class);
		//put them on the intent and send them over!
		intent.putExtra("Player1", playerOne);
		intent.putExtra("Player2", playerTwo);
		intent.putExtra("QuestionScore", 6);
		intent.putExtra("Device", Device);
		intent.putExtra("Question", bank.GetScienceQuestion(6)[0]);
		intent.putExtra("Answer", bank.GetScienceQuestion(6)[1]);
		startActivity(intent);
		ScienceSixHundredButton.setVisibility(View.GONE);
	}

	public void ScienceQuestionEightHundred(View view){
		//get ready to serialize for the next activity
		Intent intent = new Intent(this, QuestionActivity.class);
		//put them on the intent and send them over!
		intent.putExtra("Player1", playerOne);
		intent.putExtra("Player2", playerTwo);
		intent.putExtra("QuestionScore", 8);
		intent.putExtra("Device", Device);
		intent.putExtra("Question", bank.GetScienceQuestion(8)[0]);
		intent.putExtra("Answer", bank.GetScienceQuestion(8)[1]);
		startActivity(intent);
		ScienceEightHundredButton.setVisibility(View.GONE);
	}

	public void ScienceQuestionThousand(View view){
		//get ready to serialize for the next activity
		Intent intent = new Intent(this, QuestionActivity.class);
		//put them on the intent and send them over!
		intent.putExtra("Player1", playerOne);
		intent.putExtra("Player2", playerTwo);
		intent.putExtra("QuestionScore", 10);
		intent.putExtra("Device", Device);
		intent.putExtra("Question", bank.GetScienceQuestion(10)[0]);
		intent.putExtra("Answer", bank.GetScienceQuestion(10)[1]);
		startActivity(intent);
		ScienceThousandButton.setVisibility(View.GONE);
    }
	//-----------------------------------------------------------

	public void MathQuestionTwoHundred(View view){
		//get ready to serialize for the next activity
		Intent intent = new Intent(this, QuestionActivity.class);
		//put them on the intent and send them over!
		intent.putExtra("Player1", playerOne);
		intent.putExtra("Player2", playerTwo);
		intent.putExtra("QuestionScore", 2);
		intent.putExtra("Device", Device);
		intent.putExtra("Question", bank.GetMathQuestion(2)[0]);
		intent.putExtra("Answer", bank.GetMathQuestion(2)[1]);
		startActivity(intent);
		MathTwoHundredButton.setVisibility(View.GONE);
	}

	public void MathQuestionFourHundred(View view){
		//get ready to serialize for the next activity
		Intent intent = new Intent(this, QuestionActivity.class);
		//put them on the intent and send them over!
		intent.putExtra("Player1", playerOne);
		intent.putExtra("Player2", playerTwo);
		intent.putExtra("QuestionScore", 4);
		intent.putExtra("Device", Device);
		intent.putExtra("Question", bank.GetMathQuestion(4)[0]);
		intent.putExtra("Answer", bank.GetMathQuestion(4)[1]);
		startActivity(intent);
		MathFourHundredButton.setVisibility(View.GONE);
	}

	public void MathQuestionSixHundred(View view){
		//get ready to serialize for the next activity
		Intent intent = new Intent(this, QuestionActivity.class);
		//put them on the intent and send them over!
		intent.putExtra("Player1", playerOne);
		intent.putExtra("Player2", playerTwo);
		intent.putExtra("QuestionScore", 6);
		intent.putExtra("Device", Device);
		intent.putExtra("Question", bank.GetMathQuestion(6)[0]);
		intent.putExtra("Answer", bank.GetMathQuestion(6)[1]);
		startActivity(intent);
		MathSixHundredButton.setVisibility(View.GONE);
	}

	public void MathQuestionEightHundred(View view){
		//get ready to serialize for the next activity
		Intent intent = new Intent(this, QuestionActivity.class);
		//put them on the intent and send them over!
		intent.putExtra("Player1", playerOne);
		intent.putExtra("Player2", playerTwo);
		intent.putExtra("QuestionScore", 8);
		intent.putExtra("Device", Device);
		intent.putExtra("Question", bank.GetMathQuestion(8)[0]);
		intent.putExtra("Answer", bank.GetMathQuestion(8)[1]);
		startActivity(intent);
		MathEightHundredButton.setVisibility(View.GONE);
	}

	public void MathQuestionThousand(View view){
		//get ready to serialize for the next activity
		Intent intent = new Intent(this, QuestionActivity.class);
		//put them on the intent and send them over!
		intent.putExtra("Player1", playerOne);
		intent.putExtra("Player2", playerTwo);
		intent.putExtra("QuestionScore", 10);
		intent.putExtra("Device", Device);
		intent.putExtra("Question", bank.GetMathQuestion(10)[0]);
		intent.putExtra("Answer", bank.GetMathQuestion(10)[1]);
		startActivity(intent);
		MathThousandButton.setVisibility(View.GONE);
	}
	//-----------------------------------------------------------
	public void EnglishQuestionTwoHundred(View view){
		//get ready to serialize for the next activity
		Intent intent = new Intent(this, QuestionActivity.class);
		//put them on the intent and send them over!
		intent.putExtra("Player1", playerOne);
		intent.putExtra("Player2", playerTwo);
		intent.putExtra("QuestionScore", 2);
		intent.putExtra("Device", Device);
		intent.putExtra("Question", bank.GetEnglishQuestion(2)[0]);
		intent.putExtra("Answer", bank.GetEnglishQuestion(2)[1]);
		startActivity(intent);
		EnglishTwoHundredButton.setVisibility(View.GONE);
	}

	public void EnglishQuestionFourHundred(View view){
		//get ready to serialize for the next activity
		Intent intent = new Intent(this, QuestionActivity.class);
		//put them on the intent and send them over!
		intent.putExtra("Player1", playerOne);
		intent.putExtra("Player2", playerTwo);
		intent.putExtra("QuestionScore", 4);
		intent.putExtra("Device", Device);
		intent.putExtra("Question", bank.GetEnglishQuestion(4)[0]);
		intent.putExtra("Answer", bank.GetEnglishQuestion(4)[1]);
		startActivity(intent);
		EnglishFourHundredButton.setVisibility(View.GONE);
	}

	public void EnglishQuestionSixHundred(View view){
		//get ready to serialize for the next activity
		Intent intent = new Intent(this, QuestionActivity.class);
		//put them on the intent and send them over!
		intent.putExtra("Player1", playerOne);
		intent.putExtra("Player2", playerTwo);
		intent.putExtra("QuestionScore", 6);
		intent.putExtra("Device", Device);
		intent.putExtra("Question", bank.GetEnglishQuestion(6)[0]);
		intent.putExtra("Answer", bank.GetEnglishQuestion(6)[1]);
		startActivity(intent);
		EnglishSixHundredButton.setVisibility(View.GONE);
	}

	public void EnglishQuestionEightHundred(View view){
		//get ready to serialize for the next activity
		Intent intent = new Intent(this, QuestionActivity.class);
		//put them on the intent and send them over!
		intent.putExtra("Player1", playerOne);
		intent.putExtra("Player2", playerTwo);
		intent.putExtra("QuestionScore", 8);
		intent.putExtra("Device", Device);
		intent.putExtra("Question", bank.GetEnglishQuestion(8)[0]);
		intent.putExtra("Answer", bank.GetEnglishQuestion(8)[1]);
		startActivity(intent);
		EnglishEightHundredButton.setVisibility(View.GONE);
	}

	public void EnglishQuestionThousand(View view){
		//get ready to serialize for the next activity
		Intent intent = new Intent(this, QuestionActivity.class);
		//put them on the intent and send them over!
		intent.putExtra("Player1", playerOne);
		intent.putExtra("Player2", playerTwo);
		intent.putExtra("QuestionScore", 10);
		intent.putExtra("Device", Device);
		intent.putExtra("Question", bank.GetEnglishQuestion(10)[0]);
		intent.putExtra("Answer", bank.GetEnglishQuestion(10)[1]);
		startActivity(intent);
		EnglishThousandButton.setVisibility(View.GONE);
	}
	//-----------------------------------------------------------
	public void ChemistryQuestionTwoHundred(View view){
		//get ready to serialize for the next activity
		Intent intent = new Intent(this, QuestionActivity.class);
		//put them on the intent and send them over!
		intent.putExtra("Player1", playerOne);
		intent.putExtra("Player2", playerTwo);
		intent.putExtra("QuestionScore", 2);
		intent.putExtra("Device", Device);
		intent.putExtra("Question", bank.GetChemQuestion(2)[0]);
		intent.putExtra("Answer", bank.GetChemQuestion(2)[1]);
		startActivity(intent);
		ChemistryTwoHundredButton.setVisibility(View.GONE);
	}

	public void ChemistryQuestionFourHundred(View view){
		//get ready to serialize for the next activity
		Intent intent = new Intent(this, QuestionActivity.class);
		//put them on the intent and send them over!
		intent.putExtra("Player1", playerOne);
		intent.putExtra("Player2", playerTwo);
		intent.putExtra("QuestionScore", 4);
		intent.putExtra("Device", Device);
		intent.putExtra("Question", bank.GetChemQuestion(4)[0]);
		intent.putExtra("Answer", bank.GetChemQuestion(4)[1]);
		startActivity(intent);
		ChemistryFourHundredButton.setVisibility(View.GONE);
	}

	public void ChemistryQuestionSixHundred(View view){
		//get ready to serialize for the next activity
		Intent intent = new Intent(this, QuestionActivity.class);
		//put them on the intent and send them over!
		intent.putExtra("Player1", playerOne);
		intent.putExtra("Player2", playerTwo);
		intent.putExtra("QuestionScore", 6);
		intent.putExtra("Device", Device);
		intent.putExtra("Question", bank.GetChemQuestion(6)[0]);
		intent.putExtra("Answer", bank.GetChemQuestion(6)[1]);
		startActivity(intent);
		ChemistrySixHundredButton.setVisibility(View.GONE);
	}

	public void ChemistryQuestionEightHundred(View view){
		//get ready to serialize for the next activity
		Intent intent = new Intent(this, QuestionActivity.class);
		//put them on the intent and send them over!
		intent.putExtra("Player1", playerOne);
		intent.putExtra("Player2", playerTwo);
		intent.putExtra("QuestionScore", 8);
		intent.putExtra("Device", Device);
		intent.putExtra("Question", bank.GetChemQuestion(8)[0]);
		intent.putExtra("Answer", bank.GetChemQuestion(8)[1]);
		startActivity(intent);
		ChemistryEightHundredButton.setVisibility(View.GONE);
	}

	public void ChemistryQuestionThousand(View view){
		//get ready to serialize for the next activity
		Intent intent = new Intent(this, QuestionActivity.class);
		//put them on the intent and send them over!
		intent.putExtra("Player1", playerOne);
		intent.putExtra("Player2", playerTwo);
		intent.putExtra("QuestionScore", 10);
		intent.putExtra("Device", Device);
		intent.putExtra("Question", bank.GetChemQuestion(10)[0]);
		intent.putExtra("Answer", bank.GetChemQuestion(10)[1]);
		startActivity(intent);
		ChemistryThousandButton.setVisibility(View.GONE);
	}
	//-----------------------------------------------------------
	//-----------------------------------------------------------
	public void LitQuestionTwoHundred(View view){
		//get ready to serialize for the next activity
		Intent intent = new Intent(this, QuestionActivity.class);
		//put them on the intent and send them over!
		intent.putExtra("Player1", playerOne);
		intent.putExtra("Player2", playerTwo);
		intent.putExtra("QuestionScore", 2);
		intent.putExtra("Device", Device);
		intent.putExtra("Question", bank.GetLitQuestion(2)[0]);
		intent.putExtra("Answer", bank.GetLitQuestion(2)[1]);
		startActivity(intent);
		LiteratureTwoHundredButton.setVisibility(View.GONE);
	}

	public void LitQuestionFourHundred(View view){
		//get ready to serialize for the next activity
		Intent intent = new Intent(this, QuestionActivity.class);
		//put them on the intent and send them over!
		intent.putExtra("Player1", playerOne);
		intent.putExtra("Player2", playerTwo);
		intent.putExtra("QuestionScore", 4);
		intent.putExtra("Device", Device);
		intent.putExtra("Question", bank.GetLitQuestion(4)[0]);
		intent.putExtra("Answer", bank.GetLitQuestion(4)[1]);
		startActivity(intent);
		LiteratureFourHundredButton.setVisibility(View.GONE);
	}

	public void LitQuestionSixHundred(View view){
		//get ready to serialize for the next activity
		Intent intent = new Intent(this, QuestionActivity.class);
		//put them on the intent and send them over!
		intent.putExtra("Player1", playerOne);
		intent.putExtra("Player2", playerTwo);
		intent.putExtra("QuestionScore", 6);
		intent.putExtra("Device", Device);
		intent.putExtra("Question", bank.GetLitQuestion(6)[0]);
		intent.putExtra("Answer", bank.GetLitQuestion(6)[1]);
		startActivity(intent);
		LiteratureSixHundredButton.setVisibility(View.GONE);
	}

	public void LitQuestionEightHundred(View view){
		//get ready to serialize for the next activity
		Intent intent = new Intent(this, QuestionActivity.class);
		//put them on the intent and send them over!
		intent.putExtra("Player1", playerOne);
		intent.putExtra("Player2", playerTwo);
		intent.putExtra("QuestionScore", 8);
		intent.putExtra("Device", Device);
		intent.putExtra("Question", bank.GetLitQuestion(8)[0]);
		intent.putExtra("Answer", bank.GetLitQuestion(8)[1]);
		startActivity(intent);
		LiteratureEightHundredButton.setVisibility(View.GONE);
	}

	public void LitQuestionThousand(View view){
		//get ready to serialize for the next activity
		Intent intent = new Intent(this, QuestionActivity.class);
		//put them on the intent and send them over!
		intent.putExtra("Player1", playerOne);
		intent.putExtra("Player2", playerTwo);
		intent.putExtra("QuestionScore", 10);
		intent.putExtra("Device", Device);
		intent.putExtra("Question", bank.GetLitQuestion(10)[0]);
		intent.putExtra("Answer", bank.GetLitQuestion(10)[1]);
		startActivity(intent);
		LiteratureThousandButton.setVisibility(View.GONE);
	}
	//-----------------------------------------------------------
}
