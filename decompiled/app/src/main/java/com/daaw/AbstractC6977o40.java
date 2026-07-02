package com.daaw;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.o40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6977o40 implements Closeable {
    public static final String[] H = new String[128];
    public int B;
    public int[] C = new int[32];
    public String[] D = new String[32];
    public int[] E = new int[32];
    public boolean F;
    public boolean G;

    /* JADX INFO: renamed from: com.daaw.o40$a */
    public static final class a {
        public final String[] a;
        public final C4386er0 b;

        public a(String[] strArr, C4386er0 c4386er0) {
            this.a = strArr;
            this.b = c4386er0;
        }

        public static a a(String... strArr) {
            try {
                C4908gi[] c4908giArr = new C4908gi[strArr.length];
                C4057dh c4057dh = new C4057dh();
                for (int i = 0; i < strArr.length; i++) {
                    AbstractC6977o40.s0(c4057dh, strArr[i]);
                    c4057dh.j0();
                    c4908giArr[i] = c4057dh.x0();
                }
                return new a((String[]) strArr.clone(), C4386er0.q(c4908giArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.o40$b */
    public enum b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i = 0; i <= 31; i++) {
            H[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = H;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public static AbstractC6977o40 U(InterfaceC7424ph interfaceC7424ph) {
        return new C8371t40(interfaceC7424ph);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void s0(com.daaw.InterfaceC7145oh r7, java.lang.String r8) {
        /*
            java.lang.String[] r0 = com.daaw.AbstractC6977o40.H
            r1 = 34
            r7.L(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = 0
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.n0(r8, r4, r3)
        L2e:
            r7.d0(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.n0(r8, r4, r2)
        L3b:
            r7.L(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC6977o40.s0(com.daaw.oh, java.lang.String):void");
    }

    public abstract double F();

    public abstract int I();

    public abstract String N();

    public abstract String R();

    public abstract b W();

    public final void Y(int i) {
        int i2 = this.B;
        int[] iArr = this.C;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new C6140l40("Nesting too deep at " + i());
            }
            this.C = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.D;
            this.D = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.E;
            this.E = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.C;
        int i3 = this.B;
        this.B = i3 + 1;
        iArr3[i3] = i;
    }

    public abstract void c();

    public abstract void d();

    public final String i() {
        return AbstractC7813r40.a(this.B, this.C, this.D, this.E);
    }

    public abstract void j();

    public abstract void l();

    public abstract boolean o();

    public abstract int o0(a aVar);

    public abstract void p0();

    public abstract void q0();

    public abstract boolean s();

    public final C6419m40 w0(String str) throws C6419m40 {
        throw new C6419m40(str + " at path " + i());
    }
}
