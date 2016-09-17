package com.example.markos.androiddevlayoutexercise;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Markos on 17. 9. 2016.
 */
public class DetailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        Bundle bund = intent.getExtras();
        String phoneType = (String) bund.get("phone");

        TextView tvPhoneName = (TextView) findViewById(R.id.phoneNameLabel);
        tvPhoneName.setText(phoneType);

        TextView tvDetails = (TextView) findViewById(R.id.detailTextLabel);

        ImageView iv = (ImageView) findViewById(R.id.detailImg);

        switch (phoneType){
            case "Android":
                iv.setImageResource(R.drawable.android);
                tvDetails.setText(R.string.androidDetailsText);
                break;
            case "iPhone":
                iv.setImageResource(R.drawable.ios);
                tvDetails.setText(R.string.iPhoneDetailsText);
                break;
            case "WindowsMobile":
                iv.setImageResource(R.drawable.windows);
                tvDetails.setText(R.string.windowsMobileDetailsText);
                break;
            case "Blackberry":
                iv.setImageResource(R.drawable.blackberry);
                tvDetails.setText(R.string.blackberryDetailsText);
                break;
            case "WebOS":
                iv.setImageResource(R.drawable.webos);
                tvDetails.setText(R.string.webOSDetailsText);
                break;
            case "Ubuntu":
                iv.setImageResource(R.drawable.ubuntu);
                tvDetails.setText(R.string.ubuntuDetailsText);
                break;
        }
    }

    public void backButtonAction(View view){
        finish();
    }
}
