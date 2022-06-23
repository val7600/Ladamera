package com.valentin.menage.radar;

import android.graphics.Bitmap;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class CameraView extends WebViewClient {

    public CameraView() {
    }

    // When page loading
    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        Log.i("MyLog", "Your current url when webpage loading.." + url);
    }

    // When page load finish.
    @Override
    public void onPageFinished(WebView view, String url) {
        Log.i("MyLog", "Your current url when webpage loading.. finish" + url);
        super.onPageFinished(view, url);
    }

    @Override
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
    }
}