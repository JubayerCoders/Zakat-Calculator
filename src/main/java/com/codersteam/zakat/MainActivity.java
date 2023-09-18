package com.codersteam.zakat;

import static com.codersteam.zakat.Second_page.calculate;
import com.onesignal.OneSignal;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String ONESIGNAL_APP_ID = "4686d7fd-00a1-4c60-ad9e-e85854f6c4f7";

    private long lastTapTime = 0;

    //------icon_button-----//
    LinearLayout btn_zakat_niyom, btn_calculate, btn_zakat_foroz, btn_zakater_sorto, btn_zakat_ki, btn_zakater_hisab,
                 btn_zakater_khat, btn_zakat_na_deya,btn_about_developer ;

    //------video_button----//
    LinearLayout btn_video1,  btn_video2, btn_video3, btn_video4;
    TextView tv;

    Animation zoom_in;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ///--ON SIGNAL NOTIFICATION---//

        // Enable verbose OneSignal logging to debug issues if needed.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        // OneSignal Initialization
        OneSignal.initWithContext(this);
        OneSignal.setAppId(ONESIGNAL_APP_ID);

        // promptForPushNotifications will show the native Android notification permission prompt.
        // We recommend removing the following code and instead using an In-App Message to prompt for notification permission (See step 7)
        OneSignal.promptForPushNotifications();



        ///////----------------Identity-----------------////
        tv = findViewById(R.id.tv);
        tv.setSelected(true);

        //-----Animaton----------//
        zoom_in = AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoom_in);


        //------icon_button-----//
        btn_calculate = findViewById(R.id.btn_calculate);
        btn_zakat_niyom = findViewById(R.id.btn_zakat_niyom);
        btn_zakat_foroz = findViewById(R.id.btn_zakat_foroz);
        btn_zakater_sorto = findViewById(R.id.btn_zakater_sorto);
        btn_zakat_ki = findViewById(R.id.btn_zakat_ki);
        btn_zakater_hisab = findViewById(R.id.btn_zakater_hisab);
        btn_zakater_khat = findViewById(R.id.btn_zakater_khat);
        btn_zakat_na_deya = findViewById(R.id.btn_zakat_na_deya);
        btn_about_developer = findViewById(R.id.btn_about_developer);

        //------video_button----//
        btn_video1 = findViewById(R.id.btn_video1);
        btn_video2 = findViewById(R.id.btn_video2);
        btn_video3 = findViewById(R.id.btn_video3);
        btn_video4 = findViewById(R.id.btn_video4);





        //-------- btn_calculate --------//
        btn_calculate.setOnClickListener(view -> {


            Intent nextActivity = new Intent(MainActivity.this, Second_page.class);
            Bundle bundle = new Bundle();
            bundle.putInt("VAL", 1);
            nextActivity.putExtras(bundle);
            startActivity(nextActivity);


        });

        //------- btn zakat niyom ---------//
        btn_zakat_niyom.setOnClickListener(view -> {

            Intent nextActivity = new Intent(MainActivity.this, Second_page.class);
            Bundle bundle = new Bundle();
            bundle.putInt("VAL", 2);
            nextActivity.putExtras(bundle);
            startActivity(nextActivity);

        });

        //------- btn zakat foroz ---------//
        btn_zakat_foroz.setOnClickListener(view -> {

            Intent nextActivity = new Intent(MainActivity.this, Second_page.class);
            Bundle bundle = new Bundle();
            bundle.putInt("VAL", 3);
            nextActivity.putExtras(bundle);
            startActivity(nextActivity);

        });

        //------- btn zakater sorto ---------//
        btn_zakater_sorto.setOnClickListener(view -> {

            Intent nextActivity = new Intent(MainActivity.this, Second_page.class);
            Bundle bundle = new Bundle();
            bundle.putInt("VAL", 4);
            nextActivity.putExtras(bundle);
            startActivity(nextActivity);

        });

        //------- btn zakat ki ---------//
        btn_zakat_ki.setOnClickListener(view -> {

            Intent nextActivity = new Intent(MainActivity.this, Second_page.class);
            Bundle bundle = new Bundle();
            bundle.putInt("VAL", 5);
            nextActivity.putExtras(bundle);
            startActivity(nextActivity);

        });

        //------- btn zakater hisab ---------//
        btn_zakater_hisab.setOnClickListener(view -> {

            Intent nextActivity = new Intent(MainActivity.this, Second_page.class);
            Bundle bundle = new Bundle();
            bundle.putInt("VAL", 6);
            nextActivity.putExtras(bundle);
            startActivity(nextActivity);

        });

        //------- btn_zakater_khat ---------//
        btn_zakater_khat.setOnClickListener(view -> {

            Intent nextActivity = new Intent(MainActivity.this, Second_page.class);
            Bundle bundle = new Bundle();
            bundle.putInt("VAL", 7);
            nextActivity.putExtras(bundle);
            startActivity(nextActivity);

        });

        //------- btn_zakat_na_deya ---------//
        btn_zakat_na_deya.setOnClickListener(view -> {

            Intent nextActivity = new Intent(MainActivity.this, Second_page.class);
            Bundle bundle = new Bundle();
            bundle.putInt("VAL", 8);
            nextActivity.putExtras(bundle);
            startActivity(nextActivity);

        });

        //------- btn_about_developer ---------//
        btn_about_developer.setOnClickListener(view -> {

            Intent nextActivity = new Intent(MainActivity.this, Second_page.class);
            Bundle bundle = new Bundle();
            bundle.putInt("VAL", 9);
            nextActivity.putExtras(bundle);
            startActivity(nextActivity);


        });



        //------- btn_video_1 ---------//
        btn_video1.setOnClickListener(view -> {


            Intent nextActivity = new Intent(MainActivity.this, Second_page.class);
            Bundle bundle = new Bundle();
            bundle.putInt("VAL", 10);
            nextActivity.putExtras(bundle);
            startActivity(nextActivity);




        });

        //------- btn_video_2 ---------//
        btn_video2.setOnClickListener(view -> {

            Intent nextActivity = new Intent(MainActivity.this, Second_page.class);
            Bundle bundle = new Bundle();
            bundle.putInt("VAL", 11);
            nextActivity.putExtras(bundle);
            startActivity(nextActivity);


        });


        //------- btn_video_1 ---------//
        btn_video3.setOnClickListener(view -> {


            Intent nextActivity = new Intent(MainActivity.this, Second_page.class);
            Bundle bundle = new Bundle();
            bundle.putInt("VAL", 12);
            nextActivity.putExtras(bundle);
            startActivity(nextActivity);




        });

        //------- btn_video_2 ---------//
        btn_video4.setOnClickListener(view -> {

            Intent nextActivity = new Intent(MainActivity.this, Second_page.class);
            Bundle bundle = new Bundle();
            bundle.putInt("VAL", 13);
            nextActivity.putExtras(bundle);
            startActivity(nextActivity);


        });

    }

    //----on----back----pressed---//
    @Override
    public void onBackPressed() {


        if (lastTapTime == 0 || System.currentTimeMillis() - lastTapTime > 2000) {
            // This is the first tap, or the user waited more than 2 seconds between taps.
            Toast.makeText(this, "Press back again to exit", Toast.LENGTH_SHORT).show();
            lastTapTime = System.currentTimeMillis();
        } else {
            // This is the second tap, so exit the app.

            super.onBackPressed();

        }


    }


}