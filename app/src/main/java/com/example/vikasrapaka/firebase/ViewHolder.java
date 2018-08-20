package com.example.vikasrapaka.firebase;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;


public class ViewHolder extends RecyclerView.ViewHolder {

   View mView;

   public ViewHolder(View itemView){

       super(itemView);

       mView = itemView;


   }

   public void setDetails(Context ctx,String image,String title,String desc){

       TextView mTitleView = mView.findViewById(R.id.rTitleView);
       ImageView mImageIv = mView.findViewById(R.id.rImageView);
       TextView mDesc = mView.findViewById(R.id.rDesc);

       mTitleView.setText(title);
       mDesc.setText(desc);
       Picasso.get().load(image).into(mImageIv);
   }



}
