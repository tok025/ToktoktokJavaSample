package ai.toktoktok.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import ai.toktoktok.sdk.TokTokTok;
import ai.toktoktok.sdk.TokTokTokFloatingActionButton;


// Programmatically
public class ProgrammaticMainActivity extends AppCompatActivity {

    private RelativeLayout rlMain;

    private TokTokTokFloatingActionButton fabTokTokTok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programmatic_main);

        // add TokTokTokFloatingActionButton to root view programmatically.
        rlMain = findViewById(R.id.rlMain);
        fabTokTokTok = new TokTokTokFloatingActionButton(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParams.setMargins(48, 48, 48, 48);
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        rlMain.addView(fabTokTokTok, layoutParams);

        // init TokTokTok class & show TokTokTokFloatingActionButton.
        TokTokTok.init(this);
        TokTokTok.show(this, fabTokTokTok);
        TokTokTok.setToktoktokListener(new TokTokTok.TokTokTokListener() {
            @Override
            public void onContentsClosed() {
                Log.d(ProgrammaticMainActivity.class.getSimpleName(), "onContentsClosed()");
            }

            @Override
            public void onContentsLoaded() {
                Log.d(ProgrammaticMainActivity.class.getSimpleName(), "onContentsLoaded()");
            }

            @Override
            public void onFailedToLoadContents(int errorCode, String errorMsg) {
                Log.d(ProgrammaticMainActivity.class.getSimpleName(),
                        "onFailedToLoadContents(" +
                                errorCode + ", " + errorMsg + ")");
            }

            @Override
            public void onContentsStarted() {
                Log.d(ProgrammaticMainActivity.class.getSimpleName(), "onContentsStarted()");
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        fabTokTokTok.startFabAnimation();
    }

    @Override
    protected void onPause() {
        super.onPause();
        fabTokTokTok.stopFabAnimation();
    }
}
