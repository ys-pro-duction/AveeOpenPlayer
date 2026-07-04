package com.daaw;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: renamed from: com.daaw.ax, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3298ax implements InterfaceC2595Vv {
    public final Context a;
    public final InterfaceC5299i51 b;
    public final InterfaceC2595Vv c;
    public InterfaceC2595Vv d;
    public InterfaceC2595Vv e;
    public InterfaceC2595Vv f;
    public InterfaceC2595Vv g;
    public InterfaceC2595Vv h;
    public InterfaceC2595Vv i;
    public InterfaceC2595Vv j;

    public C3298ax(Context context, InterfaceC5299i51 interfaceC5299i51, InterfaceC2595Vv interfaceC2595Vv) {
        this.a = context.getApplicationContext();
        this.b = interfaceC5299i51;
        this.c = (InterfaceC2595Vv) AbstractC7115ob.e(interfaceC2595Vv);
    }

    public final InterfaceC2595Vv a() {
        if (this.e == null) {
            this.e = new C7394pb(this.a, this.b);
        }
        return this.e;
    }

    public final InterfaceC2595Vv b() {
        if (this.f == null) {
            this.f = new C2891Yr(this.a, this.b);
        }
        return this.f;
    }

    @Override // com.daaw.InterfaceC2595Vv
    public int c(byte[] bArr, int i, int i2) {
        return this.j.c(bArr, i, i2);
    }

    @Override // com.daaw.InterfaceC2595Vv
    public void close() {
        InterfaceC2595Vv interfaceC2595Vv = this.j;
        if (interfaceC2595Vv != null) {
            try {
                interfaceC2595Vv.close();
            } finally {
                this.j = null;
            }
        }
    }

    @Override // com.daaw.InterfaceC2595Vv
    public long d(C2907Yv c2907Yv) {
        AbstractC7115ob.f(this.j == null);
        String scheme = c2907Yv.a.getScheme();
        if (AbstractC6280lb1.K(c2907Yv.a)) {
            if (c2907Yv.a.getPath().startsWith("/android_asset/")) {
                this.j = a();
            } else {
                this.j = g();
            }
        } else if ("asset".equals(scheme)) {
            this.j = a();
        } else if ("content".equals(scheme)) {
            this.j = b();
        } else if ("rtmp".equals(scheme)) {
            this.j = i();
        } else if ("data".equals(scheme)) {
            this.j = f();
        } else if ("rawresource".equals(scheme)) {
            this.j = h();
        } else {
            this.j = this.c;
        }
        return this.j.d(c2907Yv);
    }

    @Override // com.daaw.InterfaceC2595Vv
    public Uri e() {
        InterfaceC2595Vv interfaceC2595Vv = this.j;
        if (interfaceC2595Vv == null) {
            return null;
        }
        return interfaceC2595Vv.e();
    }

    public final InterfaceC2595Vv f() {
        if (this.h == null) {
            this.h = new C2491Uv();
        }
        return this.h;
    }

    public final InterfaceC2595Vv g() {
        if (this.d == null) {
            this.d = new BK(this.b);
        }
        return this.d;
    }

    public final InterfaceC2595Vv h() {
        if (this.i == null) {
            this.i = new C9819yE0(this.a, this.b);
        }
        return this.i;
    }

    public final InterfaceC2595Vv i() {
        if (this.g == null) {
            try {
                this.g = (InterfaceC2595Vv) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
            } catch (ClassNotFoundException unused) {
            } catch (Exception e) {
                throw new RuntimeException("Error instantiating RTMP extension", e);
            }
            if (this.g == null) {
                this.g = this.c;
            }
        }
        return this.g;
    }
}
