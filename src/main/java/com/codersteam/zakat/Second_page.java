package com.codersteam.zakat;

import static com.codersteam.zakat.Second_page.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.speech.tts.TextToSpeech;
import android.telephony.PhoneNumberUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class Second_page extends AppCompatActivity {


    RelativeLayout no_internet_page;

    public static LinearLayout calculate, zakat_deyar_niyom, zakat_foroz, zakater_sorto, zakat_ki, zakater_hisab, zakater_khat, zakat_na_deya, about_developer,calculation, result;

    public static WebView video1;
    String videoUrl;
    TextView btn_calculator, btn_remove, btn_Hisab_seen, try_again;

    //---display----//
    TextView user_situation, mot_poriman, zakater_poriman;

    //----Hisab Seen ------------//
    TextView  sorno_hisab, rupa_hisab, nagadTK_hisab , pathor_hisab , dhar_hisab , jomi_hisab , bussiness_hisab , rin_hisab , onanno_hisab , total_hisab , userName_hisab;

    EditText edText_sorno, edText_rupa, edText_nagad_taka, edText_pathor, edText_dhar, edText_jomi, edText_bussiness, edText_onanno, edText_userName, edText_rin_taka;

    Vibrator vibrate;

    //----about developer page ---- //
    LinearLayout btn_mail, btn_facebook, btn_call, btn_whatsapp, btn_instagram, btn_telegram;

    //---text to voice-----//
    LottieAnimationView zakat_foroz_play, zakat_deyar_niyom_paly,zakater_sorto_play, zakat_ki_play, zakater_khat_play;
    ImageView zakat_foroz_stop, zakat_deyar_niyom_stop, zakater_sorto_stop, zakat_ki_stop, zakater_khat_stop;
    TextView zakat_foroz_text, zakat_deyar_niyom_text, zakater_sorto_text, zakat_ki_text, zakater_khat_text;

    TextToSpeech textToSpeech;

    Animation zoom_in;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);



        //---------------------------text to voice----------------------//
        zakat_deyar_niyom_paly = findViewById(R.id.zakat_deyar_niyom_play);
        zakat_deyar_niyom_stop = findViewById(R.id.zakat_deyar_niyom_stop);
        zakat_deyar_niyom_text = findViewById(R.id.zakat_deyar_niyom_text);
        zakat_foroz_play = findViewById(R.id.zakat_foroz_play);
        zakat_foroz_text = findViewById(R.id.zakat_foroz_text);
        zakat_foroz_stop = findViewById(R.id.zakat_foroz_stop);
        zakater_sorto_play = findViewById(R.id.zakater_sorto_play);
        zakater_sorto_text = findViewById(R.id.zakater_sorto_text);
        zakater_sorto_stop = findViewById(R.id.zakater_sorto_stop);
        zakat_ki_text = findViewById(R.id.zakat_ki_text);
        zakat_ki_play = findViewById(R.id.zakat_ki_play);
        zakat_ki_stop = findViewById(R.id.zakat_ki_stop);
        zakater_khat_play = findViewById(R.id.zakater_khat_play);
        zakater_khat_text = findViewById(R.id.zakater_khat_text);
        zakater_khat_stop = findViewById(R.id.zakater_khat_stop);

        textToSpeech = new TextToSpeech(Second_page.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {

            }


        });

        //----work_zakat_deyar_niyom----//
        zakat_deyar_niyom_paly.setOnClickListener(view -> {

            textToSpeech.speak(""+ zakat_deyar_niyom_text.getText().toString(), TextToSpeech.QUEUE_FLUSH, null, null);

        });

        zakat_deyar_niyom_stop.setOnClickListener(view -> {
            textToSpeech.stop();

        });
        //----work_zakat_deyar_niyom----//

        //==================================================================================================//

        //----work_zakat_keno_foroz----//
        zakat_foroz_play.setOnClickListener(view -> {

            textToSpeech.speak( ""+ zakat_foroz_text.getText().toString(), TextToSpeech.QUEUE_FLUSH, null, null);

        });

        zakat_foroz_stop.setOnClickListener(view -> {

            textToSpeech.stop();

        });
        //----work_zakat_keno_foroz----//

        //==================================================================================================//

        //----zakater sorto----//
        zakater_sorto_text.setOnClickListener(view -> {

            textToSpeech.speak( ""+ zakater_sorto_text.getText().toString(), TextToSpeech.QUEUE_FLUSH, null, null);

        });

        zakater_sorto_stop.setOnClickListener(view -> {

            textToSpeech.stop();

        });
        //----zakater sorto----//

        //==================================================================================================//

        //----zakater ki----//
        zakat_ki_play.setOnClickListener(view -> {

            textToSpeech.speak( ""+ zakat_ki_text.getText().toString(), TextToSpeech.QUEUE_FLUSH, null, null);

        });

        zakat_ki_stop.setOnClickListener(view -> {

            textToSpeech.stop();

        });
        //----zakater ki----//

        //==================================================================================================//

        //----work_zakater_khat----//
        zakater_khat_play.setOnClickListener(view -> {

            textToSpeech.speak( ""+ zakater_khat_text.getText().toString(), TextToSpeech.QUEUE_FLUSH, null, null);

        });

        zakater_khat_stop.setOnClickListener(view -> {

            textToSpeech.stop();

        });
        //----work_zakater_khat----//

        //==================================================================================================//



        //----------------Identity-----------------//
        calculate = findViewById(R.id.calculate);
        zakat_deyar_niyom = findViewById(R.id.zakat_deyar_niyom);
        zakat_foroz = findViewById(R.id.zakat_foroz);
        zakater_sorto = findViewById(R.id.zakater_sorto);
        zakat_ki = findViewById(R.id.zakat_ki);
        zakater_hisab = findViewById(R.id.zakater_hisab);
        zakater_khat = findViewById(R.id.zakater_khat);
        zakat_na_deya = findViewById(R.id.zakat_na_deya);
        about_developer = findViewById(R.id.about_developer);
        video1 = findViewById(R.id.video1);

        try_again = findViewById(R.id.try_again);
        no_internet_page = findViewById(R.id.no_internet_page);

        //------Calculator Page Ed text -------//
        calculation = findViewById(R.id.calculation);
        edText_sorno = findViewById(R.id.edText_sorno);
        edText_rupa = findViewById(R.id.edText_rupa);
        edText_nagad_taka = findViewById(R.id.edText_nagad_taka);
        edText_pathor = findViewById(R.id.edText_pathor);
        edText_dhar = findViewById(R.id.edText_dhar);
        edText_jomi = findViewById(R.id.edText_jomi);
        edText_bussiness = findViewById(R.id.edText_bussiness);
        edText_onanno = findViewById(R.id.edText_onanno);
        edText_userName = findViewById(R.id.edText_userName);
        edText_rin_taka = findViewById(R.id.edText_rin_taka);

        //-------Button-----------//
        btn_calculator = findViewById(R.id.btn_calculator);
        btn_remove = findViewById(R.id.btn_remove);
        btn_Hisab_seen = findViewById(R.id.btn_Hisab_seen);

        //------Result Page--------//
        result = findViewById(R.id.result);
        user_situation = findViewById(R.id.user_situation);
        mot_poriman = findViewById(R.id.mot_poriman);
        zakater_poriman = findViewById(R.id.zakater_poriman);

        //----Hisab Seen ------------//
        sorno_hisab = findViewById(R.id.sorno_hisab);
        rupa_hisab = findViewById(R.id.rupa_hisab);
        nagadTK_hisab = findViewById(R.id.nagadTK_hisab);
        pathor_hisab = findViewById(R.id.pathor_hisab);
        dhar_hisab = findViewById(R.id.dhar_hisab);
        jomi_hisab = findViewById(R.id.jomi_hisab);
        bussiness_hisab = findViewById(R.id.bussiness_hisab);
        onanno_hisab = findViewById(R.id.onanno_hisab);
        edText_userName = findViewById(R.id.edText_userName);
        total_hisab = findViewById(R.id.total_hisab);
        userName_hisab = findViewById(R.id.userName_hisab);
        rin_hisab = findViewById(R.id.rin_hisab);

        //---about developer page code--- //
        btn_mail = findViewById(R.id.btn_mail);
        btn_facebook = findViewById(R.id.btn_facebook);
        btn_call = findViewById(R.id.btn_call);
        btn_whatsapp = findViewById(R.id.btn_whatsapp);
        btn_instagram = findViewById(R.id.btn_instagram);
        btn_telegram = findViewById(R.id.btn_telegram);

        //-----Animaton----------//
        zoom_in = AnimationUtils.loadAnimation(Second_page.this, R.anim.zoom_in);





        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        Network networkInfo = connectivityManager.getActiveNetwork();


        btn_calculator.setOnClickListener(view -> {

            String sSorno = edText_sorno.getText().toString();
            String sRupa = edText_rupa.getText().toString();
            String sNagad_Taka = edText_nagad_taka.getText().toString();
            String sPathor = edText_pathor.getText().toString();
            String sDhar = edText_dhar.getText().toString();
            String sJomi = edText_jomi.getText().toString();
            String sBussiness = edText_bussiness.getText().toString();
            String sOnanno = edText_onanno.getText().toString();
            String sUsername = edText_userName.getText().toString();
            String sRin = edText_rin_taka.getText().toString();


            if (sSorno.length()>0 && sRupa.length()>0  && sNagad_Taka.length()>0  && sPathor.length()>0  && sDhar.length()>0  && sJomi.length()>0  && sBussiness.length()>0  && sOnanno.length()>0 && sRin.length()>0 ) {

                float Sorno_Vori = Float.parseFloat(sSorno);
                float Rupa_Vori = Float.parseFloat(sRupa);
                float Nagad_Taka = Float.parseFloat(sNagad_Taka);
                float Pathor = Float.parseFloat(sPathor);
                float Dhar = Float.parseFloat(sDhar);
                float Jomi = Float.parseFloat(sJomi);
                float Bussiness = Float.parseFloat(sBussiness);
                float Onanno = Float.parseFloat(sOnanno);
                float Rin = Float.parseFloat(sRin);

                float Sorno = Sorno_Vori * 98444;
                float Rupa = Rupa_Vori * 1632;

                float all_plus = (Sorno + Rupa + Nagad_Taka + Pathor + Dhar + Jomi + Bussiness + Onanno) -(Rin);
                float zakat = (float) (all_plus * (2.5 /100));

                calculation.setVisibility(View.GONE);
                result.setVisibility(View.VISIBLE);
                btn_calculator.setVisibility(View.GONE);
                btn_Hisab_seen.setVisibility(View.VISIBLE);

                Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                v.vibrate(300);



                //----Hisab Seen ------------//
                userName_hisab.setText(""+ sUsername);
                sorno_hisab.setText(""+Sorno + " টাকা");
                rupa_hisab.setText(""+ Rupa +" টাকা");
                nagadTK_hisab.setText(""+ Nagad_Taka + " টাকা");
                pathor_hisab.setText(""+ Pathor + " টাকা");
                dhar_hisab.setText(""+ Dhar +" টাকা");
                jomi_hisab.setText(""+ Jomi + " টাকা");
                bussiness_hisab.setText(""+ Bussiness + " টাকা");
                onanno_hisab.setText(""+ Onanno +" টাকা");
                rin_hisab.setText(""+ Rin + " টাকা");
                total_hisab.setText(""+ all_plus + " টাকা");





                mot_poriman.setText("আপনার মোট সম্পদের পরিমাণ " + all_plus +" টাকা");

                if (all_plus>90017) {
                    zakater_poriman.setVisibility(View.VISIBLE);
                    user_situation.setText("অভিনন্দন\nআপনার উপর যাকাত ফরয হয়েছে");
                    zakater_poriman.setText("এ বছর আপনার যাকাতের পরিমাণ\n" +zakat +" টাকা");
                    textToSpeech.speak("অভিনন্দন"+sUsername+"।আপনার উপর যাকাত ফরয হয়েছে।" + "এ বছর আপনার যাকাতের পরিমাণ" +zakat+ "টাকা।" +    "সঠিক ভাবে যাকাত আদায় করুন। মহান সৃষ্টি কর্তা আল্লাহকে খুশি রাখুন", TextToSpeech.QUEUE_FLUSH, null, null);
                }
                else if (all_plus<90017){
                    user_situation.setText("দুঃখিত\nআপনার উপর যাকাত ফরয হয়নি");
                    zakater_poriman.setVisibility(View.GONE);
                    textToSpeech.speak("দুঃখিত"+sUsername+"।আপনার উপর যাকাত ফরয হইনি।" + "আপনার মোট সম্পদের পরিমান" +all_plus+ "টাকা", TextToSpeech.QUEUE_FLUSH, null, null);

                }





            } else {

                Toast.makeText(Second_page.this, "সকল তথ্য সঠিকভাবে দিন", Toast.LENGTH_SHORT).show();
                textToSpeech.speak("সকল তথ্য সঠিক ভাবে দিন", TextToSpeech.QUEUE_FLUSH, null, null);
                Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                v.vibrate(200);
                edText_sorno.setError("পরিমান বসান");
                edText_rupa.setError("পরিমান বসান");
                edText_nagad_taka.setError("পরিমান বসান");
                edText_pathor.setError("পরিমান বসান");
                edText_dhar.setError("পরিমান বসান");
                edText_jomi.setError("পরিমান বসান");
                edText_bussiness.setError("পরিমান বসান");
                edText_onanno.setError("পরিমান বসান");
                edText_rin_taka.setError("পরিমান বসান");
                edText_userName.setError("আপনার নাম লিখুন");


            }





        });


        btn_remove.setOnClickListener(view -> {

            edText_userName.setText("");
            edText_sorno.setText("");
            edText_rupa.setText("");
            edText_nagad_taka.setText("");
            edText_pathor.setText("");
            edText_dhar.setText("");
            edText_jomi.setText("");
            edText_bussiness.setText("");
            edText_onanno.setText("");
            edText_rin_taka.setText("");
            textToSpeech.stop();
            result.setVisibility(View.GONE);
            calculation.setVisibility(View.VISIBLE);
            btn_Hisab_seen.setVisibility(View.GONE);
            btn_calculator.setVisibility(View.VISIBLE);


        });
        btn_Hisab_seen.setOnClickListener(view -> {

            btn_calculator.setVisibility(View.VISIBLE);
            btn_Hisab_seen.setVisibility(View.GONE);
            result.setVisibility(View.GONE);
            calculation.setVisibility(View.VISIBLE);

        });






        Bundle bun = getIntent().getExtras();
        int val = bun.getInt("VAL");

        //----------code if else---------//
        if (val == 1) {

            calculate.startAnimation(zoom_in);
            calculate.setVisibility(View.VISIBLE);
            zakat_deyar_niyom.setVisibility(View.GONE);
            zakat_foroz.setVisibility(View.GONE);
            zakater_sorto.setVisibility(View.GONE);
            zakat_ki.setVisibility(View.GONE);
            zakater_hisab.setVisibility(View.GONE);
            zakater_khat.setVisibility(View.GONE);
            zakat_na_deya.setVisibility(View.GONE);
            about_developer.setVisibility(View.GONE);

            //-----Video_Work-------//
            video1.setVisibility(View.GONE);


        } else if (val == 2) {

            calculate.setVisibility(View.GONE);
            zakat_deyar_niyom.setVisibility(View.VISIBLE);
            zakat_foroz.setVisibility(View.GONE);
            zakater_sorto.setVisibility(View.GONE);
            zakat_ki.setVisibility(View.GONE);
            zakater_hisab.setVisibility(View.GONE);
            zakater_khat.setVisibility(View.GONE);
            zakat_na_deya.setVisibility(View.GONE);
            about_developer.setVisibility(View.GONE);
            //-----Video_Work-------//
            video1.setVisibility(View.GONE);

        } else if (val == 3) {

            calculate.setVisibility(View.GONE);
            zakat_deyar_niyom.setVisibility(View.GONE);
            zakat_foroz.setVisibility(View.VISIBLE);
            zakater_sorto.setVisibility(View.GONE);
            zakat_ki.setVisibility(View.GONE);
            zakater_hisab.setVisibility(View.GONE);
            zakater_khat.setVisibility(View.GONE);
            zakat_na_deya.setVisibility(View.GONE);
            about_developer.setVisibility(View.GONE);
            //-----Video_Work-------//
            video1.setVisibility(View.GONE);

        } else if (val == 4) {

            calculate.setVisibility(View.GONE);
            zakat_deyar_niyom.setVisibility(View.GONE);
            zakat_foroz.setVisibility(View.GONE);
            zakater_sorto.setVisibility(View.VISIBLE);
            zakat_ki.setVisibility(View.GONE);
            zakater_hisab.setVisibility(View.GONE);
            zakater_khat.setVisibility(View.GONE);
            zakat_na_deya.setVisibility(View.GONE);
            about_developer.setVisibility(View.GONE);
            //-----Video_Work-------//
            video1.setVisibility(View.GONE);


        } else if (val == 5) {

            calculate.setVisibility(View.GONE);
            zakat_deyar_niyom.setVisibility(View.GONE);
            zakat_foroz.setVisibility(View.GONE);
            zakater_sorto.setVisibility(View.GONE);
            zakat_ki.setVisibility(View.VISIBLE);
            zakater_hisab.setVisibility(View.GONE);
            zakater_khat.setVisibility(View.GONE);
            zakat_na_deya.setVisibility(View.GONE);
            about_developer.setVisibility(View.GONE);
            //-----Video_Work-------//
            video1.setVisibility(View.GONE);


        } else if (val == 6) {

            calculate.setVisibility(View.GONE);
            zakat_deyar_niyom.setVisibility(View.GONE);
            zakat_foroz.setVisibility(View.GONE);
            zakater_sorto.setVisibility(View.GONE);
            zakat_ki.setVisibility(View.GONE);
            zakater_hisab.setVisibility(View.VISIBLE);
            zakater_khat.setVisibility(View.GONE);
            zakat_na_deya.setVisibility(View.GONE);
            about_developer.setVisibility(View.GONE);
            //-----Video_Work-------//
            video1.setVisibility(View.GONE);

            Toast.makeText(Second_page.this, "This service under maintance.", Toast.LENGTH_SHORT).show();

        } else if (val == 7) {

            calculate.setVisibility(View.GONE);
            zakat_deyar_niyom.setVisibility(View.GONE);
            zakat_foroz.setVisibility(View.GONE);
            zakater_sorto.setVisibility(View.GONE);
            zakat_ki.setVisibility(View.GONE);
            zakater_hisab.setVisibility(View.GONE);
            zakater_khat.setVisibility(View.VISIBLE);
            zakat_na_deya.setVisibility(View.GONE);
            about_developer.setVisibility(View.GONE);
            //-----Video_Work-------//
            video1.setVisibility(View.GONE);


        } else if (val == 8) {

            calculate.setVisibility(View.GONE);
            zakat_deyar_niyom.setVisibility(View.GONE);
            zakat_foroz.setVisibility(View.GONE);
            zakater_sorto.setVisibility(View.GONE);
            zakat_ki.setVisibility(View.GONE);
            zakater_hisab.setVisibility(View.GONE);
            zakater_khat.setVisibility(View.GONE);
            zakat_na_deya.setVisibility(View.VISIBLE);
            about_developer.setVisibility(View.GONE);
            //-----Video_Work-------//
            video1.setVisibility(View.GONE);

            Toast.makeText(Second_page.this, "This service under maintance.", Toast.LENGTH_SHORT).show();


        } else if (val == 9) {

            calculate.setVisibility(View.GONE);
            zakat_deyar_niyom.setVisibility(View.GONE);
            zakat_foroz.setVisibility(View.GONE);
            zakater_sorto.setVisibility(View.GONE);
            zakat_ki.setVisibility(View.GONE);
            zakater_hisab.setVisibility(View.GONE);
            zakater_khat.setVisibility(View.GONE);
            zakat_na_deya.setVisibility(View.GONE);
            about_developer.setVisibility(View.VISIBLE);

            //-----Video_Work-------//
            video1.setVisibility(View.GONE);

            //---- Mail open Code ----//
            btn_mail.setOnClickListener(view -> {

                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:jubayer0267@gmail.com")));

            });

            //---- Facebook Open ---//
            btn_facebook.setOnClickListener(view -> {

                gotUrl("https://www.facebook.com/JubayerCoders");

            });

            //--- Make Call ---//
            btn_call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:+8801826994391"));
                    startActivity(intent);

                }
            });

            btn_instagram.setOnClickListener(view -> {

                Toast.makeText(Second_page.this, "This service currently unavailable", Toast.LENGTH_SHORT).show();

            });

            btn_whatsapp.setOnClickListener(view -> {

                Toast.makeText(Second_page.this, "This service currently unavailable", Toast.LENGTH_SHORT).show();

            });

            btn_telegram.setOnClickListener(view -> {

                Toast.makeText(Second_page.this, "This service currently unavailable", Toast.LENGTH_SHORT).show();

            });






        } else if (val == 10) {

            calculate.setVisibility(View.GONE);
            zakat_deyar_niyom.setVisibility(View.GONE);
            zakat_foroz.setVisibility(View.GONE);
            zakater_sorto.setVisibility(View.GONE);
            zakat_ki.setVisibility(View.GONE);
            zakater_hisab.setVisibility(View.GONE);
            zakater_khat.setVisibility(View.GONE);
            zakat_na_deya.setVisibility(View.GONE);
            about_developer.setVisibility(View.GONE);

            //-----Video_Work-------//

            if (networkInfo !=null) {

                videoUrl = "https://www.youtube.com/embed/cBoBjlbXYHo";
                video1.setVisibility(View.VISIBLE);
                video1.getSettings().setJavaScriptEnabled(true);
                video1.loadUrl(videoUrl);

            } else {
                no_internet_page.setVisibility(View.VISIBLE);
            }

            try_again.setOnClickListener(view -> {

                Intent nextActivity = new Intent(Second_page.this, MainActivity.class);
                startActivity(nextActivity);

            });

        }

        else if (val == 11) {

            calculate.setVisibility(View.GONE);
            zakat_deyar_niyom.setVisibility(View.GONE);
            zakat_foroz.setVisibility(View.GONE);
            zakater_sorto.setVisibility(View.GONE);
            zakat_ki.setVisibility(View.GONE);
            zakater_hisab.setVisibility(View.GONE);
            zakater_khat.setVisibility(View.GONE);
            zakat_na_deya.setVisibility(View.GONE);
            about_developer.setVisibility(View.GONE);

            if (networkInfo !=null) {
                //-----Video_Work-------//
                video1.setVisibility(View.VISIBLE);
                videoUrl = "https://www.youtube.com/embed/CdfUcH3X1GI";
                video1.getSettings().setJavaScriptEnabled(true);
                video1.loadUrl(videoUrl);

            } else {
                no_internet_page.setVisibility(View.VISIBLE);
            }

            try_again.setOnClickListener(view -> {

                Intent nextActivity = new Intent(Second_page.this, MainActivity.class);
                startActivity(nextActivity);

            });
        }

        else if (val == 12) {

            calculate.setVisibility(View.GONE);
            zakat_deyar_niyom.setVisibility(View.GONE);
            zakat_foroz.setVisibility(View.GONE);
            zakater_sorto.setVisibility(View.GONE);
            zakat_ki.setVisibility(View.GONE);
            zakater_hisab.setVisibility(View.GONE);
            zakater_khat.setVisibility(View.GONE);
            zakat_na_deya.setVisibility(View.GONE);
            about_developer.setVisibility(View.GONE);

            //-----Video_Work-------//

            if (networkInfo != null) {

                videoUrl = "https://www.youtube.com/embed/JKiCmDoORY4";
                video1.setVisibility(View.VISIBLE);
                video1.getSettings().setJavaScriptEnabled(true);
                video1.loadUrl(videoUrl);

            } else {
                no_internet_page.setVisibility(View.VISIBLE);
            }

            try_again.setOnClickListener(view -> {

                Intent nextActivity = new Intent(Second_page.this, MainActivity.class);
                startActivity(nextActivity);

            });

        }

        else if (val == 13) {

            calculate.setVisibility(View.GONE);
            zakat_deyar_niyom.setVisibility(View.GONE);
            zakat_foroz.setVisibility(View.GONE);
            zakater_sorto.setVisibility(View.GONE);
            zakat_ki.setVisibility(View.GONE);
            zakater_hisab.setVisibility(View.GONE);
            zakater_khat.setVisibility(View.GONE);
            zakat_na_deya.setVisibility(View.GONE);
            about_developer.setVisibility(View.GONE);

            //-----Video_Work-------//

            if (networkInfo != null) {

                videoUrl = "https://ahkamuzzakat.com/";
                video1.setVisibility(View.VISIBLE);
                video1.getSettings().setJavaScriptEnabled(true);
                video1.loadUrl(videoUrl);

            } else {
                no_internet_page.setVisibility(View.VISIBLE);
            }

            try_again.setOnClickListener(view -> {

                Intent nextActivity = new Intent(Second_page.this, MainActivity.class);
                startActivity(nextActivity);

            });

        }




    }

    public void onBackPressed() {
        super.onBackPressed();
        textToSpeech.stop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        textToSpeech.stop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        textToSpeech.stop();
    }

    @Override
    protected void onPause() {
        super.onPause();
        textToSpeech.stop();
    }

    private void gotUrl(String s) {

        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }


}