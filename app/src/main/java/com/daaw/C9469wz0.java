package com.daaw;

import com.daaw.C2719Xa;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: com.daaw.wz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9469wz0 extends C2719Xa {
    public int g;
    public IU0[] h;
    public IU0[] i;
    public int j;
    public b k;
    public C6871ni l;

    /* JADX INFO: renamed from: com.daaw.wz0$a */
    public class a implements Comparator {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(IU0 iu0, IU0 iu02) {
            return iu0.c - iu02.c;
        }
    }

    /* JADX INFO: renamed from: com.daaw.wz0$b */
    public class b implements Comparable {
        public IU0 B;
        public C9469wz0 C;

        public b(C9469wz0 c9469wz0) {
            this.C = c9469wz0;
        }

        public boolean a(IU0 iu0, float f) {
            boolean z = true;
            if (!this.B.a) {
                for (int i = 0; i < 9; i++) {
                    float f2 = iu0.i[i];
                    if (f2 != 0.0f) {
                        float f3 = f2 * f;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        this.B.i[i] = f3;
                    } else {
                        this.B.i[i] = 0.0f;
                    }
                }
                return true;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float[] fArr = this.B.i;
                float f4 = fArr[i2] + (iu0.i[i2] * f);
                fArr[i2] = f4;
                if (Math.abs(f4) < 1.0E-4f) {
                    this.B.i[i2] = 0.0f;
                } else {
                    z = false;
                }
            }
            if (z) {
                C9469wz0.this.G(this.B);
            }
            return false;
        }

        public void c(IU0 iu0) {
            this.B = iu0;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.B.c - ((IU0) obj).c;
        }

        public final boolean g() {
            for (int i = 8; i >= 0; i--) {
                float f = this.B.i[i];
                if (f > 0.0f) {
                    return false;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean h(IU0 iu0) {
            int i = 8;
            while (true) {
                if (i < 0) {
                    break;
                }
                float f = iu0.i[i];
                float f2 = this.B.i[i];
                if (f2 == f) {
                    i--;
                } else if (f2 < f) {
                    return true;
                }
            }
            return false;
        }

        public void k() {
            Arrays.fill(this.B.i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.B != null) {
                for (int i = 0; i < 9; i++) {
                    str = str + this.B.i[i] + " ";
                }
            }
            return str + "] " + this.B;
        }
    }

    public C9469wz0(C6871ni c6871ni) {
        super(c6871ni);
        this.g = 128;
        this.h = new IU0[128];
        this.i = new IU0[128];
        this.j = 0;
        this.k = new b(this);
        this.l = c6871ni;
    }

    @Override // com.daaw.C2719Xa
    public void C(C2719Xa c2719Xa, boolean z) {
        IU0 iu0 = c2719Xa.a;
        if (iu0 == null) {
            return;
        }
        C2719Xa.a aVar = c2719Xa.e;
        int iB = aVar.b();
        for (int i = 0; i < iB; i++) {
            IU0 iu0D = aVar.d(i);
            float fG = aVar.g(i);
            this.k.c(iu0D);
            if (this.k.a(iu0, fG)) {
                F(iu0D);
            }
            this.b += c2719Xa.b * fG;
        }
        G(iu0);
    }

    public final void F(IU0 iu0) {
        int i;
        int i2 = this.j + 1;
        IU0[] iu0Arr = this.h;
        if (i2 > iu0Arr.length) {
            IU0[] iu0Arr2 = (IU0[]) Arrays.copyOf(iu0Arr, iu0Arr.length * 2);
            this.h = iu0Arr2;
            this.i = (IU0[]) Arrays.copyOf(iu0Arr2, iu0Arr2.length * 2);
        }
        IU0[] iu0Arr3 = this.h;
        int i3 = this.j;
        iu0Arr3[i3] = iu0;
        int i4 = i3 + 1;
        this.j = i4;
        if (i4 > 1 && iu0Arr3[i3].c > iu0.c) {
            int i5 = 0;
            while (true) {
                i = this.j;
                if (i5 >= i) {
                    break;
                }
                this.i[i5] = this.h[i5];
                i5++;
            }
            Arrays.sort(this.i, 0, i, new a());
            for (int i6 = 0; i6 < this.j; i6++) {
                this.h[i6] = this.i[i6];
            }
        }
        iu0.a = true;
        iu0.a(this);
    }

    public final void G(IU0 iu0) {
        int i = 0;
        while (i < this.j) {
            if (this.h[i] == iu0) {
                while (true) {
                    int i2 = this.j;
                    if (i >= i2 - 1) {
                        this.j = i2 - 1;
                        iu0.a = false;
                        return;
                    } else {
                        IU0[] iu0Arr = this.h;
                        int i3 = i + 1;
                        iu0Arr[i] = iu0Arr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // com.daaw.C2719Xa, com.daaw.C4311ec0.a
    public void a(IU0 iu0) {
        this.k.c(iu0);
        this.k.k();
        iu0.i[iu0.e] = 1.0f;
        F(iu0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    @Override // com.daaw.C2719Xa, com.daaw.C4311ec0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.daaw.IU0 c(com.daaw.C4311ec0 r5, boolean[] r6) {
        /*
            r4 = this;
            r5 = -1
            r0 = 0
            r1 = -1
        L3:
            int r2 = r4.j
            if (r0 >= r2) goto L32
            com.daaw.IU0[] r2 = r4.h
            r2 = r2[r0]
            int r3 = r2.c
            boolean r3 = r6[r3]
            if (r3 == 0) goto L12
            goto L2f
        L12:
            com.daaw.wz0$b r3 = r4.k
            r3.c(r2)
            if (r1 != r5) goto L22
            com.daaw.wz0$b r2 = r4.k
            boolean r2 = r2.g()
            if (r2 == 0) goto L2f
            goto L2e
        L22:
            com.daaw.wz0$b r2 = r4.k
            com.daaw.IU0[] r3 = r4.h
            r3 = r3[r1]
            boolean r2 = r2.h(r3)
            if (r2 == 0) goto L2f
        L2e:
            r1 = r0
        L2f:
            int r0 = r0 + 1
            goto L3
        L32:
            if (r1 != r5) goto L36
            r5 = 0
            return r5
        L36:
            com.daaw.IU0[] r5 = r4.h
            r5 = r5[r1]
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C9469wz0.c(com.daaw.ec0, boolean[]):com.daaw.IU0");
    }

    @Override // com.daaw.C2719Xa, com.daaw.C4311ec0.a
    public void clear() {
        this.j = 0;
        this.b = 0.0f;
    }

    @Override // com.daaw.C2719Xa
    public String toString() {
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.j; i++) {
            this.k.c(this.h[i]);
            str = str + this.k + " ";
        }
        return str;
    }
}
