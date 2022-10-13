package org.techtown.diary;

import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;

import com.github.channguyen.rsv.RangeSliderView;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Fragment2 extends Fragment {
    private static final String TAG = "Fragment2";

    int mMode = AppConstants.MODE_INSERT;
    int _id = -1;
    int weatherIndex = 0;

    RangeSliderView moodSlider;
    int moodIndex = 2;

    Note item;

    Context context;
    OnTabItemSelectedListener listener;
    OnRequestListener requestListener;

    ImageView weatherIcon;
    TextView dateTextView;
    TextView locationTextView;

    EditText contentsInput;
    ImageView pictureImageView;

    boolean isPhotoCaptured;
    boolean isPhotoFileSaved;
    boolean isPhotoCanceled;

    int selectedPhotoMenu;

    Uri uri;
    File file;
    Bitmap resultPhotoBitmap;

    SimpleDateFormat todayDateFormat;
    String currentDateString;

    @Override
    public void onAttach(Context context) {


    }

    @Override
    public void onDetach() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment2, container, false);

        initUI(rootView);

        // check current location
        if (requestListener != null) {
            requestListener.onRequest("getCurrentLocation");
        }

        applyItem();

        return rootView;
    }

    private void initUI(ViewGroup rootView) {


    }

    public void setAddress(String data) {
        locationTextView.setText(data);
    }

    public void setDateString(String dateString) {
        dateTextView.setText(dateString);
    }

    public void setContents(String data) {
        contentsInput.setText(data);
    }

    public void setPicture(String picturePath, int sampleSize) {

    }

    public void setMood(String mood) {

    }

    public void setItem(Note item) {
        this.item = item;
    }

    public void applyItem() {

    }

    public void setWeather(String data) {

    }

    public void setWeatherIndex(int index) {


    }


    public void showDialog(int id) {

        }

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void showPhotoCaptureActivity() {


    }

    private File createFile() {

    }

    public void showPhotoSelectionActivity() {

    }

    /**
     * 다른 액티비티로부터의 응답 처리
     */
    public void onActivityResult(int requestCode, int resultCode, Intent intent) {

    }

    public static Bitmap decodeSampledBitmapFromResource(File res, int reqWidth, int reqHeight) {


    }

    public static int calculateInSampleSize(BitmapFactory.Options options, int reqWidth, int reqHeight) {

    }


    private String createFilename() {

    }


    private void saveNote() {


    }

    private void modifyNote() {

    }


    private void deleteNote() {

    }

    private String savePicture() {


}
