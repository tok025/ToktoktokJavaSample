package ai.toktoktok.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import ai.toktoktok.sdk.TokTokTok;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TokTokTok.init(this);
        TokTokTok.show(this);
        TokTokTok.setToktoktokListener(new TokTokTok.TokTokTokListener() {
            @Override
            public void onContentsClosed() {
                Log.d(MainActivity.class.getSimpleName(), "onContentsClosed()");
            }

            @Override
            public void onContentsLoaded() {
                Log.d(MainActivity.class.getSimpleName(), "onContentsLoaded()");
            }

            @Override
            public void onFailedToLoadContents(int errorCode, String errorMsg) {
                Log.d(MainActivity.class.getSimpleName(),
                        "onFailedToLoadContents(" +
                        errorCode + ", " + errorMsg + ")");
            }

            @Override
            public void onContentsStarted() {
                Log.d(MainActivity.class.getSimpleName(), "onContentsStarted()");
            }
        });
    }
}