package com.app.mgu.emoji;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txt, txtEmoji;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        final EditText edt = (EditText) findViewById(R.id.edtText);

        txt = (EditText) findViewById(R.id.txt);

        txtEmoji = (EditText) findViewById(R.id.txtEmoji);

        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int len = edt.getText().toString().length();
                Character[] array = new Character[len];
                for (int i = 0; i < len ; i++) {
                    array[i] = new Character(edt.getText().toString().charAt(i));

                    System.out.println("Array" + array[i]);

                    if(array[i].equals('H')) {

                     /*   Spannable wordtoSpan = new SpannableString(txtEmoji.getText().toString()
                        +txtEmoji.getText().toString()
                        +txtEmoji.getText().toString()
                        +txtEmoji.getText().toString()
                        +txtEmoji.getText().toString()
                        +txtEmoji.getText().toString()
                        +txtEmoji.getText().toString()
                        +txtEmoji.getText().toString()
                        +txtEmoji.getText().toString());*/

                   //     wordtoSpan.setSpan(new ForegroundColorSpan(Color.TRANSPARENT), 3, 4, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

                       // String input = "<font color=" + "#800000" + ">" + txtEmoji.getText().toString() + "</font>  <font color=" + "#000000" + ">" + txtEmoji.getText().toString() + "</font>";


                        txt.setText(txtEmoji.getText().toString()+txtEmoji.getText().toString()+"                         "+ txtEmoji.getText().toString() +txtEmoji.getText().toString()
                                +"\n"+txtEmoji.getText().toString()+ txtEmoji.getText().toString()+"                         " + txtEmoji.getText().toString() +txtEmoji.getText().toString()+"\n"+txtEmoji.getText().toString()
                        +txtEmoji.getText().toString() +txtEmoji.getText().toString()+txtEmoji.getText().toString()+txtEmoji.getText().toString()+txtEmoji.getText().toString()+txtEmoji.getText().toString()+txtEmoji.getText().toString()+txtEmoji.getText().toString());

                        //txt.setText(Html.fromHtml(input));



                    }
                }
            }
        });
    }
}
