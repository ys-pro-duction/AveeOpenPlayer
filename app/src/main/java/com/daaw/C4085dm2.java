package com.daaw;

import android.content.Context;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.dm2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4085dm2 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;

    public C4085dm2(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        YH2 yh2 = (YH2) this.a.zzb();
        final CookieManager cookieManagerZzb = zzt.zzq().zzb((Context) this.b.zzb());
        PH2 ph2I = IH2.a(new Callable() { // from class: com.daaw.am2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = cookieManagerZzb;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) zzba.zzc().b(AbstractC9820yE1.M0));
            }
        }, SH2.WEBVIEW_COOKIE, yh2).i(1L, TimeUnit.SECONDS);
        final C3528bm2 c3528bm2 = new InterfaceC9554xH2() { // from class: com.daaw.bm2
            @Override // com.daaw.InterfaceC9554xH2
            public final Object zza(Object obj) {
                return "";
            }
        };
        return ph2I.c(Exception.class, new WR2() { // from class: com.daaw.JH2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return AbstractC7360pS2.h("");
            }
        }).a();
    }
}
