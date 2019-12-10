package com.example.sistemas;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private EditText input;
    private Button btnGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (EditText) findViewById(R.id.num);
        btnGo = (Button) findViewById(R.id.vai);

        btnGo.setOnClickListener(new View.OnClickListener() {
            public String str;
            public float num;

            @Override
            public void onClick(View view) {
                str = input.getText().toString().trim();
                Log.e("String ", "str" + str);
                num = 0;
                num = Float.parseFloat(str);
                Log.e("Float ", "float " + num);
                if (num == 1) {
                    Intent i = new Intent(MainActivity.this, c_1.class);
                    startActivity(i);
                }
                else if (num == 2) {
                    Intent i = new Intent(MainActivity.this, c_2.class);
                    startActivity(i);
                }
                else if (num == 3) {
                    Intent i = new Intent(MainActivity.this, c_3.class);
                    startActivity(i);
                }
                else if (num == 4) {
                    Intent i = new Intent(MainActivity.this, c_4.class);
                    startActivity(i);
                }
                else if (num == 5) {
                    Intent i = new Intent(MainActivity.this, c_5.class);
                    startActivity(i);
                }
                else if (num == 6) {
                    Intent i = new Intent(MainActivity.this, c_6.class);
                    startActivity(i);
                }
                else if (num == 7) {
                    Intent i = new Intent(MainActivity.this, c_7.class);
                    startActivity(i);
                }
                else if (num == 8) {
                    Intent i = new Intent(MainActivity.this, c_8.class);
                    startActivity(i);
                }
                else if (num == 9) {
                    Intent i = new Intent(MainActivity.this, c_9.class);
                    startActivity(i);
                }
                else if (num == 9.1f) {
                    Intent i = new Intent(MainActivity.this, c_9_1.class);
                    startActivity(i);
                }
                else if (num == 9.2f) {
                    Intent i = new Intent(MainActivity.this, c_9_2.class);
                    startActivity(i);
                }
                else if (num == 10) {
                    Intent i = new Intent(MainActivity.this, c_10.class);
                    startActivity(i);
                }
                else if (num == 11) {
                    Intent i = new Intent(MainActivity.this, c_11.class);
                    startActivity(i);
                }
                else if (num == 12) {
                    Intent i = new Intent(MainActivity.this, c_12.class);
                    startActivity(i);
                }
                else if (num == 12.1f) {
                    Intent i = new Intent(MainActivity.this, c_12_1.class);
                    startActivity(i);
                }
                else if (num == 12.2f) {
                    Intent i = new Intent(MainActivity.this, c_12_2.class);
                    startActivity(i);
                }
                else if (num == 12.3f) {
                    Intent i = new Intent(MainActivity.this, c_12_3.class);
                    startActivity(i);
                }
                else if (num == 13) {
                    Intent i = new Intent(MainActivity.this, c_13.class);
                    startActivity(i);
                }
                else if (num == 14) {
                    Intent i = new Intent(MainActivity.this, c_14.class);
                    startActivity(i);
                }
                else if (num == 15) {
                    Intent i = new Intent(MainActivity.this, c_15.class);
                    startActivity(i);
                }
                else if (num == 16) {
                    Intent i = new Intent(MainActivity.this, c_16.class);
                    startActivity(i);
                }
                else if (num == 17) {
                    Intent i = new Intent(MainActivity.this, c_17.class);
                    startActivity(i);
                }
                else if (num == 18) {
                    Intent i = new Intent(MainActivity.this, c_18.class);
                    startActivity(i);
                }
                else if (num == 19) {
                    Intent i = new Intent(MainActivity.this, c_19.class);
                    startActivity(i);
                }
                else if (num == 20) {
                    Intent i = new Intent(MainActivity.this, c_20.class);
                    startActivity(i);
                }
                else if (num == 21) {
                    Intent i = new Intent(MainActivity.this, c_21.class);
                    startActivity(i);
                }
                else if (num == 22) {
                    Intent i = new Intent(MainActivity.this, c_22.class);
                    startActivity(i);
                }
                else if (num == 23) {
                    Intent i = new Intent(MainActivity.this, c_23.class);
                    startActivity(i);
                }
                else if (num == 24) {
                    Intent i = new Intent(MainActivity.this, c_24.class);
                    startActivity(i);
                }
                else if (num == 25) {
                    Intent i = new Intent(MainActivity.this, c_25.class);
                    startActivity(i);
                }
                else if (num == 26) {
                    Intent i = new Intent(MainActivity.this, c_26.class);
                    startActivity(i);
                }
                else{
                    Snackbar.make(view, "Não encontrado! Verifique a casa!", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
