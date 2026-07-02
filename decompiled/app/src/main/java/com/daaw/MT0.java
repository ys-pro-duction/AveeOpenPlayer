package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class MT0 {
    public static final Comparator h = new a();
    public static final Comparator i = new b();
    public final int a;
    public int e;
    public int f;
    public int g;
    public final c[] c = new c[5];
    public final ArrayList b = new ArrayList();
    public int d = -1;

    public static class a implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            return cVar.a - cVar2.a;
        }
    }

    public static class b implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            float f = cVar.c;
            float f2 = cVar2.c;
            if (f < f2) {
                return -1;
            }
            return f2 < f ? 1 : 0;
        }
    }

    public static class c {
        public int a;
        public int b;
        public float c;

        public c() {
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    public MT0(int i2) {
        this.a = i2;
    }

    public void a(int i2, float f) {
        c cVar;
        b();
        int i3 = this.g;
        if (i3 > 0) {
            c[] cVarArr = this.c;
            int i4 = i3 - 1;
            this.g = i4;
            cVar = cVarArr[i4];
        } else {
            cVar = new c(null);
        }
        int i5 = this.e;
        this.e = i5 + 1;
        cVar.a = i5;
        cVar.b = i2;
        cVar.c = f;
        this.b.add(cVar);
        this.f += i2;
        while (true) {
            int i6 = this.f;
            int i7 = this.a;
            if (i6 <= i7) {
                return;
            }
            int i8 = i6 - i7;
            c cVar2 = (c) this.b.get(0);
            int i9 = cVar2.b;
            if (i9 <= i8) {
                this.f -= i9;
                this.b.remove(0);
                int i10 = this.g;
                if (i10 < 5) {
                    c[] cVarArr2 = this.c;
                    this.g = i10 + 1;
                    cVarArr2[i10] = cVar2;
                }
            } else {
                cVar2.b = i9 - i8;
                this.f -= i8;
            }
        }
    }

    public final void b() {
        if (this.d != 1) {
            Collections.sort(this.b, h);
            this.d = 1;
        }
    }

    public final void c() {
        if (this.d != 0) {
            Collections.sort(this.b, i);
            this.d = 0;
        }
    }

    public float d(float f) {
        c();
        float f2 = f * this.f;
        int i2 = 0;
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            c cVar = (c) this.b.get(i3);
            i2 += cVar.b;
            if (i2 >= f2) {
                return cVar.c;
            }
        }
        if (this.b.isEmpty()) {
            return Float.NaN;
        }
        return ((c) this.b.get(r5.size() - 1)).c;
    }
}
