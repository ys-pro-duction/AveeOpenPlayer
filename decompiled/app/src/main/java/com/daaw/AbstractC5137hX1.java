package com.daaw;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.io.File;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.hX1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5137hX1 extends FW1 {
    public AbstractC5137hX1(InterfaceC9334wW1 interfaceC9334wW1, C6454mB1 c6454mB1, boolean z, BinderC9431wq2 binderC9431wq2) {
        super(interfaceC9334wW1, c6454mB1, z, new FN1(interfaceC9334wW1, interfaceC9334wW1.zzE(), new C3936dE1(interfaceC9334wW1.getContext())), null, binderC9431wq2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebResourceResponse F0(WebView webView, String str, Map map) {
        String str2;
        if (!(webView instanceof InterfaceC9334wW1)) {
            AbstractC4274eT1.zzj("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        InterfaceC9334wW1 interfaceC9334wW1 = (InterfaceC9334wW1) webView;
        InterfaceC3152aR1 interfaceC3152aR1 = this.Y;
        if (interfaceC3152aR1 != null) {
            interfaceC3152aR1.a(str, map, 1);
        }
        if (!"mraid.js".equalsIgnoreCase(new File(str).getName())) {
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            return super.a0(str, map);
        }
        if (interfaceC9334wW1.zzN() != null) {
            interfaceC9334wW1.zzN().zzE();
        }
        if (interfaceC9334wW1.zzO().i()) {
            str2 = (String) zzba.zzc().b(AbstractC9820yE1.O);
        } else if (interfaceC9334wW1.w()) {
            str2 = (String) zzba.zzc().b(AbstractC9820yE1.N);
        } else {
            str2 = (String) zzba.zzc().b(AbstractC9820yE1.M);
        }
        zzt.zzp();
        return com.google.android.gms.ads.internal.util.zzt.zzw(interfaceC9334wW1.getContext(), interfaceC9334wW1.zzn().B, str2);
    }
}
