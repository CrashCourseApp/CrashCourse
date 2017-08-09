package cpd.crashcourse;
import android.content.Intent;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;


public class AnatomyPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anatomy_page);



    }
    public void goToAnatomyIntro(View v){
        Intent intent = new Intent(this, anatomyIntro.class);
        startActivity(intent);
    }

    public void goToAnatomy2(View v){
        Intent intent = new Intent(this, anatomy2.class);
        startActivity(intent);
    }

    public void goToAnatomy3(View v){
        Intent intent = new Intent(this, anatomy3.class);
        startActivity(intent);
    }

    public void goToAnatomy4(View v){
        Intent intent = new Intent(this, anatomy4.class);
        startActivity(intent);
    }

    public void goToAnatomy5(View v){
        Intent intent = new Intent(this, anatomy5.class);
        startActivity(intent);
    }

    public void goToAnatomy6(View v){
        Intent intent = new Intent(this, anatomy6.class);
        startActivity(intent);
    }

    public void goToAnatomy7(View v){
        Intent intent = new Intent(this, anatomy7.class);
        startActivity(intent);
    }

    public void goToAnatomy8(View v){
        Intent intent = new Intent(this, anatomy8.class);
        startActivity(intent);
    }

    public void goToAnatomy9(View v){
        Intent intent = new Intent(this, anatomy9.class);
        startActivity(intent);
    }
}
