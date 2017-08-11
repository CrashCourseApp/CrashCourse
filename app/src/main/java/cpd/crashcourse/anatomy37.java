package cpd.crashcourse;

import android.annotation.SuppressLint;
import android.os.RecoverySystem;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerFragment;
import android.content.Intent;
import com.google.android.youtube.player.YouTubePlayerView;



import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;



public class anatomy37 extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener{

    public static final String API_KEY = "AIza5yAhQFD9ykc519_3FeL21EO2HAipQD7-Mfs";

    public static final String Video_ID2 = "kb146Y1igTQ";




    public static final int RECOVER_DIALOG_REQUEST = 1;

    YouTubePlayerFragment myYouTubePlayerFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anatomy2);

        myYouTubePlayerFragment = (YouTubePlayerFragment) getFragmentManager()
                .findFragmentById(R.id.youtubeplayerfragment2);
        myYouTubePlayerFragment.initialize(API_KEY, this);


    }
    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult errorReason) {
        if(errorReason.isUserRecoverableError()) {
            errorReason.getErrorDialog(this, RECOVER_DIALOG_REQUEST).show();
        } else {
            String errorMessage = String.format(
                    "There was an error initializing the YouTubePlayer (%1$s)",
                    errorReason.toString());
            Toast.makeText(this, errorMessage, Toast.LENGTH_LONG).show();
        }
    }


    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player, boolean wasRestored){

        if(!wasRestored) {
            player.loadVideo(Video_ID2);
            player.setFullscreen(true);

        }
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if(requestCode == RECOVER_DIALOG_REQUEST) {
            getYouTubePlayerProvider().initialize(API_KEY, this);
        }

    }
    protected YouTubePlayer.Provider getYouTubePlayerProvider(){
        return (YouTubePlayerView)findViewById(R.id.youtubeplayerfragment2);
    }

}


