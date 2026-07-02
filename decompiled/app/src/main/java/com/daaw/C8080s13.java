package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.s13, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8080s13 implements InterfaceC7659qX2 {
    public final Context a;
    public final List b = new ArrayList();
    public final InterfaceC7659qX2 c;
    public InterfaceC7659qX2 d;
    public InterfaceC7659qX2 e;
    public InterfaceC7659qX2 f;
    public InterfaceC7659qX2 g;
    public InterfaceC7659qX2 h;
    public InterfaceC7659qX2 i;
    public InterfaceC7659qX2 j;
    public InterfaceC7659qX2 k;

    public C8080s13(Context context, InterfaceC7659qX2 interfaceC7659qX2) {
        this.a = context.getApplicationContext();
        this.c = interfaceC7659qX2;
    }

    public static final void n(InterfaceC7659qX2 interfaceC7659qX2, InterfaceC3917d93 interfaceC3917d93) {
        if (interfaceC7659qX2 != null) {
            interfaceC7659qX2.k(interfaceC3917d93);
        }
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final long a(C5835k03 c5835k03) {
        InterfaceC7659qX2 interfaceC7659qX2;
        AbstractC6048km2.f(this.k == null);
        String scheme = c5835k03.a.getScheme();
        Uri uri = c5835k03.a;
        int i = AbstractC9004vJ2.a;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || "file".equals(scheme2)) {
            String path = c5835k03.a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.d == null) {
                    C5306i63 c5306i63 = new C5306i63();
                    this.d = c5306i63;
                    m(c5306i63);
                }
                this.k = this.d;
            } else {
                this.k = l();
            }
        } else if ("asset".equals(scheme)) {
            this.k = l();
        } else if ("content".equals(scheme)) {
            if (this.f == null) {
                FV2 fv2 = new FV2(this.a);
                this.f = fv2;
                m(fv2);
            }
            this.k = this.f;
        } else if ("rtmp".equals(scheme)) {
            if (this.g == null) {
                try {
                    InterfaceC7659qX2 interfaceC7659qX22 = (InterfaceC7659qX2) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                    this.g = interfaceC7659qX22;
                    m(interfaceC7659qX22);
                } catch (ClassNotFoundException unused) {
                    AbstractC3305ay2.f("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating RTMP extension", e);
                }
                if (this.g == null) {
                    this.g = this.c;
                }
            }
            this.k = this.g;
        } else if ("udp".equals(scheme)) {
            if (this.h == null) {
                C6168l93 c6168l93 = new C6168l93(2000);
                this.h = c6168l93;
                m(c6168l93);
            }
            this.k = this.h;
        } else if ("data".equals(scheme)) {
            if (this.i == null) {
                C5693jW2 c5693jW2 = new C5693jW2();
                this.i = c5693jW2;
                m(c5693jW2);
            }
            this.k = this.i;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.j == null) {
                    V83 v83 = new V83(this.a);
                    this.j = v83;
                    m(v83);
                }
                interfaceC7659qX2 = this.j;
            } else {
                interfaceC7659qX2 = this.c;
            }
            this.k = interfaceC7659qX2;
        }
        return this.k.a(c5835k03);
    }

    @Override // com.daaw.InterfaceC8304sp3
    public final int d(byte[] bArr, int i, int i2) {
        InterfaceC7659qX2 interfaceC7659qX2 = this.k;
        interfaceC7659qX2.getClass();
        return interfaceC7659qX2.d(bArr, i, i2);
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final void k(InterfaceC3917d93 interfaceC3917d93) {
        interfaceC3917d93.getClass();
        this.c.k(interfaceC3917d93);
        this.b.add(interfaceC3917d93);
        n(this.d, interfaceC3917d93);
        n(this.e, interfaceC3917d93);
        n(this.f, interfaceC3917d93);
        n(this.g, interfaceC3917d93);
        n(this.h, interfaceC3917d93);
        n(this.i, interfaceC3917d93);
        n(this.j, interfaceC3917d93);
    }

    public final InterfaceC7659qX2 l() {
        if (this.e == null) {
            C7364pT2 c7364pT2 = new C7364pT2(this.a);
            this.e = c7364pT2;
            m(c7364pT2);
        }
        return this.e;
    }

    public final void m(InterfaceC7659qX2 interfaceC7659qX2) {
        for (int i = 0; i < this.b.size(); i++) {
            interfaceC7659qX2.k((InterfaceC3917d93) this.b.get(i));
        }
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final Uri zzc() {
        InterfaceC7659qX2 interfaceC7659qX2 = this.k;
        if (interfaceC7659qX2 == null) {
            return null;
        }
        return interfaceC7659qX2.zzc();
    }

    @Override // com.daaw.InterfaceC7659qX2
    public final void zzd() {
        InterfaceC7659qX2 interfaceC7659qX2 = this.k;
        if (interfaceC7659qX2 != null) {
            try {
                interfaceC7659qX2.zzd();
            } finally {
                this.k = null;
            }
        }
    }

    @Override // com.daaw.InterfaceC7659qX2, com.daaw.K83
    public final Map zze() {
        InterfaceC7659qX2 interfaceC7659qX2 = this.k;
        return interfaceC7659qX2 == null ? Collections.EMPTY_MAP : interfaceC7659qX2.zze();
    }
}
