package com.example.dell.tbr3;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;

import com.miguelcatalan.materialsearchview.MaterialSearchView;

public class Main4Activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    MaterialSearchView searchView;

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        recyclerView=(RecyclerView) findViewById(R.id.recycle_view);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new RecyclerAdapter();
        recyclerView.setAdapter(adapter);
        setSupportActionBar(toolbar);
        //Toolbar toolbar1=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("الحالات");
        toolbar.setTitleTextColor(Color.parseColor("#ffffff"));
        searchView=(MaterialSearchView)findViewById(R.id.search_view);
        BottomNavigationView bottomNavigationView=(BottomNavigationView) findViewById(R.id.nav_bottom);
        bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.home:
                        Intent i1=new Intent(Main4Activity.this,MainActivity.class);
                        startActivity(i1);
                        break;
                    case R.id.chat:
                        Intent i2=new Intent(Main4Activity.this,Main9Activity.class);
                        startActivity(i2);
                        break;

                }
            }
        });


       /* ImageView imageView=(ImageView) findViewById(R.id.pop_up2);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i=new Intent(Main4Activity.this,Main5Activity.class);
                startActivity(i);


            }
        });*/
        /*Button b1=(Button) findViewById(R.id.pop_up);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i=new Intent(Main4Activity.this,Main5Activity.class);
                startActivity(i);


            }
        });*/



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }
   /* @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        return true;
    }*/


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
        /*getMenuInflater().inflate(R.menu.main4, menu);
        MenuItem item = menu.findItem(R.id.action_search2);
        searchView.setMenuItem(item);*/
        getMenuInflater().inflate(R.menu.main4, menu);
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
            case R.id.it41:
                Intent i1=new Intent(Main4Activity.this,MainActivity.class);
                startActivity(i1);
                break;
            case R.id.it42:
                Intent i2=new Intent(Main4Activity.this,Main2Activity.class);
                startActivity(i2);
                break;
            case R.id.it43:
                Intent i3=new Intent(Main4Activity.this,Main3Activity.class);
                startActivity(i3);
                break;
            case R.id.it44:
                Intent i4=new Intent(Main4Activity.this,Main4Activity.class);
                startActivity(i4);
                break;
            case R.id.it46:
                Intent i5=new Intent(Main4Activity.this,Main7Activity.class);
                startActivity(i5);
                break;
            case R.id.it45:
                Intent i6=new Intent(Main4Activity.this,Main8Activity.class);
                startActivity(i6);
                break;




        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
