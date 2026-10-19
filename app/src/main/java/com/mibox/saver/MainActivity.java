package com.mibox.saver;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// للتجربة فقط: يفتح الصفحة كاملة الشاشة من قائمة التطبيقات
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        WebView w = new WebView(this);
        w.setBackgroundColor(0xFF050B22);
        WebSettings s = w.getSettings();
        s.setJavaScriptEnabled(true);
        s.setDomStorageEnabled(true);
        w.setWebViewClient(new WebViewClient());
        w.loadUrl(Config.URL);
        setContentView(w);
    }
}
