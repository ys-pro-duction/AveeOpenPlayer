package com.daaw;

import com.daaw.C3991dS0;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: com.daaw.aS0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3155aS0 {
    public static final Object d = new Object();
    public static C3155aS0 e;
    public String a = "";
    public final String b;
    public final C3991dS0 c;

    public C3155aS0(String str, C3991dS0.c cVar, FQ fq, C3991dS0.d dVar, KQ kq) {
        this.c = new C3991dS0(cVar, fq, dVar, kq);
        this.b = str;
    }

    public static /* synthetic */ List a(File file, Boolean[] boolArr) {
        List listE = C1225Iw0.h().e(file.getAbsolutePath());
        boolArr[0] = Boolean.valueOf(listE != null && listE.size() > 0);
        return listE;
    }

    public static C3155aS0 d(String str, C3991dS0.c cVar, FQ fq, C3991dS0.d dVar, KQ kq) {
        C3155aS0 c3155aS0;
        C3155aS0 c3155aS02 = e;
        if (c3155aS02 != null) {
            return c3155aS02;
        }
        synchronized (d) {
            try {
                if (e == null) {
                    e = new C3155aS0(str, cVar, fq, dVar, kq);
                }
                c3155aS0 = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3155aS0;
    }

    public AsyncTaskC2517Vb1 e(String str) {
        return AbstractC3712cS0.g("https://api.shoutcast.com/genre/secondary?parentid=" + str + "&k=" + AbstractC3712cS0.f() + "&f=xml", this.b + "_genres_sec_" + str, new GQ() { // from class: com.daaw.XR0
            @Override // com.daaw.GQ
            public final Object a(Object obj, Object obj2) {
                return this.a.g((File) obj, (Boolean[]) obj2);
            }
        }, 720);
    }

    public AsyncTaskC2517Vb1 f(String str) {
        return AbstractC3712cS0.g("https://api.shoutcast.com/station/advancedsearch?genre_id=" + str + "&limit=" + RCHTTPStatusCodes.SUCCESS + "&f=xml&k=" + AbstractC3712cS0.f(), this.b + "_stations_" + str, new GQ() { // from class: com.daaw.YR0
            @Override // com.daaw.GQ
            public final Object a(Object obj, Object obj2) {
                return this.a.h((File) obj, (Boolean[]) obj2);
            }
        }, 720);
    }

    public final /* synthetic */ B61 g(File file, Boolean[] boolArr) {
        FileInputStream fileInputStream;
        List listC = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (IOException unused) {
            fileInputStream = null;
        }
        C7378pX0 c7378pX0 = new C7378pX0();
        if (fileInputStream == null) {
            c7378pX0.a("Network error");
            return new B61(null, c7378pX0);
        }
        try {
            listC = this.c.c(fileInputStream, c7378pX0);
        } catch (IOException e2) {
            c7378pX0.b("io", e2);
        } catch (XmlPullParserException e3) {
            c7378pX0.b("xml parser", e3);
        }
        boolArr[0] = Boolean.valueOf(listC != null && listC.size() > 0);
        return new B61(listC, c7378pX0);
    }

    public final /* synthetic */ B61 h(File file, Boolean[] boolArr) {
        FileInputStream fileInputStream;
        List listD = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (IOException unused) {
            fileInputStream = null;
        }
        C7378pX0 c7378pX0 = new C7378pX0();
        if (fileInputStream == null) {
            c7378pX0.a("Network error");
            return new B61(null, c7378pX0);
        }
        try {
            listD = this.c.d(fileInputStream, c7378pX0);
        } catch (IOException e2) {
            c7378pX0.b("io", e2);
        } catch (XmlPullParserException e3) {
            c7378pX0.b("xml parser", e3);
        }
        boolArr[0] = Boolean.valueOf(listD != null && listD.size() > 0);
        return new B61(listD, c7378pX0);
    }

    public AsyncTaskC2517Vb1 i(String str, String str2) {
        return AbstractC3712cS0.g("https://yp.shoutcast.com/" + str + "?id=" + str2, this.b + "_station_" + str2, new GQ() { // from class: com.daaw.ZR0
            @Override // com.daaw.GQ
            public final Object a(Object obj, Object obj2) {
                return C3155aS0.a((File) obj, (Boolean[]) obj2);
            }
        }, 720);
    }
}
