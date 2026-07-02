package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.hZ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C5144hZ0 implements InterfaceC2836Yd0 {
    public EnumC9633xb0 a;
    public List b;
    public String c;
    public C4586fZ0 d;
    public String e;
    public String f;
    public Object[] g;
    public long h;
    public Throwable i;

    public void a(InterfaceC1784Og0 interfaceC1784Og0) {
        if (interfaceC1784Og0 == null) {
            return;
        }
        if (this.b == null) {
            this.b = new ArrayList(2);
        }
        this.b.add(interfaceC1784Og0);
    }

    public EnumC9633xb0 b() {
        return this.a;
    }

    public C4586fZ0 c() {
        return this.d;
    }

    public void d(Object[] objArr) {
        this.g = objArr;
    }

    public void e(EnumC9633xb0 enumC9633xb0) {
        this.a = enumC9633xb0;
    }

    public void f(C4586fZ0 c4586fZ0) {
        this.d = c4586fZ0;
    }

    public void g(String str) {
        this.c = str;
    }

    public void h(String str) {
        this.f = str;
    }

    public void i(String str) {
        this.e = str;
    }

    public void j(Throwable th) {
        this.i = th;
    }

    public void k(long j) {
        this.h = j;
    }
}
