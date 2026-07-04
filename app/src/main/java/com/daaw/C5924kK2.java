package com.daaw;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.kK2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5924kK2 extends AbstractC4807gK2 {
    public WebView d;
    public Long e = null;
    public final Map f;

    public C5924kK2(Map map, String str) {
        this.f = map;
    }

    @Override // com.daaw.AbstractC4807gK2
    public final void c() {
        super.c();
        new Handler().postDelayed(new RunnableC5645jK2(this), Math.max(4000 - (this.e == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.e.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.d = null;
    }

    @Override // com.daaw.AbstractC4807gK2
    public final void g(CJ2 cj2, AJ2 aj2) {
        JSONObject jSONObject = new JSONObject();
        Map mapI = aj2.i();
        Iterator it = mapI.keySet().iterator();
        if (it.hasNext()) {
            AbstractC6314li0.a(mapI.get((String) it.next()));
            throw null;
        }
        h(cj2, aj2, jSONObject);
    }

    @Override // com.daaw.AbstractC4807gK2
    public final void k() {
        WebView webView = new WebView(TJ2.b().a());
        this.d = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.d.getSettings().setAllowContentAccess(false);
        this.d.getSettings().setAllowFileAccess(false);
        this.d.setWebViewClient(new C5365iK2(this));
        j(this.d);
        ZJ2.i(this.d, null);
        Iterator it = this.f.keySet().iterator();
        if (!it.hasNext()) {
            this.e = Long.valueOf(System.nanoTime());
        } else {
            AbstractC6314li0.a(this.f.get((String) it.next()));
            throw null;
        }
    }
}
