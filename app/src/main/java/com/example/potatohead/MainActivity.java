package com.example.potatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //Initialize the image visibility
    private View Arms;
    private View Nose;
    private View Shoes;
    private View Hat;
    private View Glasses;
    private View Mouth;
    private View Eyes;
    private View Eyebrows;
    private View Mustache;
    private View Ears;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Arms =  findViewById(R.id.arms);
        Nose =  findViewById(R.id.nose);

        Log.d("Visibility", Arms.getVisibility()  + String.valueOf(Nose.getVisibility()));

        Shoes =  findViewById(R.id.shoes);
        Hat =  findViewById(R.id.hat);
        Glasses =  findViewById(R.id.glasses);
        Mouth =  findViewById(R.id.mouth);
        Eyes =  findViewById(R.id.eyes);
        Eyebrows =  findViewById(R.id.eyebrows);
        Mustache =  findViewById(R.id.mustache);
        Ears =  findViewById(R.id.ears);
    }
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState); // always call super

        // check if Views are visible

        int noseVisible = Nose.getVisibility();
        int shoesVisible = Shoes.getVisibility();
        int hatVisible = Hat.getVisibility();
        int glassesVisible = Glasses.getVisibility();
        int mouthVisible = Mouth.getVisibility();
        int eyesVisible = Eyes.getVisibility();
        int eyebrowsVisible = Eyebrows.getVisibility();
        int mustacheVisible = Mustache.getVisibility();
        int earsVisible = Ears.getVisibility();
        int armsVisible = Arms.getVisibility();

        Log.d("errorcheck", String.valueOf(armsVisible) + String.valueOf(noseVisible));
        // put visibilities into the out state

        outState.putInt("noseVisible", noseVisible);
        outState.putInt("shoesVisible", shoesVisible);
        outState.putInt("hatVisible", hatVisible);
        outState.putInt("glassesVisible", glassesVisible);
        outState.putInt("mouthVisible", mouthVisible);
        outState.putInt("eyesVisible", eyesVisible);
        outState.putInt("eyebrowsVisible", eyebrowsVisible);
        outState.putInt("mustacheVisible", mustacheVisible);
        outState.putInt("earsVisible", earsVisible);
        outState.putInt("armsVisible", armsVisible);
    }
    @Override
    public void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);

        // get the visibility values

        int noseVisible = inState.getInt("noseVisible");
        int shoesVisible = inState.getInt("shoesVisible");
        int hatVisible = inState.getInt("hatVisible");
        int glassesVisible = inState.getInt("glassesVisible");
        int mouthVisible = inState.getInt("mouthVisible");
        int eyesVisible = inState.getInt("eyesVisible");
        int eyebrowsVisible = inState.getInt("eyebrowsVisible");
        int mustacheVisible = inState.getInt("mustacheVisible");
        int earsVisible = inState.getInt("earsVisible");
        int armsVisible = inState.getInt("armsVisible");

        // set the values correctly

        Nose.setVisibility(noseVisible);
        Shoes.setVisibility(shoesVisible);
        Hat.setVisibility(hatVisible);
        Glasses.setVisibility(glassesVisible);
        Mouth.setVisibility(mouthVisible);
        Eyes.setVisibility(eyesVisible);
        Eyebrows.setVisibility(eyebrowsVisible);
        Mustache.setVisibility(mustacheVisible);
        Ears.setVisibility(earsVisible);
        Arms.setVisibility(armsVisible);

    }
    public void checkClicked(View v) {
        CheckBox checkbox = (CheckBox) v;
        ImageView image;

        Log.d( "potato", "checkClicked: " + checkbox.getId());

        boolean checked = checkbox.isChecked();

        switch(checkbox.getId()) {
            case R.id.checkBoxNose:
                image = findViewById(R.id.nose);
                break;
            case R.id.checkBoxArms:
                image = findViewById(R.id.arms);
                break;
            case R.id.checkBoxShoes:
                image = findViewById(R.id.shoes);
                break;
            case R.id.checkBoxHat:
                image = findViewById(R.id.hat);
                break;
            case R.id.checkBoxGlasses:
                image = findViewById(R.id.glasses);
                break;
            case R.id.checkBoxMouth:
                image = findViewById(R.id.mouth);
                break;
            case R.id.checkBoxEyes:
                image = findViewById(R.id.eyes);
                break;
            case R.id.checkBoxEyebrows:
                image = findViewById(R.id.eyebrows);
                break;
            case R.id.checkBoxMustache:
                image = findViewById(R.id.mustache);
                break;
            case R.id.checkBoxEars:
                image = findViewById(R.id.ears);
                break;
            // To prevent errors
            default:
                image = findViewById(R.id.ears);
        }



        if (checked){
            image.setVisibility(View.VISIBLE);
        }
        else {
            image.setVisibility(View.INVISIBLE);
        }
    }
}
