package com.daaw;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.daaw.cA1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3641cA1 extends Thread {
    public boolean B;
    public boolean C;
    public final Object D;
    public final C2405Tz1 E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final String N;
    public final boolean O;
    public final boolean P;
    public final boolean Q;

    public C3641cA1() {
        C2405Tz1 c2405Tz1 = new C2405Tz1();
        this.B = false;
        this.C = false;
        this.E = c2405Tz1;
        this.D = new Object();
        this.G = ((Long) AbstractC7028oF1.d.e()).intValue();
        this.H = ((Long) AbstractC7028oF1.a.e()).intValue();
        this.I = ((Long) AbstractC7028oF1.e.e()).intValue();
        this.J = ((Long) AbstractC7028oF1.c.e()).intValue();
        this.K = ((Integer) zzba.zzc().b(AbstractC9820yE1.S)).intValue();
        this.L = ((Integer) zzba.zzc().b(AbstractC9820yE1.T)).intValue();
        this.M = ((Integer) zzba.zzc().b(AbstractC9820yE1.U)).intValue();
        this.F = ((Long) AbstractC7028oF1.f.e()).intValue();
        this.N = (String) zzba.zzc().b(AbstractC9820yE1.W);
        this.O = ((Boolean) zzba.zzc().b(AbstractC9820yE1.X)).booleanValue();
        this.P = ((Boolean) zzba.zzc().b(AbstractC9820yE1.Y)).booleanValue();
        this.Q = ((Boolean) zzba.zzc().b(AbstractC9820yE1.Z)).booleanValue();
        setName("ContentFetchTask");
    }

    public final C2301Sz1 a() {
        return this.E.a(this.Q);
    }

    public final C3363bA1 b(View view, C2301Sz1 c2301Sz1) {
        if (view == null) {
            return new C3363bA1(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new C3363bA1(this, 0, 0);
            }
            c2301Sz1.k(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new C3363bA1(this, 1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof InterfaceC9334wW1)) {
            WebView webView = (WebView) view;
            if (!AbstractC7494pv0.d()) {
                return new C3363bA1(this, 0, 0);
            }
            c2301Sz1.h();
            webView.post(new RunnableC3084aA1(this, c2301Sz1, webView, globalVisibleRect));
            return new C3363bA1(this, 0, 1);
        }
        if (!(view instanceof ViewGroup)) {
            return new C3363bA1(this, 0, 0);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
            C3363bA1 c3363bA1B = b(viewGroup.getChildAt(i3), c2301Sz1);
            i += c3363bA1B.a;
            i2 += c3363bA1B.b;
        }
        return new C3363bA1(this, i, i2);
    }

    public final void c(View view) {
        try {
            C2301Sz1 c2301Sz1 = new C2301Sz1(this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.P);
            Context contextB = zzt.zzb().b();
            if (contextB != null && !TextUtils.isEmpty(this.N)) {
                String str = (String) view.getTag(contextB.getResources().getIdentifier((String) zzba.zzc().b(AbstractC9820yE1.V), "id", contextB.getPackageName()));
                if (str != null && str.equals(this.N)) {
                    return;
                }
            }
            C3363bA1 c3363bA1B = b(view, c2301Sz1);
            c2301Sz1.m();
            if (c3363bA1B.a == 0 && c3363bA1B.b == 0) {
                return;
            }
            int i = c3363bA1B.b;
            if (i != 0) {
                if (i == 0) {
                }
                this.E.b(c2301Sz1);
            } else if (c2301Sz1.c() == 0) {
                return;
            }
            if (this.E.d(c2301Sz1)) {
                return;
            }
            this.E.b(c2301Sz1);
        } catch (Exception e) {
            AbstractC4274eT1.zzh("Exception in fetchContentOnUIThread", e);
            zzt.zzo().u(e, "ContentFetchTask.fetchContent");
        }
    }

    public final void d(C2301Sz1 c2301Sz1, WebView webView, String str, boolean z) {
        C2301Sz1 c2301Sz12;
        c2301Sz1.g();
        try {
            if (TextUtils.isEmpty(str)) {
                c2301Sz12 = c2301Sz1;
            } else {
                String strOptString = new JSONObject(str).optString("text");
                if (this.O || TextUtils.isEmpty(webView.getTitle())) {
                    c2301Sz12 = c2301Sz1;
                    c2301Sz12.l(strOptString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    c2301Sz1.l(webView.getTitle() + "\n" + strOptString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                    c2301Sz12 = c2301Sz1;
                }
            }
            if (c2301Sz12.o()) {
                this.E.c(c2301Sz12);
            }
        } catch (JSONException unused) {
            AbstractC4274eT1.zze("Json string may be malformed.");
        } catch (Throwable th) {
            AbstractC4274eT1.zzf("Failed to get webview content.", th);
            zzt.zzo().u(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void e() {
        synchronized (this.D) {
            try {
                if (this.B) {
                    AbstractC4274eT1.zze("Content hash thread already started, quitting...");
                } else {
                    this.B = true;
                    start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        synchronized (this.D) {
            this.C = true;
            AbstractC4274eT1.zze("ContentFetchThread: paused, pause = true");
        }
    }

    public final void g() {
        synchronized (this.D) {
            this.C = false;
            this.D.notifyAll();
            AbstractC4274eT1.zze("ContentFetchThread: wakeup");
        }
    }

    public final boolean h() {
        return this.C;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r3.importance != 100) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r2.inKeyguardRestrictedInputMode() != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        r0 = (android.os.PowerManager) r0.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r0 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r0.isScreenOn() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        r0 = com.google.android.gms.ads.internal.zzt.zzb().a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        com.daaw.AbstractC4274eT1.zze("ContentFetchThread: no activity. Sleeping.");
        f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        if (r0.getWindow() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
    
        if (r0.getWindow().getDecorView() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0082, code lost:
    
        r1 = r0.getWindow().getDecorView().findViewById(android.R.id.content);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0092, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0093, code lost:
    
        com.google.android.gms.ads.internal.zzt.zzo().u(r0, "ContentFetchTask.extractContent");
        com.daaw.AbstractC4274eT1.zze("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c7, code lost:
    
        com.daaw.AbstractC4274eT1.zzh("Error in ContentFetchTask", r0);
        com.google.android.gms.ads.internal.zzt.zzo().u(r0, "ContentFetchTask.run");
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d6, code lost:
    
        com.daaw.AbstractC4274eT1.zzh("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00de A[EXC_TOP_SPLITTER, LOOP:1: B:66:0x00de->B:73:0x00de, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C3641cA1.run():void");
    }
}
