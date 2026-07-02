package com.daaw;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.Ce2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0522Ce2 {
    public static final C0522Ce2 h = new C0522Ce2(new C0314Ae2());
    public final XG1 a;
    public final UG1 b;
    public final InterfaceC7036oH1 c;
    public final InterfaceC5073hH1 d;
    public final InterfaceC6769nK1 e;
    public final BS0 f;
    public final BS0 g;

    public final UG1 a() {
        return this.b;
    }

    public final XG1 b() {
        return this.a;
    }

    public final InterfaceC3112aH1 c(String str) {
        return (InterfaceC3112aH1) this.g.get(str);
    }

    public final InterfaceC3948dH1 d(String str) {
        return (InterfaceC3948dH1) this.f.get(str);
    }

    public final InterfaceC5073hH1 e() {
        return this.d;
    }

    public final InterfaceC7036oH1 f() {
        return this.c;
    }

    public final InterfaceC6769nK1 g() {
        return this.e;
    }

    public final ArrayList h() {
        ArrayList arrayList = new ArrayList(this.f.size());
        for (int i = 0; i < this.f.size(); i++) {
            arrayList.add((String) this.f.j(i));
        }
        return arrayList;
    }

    public final ArrayList i() {
        ArrayList arrayList = new ArrayList();
        if (this.c != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.a != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.b != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.f.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.e != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }

    public C0522Ce2(C0314Ae2 c0314Ae2) {
        this.a = c0314Ae2.a;
        this.b = c0314Ae2.b;
        this.c = c0314Ae2.c;
        this.f = new BS0(c0314Ae2.f);
        this.g = new BS0(c0314Ae2.g);
        this.d = c0314Ae2.d;
        this.e = c0314Ae2.e;
    }
}
