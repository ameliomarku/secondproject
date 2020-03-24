package com.example.secondproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    public boolean onCreateOptionMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        super.onOptionsItemSelected(item);
             switch(item.getItemId()) {
                    case R.id.Location:
                        Intent intent = new Intent(getApplicationContext(), GoogleMaps.class);
                        startActivity(intent);
                        return true;
                    case R.id.help:
                        new AlertDialog.Builder(this)
                                .setIcon(android.R.drawable.ic_dialog_info)
                                .setTitle("Info")
                                .setMessage("You just cliked on the help link!!")
                                .setPositiveButton("Ok",new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClik(DialogInterface dialog, int which) {
                                        Toast.makeText(MainActivity.this, "It's done!", Toast.LENGTH_SHORT).show();
                                    }
                                })
                                .show();
                        return true;
                    default:
                        return false;
                }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
