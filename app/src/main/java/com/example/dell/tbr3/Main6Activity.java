package com.example.dell.tbr3;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.media.RatingCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
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
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class Main6Activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;
    private ImageView profileImage;

   /* private static final int PICK_IMAGE=1;
    Bitmap myBitmap;
    Uri imageUri;*/
   public static final int IMAGE_GALLERY_REQUEST=20;
    public static final int CAMERA_REQUEST_CODE=228;
    private CircleImageView imgPicture;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        recyclerView = (RecyclerView) findViewById(R.id.recycle2_view);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerAdapter();
        recyclerView.setAdapter(adapter);
        imgPicture=(CircleImageView)findViewById(R.id.imgView);
       // profileImage=(ImageView) findViewById(R.id.profile);

     /*Button img=(Button) findViewById(R.id.image_choose);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent gallery=new Intent();
                gallery.setType("image/*");
                gallery.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(gallery,"Sellect picture"),PICK_IMAGE);


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
        getMenuInflater().inflate(R.menu.main6, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();



        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        switch (id) {
            case R.id.it61:
                Intent i1 = new Intent(Main6Activity.this, MainActivity.class);
                startActivity(i1);
                break;
            case R.id.it62:
                Intent i2 = new Intent(Main6Activity.this, Main2Activity.class);
                startActivity(i2);
                break;
            case R.id.it63:
                Intent i3 = new Intent(Main6Activity.this, Main3Activity.class);
                startActivity(i3);
                break;
            case R.id.it64:
                Intent i4 = new Intent(Main6Activity.this, Main4Activity.class);
                startActivity(i4);
                break;
            case R.id.it66:
                Intent i5 = new Intent(Main6Activity.this, Main7Activity.class);
                startActivity(i5);
                break;

        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }



    public void change_image(View view) {
       Intent photoPickerIntent=new Intent(Intent.ACTION_PICK);
        File pictureDirectory= Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        String pictureDirectoryPath=pictureDirectory.getPath();
        Uri data=Uri.parse(pictureDirectoryPath);
        photoPickerIntent.setDataAndType(data,"image/*");
        startActivityForResult(photoPickerIntent,IMAGE_GALLERY_REQUEST);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if ( resultCode==RESULT_OK)
        {
            if(requestCode==CAMERA_REQUEST_CODE){
                Toast.makeText(this,"Image saved",Toast.LENGTH_LONG).show();
            }
           if (requestCode==IMAGE_GALLERY_REQUEST)
           {
               Uri imageUri=data.getData();
               InputStream inputStream;
               try {
                   inputStream=getContentResolver().openInputStream(imageUri);
                   Bitmap image= BitmapFactory.decodeStream(inputStream);
                   imgPicture.setImageBitmap(image);

               }
               catch (FileNotFoundException e)
               {
                   e.printStackTrace();
                   Toast.makeText(this,"not found",Toast.LENGTH_LONG).show();
               }

           }

        }
    }
}





