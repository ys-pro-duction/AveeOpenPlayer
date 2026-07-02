package com.daaw;

import com.daaw.C10150zR0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class OT implements InterfaceC6921ns {
    public final String a;
    public final RT b;
    public final J6 c;
    public final K6 d;
    public final O6 e;
    public final O6 f;
    public final I6 g;
    public final C10150zR0.b h;
    public final C10150zR0.c i;
    public final float j;
    public final List k;
    public final I6 l;
    public final boolean m;

    public OT(String str, RT rt, J6 j6, K6 k6, O6 o6, O6 o62, I6 i6, C10150zR0.b bVar, C10150zR0.c cVar, float f, List list, I6 i62, boolean z) {
        this.a = str;
        this.b = rt;
        this.c = j6;
        this.d = k6;
        this.e = o6;
        this.f = o62;
        this.g = i6;
        this.h = bVar;
        this.i = cVar;
        this.j = f;
        this.k = list;
        this.l = i62;
        this.m = z;
    }

    @Override // com.daaw.InterfaceC6921ns
    public InterfaceC2371Tr a(C4615ff0 c4615ff0, AbstractC9647xe abstractC9647xe) {
        return new PT(c4615ff0, abstractC9647xe, this);
    }

    public C10150zR0.b b() {
        return this.h;
    }

    public I6 c() {
        return this.l;
    }

    public O6 d() {
        return this.f;
    }

    public J6 e() {
        return this.c;
    }

    public RT f() {
        return this.b;
    }

    public C10150zR0.c g() {
        return this.i;
    }

    public List h() {
        return this.k;
    }

    public float i() {
        return this.j;
    }

    public String j() {
        return this.a;
    }

    public K6 k() {
        return this.d;
    }

    public O6 l() {
        return this.e;
    }

    public I6 m() {
        return this.g;
    }

    public boolean n() {
        return this.m;
    }
}
