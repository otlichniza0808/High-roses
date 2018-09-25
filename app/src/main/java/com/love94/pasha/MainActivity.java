package com.love94.pasha;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebView = (WebView) findViewById(R.id.activity_main_webview);

        mWebView.loadUrl("https://xn----ktbfbfedxjmgh9k.xn--p1ai/");
        mWebView.setWebViewClient(new WebViewClient());

        Uri address = Uri.parse("https://xn----ktbfbfedxjmgh9k.xn--p1ai/");
        Intent openlinkIntent = new Intent(Intent.ACTION_VIEW, address);
        startActivity(openlinkIntent);
    }

    @Override
    public void onBackPressed() {
        if(mWebView.canGoBack()) {
            mWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
