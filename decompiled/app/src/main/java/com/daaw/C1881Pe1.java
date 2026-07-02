package com.daaw;

import com.daaw.C4208eD;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Pe1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1881Pe1 {
    public final C5890kC0 a;
    public final C3373bD b;
    public final C3373bD c;
    public final List d;
    public final boolean e;
    public final UY f;
    public final boolean g;
    public boolean h;
    public boolean i;

    /* JADX INFO: renamed from: com.daaw.Pe1$a */
    public enum a {
        NONE,
        LOCAL,
        SYNCED
    }

    public C1881Pe1(C5890kC0 c5890kC0, C3373bD c3373bD, C3373bD c3373bD2, List list, boolean z, UY uy, boolean z2, boolean z3, boolean z4) {
        this.a = c5890kC0;
        this.b = c3373bD;
        this.c = c3373bD2;
        this.d = list;
        this.e = z;
        this.f = uy;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public static C1881Pe1 c(C5890kC0 c5890kC0, C3373bD c3373bD, UY uy, boolean z, boolean z2, boolean z3) {
        ArrayList arrayList = new ArrayList();
        Iterator it = c3373bD.iterator();
        while (it.hasNext()) {
            arrayList.add(C4208eD.a(C4208eD.a.ADDED, (LC) it.next()));
        }
        return new C1881Pe1(c5890kC0, c3373bD, C3373bD.p(c5890kC0.c()), arrayList, z, uy, true, z2, z3);
    }

    public boolean a() {
        return this.g;
    }

    public boolean b() {
        return this.h;
    }

    public List d() {
        return this.d;
    }

    public C3373bD e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1881Pe1)) {
            return false;
        }
        C1881Pe1 c1881Pe1 = (C1881Pe1) obj;
        if (this.e == c1881Pe1.e && this.g == c1881Pe1.g && this.h == c1881Pe1.h && this.a.equals(c1881Pe1.a) && this.f.equals(c1881Pe1.f) && this.b.equals(c1881Pe1.b) && this.c.equals(c1881Pe1.c) && this.i == c1881Pe1.i) {
            return this.d.equals(c1881Pe1.d);
        }
        return false;
    }

    public UY f() {
        return this.f;
    }

    public C3373bD g() {
        return this.c;
    }

    public C5890kC0 h() {
        return this.a;
    }

    public int hashCode() {
        return (((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f.hashCode()) * 31) + (this.e ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }

    public boolean i() {
        return this.i;
    }

    public boolean j() {
        return !this.f.isEmpty();
    }

    public boolean k() {
        return this.e;
    }

    public String toString() {
        return "ViewSnapshot(" + this.a + ", " + this.b + ", " + this.c + ", " + this.d + ", isFromCache=" + this.e + ", mutatedKeys=" + this.f.size() + ", didSyncStateChange=" + this.g + ", excludesMetadataChanges=" + this.h + ", hasCachedResults=" + this.i + ")";
    }
}
