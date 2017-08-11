package cpd.crashcourse;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class BigHistory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_big_history);

    }

    public void goToH1(View v){
        Intent intent = new Intent(this, h1.class);
        startActivity(intent);
    }

    public void goToH2(View v){
        Intent intent = new Intent(this, h2.class);
        startActivity(intent);
    }
    public void goToH3(View v){
        Intent intent = new Intent(this, FullscreenActivity.class);
        startActivity(intent);
    }
    public void goToH4(View v){
        Intent intent = new Intent(this, h4.class);
        startActivity(intent);
    }
    public void goToH5(View v){
        Intent intent = new Intent(this, h5.class);
        startActivity(intent);
    }
    public void goToH6(View v){
        Intent intent = new Intent(this, h6.class);
        startActivity(intent);
    }
    public void goToH7(View v){
        Intent intent = new Intent(this, h7.class);
        startActivity(intent);
    }
    public void goToH8(View v){
        Intent intent = new Intent(this, h8.class);
        startActivity(intent);
    }
    public void goToH9(View v){
        Intent intent = new Intent(this, h9.class);
        startActivity(intent);
    }
    public void goToH10(View v){
        Intent intent = new Intent(this, h10.class);
        startActivity(intent);
    }
}
