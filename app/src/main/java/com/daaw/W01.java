package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class W01 {
    public final Context a;
    public final WebView b;
    public final C7782qx1 c;
    public final int d;
    public final C1590Mj2 e;
    public final boolean f;
    public final PS2 g = AbstractC9322wT1.e;
    public final C6487mJ2 h;

    public W01(WebView webView, C7782qx1 c7782qx1, C1590Mj2 c1590Mj2, C6487mJ2 c6487mJ2) {
        this.b = webView;
        Context context = webView.getContext();
        this.a = context;
        this.c = c7782qx1;
        this.e = c1590Mj2;
        AbstractC9820yE1.a(context);
        this.d = ((Integer) zzba.zzc().b(AbstractC9820yE1.i9)).intValue();
        this.f = ((Boolean) zzba.zzc().b(AbstractC9820yE1.j9)).booleanValue();
        this.h = c6487mJ2;
    }

    public final /* synthetic */ void b(Bundle bundle, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        CookieManager cookieManagerZzb = zzt.zzq().zzb(this.a);
        bundle.putBoolean("accept_3p_cookie", cookieManagerZzb != null ? cookieManagerZzb.acceptThirdPartyCookies(this.b) : false);
        Context context = this.a;
        AdFormat adFormat = AdFormat.BANNER;
        AdRequest.Builder builder = new AdRequest.Builder();
        builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
        QueryInfo.generate(context, adFormat, builder.build(), queryInfoGenerationCallback);
    }

    public final /* synthetic */ void c(String str) {
        Uri uriA = Uri.parse(str);
        try {
            uriA = this.c.a(uriA, this.a, this.b, null);
        } catch (C8060rx1 e) {
            AbstractC4274eT1.zzf("Failed to append the click signal to URL: ", e);
            zzt.zzo().u(e, "TaggingLibraryJsInterface.recordClick");
        }
        this.h.c(uriA.toString(), null);
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        try {
            long jA = zzt.zzB().a();
            String strZze = this.c.c().zze(this.a, str, this.b);
            if (!this.f) {
                return strZze;
            }
            zzf.zzc(this.e, null, "csg", new Pair("clat", String.valueOf(zzt.zzB().a() - jA)));
            return strZze;
        } catch (RuntimeException e) {
            AbstractC4274eT1.zzh("Exception getting click signals. ", e);
            zzt.zzo().u(e, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    public String getClickSignalsWithTimeout(final String str, int i) {
        if (i <= 0) {
            AbstractC4274eT1.zzg("Invalid timeout for getting click signals. Timeout=" + i);
            return "";
        }
        try {
            return (String) AbstractC9322wT1.a.S0(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzap
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.getClickSignals(str);
                }
            }).get(Math.min(i, this.d), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            AbstractC4274eT1.zzh("Exception getting click signals with timeout. ", e);
            zzt.zzo().u(e, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public String getQueryInfo() {
        zzt.zzp();
        String string = UUID.randomUUID().toString();
        final Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        final C3579bx1 c3579bx1 = new C3579bx1(this, string);
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.l9)).booleanValue()) {
            this.g.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaq
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.b(bundle, c3579bx1);
                }
            });
            return string;
        }
        Context context = this.a;
        AdFormat adFormat = AdFormat.BANNER;
        AdRequest.Builder builder = new AdRequest.Builder();
        builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
        QueryInfo.generate(context, adFormat, builder.build(), c3579bx1);
        return string;
    }

    @JavascriptInterface
    public String getViewSignals() {
        try {
            long jA = zzt.zzB().a();
            String strZzh = this.c.c().zzh(this.a, this.b, null);
            if (!this.f) {
                return strZzh;
            }
            zzf.zzc(this.e, null, "vsg", new Pair("vlat", String.valueOf(zzt.zzB().a() - jA)));
            return strZzh;
        } catch (RuntimeException e) {
            AbstractC4274eT1.zzh("Exception getting view signals. ", e);
            zzt.zzo().u(e, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @JavascriptInterface
    public String getViewSignalsWithTimeout(int i) {
        if (i <= 0) {
            AbstractC4274eT1.zzg("Invalid timeout for getting view signals. Timeout=" + i);
            return "";
        }
        try {
            return (String) AbstractC9322wT1.a.S0(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzan
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.getViewSignals();
                }
            }).get(Math.min(i, this.d), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            AbstractC4274eT1.zzh("Exception getting view signals with timeout. ", e);
            zzt.zzo().u(e, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    public void recordClick(final String str) {
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.n9)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        AbstractC9322wT1.a.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzao
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.c(str);
            }
        });
    }

    @JavascriptInterface
    public void reportTouchEvent(String str) {
        int i;
        int i2;
        int i3;
        float f;
        int i4;
        try {
            JSONObject jSONObject = new JSONObject(str);
            i = jSONObject.getInt("x");
            i2 = jSONObject.getInt("y");
            i3 = jSONObject.getInt("duration_ms");
            f = (float) jSONObject.getDouble("force");
            i4 = jSONObject.getInt("type");
        } catch (RuntimeException | JSONException e) {
            e = e;
        }
        try {
            this.c.d(MotionEvent.obtain(0L, i3, i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? -1 : 3 : 2 : 1 : 0, i, i2, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
        } catch (RuntimeException e2) {
            e = e2;
            AbstractC4274eT1.zzh("Failed to parse the touch string. ", e);
            zzt.zzo().u(e, "TaggingLibraryJsInterface.reportTouchEvent");
        } catch (JSONException e3) {
            e = e3;
            AbstractC4274eT1.zzh("Failed to parse the touch string. ", e);
            zzt.zzo().u(e, "TaggingLibraryJsInterface.reportTouchEvent");
        }
    }
}
