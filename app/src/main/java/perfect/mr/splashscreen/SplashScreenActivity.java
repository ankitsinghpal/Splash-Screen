package perfect.mr.splashscreen;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {

    private  static int time=5000;  //  initialize your time value in milliseconds
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        splashScreenMethod();       // invoking our method
    }

    void splashScreenMethod(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // going to next activity
                Intent i=new Intent(SplashScreenActivity.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        },time);

    }
}
