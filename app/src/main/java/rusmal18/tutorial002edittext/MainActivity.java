package rusmal18.tutorial002edittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Declaration variable
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //values variable
        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);

        //set Action in button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //set String from Edit Text
                String text = editText.getText().toString();
                Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
