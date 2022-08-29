package br.com.up.example.appwhatssemcontato;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout inputLayoutNumber;
    private TextInputLayout inputLayoutTxtSend;


    private TextInputEditText inputTextNumber;
    private TextInputEditText inputTextTxtSend;


    private Button buttonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_gift);

        inputLayoutNumber = findViewById(R.id.input_layout_number);
        inputLayoutTxtSend = findViewById(R.id.input_layout_txt_send);

        inputTextNumber = findViewById(R.id.input_text_number);
        inputTextTxtSend = findViewById(R.id.input_text_txt_send);


        buttonSend = findViewById(R.id.button_send);

        buttonSend.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String number = inputTextNumber.getText().toString();
                        String text = inputTextTxtSend.getText().toString();

                        Uri webpage = Uri.parse("https://wa.me/"+number+"/?text="+text);
                        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                        startActivity(webIntent);
                    }
                }
        );
    }

}