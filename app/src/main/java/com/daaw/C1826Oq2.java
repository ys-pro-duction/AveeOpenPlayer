package com.daaw;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: renamed from: com.daaw.Oq2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1826Oq2 implements InterfaceC1930Pq2 {
    public static /* synthetic */ AbstractC9841yJ2 i(String str, String str2, String str3, EnumC2056Qq2 enumC2056Qq2, String str4, WebView webView, String str5, String str6, EnumC2160Rq2 enumC2160Rq2) {
        IJ2 ij2A = IJ2.a("Google", str2);
        HJ2 hj2M = m("javascript");
        DJ2 dj2K = k(enumC2056Qq2.toString());
        HJ2 hj2 = HJ2.NONE;
        if (hj2M == hj2) {
            AbstractC4274eT1.zzj("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (dj2K == null) {
            AbstractC4274eT1.zzj("Omid html session error; Unable to parse creative type: ".concat(String.valueOf(enumC2056Qq2)));
            return null;
        }
        HJ2 hj2M2 = m(str4);
        if (dj2K == DJ2.VIDEO && hj2M2 == hj2) {
            AbstractC4274eT1.zzj("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        return AbstractC9841yJ2.a(C10120zJ2.a(dj2K, l(enumC2160Rq2.toString()), hj2M, hj2M2, true), AJ2.b(ij2A, webView, str5, ""));
    }

    public static /* synthetic */ AbstractC9841yJ2 j(String str, String str2, String str3, String str4, EnumC2056Qq2 enumC2056Qq2, WebView webView, String str5, String str6, EnumC2160Rq2 enumC2160Rq2) {
        IJ2 ij2A = IJ2.a(str, str2);
        HJ2 hj2M = m("javascript");
        HJ2 hj2M2 = m(str4);
        DJ2 dj2K = k(enumC2056Qq2.toString());
        HJ2 hj2 = HJ2.NONE;
        if (hj2M == hj2) {
            AbstractC4274eT1.zzj("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (dj2K == null) {
            AbstractC4274eT1.zzj("Omid js session error; Unable to parse creative type: ".concat(String.valueOf(enumC2056Qq2)));
            return null;
        }
        if (dj2K == DJ2.VIDEO && hj2M2 == hj2) {
            AbstractC4274eT1.zzj("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        return AbstractC9841yJ2.a(C10120zJ2.a(dj2K, l(enumC2160Rq2.toString()), hj2M, hj2M2, true), AJ2.c(ij2A, webView, str5, ""));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.daaw.DJ2 k(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -382745961(0xffffffffe92fc297, float:-1.3280059E25)
            r2 = 2
            r3 = 1
            if (r0 == r1) goto L2a
            r1 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r0 == r1) goto L20
            r1 = 714893483(0x2a9c68ab, float:2.7783795E-13)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "nativeDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 1
            goto L35
        L20:
            java.lang.String r0 = "video"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 2
            goto L35
        L2a:
            java.lang.String r0 = "htmlDisplay"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 0
            goto L35
        L34:
            r4 = -1
        L35:
            if (r4 == 0) goto L43
            if (r4 == r3) goto L40
            if (r4 == r2) goto L3d
            r4 = 0
            return r4
        L3d:
            com.daaw.DJ2 r4 = com.daaw.DJ2.VIDEO
            return r4
        L40:
            com.daaw.DJ2 r4 = com.daaw.DJ2.NATIVE_DISPLAY
            return r4
        L43:
            com.daaw.DJ2 r4 = com.daaw.DJ2.HTML_DISPLAY
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C1826Oq2.k(java.lang.String):com.daaw.DJ2");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.daaw.GJ2 l(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = -1104128070(0xffffffffbe3057ba, float:-0.17220965)
            r2 = 1
            r3 = 2
            if (r0 == r1) goto L2a
            r1 = 1318088141(0x4e906dcd, float:1.2115575E9)
            if (r0 == r1) goto L20
            r1 = 1988248512(0x768243c0, float:1.3210405E33)
            if (r0 == r1) goto L16
            goto L34
        L16:
            java.lang.String r0 = "onePixel"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 2
            goto L35
        L20:
            java.lang.String r0 = "definedByJavascript"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 1
            goto L35
        L2a:
            java.lang.String r0 = "beginToRender"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L34
            r4 = 0
            goto L35
        L34:
            r4 = -1
        L35:
            if (r4 == 0) goto L44
            if (r4 == r2) goto L41
            if (r4 == r3) goto L3e
            com.daaw.GJ2 r4 = com.daaw.GJ2.UNSPECIFIED
            return r4
        L3e:
            com.daaw.GJ2 r4 = com.daaw.GJ2.ONE_PIXEL
            return r4
        L41:
            com.daaw.GJ2 r4 = com.daaw.GJ2.DEFINED_BY_JAVASCRIPT
            return r4
        L44:
            com.daaw.GJ2 r4 = com.daaw.GJ2.BEGIN_TO_RENDER
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C1826Oq2.l(java.lang.String):com.daaw.GJ2");
    }

    public static HJ2 m(String str) {
        return "native".equals(str) ? HJ2.NATIVE : "javascript".equals(str) ? HJ2.JAVASCRIPT : HJ2.NONE;
    }

    public static final Object n(InterfaceC1722Nq2 interfaceC1722Nq2) {
        try {
            return interfaceC1722Nq2.zza();
        } catch (RuntimeException e) {
            zzt.zzo().t(e, "omid exception");
            return null;
        }
    }

    public static final void o(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e) {
            zzt.zzo().t(e, "omid exception");
        }
    }

    @Override // com.daaw.InterfaceC1930Pq2
    public final AbstractC9841yJ2 a(final String str, final WebView webView, String str2, String str3, final String str4, final EnumC2160Rq2 enumC2160Rq2, final EnumC2056Qq2 enumC2056Qq2, final String str5) {
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.S4)).booleanValue() || !AbstractC9283wJ2.b()) {
            return null;
        }
        final String str6 = "javascript";
        final String str7 = "Google";
        final String str8 = "";
        return (AbstractC9841yJ2) n(new InterfaceC1722Nq2(str7, str, str6, enumC2056Qq2, str4, webView, str5, str8, enumC2160Rq2) { // from class: com.daaw.Kq2
            public final /* synthetic */ String b;
            public final /* synthetic */ EnumC2056Qq2 d;
            public final /* synthetic */ String e;
            public final /* synthetic */ WebView f;
            public final /* synthetic */ String g;
            public final /* synthetic */ EnumC2160Rq2 i;
            public final /* synthetic */ String a = "Google";
            public final /* synthetic */ String c = "javascript";
            public final /* synthetic */ String h = "";

            {
                this.b = str;
                this.d = enumC2056Qq2;
                this.e = str4;
                this.f = webView;
                this.g = str5;
                this.i = enumC2160Rq2;
            }

            @Override // com.daaw.InterfaceC1722Nq2
            public final Object zza() {
                return C1826Oq2.i(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
            }
        });
    }

    @Override // com.daaw.InterfaceC1930Pq2
    public final boolean b(final Context context) {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.S4)).booleanValue()) {
            Boolean bool = (Boolean) n(new InterfaceC1722Nq2() { // from class: com.daaw.Jq2
                @Override // com.daaw.InterfaceC1722Nq2
                public final Object zza() {
                    if (AbstractC9283wJ2.b()) {
                        return Boolean.TRUE;
                    }
                    AbstractC9283wJ2.a(context);
                    return Boolean.valueOf(AbstractC9283wJ2.b());
                }
            });
            return bool != null && bool.booleanValue();
        }
        AbstractC4274eT1.zzj("Omid flag is disabled");
        return false;
    }

    @Override // com.daaw.InterfaceC1930Pq2
    public final AbstractC9841yJ2 c(final String str, final WebView webView, String str2, String str3, final String str4, final String str5, final EnumC2160Rq2 enumC2160Rq2, final EnumC2056Qq2 enumC2056Qq2, final String str6) {
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.S4)).booleanValue() || !AbstractC9283wJ2.b()) {
            return null;
        }
        final String str7 = "";
        final String str8 = "javascript";
        return (AbstractC9841yJ2) n(new InterfaceC1722Nq2(str5, str, str8, str4, enumC2056Qq2, webView, str6, str7, enumC2160Rq2) { // from class: com.daaw.Hq2
            public final /* synthetic */ String a;
            public final /* synthetic */ String b;
            public final /* synthetic */ String d;
            public final /* synthetic */ EnumC2056Qq2 e;
            public final /* synthetic */ WebView f;
            public final /* synthetic */ String g;
            public final /* synthetic */ EnumC2160Rq2 i;
            public final /* synthetic */ String c = "javascript";
            public final /* synthetic */ String h = "";

            {
                this.d = str4;
                this.e = enumC2056Qq2;
                this.f = webView;
                this.g = str6;
                this.i = enumC2160Rq2;
            }

            @Override // com.daaw.InterfaceC1722Nq2
            public final Object zza() {
                return C1826Oq2.j(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
            }
        });
    }

    @Override // com.daaw.InterfaceC1930Pq2
    public final void d(final AbstractC9841yJ2 abstractC9841yJ2) {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.S4)).booleanValue() && AbstractC9283wJ2.b()) {
            abstractC9841yJ2.getClass();
            o(new Runnable() { // from class: com.daaw.Iq2
                @Override // java.lang.Runnable
                public final void run() {
                    abstractC9841yJ2.e();
                }
            });
        }
    }

    @Override // com.daaw.InterfaceC1930Pq2
    public final void e(final AbstractC9841yJ2 abstractC9841yJ2, final View view) {
        o(new Runnable() { // from class: com.daaw.Fq2
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) zzba.zzc().b(AbstractC9820yE1.S4)).booleanValue() && AbstractC9283wJ2.b()) {
                    abstractC9841yJ2.b(view, FJ2.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.daaw.InterfaceC1930Pq2
    public final void f(final AbstractC9841yJ2 abstractC9841yJ2) {
        o(new Runnable() { // from class: com.daaw.Mq2
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) zzba.zzc().b(AbstractC9820yE1.S4)).booleanValue() && AbstractC9283wJ2.b()) {
                    abstractC9841yJ2.c();
                }
            }
        });
    }

    @Override // com.daaw.InterfaceC1930Pq2
    public final void g(final AbstractC9841yJ2 abstractC9841yJ2, final View view) {
        o(new Runnable() { // from class: com.daaw.Gq2
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) zzba.zzc().b(AbstractC9820yE1.S4)).booleanValue() && AbstractC9283wJ2.b()) {
                    abstractC9841yJ2.d(view);
                }
            }
        });
    }

    @Override // com.daaw.InterfaceC1930Pq2
    public final String h(Context context) {
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.S4)).booleanValue()) {
            return (String) n(new InterfaceC1722Nq2() { // from class: com.daaw.Lq2
                @Override // com.daaw.InterfaceC1722Nq2
                public final Object zza() {
                    return "a.1.4.8-google_20230803";
                }
            });
        }
        return null;
    }
}
