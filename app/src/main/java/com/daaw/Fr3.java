package com.daaw;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Fr3 implements InterfaceC9442ws3 {
    public final A62 a;
    public final int b;
    public final int[] c;
    public final C2485Ut1[] d;
    public int e;

    public Fr3(A62 a62, int[] iArr, int i) {
        int length = iArr.length;
        AbstractC6048km2.f(length > 0);
        a62.getClass();
        this.a = a62;
        this.b = length;
        this.d = new C2485Ut1[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.d[i2] = a62.b(iArr[i2]);
        }
        Arrays.sort(this.d, new Comparator() { // from class: com.daaw.Er3
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((C2485Ut1) obj2).h - ((C2485Ut1) obj).h;
            }
        });
        this.c = new int[this.b];
        for (int i3 = 0; i3 < this.b; i3++) {
            this.c[i3] = a62.a(this.d[i3]);
        }
    }

    @Override // com.daaw.As3
    public final int c(int i) {
        return this.c[0];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Fr3 fr3 = (Fr3) obj;
            if (this.a.equals(fr3.a) && Arrays.equals(this.c, fr3.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.As3
    public final C2485Ut1 f(int i) {
        return this.d[i];
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int iIdentityHashCode = (System.identityHashCode(this.a) * 31) + Arrays.hashCode(this.c);
        this.e = iIdentityHashCode;
        return iIdentityHashCode;
    }

    @Override // com.daaw.As3
    public final int zzb(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.daaw.As3
    public final int zzc() {
        return this.c.length;
    }

    @Override // com.daaw.As3
    public final A62 zze() {
        return this.a;
    }
}
