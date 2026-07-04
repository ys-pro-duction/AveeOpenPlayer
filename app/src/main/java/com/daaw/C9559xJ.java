package com.daaw;

import android.net.Uri;
import com.daaw.C9280wJ;
import com.daaw.InterfaceC1792Oi0;
import com.daaw.InterfaceC2595Vv;

/* JADX INFO: renamed from: com.daaw.xJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9559xJ extends AbstractC0632De implements C9280wJ.e {
    public final Uri G;
    public final InterfaceC2595Vv.a H;
    public final InterfaceC10117zJ I;
    public final int J;
    public final String K;
    public final int L;
    public final Object M;
    public long N;
    public boolean O;

    /* JADX INFO: renamed from: com.daaw.xJ$b */
    public static final class b {
        public final InterfaceC2595Vv.a a;
        public InterfaceC10117zJ b;
        public String c;
        public Object d;
        public int e = -1;
        public int f = 1048576;
        public boolean g;

        public b(InterfaceC2595Vv.a aVar) {
            this.a = aVar;
        }

        public C9559xJ a(Uri uri) {
            this.g = true;
            if (this.b == null) {
                this.b = new C5818jx();
            }
            return new C9559xJ(uri, this.a, this.b, this.e, this.c, this.f, this.d);
        }
    }

    @Override // com.daaw.InterfaceC1792Oi0
    public void a(InterfaceC9110vi0 interfaceC9110vi0) {
        ((C9280wJ) interfaceC9110vi0).Q();
    }

    @Override // com.daaw.C9280wJ.e
    public void b(long j, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.N;
        }
        if (this.N == j && this.O == z) {
            return;
        }
        q(j, z);
    }

    @Override // com.daaw.InterfaceC1792Oi0
    public InterfaceC9110vi0 g(InterfaceC1792Oi0.a aVar, O3 o3) {
        AbstractC7115ob.a(aVar.a == 0);
        return new C9280wJ(this.G, this.H.a(), this.I.a(), this.J, j(aVar), this, o3, this.K, this.L);
    }

    @Override // com.daaw.AbstractC0632De
    public void m(WI wi, boolean z) {
        q(this.N, false);
    }

    public final void q(long j, boolean z) {
        this.N = j;
        this.O = z;
        n(new C8198sT0(this.N, this.O, false, this.M), null);
    }

    public C9559xJ(Uri uri, InterfaceC2595Vv.a aVar, InterfaceC10117zJ interfaceC10117zJ, int i, String str, int i2, Object obj) {
        this.G = uri;
        this.H = aVar;
        this.I = interfaceC10117zJ;
        this.J = i;
        this.K = str;
        this.L = i2;
        this.N = -9223372036854775807L;
        this.M = obj;
    }

    @Override // com.daaw.InterfaceC1792Oi0
    public void e() {
    }

    @Override // com.daaw.AbstractC0632De
    public void o() {
    }
}
