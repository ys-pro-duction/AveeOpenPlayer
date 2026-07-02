package com.daaw;

import android.net.Uri;
import com.daaw.C0833Fc0;
import java.io.InputStream;

/* JADX INFO: renamed from: com.daaw.bt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3561bt0 implements C0833Fc0.c {
    public final C2907Yv a;
    public final int b;
    public final InterfaceC2595Vv c;
    public final a d;
    public volatile Object e;
    public volatile long f;

    /* JADX INFO: renamed from: com.daaw.bt0$a */
    public interface a {
        Object a(Uri uri, InputStream inputStream);
    }

    public C3561bt0(InterfaceC2595Vv interfaceC2595Vv, Uri uri, int i, a aVar) {
        this(interfaceC2595Vv, new C2907Yv(uri, 3), i, aVar);
    }

    @Override // com.daaw.C0833Fc0.c
    public final void a() {
        C2803Xv c2803Xv = new C2803Xv(this.c, this.a);
        try {
            c2803Xv.d();
            this.e = this.d.a(this.c.e(), c2803Xv);
        } finally {
            this.f = c2803Xv.a();
            AbstractC6280lb1.i(c2803Xv);
        }
    }

    public long c() {
        return this.f;
    }

    public final Object d() {
        return this.e;
    }

    public C3561bt0(InterfaceC2595Vv interfaceC2595Vv, C2907Yv c2907Yv, int i, a aVar) {
        this.c = interfaceC2595Vv;
        this.a = c2907Yv;
        this.b = i;
        this.d = aVar;
    }

    @Override // com.daaw.C0833Fc0.c
    public final void b() {
    }
}
