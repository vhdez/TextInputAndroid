package sla.org.tryagain;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Controller {
    private TextView myTextView;
    private EditText myEditText;
    private Button myButton;

    Controller(TextView textView, final EditText editText, Button button) {
        myTextView = textView;
        myEditText = editText;
        myButton = button;

        myEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                updateText();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearBothTexts();
            }
        });
    }

    void updateText() {
        myTextView.setText(myEditText.getText());
    }

    void clearBothTexts() {
        myEditText.setText("");
        myTextView.setText("");
    }


}
