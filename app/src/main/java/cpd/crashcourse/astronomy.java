package cpd.crashcourse;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class astronomy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_astronomy);


    }

    public void goToAstronomy1(View v){
        Intent intent = new Intent(this, astronomy1.class);
        startActivity(intent);
    }

    public void goToAstronomy2(View v){
        Intent intent = new Intent(this, astronomy2.class);
        startActivity(intent);
    }

    public void goToAstronomy3(View v){
        Intent intent = new Intent(this, Astronomy3.class);
        startActivity(intent);
    }

}




