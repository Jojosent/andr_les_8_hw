package com.example.les1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton rb_excelent, rb_good, rb_nice, rb_poor;
    CheckBox cb_football, cb_volleyball, cb_tennis, cb_basketball;
    Button btnJberu;
    String radioSSS, checkS1,checkS2,checkS3,checkS4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.les7_homewokr);

        rb_excelent = findViewById(R.id.rb_excelent);
        rb_good = findViewById(R.id.rb_good);
        rb_nice = findViewById(R.id.rb_nice);
        rb_poor = findViewById(R.id.rb_poor);

        cb_football = findViewById(R.id.cb_football);
        cb_volleyball = findViewById(R.id.cb_volleyball);
        cb_tennis = findViewById(R.id.cb_tennis);
        cb_basketball = findViewById(R.id.cb_basketball);

        btnJberu = findViewById(R.id.btnJberu);

        btnJberu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(rb_excelent.isChecked()){
                    radioSSS = "Selected Radio Button: " + rb_excelent.getText();
                }else if(rb_good.isChecked()){
                    radioSSS = "Selected Radio Button: " + rb_good.getText();
                }else if(rb_nice.isChecked()){
                    radioSSS = "Selected Radio Button: " + rb_nice.getText();
                }else if(rb_poor.isChecked()){
                    radioSSS = "Selected Radio Button: " + rb_poor.getText();
                }


                if(cb_football.isChecked()){
                    checkS1 = cb_football.getText() + ": Yes";
                }else{
                    checkS1 = cb_football.getText() +":No";
                }


                if(cb_volleyball.isChecked()){
                    checkS2 = cb_volleyball.getText() +":Yes";
                }else{
                    checkS2 = cb_volleyball.getText() +":No";
                }


                if(cb_tennis.isChecked()){
                    checkS3 = cb_tennis.getText() +":Yes";
                }else{
                    checkS3 = cb_tennis.getText() +":No";
                }


                if(cb_basketball.isChecked()){
                    checkS4 = cb_basketball.getText() +":Yes";
                }else{
                    checkS4 = cb_basketball.getText() +":No";
                }


                String result = radioSSS + "\n"+
                        "Checkbox Choices:" + "\n"+
                        checkS1 + "\n"+
                        checkS2+"\n"+
                        checkS3+"\n"+
                        checkS4+"\n";
                Toast.makeText(MainActivity.this,result,Toast.LENGTH_LONG).show();
            }
        });
    }
}