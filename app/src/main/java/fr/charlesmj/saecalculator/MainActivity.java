package fr.charlesmj.saecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView solutionTv, resultTv;
    MaterialButton button_c, button_open_par, button_close_par, button_division;
    MaterialButton button_seven, button_eight, button_nine, button_plus;
    MaterialButton button_four, button_five, button_six, button_minus;
    MaterialButton button_one, button_two, button_three, button_product;
    MaterialButton button_ac, button_zero, button_point, button_equal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultTv = findViewById(R.id.result_tv);
        solutionTv = findViewById(R.id.solution_tv);

        assignId(button_c, R.id.button_c);
        assignId(button_open_par, R.id.button_open_par);
        assignId(button_close_par, R.id.button_close_par);
        assignId(button_division, R.id.button_division);

        assignId(button_seven, R.id.button_seven);
        assignId(button_eight, R.id.button_eight);
        assignId(button_nine, R.id.button_nine);
        assignId(button_plus, R.id.button_plus);

        assignId(button_four, R.id.button_four);
        assignId(button_five, R.id.button_five);
        assignId(button_six, R.id.button_six);
        assignId(button_minus, R.id.button_minus);

        assignId(button_one, R.id.button_one);
        assignId(button_two, R.id.button_two);
        assignId(button_three, R.id.button_three);
        assignId(button_product, R.id.button_product);

        assignId(button_ac, R.id.button_ac);
        assignId(button_zero, R.id.button_zero);
        assignId(button_point, R.id.button_point);
        assignId(button_equal, R.id.button_equal);

    }

    void assignId(MaterialButton btn, int id){
        btn = findViewById(id);
        btn.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        MaterialButton button =(MaterialButton) view;
        String buttonText = button.getText().toString();
        String dataToCalculate = solutionTv.getText().toString();

        if(buttonText.equals("AC")) {
            solutionTv.setText("");
            resultTv.setText("0");
            return;
        }

        if(buttonText.equals("=")) {
            resultTv.setText(solutionTv.getText());
            return;
        }

        if(buttonText.equals("C")) {
            dataToCalculate = dataToCalculate.substring(0, dataToCalculate.length()-1);
        }else {
            dataToCalculate = dataToCalculate + buttonText;
        }

        solutionTv.setText(dataToCalculate);
    }

    String getResult(String data){
        return "Calculated";
    }
}