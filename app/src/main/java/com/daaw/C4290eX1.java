package com.daaw;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;

/* JADX INFO: renamed from: com.daaw.eX1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4290eX1 {
    public final InterfaceC4579fX1 a;
    public final C4012dX1 b;

    public C4290eX1(InterfaceC4579fX1 interfaceC4579fX1, C4012dX1 c4012dX1) {
        this.b = c4012dX1;
        this.a = interfaceC4579fX1;
    }

    public final /* synthetic */ void a(String str) {
        Uri uri = Uri.parse(str);
        FW1 fw1B0 = ((RW1) this.b.a).B0();
        if (fw1B0 == null) {
            AbstractC4274eT1.zzg("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            fw1B0.o0(uri);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.daaw.fX1, com.daaw.mX1] */
    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            zze.zza("Click string is empty, not proceeding.");
            return "";
        }
        ?? r0 = this.a;
        C7782qx1 c7782qx1F = r0.f();
        if (c7782qx1F == null) {
            zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        InterfaceC6666mx1 interfaceC6666mx1C = c7782qx1F.c();
        if (r0.getContext() == null) {
            zze.zza("Context is null, ignoring.");
            return "";
        }
        InterfaceC4579fX1 interfaceC4579fX1 = this.a;
        return interfaceC6666mx1C.zzf(interfaceC4579fX1.getContext(), str, (View) interfaceC4579fX1, interfaceC4579fX1.zzi());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.daaw.fX1, com.daaw.mX1] */
    @JavascriptInterface
    public String getViewSignals() {
        ?? r0 = this.a;
        C7782qx1 c7782qx1F = r0.f();
        if (c7782qx1F == null) {
            zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        InterfaceC6666mx1 interfaceC6666mx1C = c7782qx1F.c();
        if (r0.getContext() == null) {
            zze.zza("Context is null, ignoring.");
            return "";
        }
        InterfaceC4579fX1 interfaceC4579fX1 = this.a;
        return interfaceC6666mx1C.zzh(interfaceC4579fX1.getContext(), (View) interfaceC4579fX1, interfaceC4579fX1.zzi());
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            AbstractC4274eT1.zzj("URL is empty, ignoring message");
        } else {
            zzt.zza.post(new Runnable() { // from class: com.daaw.WW1
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.a(str);
                }
            });
        }
    }
}
