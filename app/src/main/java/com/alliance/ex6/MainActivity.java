package com.alliance.ex6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner=findViewById(R.id.spinner);
        final ImageView imageView=findViewById(R.id.image_view);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 1:
                        imageView.setImageResource(R.drawable.image1);
                        msg("image "+position+" selected");

                        break;
                    case 2:
                        imageView.setImageResource(R.drawable.image2);
                        msg("image "+position+" selected");
                        break;
                    case 3:
                        imageView.setImageResource(R.drawable.image3);
                        msg("image "+position+" selected");
                        break;
                    case 4:
                        imageView.setImageResource(R.drawable.image4);
                        msg("image "+position+" selected");
                        break;
                    default:

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(MainActivity.this, "Nothing selected", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void msg(String s) {
        Toast.makeText(this, ""+s, Toast.LENGTH_SHORT).show();
    }

}
