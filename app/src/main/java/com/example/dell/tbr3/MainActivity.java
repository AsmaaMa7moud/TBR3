package com.example.dell.tbr3;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.app.Fragment;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.app.Fragment;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.miguelcatalan.materialsearchview.MaterialSearchView;

import static com.example.dell.tbr3.RecyclerAdapter.context;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    MaterialSearchView searchView;
ViewFlipper v_flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar1=(Toolbar)findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar1);
        getSupportActionBar().setTitle("الصفحه الرئيسيه");
        toolbar1.setTitleTextColor(Color.parseColor("#ffffff"));
        searchView=(MaterialSearchView)findViewById(R.id.search_view);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
        int images[]={R.drawable.s1,R.drawable.s2,R.drawable.s3};
        v_flipper=(ViewFlipper) findViewById(R.id.v_flipper);
        for(int image:images){
            flipperImages(image);
        }



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
        getMenuInflater().inflate(R.menu.main, menu);
        MenuItem item = menu.findItem(R.id.action_search2);
        searchView.setMenuItem(item);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        int id = item.getItemId();


    switch (id){
        case R.id.it1:
            Intent i1=new Intent(MainActivity.this,MainActivity.class);
            startActivity(i1);
            break;
        case R.id.it2:
            Intent i2=new Intent(MainActivity.this,Main2Activity.class);
            startActivity(i2);
            break;
        case R.id.it3:
            Intent i3=new Intent(MainActivity.this,Main3Activity.class);
            startActivity(i3);
            break;
        case R.id.it4:
            Intent i4=new Intent(MainActivity.this,Main4Activity.class);
            startActivity(i4);
            break;

        case R.id.it5:
            Intent i5=new Intent(MainActivity.this,Main8Activity.class);
            startActivity(i5);
            break;
        case R.id.it6:
            Intent i6=new Intent(MainActivity.this,Main7Activity.class);
            startActivity(i6);
            break;

        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    public void flipperImages(int image){
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(image);
        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(3000);
        v_flipper.setAutoStart(true);
        v_flipper.setInAnimation(this,android.R.anim.fade_out);
        v_flipper.setInAnimation(this,android.R.anim.fade_in);
    }
}
