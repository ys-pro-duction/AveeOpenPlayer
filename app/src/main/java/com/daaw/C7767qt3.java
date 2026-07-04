package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: renamed from: com.daaw.qt3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7767qt3 {
    public static final Comparator g = new Comparator() { // from class: com.daaw.mt3
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((C7488pt3) obj).a - ((C7488pt3) obj2).a;
        }
    };
    public static final Comparator h = new Comparator() { // from class: com.daaw.nt3
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((C7488pt3) obj).c, ((C7488pt3) obj2).c);
        }
    };
    public int d;
    public int e;
    public int f;
    public final C7488pt3[] b = new C7488pt3[5];
    public final ArrayList a = new ArrayList();
    public int c = -1;

    public C7767qt3(int i) {
    }

    public final float a(float f) {
        if (this.c != 0) {
            Collections.sort(this.a, h);
            this.c = 0;
        }
        float f2 = this.e;
        int i = 0;
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            float f3 = 0.5f * f2;
            C7488pt3 c7488pt3 = (C7488pt3) this.a.get(i2);
            i += c7488pt3.b;
            if (i >= f3) {
                return c7488pt3.c;
            }
        }
        if (this.a.isEmpty()) {
            return Float.NaN;
        }
        return ((C7488pt3) this.a.get(r6.size() - 1)).c;
    }

    public final void b(int i, float f) {
        C7488pt3 c7488pt3;
        if (this.c != 1) {
            Collections.sort(this.a, g);
            this.c = 1;
        }
        int i2 = this.f;
        if (i2 > 0) {
            C7488pt3[] c7488pt3Arr = this.b;
            int i3 = i2 - 1;
            this.f = i3;
            c7488pt3 = c7488pt3Arr[i3];
        } else {
            c7488pt3 = new C7488pt3(null);
        }
        int i4 = this.d;
        this.d = i4 + 1;
        c7488pt3.a = i4;
        c7488pt3.b = i;
        c7488pt3.c = f;
        this.a.add(c7488pt3);
        this.e += i;
        while (true) {
            int i5 = this.e;
            if (i5 <= 2000) {
                return;
            }
            int i6 = i5 - 2000;
            C7488pt3 c7488pt32 = (C7488pt3) this.a.get(0);
            int i7 = c7488pt32.b;
            if (i7 <= i6) {
                this.e -= i7;
                this.a.remove(0);
                int i8 = this.f;
                if (i8 < 5) {
                    C7488pt3[] c7488pt3Arr2 = this.b;
                    this.f = i8 + 1;
                    c7488pt3Arr2[i8] = c7488pt32;
                }
            } else {
                c7488pt32.b = i7 - i6;
                this.e -= i6;
            }
        }
    }

    public final void c() {
        this.a.clear();
        this.c = -1;
        this.d = 0;
        this.e = 0;
    }
}
