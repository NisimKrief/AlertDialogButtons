package com.example.alertdialogbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Random;

/**
 * Main activity1.

 *  @author	Nisim Doron Krief <nisimandroi@gmail.com>
 *  @version	1.0
 *  @since	28/01/2022 (the date of the package the class was added)
 *  @info Program that uses Alert Dialog, buttons and options menu to show stuff like
 *  Title, message, icon, positive/neutral/negative buttons.*/
public class MainActivity extends AppCompatActivity {

    /**
     * The Adb.
     */
    AlertDialog.Builder adb;
    /**
     * The Ll.
     */
    LinearLayout LL;
    /**
     * The Rand.
     */
    Random rand = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adb = new AlertDialog.Builder(this);
        LL = (LinearLayout) findViewById(R.id.LL);
    }

    /**
     * Alert dialog 1.
     *
     * @param view the view
     */
    public void AlertDialog1(View view) {
        adb.setCancelable(true);

        adb.setTitle("AlertDialog1");
        adb.setMessage("This is the first AlertDialog");
        adb.show();
    }

    /**
     * Alert dialog 2.
     *
     * @param view the view
     */
    public void AlertDialog2(View view) {
        adb.setCancelable(true);
        adb.setTitle("AlertDialog2");
        adb.setMessage("This is the second AlertDialog");
        adb.setIcon(R.drawable.dorel);
        adb.show();
        adb.setIcon(0);
    }

    /**
     * Alert dialog 3.
     *
     * @param view the view
     */
    public void AlertDialog3(View view) {
        adb.setCancelable(false);
        adb.setTitle("AlertDialog3");
        adb.setMessage("This is the third AlertDialog");
        adb.setIcon(R.drawable.dorel);
        adb.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                dialog.cancel();
            }
        });
        adb.show();
        adb.setNegativeButton("", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
            }
        });
        adb.setIcon(0);
    }

    /**
     * Alert dialog 4.
     *
     * @param view the view
     */
    public void AlertDialog4(View view) {
        adb.setCancelable(false);
        adb.setTitle("AlertDialog4");
        adb.setMessage("Change background color");
        adb.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                dialog.cancel();
            }
        });
        adb.setPositiveButton("Random Color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                LL.setBackgroundColor(Color.rgb(rand.nextInt(256),rand.nextInt(256), rand.nextInt(256) ));
            }
        });
        adb.show();
        adb.setNegativeButton("", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
            }
        });
        adb.setPositiveButton("", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
            }
        });
    }

    /**
     * Alert dialog 5.
     *
     * @param view the view
     */
    public void AlertDialog5(View view) {
        adb.setCancelable(false);
        adb.setTitle("AlertDialog4");
        adb.setMessage("Change background color");
        adb.setNegativeButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                dialog.cancel();
            }
        });
        adb.setPositiveButton("Random Color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                LL.setBackgroundColor(Color.rgb(rand.nextInt(256),rand.nextInt(256), rand.nextInt(256) ));
            }
        });
        adb.setNeutralButton("Reset Color", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                LL.setBackgroundColor(Color.WHITE);
            }
        });
        adb.show();
        adb.setNegativeButton("", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
            }
        });
        adb.setPositiveButton("", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
            }
        });
        adb.setNeutralButton("", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getTitle().toString().equals("Credits")){
            Intent Si = new Intent(this,MainActivity2.class);
            startActivity(Si);

        }



        return true;
    }
}