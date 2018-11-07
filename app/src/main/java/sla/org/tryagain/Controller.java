package sla.org.tryagain;

import android.view.KeyEvent;
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

        myEditText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                myTextView.setText(myEditText.getText());
                return false;
            }
        });

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateWhenButtonPressed();
            }
        });
    }

    void updateWhenButtonPressed() {
        myTextView.setText("");
    }

}
