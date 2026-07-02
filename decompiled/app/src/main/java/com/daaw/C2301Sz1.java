package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.Sz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2301Sz1 {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final C6729nA1 e;
    public final C8681uA1 f;
    public int n;
    public final Object g = new Object();
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public int k = 0;
    public int l = 0;
    public int m = 0;
    public String o = "";
    public String p = "";
    public String q = "";

    public C2301Sz1(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
        this.e = new C6729nA1(i4);
        this.f = new C8681uA1(i5, i6, i7);
    }

    public static final String q(ArrayList arrayList, int i) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            sb.append((String) arrayList.get(i2));
            sb.append(' ');
            i2++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String string = sb.toString();
        return string.length() < 100 ? string : string.substring(0, 100);
    }

    public final int a(int i, int i2) {
        return this.d ? this.b : (i * this.a) + (i2 * this.b);
    }

    public final int b() {
        return this.n;
    }

    public final int c() {
        return this.k;
    }

    public final String d() {
        return this.o;
    }

    public final String e() {
        return this.p;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2301Sz1)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((C2301Sz1) obj).o;
        return str != null && str.equals(this.o);
    }

    public final String f() {
        return this.q;
    }

    public final void g() {
        synchronized (this.g) {
            this.m--;
        }
    }

    public final void h() {
        synchronized (this.g) {
            this.m++;
        }
    }

    public final int hashCode() {
        return this.o.hashCode();
    }

    public final void i() {
        synchronized (this.g) {
            this.n -= 100;
        }
    }

    public final void j(int i) {
        this.l = i;
    }

    public final void k(String str, boolean z, float f, float f2, float f3, float f4) {
        p(str, z, f, f2, f3, f4);
    }

    public final void l(String str, boolean z, float f, float f2, float f3, float f4) {
        p(str, z, f, f2, f3, f4);
        synchronized (this.g) {
            try {
                if (this.m < 0) {
                    AbstractC4274eT1.zze("ActivityContent: negative number of WebViews.");
                }
                m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m() {
        synchronized (this.g) {
            try {
                int iA = a(this.k, this.l);
                if (iA > this.n) {
                    this.n = iA;
                    if (!zzt.zzo().h().zzN()) {
                        this.o = this.e.a(this.h);
                        this.p = this.e.a(this.i);
                    }
                    if (!zzt.zzo().h().zzO()) {
                        this.q = this.f.a(this.i, this.j);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n() {
        synchronized (this.g) {
            try {
                int iA = a(this.k, this.l);
                if (iA > this.n) {
                    this.n = iA;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean o() {
        boolean z;
        synchronized (this.g) {
            z = this.m == 0;
        }
        return z;
    }

    public final void p(String str, boolean z, float f, float f2, float f3, float f4) {
        if (str != null) {
            if (str.length() < this.c) {
                return;
            }
            synchronized (this.g) {
                try {
                    this.h.add(str);
                    this.k += str.length();
                    if (z) {
                        this.i.add(str);
                        this.j.add(new C3920dA1(f, f2, f3, f4, this.i.size() - 1));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = this.h;
        return "ActivityContent fetchId: " + this.l + " score:" + this.n + " total_length:" + this.k + "\n text: " + q(arrayList, 100) + "\n viewableText" + q(this.i, 100) + "\n signture: " + this.o + "\n viewableSignture: " + this.p + "\n viewableSignatureForVertical: " + this.q;
    }
}
