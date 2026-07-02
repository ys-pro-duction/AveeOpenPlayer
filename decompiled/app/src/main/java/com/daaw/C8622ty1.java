package com.daaw;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzba;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.daaw.ty1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8622ty1 extends AbstractCallableC3025Zy1 {
    public static final C3308az1 j = new C3308az1();
    public final Context i;

    public C8622ty1(C2813Xx1 c2813Xx1, String str, String str2, C9733xv1 c9733xv1, int i, int i2, Context context, C7774qv1 c7774qv1) {
        super(c2813Xx1, "p0JEft1H0Ux+/zQoofBGK8/hHhAdN3veKIjNmetX6I2+7J67s0tf2NBKaWy11XvI", "yaxGJhC1WxugM+8EfEc/xAIuDWtPkz77G//hU7f/vWw=", c9733xv1, i, 27);
        this.i = context;
    }

    @Override // com.daaw.AbstractCallableC3025Zy1
    public final void a() {
        int i;
        C9458ww1 c9458ww1;
        AtomicReference atomicReferenceA = j.a(this.i.getPackageName());
        synchronized (atomicReferenceA) {
            try {
                C9458ww1 c9458ww12 = (C9458ww1) atomicReferenceA.get();
                if (c9458ww12 == null || AbstractC3304ay1.d(c9458ww12.a) || c9458ww12.a.equals("E") || c9458ww12.a.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                    if (AbstractC3304ay1.d(null)) {
                        AbstractC3304ay1.d(null);
                        i = 3;
                    } else {
                        i = 5;
                    }
                    Boolean boolValueOf = Boolean.valueOf(i == 3);
                    Boolean bool = (Boolean) zzba.zzc().b(AbstractC9820yE1.j2);
                    String strC = ((Boolean) zzba.zzc().b(AbstractC9820yE1.i2)).booleanValue() ? c() : null;
                    if (bool.booleanValue() && this.b.p() && AbstractC3304ay1.d(strC)) {
                        strC = d();
                    }
                    C9458ww1 c9458ww13 = new C9458ww1((String) this.f.invoke(null, this.i, boolValueOf, strC));
                    if (AbstractC3304ay1.d(c9458ww13.a) || c9458ww13.a.equals("E")) {
                        int i2 = i - 1;
                        if (i2 == 3) {
                            String strD = d();
                            if (!AbstractC3304ay1.d(strD)) {
                                c9458ww13.a = strD;
                            }
                        } else if (i2 == 4) {
                            throw null;
                        }
                    }
                    atomicReferenceA.set(c9458ww13);
                }
                c9458ww1 = (C9458ww1) atomicReferenceA.get();
            } finally {
            }
        }
        synchronized (this.e) {
            if (c9458ww1 != null) {
                try {
                    this.e.y0(c9458ww1.a);
                    this.e.P(c9458ww1.b);
                    this.e.S(c9458ww1.c);
                    this.e.j0(c9458ww1.d);
                    this.e.x0(c9458ww1.e);
                } finally {
                }
            }
        }
    }

    public final String c() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] bArrF = AbstractC3304ay1.f((String) zzba.zzc().b(AbstractC9820yE1.k2));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrF)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(AbstractC3304ay1.f((String) zzba.zzc().b(AbstractC9820yE1.l2)))));
            }
            Context context = this.i;
            String packageName = context.getPackageName();
            this.b.k();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            final XS2 xs2C = XS2.C();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager.OnChecksumsReadyListener() { // from class: com.daaw.ez1
                @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
                public final void onChecksumsReady(List list) {
                    XS2 xs2 = xs2C;
                    if (list == null) {
                        xs2.e(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ApkChecksum apkChecksumA = AbstractC3586bz1.a(list.get(i));
                            if (apkChecksumA.getType() == 8) {
                                xs2.e(AbstractC3304ay1.b(apkChecksumA.getValue()));
                                return;
                            }
                        }
                        xs2.e(null);
                    } catch (Throwable unused) {
                        xs2.e(null);
                    }
                }
            });
            return (String) xs2C.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }

    public final String d() {
        try {
            if (this.b.l() != null) {
                this.b.l().get();
            }
            C3013Zv1 c3013Zv1C = this.b.c();
            if (c3013Zv1C == null || !c3013Zv1C.w0()) {
                return null;
            }
            return c3013Zv1C.L0();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }
}
