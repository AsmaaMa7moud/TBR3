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

class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    static public Context context;
    private Activity ctx;
    private Context mContext;



    private String[] titles={"اسم الجمعيه بالكامل",
            "اسم الجمعيه بالكامل"




    };
    private String[] details={"البوست",
            "البوست"


    };
    private int[] images={R.drawable.p2,

            R.drawable.p2



    };





class ViewHolder extends RecyclerView.ViewHolder{
    public int currentItem;
    public ImageView image;
    public TextView itemTiltle;
    public  TextView itemDetail;
    public Button pop;


    public ViewHolder(View itemView) {
        super(itemView);
        image=(ImageView)itemView.findViewById(R.id.item_image);

        itemTiltle=(TextView)itemView.findViewById(R.id.t1);
        itemDetail=(TextView)itemView.findViewById(R.id.t2);
     //  pop=(Button)itemView.findViewById(R.id.pop2);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = getAdapterPosition();
                Snackbar.make(v, "click detected on item" + position, Snackbar.LENGTH_LONG).setAction("Action", null).show();


            }
            });


      /* pop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                        context);

                // set title
                alertDialogBuilder.setTitle("Your Title");

                // set dialog message
                alertDialogBuilder
                        .setMessage("Click yes to exit!")
                        .setCancelable(false)

                        .setNegativeButton("No",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                // if this button is clicked, just close
                                // the dialog box and do nothing
                                dialog.cancel();
                            }
                        });

                // create alert dialog
                AlertDialog alertDialog = alertDialogBuilder.create();

                // show it
                alertDialog.show();
            }
       });*/









    }}
@Override
public ViewHolder onCreateViewHolder(ViewGroup viewGroup,int i){



View v= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview,viewGroup,false);
    ViewHolder viewHolder=new ViewHolder(v);
    return viewHolder;
}
@Override
    public void onBindViewHolder(ViewHolder viewHolder,int i){


    viewHolder.itemTiltle.setText(titles[i]);
    viewHolder.itemDetail.setText(details[i]);
    viewHolder.image.setImageResource(images[i]);


    }
    @Override
    public int getItemCount(){
        return titles.length;
    }
    /*public static class  MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{


        public MyViewHolder(View itemView) {

            super(itemView);
             Button pop=(Button)itemView.findViewById(R.id.pop2);



            pop.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            v.getContext().startActivity(new Intent(v.getContext(),Main5Activity.class));

        }
    }*/
}



