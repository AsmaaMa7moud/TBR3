/**
 * Created by DELL on 09/02/2019.
 */
package com.example.dell.tbr3;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by DELL on 14/01/2019.
 */

class RecyclerAdapt extends RecyclerView.Adapter<RecyclerAdapt.ViewHolder> {
    static public Context context;
    private Activity ctx;





private String[] name={"Ahmed Mashour",
"Alaa Samy","Asmaa Ahmed","Asmaa Mahmoud","Hawaa Mohamed","Mohamed Gaper","Safa Mohamed"};

    private int[] images={R.drawable.p12,

            R.drawable.p12,R.drawable.p11,R.drawable.p11,R.drawable.p11,R.drawable.p12,R.drawable.p11



    };
private String[] titles={"Web Developer",
        "Web Developer","Android Developer","Android Developer","Full Stack Web Developer","Full Stack Web Developer","Grapical Design"};







class ViewHolder extends RecyclerView.ViewHolder{
        public int currentItem;
    public TextView itemName;
        public ImageView image;
        public TextView itemTiltle;





        public ViewHolder(View itemView) {
            super(itemView);
            itemName=(TextView)itemView.findViewById(R.id.name);
            image=(ImageView)itemView.findViewById(R.id.card_view_image);

            itemTiltle=(TextView)itemView.findViewById(R.id.card_view_image_title);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    Snackbar.make(v, "click detected on item" + position, Snackbar.LENGTH_LONG).setAction("Action", null).show();


                }
            });











        }}
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup,int i){

        View v= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_view,viewGroup,false);
        ViewHolder viewHolder=new ViewHolder(v);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(ViewHolder viewHolder,int i){
        viewHolder.itemName.setText(name[i]);
        viewHolder.itemTiltle.setText(titles[i]);

        viewHolder.image.setImageResource(images[i]);


    }
    @Override
    public int getItemCount(){
        return titles.length;
    }
}






