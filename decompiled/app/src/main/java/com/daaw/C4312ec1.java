package com.daaw;

import android.opengl.GLES20;

/* JADX INFO: renamed from: com.daaw.ec1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4312ec1 {
    public JW a;
    public C4880gc1 b;
    public C5997kc1[] c;
    public final int e = 4;
    public InterfaceC5841k2 f = null;
    public InterfaceC5841k2 g = null;
    public boolean h = true;
    public boolean i = true;
    public int d = 0;

    /* JADX INFO: renamed from: com.daaw.ec1$a */
    public static class a {
        public final int a = 4;
        public final String b;
        public final int c;
        public final int d;
        public final int e;

        public a(String str, int i, int i2) {
            this.b = str;
            this.c = i;
            this.d = i2;
            this.e = i * a();
        }

        public final int a() {
            int i = this.d;
            if (i == 5126) {
                return 4;
            }
            if (i == 5121) {
                return 1;
            }
            AbstractC6278lb.k("unknown dataType");
            return 4;
        }

        public String toString() {
            return this.b + " (" + this.c + ")";
        }
    }

    public C4312ec1(JW jw, C4880gc1 c4880gc1, a... aVarArr) {
        this.a = jw;
        this.b = c4880gc1;
        this.c = new C5997kc1[aVarArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            C5997kc1[] c5997kc1Arr = this.c;
            if (i2 >= c5997kc1Arr.length) {
                break;
            }
            a aVar = aVarArr[i2];
            c5997kc1Arr[i2] = new C5997kc1(c4880gc1.i(aVar.b), aVar.b, aVar.c, aVar.d, aVar.e);
            this.d += aVar.e;
            i2++;
        }
        while (true) {
            C5997kc1[] c5997kc1Arr2 = this.c;
            if (i >= c5997kc1Arr2.length) {
                return;
            }
            if (c5997kc1Arr2[i].c < 0) {
                AbstractC0441Bk1.c("ERROR attribute not found " + this.c[i].a);
            }
            i++;
        }
    }

    public void a(TH0 th0, InterfaceC6129l2 interfaceC6129l2, RH0 rh0) {
        th0.p(this.b);
        InterfaceC5841k2 interfaceC5841k2 = this.f;
        if (interfaceC5841k2 != null) {
            interfaceC5841k2.a(th0, this.b);
        }
        InterfaceC5841k2 interfaceC5841k22 = this.g;
        if (interfaceC5841k22 != null) {
            interfaceC5841k22.a(th0, this.b);
        }
        if (interfaceC6129l2 != null) {
            interfaceC6129l2.a(th0, this.b, rh0);
        }
        this.a.b();
        int i = this.d;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            C5997kc1[] c5997kc1Arr = this.c;
            if (i2 >= c5997kc1Arr.length) {
                return;
            }
            C5997kc1 c5997kc1 = c5997kc1Arr[i2];
            int i4 = c5997kc1.c;
            if (i4 >= 0) {
                GLES20.glEnableVertexAttribArray(i4);
                int i5 = c5997kc1.c;
                int i6 = c5997kc1.b;
                int i7 = c5997kc1.d;
                GLES20.glVertexAttribPointer(i5, i6, i7, i7 != 5126, i, i3);
                i3 += c5997kc1.e;
            }
            i2++;
        }
    }

    public void b(int i, int i2, int i3) {
        this.a.c(i, i2, i3);
    }

    public void c(boolean z, InterfaceC5841k2 interfaceC5841k2) {
        this.h = z;
        this.f = interfaceC5841k2;
    }

    public void d(TH0 th0) {
        th0.V();
        this.a.a();
        int i = 0;
        while (true) {
            C5997kc1[] c5997kc1Arr = this.c;
            if (i >= c5997kc1Arr.length) {
                return;
            }
            GLES20.glDisableVertexAttribArray(c5997kc1Arr[i].c);
            i++;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C4312ec1) && this == ((C4312ec1) obj);
    }
}
