package cpd.crashcourse;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class EcoPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eco_page);
    }

    public void goToE1(View v){
        Intent intent = new Intent(this, ecol1.class);
        startActivity(intent);
    }

    public void goToE2(View v){
        Intent intent = new Intent(this, ecol2.class);
        startActivity(intent);
    }
    public void goToE3(View v){
        Intent intent = new Intent(this, ecol3.class);
        startActivity(intent);
    }
    public void goToE4(View v){
        Intent intent = new Intent(this, ecol4.class);
        startActivity(intent);
    }
    public void goToE5(View v){
        Intent intent = new Intent(this, ecol5.class);
        startActivity(intent);
    }
    public void goToE6(View v){
        Intent intent = new Intent(this, ecol6.class);
        startActivity(intent);
    }
    public void goToE7(View v){
        Intent intent = new Intent(this, ecol7.class);
        startActivity(intent);
    }
    public void goToE8(View v){
        Intent intent = new Intent(this, ecol8.class);
        startActivity(intent);
    }
    public void goToE9(View v){
        Intent intent = new Intent(this, ecol9.class);
        startActivity(intent);
    }
    public void goToE10(View v){
        Intent intent = new Intent(this, ecol10.class);
        startActivity(intent);
    }
    public void goToE11(View v){
        Intent intent = new Intent(this, ecol11.class);
        startActivity(intent);
    }
    public void goToE12(View v){
        Intent intent = new Intent(this, ecol12.class);
        startActivity(intent);
    }
}


