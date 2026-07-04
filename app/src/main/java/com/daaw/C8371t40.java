package com.daaw;

import com.daaw.AbstractC6977o40;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.EOFException;

/* JADX INFO: renamed from: com.daaw.t40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8371t40 extends AbstractC6977o40 {
    public static final C4908gi O = C4908gi.h("'\\");
    public static final C4908gi P = C4908gi.h("\"\\");
    public static final C4908gi Q = C4908gi.h("{}[]:, \n\t\r\f/\\;#=");
    public static final C4908gi R = C4908gi.h("\n\r");
    public static final C4908gi S = C4908gi.h("*/");
    public final InterfaceC7424ph I;
    public final C4057dh J;
    public int K = 0;
    public long L;
    public int M;
    public String N;

    public C8371t40(InterfaceC7424ph interfaceC7424ph) {
        if (interfaceC7424ph == null) {
            throw new NullPointerException("source == null");
        }
        this.I = interfaceC7424ph;
        this.J = interfaceC7424ph.t();
        Y(6);
    }

    public final int B0(String str, AbstractC6977o40.a aVar) {
        int length = aVar.a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.a[i])) {
                this.K = 0;
                this.D[this.B - 1] = str;
                return i;
            }
        }
        return -1;
    }

    public final boolean E0(int i) throws C6419m40 {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case ModuleDescriptor.MODULE_VERSION /* 92 */:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        x0();
        return false;
    }

    @Override // com.daaw.AbstractC6977o40
    public double F() throws C6419m40, EOFException {
        int iY0 = this.K;
        if (iY0 == 0) {
            iY0 = y0();
        }
        if (iY0 == 16) {
            this.K = 0;
            int[] iArr = this.E;
            int i = this.B - 1;
            iArr[i] = iArr[i] + 1;
            return this.L;
        }
        if (iY0 == 17) {
            this.N = this.J.K0(this.M);
        } else if (iY0 == 9) {
            this.N = Q0(P);
        } else if (iY0 == 8) {
            this.N = Q0(O);
        } else if (iY0 == 10) {
            this.N = Y0();
        } else if (iY0 != 11) {
            throw new C6140l40("Expected a double but was " + W() + " at path " + i());
        }
        this.K = 11;
        try {
            double d = Double.parseDouble(this.N);
            if (this.F || !(Double.isNaN(d) || Double.isInfinite(d))) {
                this.N = null;
                this.K = 0;
                int[] iArr2 = this.E;
                int i2 = this.B - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return d;
            }
            throw new C6419m40("JSON forbids NaN and infinities: " + d + " at path " + i());
        } catch (NumberFormatException unused) {
            throw new C6140l40("Expected a double but was " + this.N + " at path " + i());
        }
    }

    @Override // com.daaw.AbstractC6977o40
    public int I() throws C6419m40, EOFException {
        int iY0 = this.K;
        if (iY0 == 0) {
            iY0 = y0();
        }
        if (iY0 == 16) {
            long j = this.L;
            int i = (int) j;
            if (j == i) {
                this.K = 0;
                int[] iArr = this.E;
                int i2 = this.B - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new C6140l40("Expected an int but was " + this.L + " at path " + i());
        }
        if (iY0 == 17) {
            this.N = this.J.K0(this.M);
        } else if (iY0 == 9 || iY0 == 8) {
            String strQ0 = iY0 == 9 ? Q0(P) : Q0(O);
            this.N = strQ0;
            try {
                int i3 = Integer.parseInt(strQ0);
                this.K = 0;
                int[] iArr2 = this.E;
                int i4 = this.B - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iY0 != 11) {
            throw new C6140l40("Expected an int but was " + W() + " at path " + i());
        }
        this.K = 11;
        try {
            double d = Double.parseDouble(this.N);
            int i5 = (int) d;
            if (i5 == d) {
                this.N = null;
                this.K = 0;
                int[] iArr3 = this.E;
                int i6 = this.B - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new C6140l40("Expected an int but was " + this.N + " at path " + i());
        } catch (NumberFormatException unused2) {
            throw new C6140l40("Expected an int but was " + this.N + " at path " + i());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        r6.J.skip(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r2 != 47) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        if (r6.I.v0(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        x0();
        r3 = r6.J.o(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        if (r3 == 42) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (r3 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r6.J.j0();
        r6.J.j0();
        i1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        r6.J.j0();
        r6.J.j0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        if (h1() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        throw w0("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
    
        if (r2 != 35) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        x0();
        i1();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int K0(boolean r7) throws com.daaw.C6419m40, java.io.EOFException {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = 0
        L2:
            com.daaw.ph r2 = r6.I
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.v0(r4)
            if (r2 == 0) goto L80
            com.daaw.dh r2 = r6.J
            long r4 = (long) r1
            byte r2 = r2.o(r4)
            r4 = 10
            if (r2 == r4) goto L7e
            r4 = 32
            if (r2 == r4) goto L7e
            r4 = 13
            if (r2 == r4) goto L7e
            r4 = 9
            if (r2 != r4) goto L25
            goto L7e
        L25:
            com.daaw.dh r3 = r6.J
            long r4 = (long) r1
            r3.skip(r4)
            r1 = 47
            if (r2 != r1) goto L72
            com.daaw.ph r3 = r6.I
            r4 = 2
            boolean r3 = r3.v0(r4)
            if (r3 != 0) goto L3a
            goto L7d
        L3a:
            r6.x0()
            com.daaw.dh r3 = r6.J
            r4 = 1
            byte r3 = r3.o(r4)
            r4 = 42
            if (r3 == r4) goto L5a
            if (r3 == r1) goto L4c
            goto L7d
        L4c:
            com.daaw.dh r1 = r6.J
            r1.j0()
            com.daaw.dh r1 = r6.J
            r1.j0()
            r6.i1()
            goto L1
        L5a:
            com.daaw.dh r1 = r6.J
            r1.j0()
            com.daaw.dh r1 = r6.J
            r1.j0()
            boolean r1 = r6.h1()
            if (r1 == 0) goto L6b
            goto L1
        L6b:
            java.lang.String r7 = "Unterminated comment"
            com.daaw.m40 r7 = r6.w0(r7)
            throw r7
        L72:
            r1 = 35
            if (r2 != r1) goto L7d
            r6.x0()
            r6.i1()
            goto L1
        L7d:
            return r2
        L7e:
            r1 = r3
            goto L2
        L80:
            if (r7 != 0) goto L84
            r7 = -1
            return r7
        L84:
            java.io.EOFException r7 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C8371t40.K0(boolean):int");
    }

    @Override // com.daaw.AbstractC6977o40
    public String N() throws C6419m40, EOFException {
        String strQ0;
        int iY0 = this.K;
        if (iY0 == 0) {
            iY0 = y0();
        }
        if (iY0 == 14) {
            strQ0 = Y0();
        } else if (iY0 == 13) {
            strQ0 = Q0(P);
        } else if (iY0 == 12) {
            strQ0 = Q0(O);
        } else {
            if (iY0 != 15) {
                throw new C6140l40("Expected a name but was " + W() + " at path " + i());
            }
            strQ0 = this.N;
        }
        this.K = 0;
        this.D[this.B - 1] = strQ0;
        return strQ0;
    }

    public final String Q0(C4908gi c4908gi) throws C6419m40 {
        StringBuilder sb = null;
        while (true) {
            long jP0 = this.I.P0(c4908gi);
            if (jP0 == -1) {
                throw w0("Unterminated string");
            }
            if (this.J.o(jP0) != 92) {
                if (sb == null) {
                    String strK0 = this.J.K0(jP0);
                    this.J.j0();
                    return strK0;
                }
                sb.append(this.J.K0(jP0));
                this.J.j0();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(this.J.K0(jP0));
            this.J.j0();
            sb.append(f1());
        }
    }

    @Override // com.daaw.AbstractC6977o40
    public String R() throws C6419m40, EOFException {
        String strK0;
        int iY0 = this.K;
        if (iY0 == 0) {
            iY0 = y0();
        }
        if (iY0 == 10) {
            strK0 = Y0();
        } else if (iY0 == 9) {
            strK0 = Q0(P);
        } else if (iY0 == 8) {
            strK0 = Q0(O);
        } else if (iY0 == 11) {
            strK0 = this.N;
            this.N = null;
        } else if (iY0 == 16) {
            strK0 = Long.toString(this.L);
        } else {
            if (iY0 != 17) {
                throw new C6140l40("Expected a string but was " + W() + " at path " + i());
            }
            strK0 = this.J.K0(this.M);
        }
        this.K = 0;
        int[] iArr = this.E;
        int i = this.B - 1;
        iArr[i] = iArr[i] + 1;
        return strK0;
    }

    @Override // com.daaw.AbstractC6977o40
    public AbstractC6977o40.b W() throws C6419m40, EOFException {
        int iY0 = this.K;
        if (iY0 == 0) {
            iY0 = y0();
        }
        switch (iY0) {
            case 1:
                return AbstractC6977o40.b.BEGIN_OBJECT;
            case 2:
                return AbstractC6977o40.b.END_OBJECT;
            case 3:
                return AbstractC6977o40.b.BEGIN_ARRAY;
            case 4:
                return AbstractC6977o40.b.END_ARRAY;
            case 5:
            case 6:
                return AbstractC6977o40.b.BOOLEAN;
            case 7:
                return AbstractC6977o40.b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return AbstractC6977o40.b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return AbstractC6977o40.b.NAME;
            case 16:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return AbstractC6977o40.b.NUMBER;
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return AbstractC6977o40.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final String Y0() {
        long jP0 = this.I.P0(Q);
        return jP0 != -1 ? this.J.K0(jP0) : this.J.E0();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final int b1() throws EOFException {
        String str;
        String str2;
        int i;
        byte bO = this.J.o(0L);
        if (bO == 116 || bO == 84) {
            str = "true";
            str2 = "TRUE";
            i = 5;
        } else if (bO == 102 || bO == 70) {
            str = "false";
            str2 = "FALSE";
            i = 6;
        } else {
            if (bO != 110 && bO != 78) {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i = 7;
        }
        int length = str.length();
        int i2 = 1;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (!this.I.v0(i3)) {
                return 0;
            }
            byte bO2 = this.J.o(i2);
            if (bO2 != str.charAt(i2) && bO2 != str2.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.I.v0(length + 1) && E0(this.J.o(length))) {
            return 0;
        }
        this.J.skip(length);
        this.K = i;
        return i;
    }

    @Override // com.daaw.AbstractC6977o40
    public void c() throws C6419m40, EOFException {
        int iY0 = this.K;
        if (iY0 == 0) {
            iY0 = y0();
        }
        if (iY0 == 3) {
            Y(1);
            this.E[this.B - 1] = 0;
            this.K = 0;
        } else {
            throw new C6140l40("Expected BEGIN_ARRAY but was " + W() + " at path " + i());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        if (E0(r1) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008a, code lost:
    
        if (r6 != 2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008c, code lost:
    
        if (r7 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0092, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0094, code lost:
    
        if (r10 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0098, code lost:
    
        if (r8 != r16) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009a, code lost:
    
        if (r10 != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x009c, code lost:
    
        if (r10 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009f, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a0, code lost:
    
        r19.L = r8;
        r19.J.skip(r5);
        r19.K = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ac, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ad, code lost:
    
        if (r6 == 2) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00af, code lost:
    
        if (r6 == 4) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b2, code lost:
    
        if (r6 != 7) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b5, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b6, code lost:
    
        r19.M = r5;
        r19.K = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00bc, code lost:
    
        return 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00bd, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c1() throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C8371t40.c1():int");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.K = 0;
        this.C[0] = 8;
        this.B = 1;
        this.J.c();
        this.I.close();
    }

    @Override // com.daaw.AbstractC6977o40
    public void d() throws C6419m40, EOFException {
        int iY0 = this.K;
        if (iY0 == 0) {
            iY0 = y0();
        }
        if (iY0 == 1) {
            Y(3);
            this.K = 0;
            return;
        }
        throw new C6140l40("Expected BEGIN_OBJECT but was " + W() + " at path " + i());
    }

    public final char f1() throws C6419m40, EOFException {
        int i;
        if (!this.I.v0(1L)) {
            throw w0("Unterminated escape sequence");
        }
        byte bJ0 = this.J.j0();
        if (bJ0 == 10 || bJ0 == 34 || bJ0 == 39 || bJ0 == 47 || bJ0 == 92) {
            return (char) bJ0;
        }
        if (bJ0 == 98) {
            return '\b';
        }
        if (bJ0 == 102) {
            return '\f';
        }
        if (bJ0 == 110) {
            return '\n';
        }
        if (bJ0 == 114) {
            return '\r';
        }
        if (bJ0 == 116) {
            return '\t';
        }
        if (bJ0 != 117) {
            if (this.F) {
                return (char) bJ0;
            }
            throw w0("Invalid escape sequence: \\" + ((char) bJ0));
        }
        if (!this.I.v0(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + i());
        }
        char c = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte bO = this.J.o(i2);
            char c2 = (char) (c << 4);
            if (bO >= 48 && bO <= 57) {
                i = bO - 48;
            } else if (bO >= 97 && bO <= 102) {
                i = bO - 87;
            } else {
                if (bO < 65 || bO > 70) {
                    throw w0("\\u" + this.J.K0(4L));
                }
                i = bO - 55;
            }
            c = (char) (c2 + i);
        }
        this.J.skip(4L);
        return c;
    }

    public final void g1(C4908gi c4908gi) throws C6419m40, EOFException {
        while (true) {
            long jP0 = this.I.P0(c4908gi);
            if (jP0 == -1) {
                throw w0("Unterminated string");
            }
            if (this.J.o(jP0) != 92) {
                this.J.skip(jP0 + 1);
                return;
            } else {
                this.J.skip(jP0 + 1);
                f1();
            }
        }
    }

    public final boolean h1() throws EOFException {
        InterfaceC7424ph interfaceC7424ph = this.I;
        C4908gi c4908gi = S;
        long jF0 = interfaceC7424ph.f0(c4908gi);
        boolean z = jF0 != -1;
        C4057dh c4057dh = this.J;
        c4057dh.skip(z ? jF0 + ((long) c4908gi.s()) : c4057dh.f1());
        return z;
    }

    public final void i1() throws EOFException {
        long jP0 = this.I.P0(R);
        C4057dh c4057dh = this.J;
        c4057dh.skip(jP0 != -1 ? jP0 + 1 : c4057dh.f1());
    }

    @Override // com.daaw.AbstractC6977o40
    public void j() throws C6419m40, EOFException {
        int iY0 = this.K;
        if (iY0 == 0) {
            iY0 = y0();
        }
        if (iY0 != 4) {
            throw new C6140l40("Expected END_ARRAY but was " + W() + " at path " + i());
        }
        int i = this.B;
        this.B = i - 1;
        int[] iArr = this.E;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.K = 0;
    }

    public final void j1() throws EOFException {
        long jP0 = this.I.P0(Q);
        C4057dh c4057dh = this.J;
        if (jP0 == -1) {
            jP0 = c4057dh.f1();
        }
        c4057dh.skip(jP0);
    }

    @Override // com.daaw.AbstractC6977o40
    public void l() throws C6419m40, EOFException {
        int iY0 = this.K;
        if (iY0 == 0) {
            iY0 = y0();
        }
        if (iY0 != 2) {
            throw new C6140l40("Expected END_OBJECT but was " + W() + " at path " + i());
        }
        int i = this.B;
        int i2 = i - 1;
        this.B = i2;
        this.D[i2] = null;
        int[] iArr = this.E;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.K = 0;
    }

    @Override // com.daaw.AbstractC6977o40
    public boolean o() throws C6419m40, EOFException {
        int iY0 = this.K;
        if (iY0 == 0) {
            iY0 = y0();
        }
        return (iY0 == 2 || iY0 == 4 || iY0 == 18) ? false : true;
    }

    @Override // com.daaw.AbstractC6977o40
    public int o0(AbstractC6977o40.a aVar) throws C6419m40, EOFException {
        int iY0 = this.K;
        if (iY0 == 0) {
            iY0 = y0();
        }
        if (iY0 < 12 || iY0 > 15) {
            return -1;
        }
        if (iY0 == 15) {
            return B0(this.N, aVar);
        }
        int iU0 = this.I.u0(aVar.b);
        if (iU0 != -1) {
            this.K = 0;
            this.D[this.B - 1] = aVar.a[iU0];
            return iU0;
        }
        String str = this.D[this.B - 1];
        String strN = N();
        int iB0 = B0(strN, aVar);
        if (iB0 == -1) {
            this.K = 15;
            this.N = strN;
            this.D[this.B - 1] = str;
        }
        return iB0;
    }

    @Override // com.daaw.AbstractC6977o40
    public void p0() throws C6419m40, EOFException {
        if (this.G) {
            throw new C6140l40("Cannot skip unexpected " + W() + " at " + i());
        }
        int iY0 = this.K;
        if (iY0 == 0) {
            iY0 = y0();
        }
        if (iY0 == 14) {
            j1();
        } else if (iY0 == 13) {
            g1(P);
        } else if (iY0 == 12) {
            g1(O);
        } else if (iY0 != 15) {
            throw new C6140l40("Expected a name but was " + W() + " at path " + i());
        }
        this.K = 0;
        this.D[this.B - 1] = "null";
    }

    @Override // com.daaw.AbstractC6977o40
    public void q0() throws C6419m40, EOFException {
        if (this.G) {
            throw new C6140l40("Cannot skip unexpected " + W() + " at " + i());
        }
        int i = 0;
        do {
            int iY0 = this.K;
            if (iY0 == 0) {
                iY0 = y0();
            }
            if (iY0 == 3) {
                Y(1);
            } else if (iY0 == 1) {
                Y(3);
            } else {
                if (iY0 == 4) {
                    i--;
                    if (i < 0) {
                        throw new C6140l40("Expected a value but was " + W() + " at path " + i());
                    }
                    this.B--;
                } else if (iY0 == 2) {
                    i--;
                    if (i < 0) {
                        throw new C6140l40("Expected a value but was " + W() + " at path " + i());
                    }
                    this.B--;
                } else if (iY0 == 14 || iY0 == 10) {
                    j1();
                } else if (iY0 == 9 || iY0 == 13) {
                    g1(P);
                } else if (iY0 == 8 || iY0 == 12) {
                    g1(O);
                } else if (iY0 == 17) {
                    this.J.skip(this.M);
                } else if (iY0 == 18) {
                    throw new C6140l40("Expected a value but was " + W() + " at path " + i());
                }
                this.K = 0;
            }
            i++;
            this.K = 0;
        } while (i != 0);
        int[] iArr = this.E;
        int i2 = this.B;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.D[i2 - 1] = "null";
    }

    @Override // com.daaw.AbstractC6977o40
    public boolean s() throws C6419m40, EOFException {
        int iY0 = this.K;
        if (iY0 == 0) {
            iY0 = y0();
        }
        if (iY0 == 5) {
            this.K = 0;
            int[] iArr = this.E;
            int i = this.B - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iY0 == 6) {
            this.K = 0;
            int[] iArr2 = this.E;
            int i2 = this.B - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        throw new C6140l40("Expected a boolean but was " + W() + " at path " + i());
    }

    public String toString() {
        return "JsonReader(" + this.I + ")";
    }

    public final void x0() throws C6419m40 {
        if (!this.F) {
            throw w0("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    public final int y0() throws C6419m40, EOFException {
        int[] iArr = this.C;
        int i = this.B;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int iK0 = K0(true);
            this.J.j0();
            if (iK0 != 44) {
                if (iK0 != 59) {
                    if (iK0 != 93) {
                        throw w0("Unterminated array");
                    }
                    this.K = 4;
                    return 4;
                }
                x0();
            }
        } else {
            if (i2 == 3 || i2 == 5) {
                iArr[i - 1] = 4;
                if (i2 == 5) {
                    int iK02 = K0(true);
                    this.J.j0();
                    if (iK02 != 44) {
                        if (iK02 != 59) {
                            if (iK02 != 125) {
                                throw w0("Unterminated object");
                            }
                            this.K = 2;
                            return 2;
                        }
                        x0();
                    }
                }
                int iK03 = K0(true);
                if (iK03 == 34) {
                    this.J.j0();
                    this.K = 13;
                    return 13;
                }
                if (iK03 == 39) {
                    this.J.j0();
                    x0();
                    this.K = 12;
                    return 12;
                }
                if (iK03 != 125) {
                    x0();
                    if (!E0((char) iK03)) {
                        throw w0("Expected name");
                    }
                    this.K = 14;
                    return 14;
                }
                if (i2 == 5) {
                    throw w0("Expected name");
                }
                this.J.j0();
                this.K = 2;
                return 2;
            }
            if (i2 == 4) {
                iArr[i - 1] = 5;
                int iK04 = K0(true);
                this.J.j0();
                if (iK04 != 58) {
                    if (iK04 != 61) {
                        throw w0("Expected ':'");
                    }
                    x0();
                    if (this.I.v0(1L) && this.J.o(0L) == 62) {
                        this.J.j0();
                    }
                }
            } else if (i2 == 6) {
                iArr[i - 1] = 7;
            } else if (i2 == 7) {
                if (K0(false) == -1) {
                    this.K = 18;
                    return 18;
                }
                x0();
            } else if (i2 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iK05 = K0(true);
        if (iK05 == 34) {
            this.J.j0();
            this.K = 9;
            return 9;
        }
        if (iK05 == 39) {
            x0();
            this.J.j0();
            this.K = 8;
            return 8;
        }
        if (iK05 != 44 && iK05 != 59) {
            if (iK05 == 91) {
                this.J.j0();
                this.K = 3;
                return 3;
            }
            if (iK05 != 93) {
                if (iK05 == 123) {
                    this.J.j0();
                    this.K = 1;
                    return 1;
                }
                int iB1 = b1();
                if (iB1 != 0) {
                    return iB1;
                }
                int iC1 = c1();
                if (iC1 != 0) {
                    return iC1;
                }
                if (!E0(this.J.o(0L))) {
                    throw w0("Expected value");
                }
                x0();
                this.K = 10;
                return 10;
            }
            if (i2 == 1) {
                this.J.j0();
                this.K = 4;
                return 4;
            }
        }
        if (i2 != 1 && i2 != 2) {
            throw w0("Unexpected value");
        }
        x0();
        this.K = 7;
        return 7;
    }
}
