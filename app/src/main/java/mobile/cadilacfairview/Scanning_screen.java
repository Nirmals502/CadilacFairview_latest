package mobile.cadilacfairview;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ProgressBar;

public class Scanning_screen extends AppCompatActivity {
    ProgressBar pro_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanning_screen);
        pro_bar = (ProgressBar) findViewById(R.id.progressBar);
        RotateAnimation rotate = new RotateAnimation(0, 360,
                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF,
                0.5f);

        rotate.setDuration(4000);
        rotate.setRepeatCount(Animation.INFINITE);
        pro_bar.setAnimation(rotate);
        goToNextScreen();
    }

    private void goToNextScreen() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent int_login = new Intent(Scanning_screen.this, Offer_response_screen.class);
                startActivity(int_login);
                finish();
            }
        }, 5000);
    }
}
