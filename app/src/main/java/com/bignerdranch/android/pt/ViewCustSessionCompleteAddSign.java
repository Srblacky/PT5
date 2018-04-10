package com.bignerdranch.android.pt;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class ViewCustSessionCompleteAddSign extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.test5:
                    Intent intent = new Intent(ViewCustSessionCompleteAddSign.this, BillInfoPayment.class);
                    startActivity(intent);
                    break;
                case R.id.test4:
                    Intent intent2 = new Intent(ViewCustSessionCompleteAddSign.this, Camera.class);
                    startActivity(intent2);
                    break;
                case R.id.test1:
                    Intent intent3 = new Intent(ViewCustSessionCompleteAddSign.this, DisplayCustomerListPics.class);
                    startActivity(intent3);
                    break;
                case R.id.test2:
                    Intent intent4 = new Intent(ViewCustSessionCompleteAddSign.this, ReceiptInfo.class);
                    startActivity(intent4);
                    break;
                case R.id.test3:
                    Intent intent5 = new Intent(ViewCustSessionCompleteAddSign.this, ViewCustSessionCompleteAddSign.class);
                    startActivity(intent5);
                    break;
                case R.id.navigation_notifications:
                    Intent intent6 = new Intent(ViewCustSessionCompleteAddSign.this, Main2Activity.class);
                    startActivity(intent6);
                    break;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_cust_session_complete_add_sign);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);//Second es your new xml.
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.navigation_logoff) {
            AlertDialog alertDialog = new AlertDialog.Builder(ViewCustSessionCompleteAddSign.this).create();
            alertDialog.setTitle("Alert");
            alertDialog.setMessage("Logging You Off");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();
            Intent intent = new Intent(ViewCustSessionCompleteAddSign.this, LoginActivity.class);
            startActivity(intent);
            return super.onOptionsItemSelected(item);
        }
        return true;
    }

}
