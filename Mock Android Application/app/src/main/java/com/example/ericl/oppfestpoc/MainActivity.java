package com.example.ericl.oppfestpoc;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button items_button, expiry_button, receipt_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items_button = (Button) findViewById(R.id.items);
        expiry_button = (Button) findViewById(R.id.expiry);
        receipt_button = (Button) findViewById(R.id.receipts);

        items_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openitems();
            }
        });

        expiry_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openexpiry();
            }
        });

        receipt_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openreceipt();
            }
        });
    }

    public void openitems() {
        Intent intent = new Intent(this, items.class);
        startActivity(intent);
    }

    public void openexpiry() {
        Intent intent = new Intent(this, expiry.class);
        startActivity(intent);
    }

    public void openreceipt() {
        Intent intent = new Intent(this, receipt.class);
            startActivity(intent);
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
