package cpd.crashcourse;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;

public class intellectualproperty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intellectualproperty);


    }

    public void goToip1(View v){
        Intent intent = new Intent(this, ip1.class);
        startActivity(intent);
    }

    public void goToip2(View v){
        Intent intent = new Intent(this, ip2.class);
        startActivity(intent);
    }
    public void goToip3(View v){
        Intent intent = new Intent(this, ip3.class);
        startActivity(intent);
    }
    public void goToip4(View v){
        Intent intent = new Intent(this, ip4.class);
        startActivity(intent);
    }
    public void goToip5(View v){
        Intent intent = new Intent(this, ip5.class);
        startActivity(intent);
    }
    public void goToip6(View v){
        Intent intent = new Intent(this, ip6.class);
        startActivity(intent);
    }
    public void goToip7(View v){
        Intent intent = new Intent(this, ip7.class);
        startActivity(intent);
    }



}
