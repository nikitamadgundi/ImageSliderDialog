package com.example.imagesliderapp;

import android.app.Dialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.ImageView;

import androidx.annotation.NonNull;

public class ImageDialog extends Dialog {
    private ImageView imgd;
    int arr[] =new int[10];

    public ImageDialog(@NonNull Context context) {
        super(context);
        setContentView(R.layout.imagedialog);
        initView();
        init();

        TimerThread timerThread = new TimerThread();
        timerThread.execute();

    }
    private void initView(){
        imgd = findViewById(R.id.img_d);
    }
    private void init(){
        arr[0] = R.drawable.onkar;
        arr[1] = R.drawable.img2;
        arr[2] = R.drawable.img3;
        arr[3] = R.drawable.img4;
        arr[4] = R.drawable.img5;
        arr[5] = R.drawable.img1;
        arr[6] = R.drawable.img10;
        arr[7] = R.drawable.img8;
        arr[8] = R.drawable.img9;
        arr[9] = R.drawable.img7;

    }
    class TimerThread extends AsyncTask<Integer,Integer,Integer>{
        int[] arr2 = new  int[1];

        @Override
        protected Integer doInBackground(Integer... integers) {

           RunLoop();
            return null;
        }



        private void RunLoop(){
            for (int i=0; i<arr.length; i++){
                try {
                    Thread.sleep(2000);
                    arr2[0] = i;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                publishProgress(i);

            }
            RunLoop();

        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            imgd.setImageResource(arr[values[0]]);
        }
    }
}
