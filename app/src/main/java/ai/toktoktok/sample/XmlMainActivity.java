package ai.toktoktok.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.RelativeLayout;

import ai.toktoktok.sdk.TokTokTok;
import ai.toktoktok.sdk.TokTokTokFloatingActionButton;

public class XmlMainActivity extends AppCompatActivity {

    private RelativeLayout rlMain;

    private TokTokTokFloatingActionButton fabTokTokTok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xml_main);

        // find TokTokTokFloatingActionButton in xml.
        fabTokTokTok = findViewById(R.id.fabTokTokTok);

        // init TokTokTok class & show TokTokTokFloatingActionButton.
        TokTokTok.init(this);
        TokTokTok.show(this, fabTokTokTok);
        TokTokTok.setToktoktokListener(new TokTokTok.TokTokTokListener() {
            @Override
            public void onContentsClosed() {
                Log.d(XmlMainActivity.class.getSimpleName(), "onContentsClosed()");
            }

            @Override
            public void onContentsLoaded() {
                Log.d(XmlMainActivity.class.getSimpleName(), "onContentsLoaded()");
            }

            @Override
            public void onFailedToLoadContents(int errorCode, String errorMsg) {
                Log.d(XmlMainActivity.class.getSimpleName(),
                        "onFailedToLoadContents(" +
                        errorCode + ", " + errorMsg + ")");
            }

            @Override
            public void onContentsStarted() {
                Log.d(XmlMainActivity.class.getSimpleName(), "onContentsStarted()");
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        TokTokTok.startFabAnimation(this, fabTokTokTok);
    }

    @Override
    protected void onPause() {
        super.onPause();
        TokTokTok.stopFabAnimation();
    }
}