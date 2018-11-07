package sla.org.tryagain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ButtonUpdatesText extends AppCompatActivity {
    Controller myController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_updates_text);

        TextView tv = findViewById(R.id.topTextView);
        EditText et = findViewById(R.id.updateText);
        Button b = findViewById(R.id.updateButton);

        myController = new Controller(tv, et, b);
    }
}
