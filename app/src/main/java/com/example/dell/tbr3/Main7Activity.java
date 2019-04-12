package com.example.dell.tbr3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.text.TextUtils;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

public class Main7Activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private LoginActivity.UserLoginTask mAuthTask = null;

    // UI references.
    private AutoCompleteTextView adress;
    private EditText phone;
    private EditText email;
    private EditText password;
    private EditText confirm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        adress=(AutoCompleteTextView) findViewById(R.id.address);
        phone=(EditText) findViewById(R.id.phone);
        email=(EditText) findViewById(R.id.email);
        password=(EditText) findViewById(R.id.password);
        confirm=(EditText) findViewById(R.id.pasconfi);

        Button reg=(Button) findViewById(R.id.reg);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (adress.getText().toString().trim().isEmpty()) {

                    adress.setError("this field is required");
                }
                else if(phone.getText().toString().trim().isEmpty())
                    phone.setError("this field is required");
                else if (email.getText().toString().trim().isEmpty())
                    email.setError("this field is required");
                else if(password.getText().toString().trim().isEmpty())
                    password.setError("this field is required");
                else if(confirm.getText().toString().trim().isEmpty())
                    confirm.setError("this field is required");
                else
                {
                    Intent i5=new Intent(Main7Activity.this,Main6Activity.class);
                    startActivity(i5);
                }


            }
        });



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main7, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        switch (id){
            case R.id.it71:
                Intent i1=new Intent(Main7Activity.this,MainActivity.class);
                startActivity(i1);
                break;
            case R.id.it72:
                Intent i2=new Intent(Main7Activity.this,Main2Activity.class);
                startActivity(i2);
                break;
            case R.id.it73:
                Intent i3=new Intent(Main7Activity.this,Main3Activity.class);
                startActivity(i3);
                break;
            case R.id.it74:
                Intent i4=new Intent(Main7Activity.this,Main4Activity.class);
                startActivity(i4);
                break;
            case R.id.it76:
                Intent i5=new Intent(Main7Activity.this,Main7Activity.class);
                startActivity(i5);
                break;
            case R.id.it75:
                Intent i6=new Intent(Main7Activity.this,Main7Activity.class);
                startActivity(i6);
                break;
        }


            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
