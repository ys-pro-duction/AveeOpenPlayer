package com.daaw;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.p40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7256p40 implements Closeable, AutoCloseable {
    public final Reader B;
    public long J;
    public int K;
    public String L;
    public int[] M;
    public String[] O;
    public int[] P;
    public boolean C = false;
    public final char[] D = new char[1024];
    public int E = 0;
    public int F = 0;
    public int G = 0;
    public int H = 0;
    public int I = 0;
    public int N = 1;

    /* JADX INFO: renamed from: com.daaw.p40$a */
    public class a extends AbstractC7535q40 {
    }

    static {
        AbstractC7535q40.a = new a();
    }

    public C7256p40(Reader reader) {
        int[] iArr = new int[32];
        this.M = iArr;
        iArr[0] = 6;
        this.O = new String[32];
        this.P = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.B = reader;
    }

    public final int B0() {
        String str;
        String str2;
        int i;
        char c = this.D[this.E];
        if (c == 't' || c == 'T') {
            str = "true";
            str2 = "TRUE";
            i = 5;
        } else if (c == 'f' || c == 'F') {
            str = "false";
            str2 = "FALSE";
            i = 6;
        } else {
            if (c != 'n' && c != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i = 7;
        }
        int length = str.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (this.E + i2 >= this.F && !F(i2 + 1)) {
                return 0;
            }
            char c2 = this.D[this.E + i2];
            if (c2 != str.charAt(i2) && c2 != str2.charAt(i2)) {
                return 0;
            }
        }
        if ((this.E + length < this.F || F(length + 1)) && R(this.D[this.E + length])) {
            return 0;
        }
        this.E += length;
        this.I = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0092, code lost:
    
        if (R(r14) != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0094, code lost:
    
        if (r9 != 2) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0096, code lost:
    
        if (r10 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009c, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009e, code lost:
    
        if (r13 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a2, code lost:
    
        if (r11 != 0) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a4, code lost:
    
        if (r13 != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a6, code lost:
    
        if (r13 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a9, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00aa, code lost:
    
        r19.J = r11;
        r19.E += r8;
        r19.I = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b5, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b6, code lost:
    
        if (r9 == 2) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b9, code lost:
    
        if (r9 == 4) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00bc, code lost:
    
        if (r9 != 7) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00bf, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c0, code lost:
    
        r19.K = r8;
        r19.I = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00c6, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c7, code lost:
    
        return 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int E0() {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C7256p40.E0():int");
    }

    public final boolean F(int i) throws IOException {
        int i2;
        int i3;
        char[] cArr = this.D;
        int i4 = this.H;
        int i5 = this.E;
        this.H = i4 - i5;
        int i6 = this.F;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.F = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.F = 0;
        }
        this.E = 0;
        do {
            Reader reader = this.B;
            int i8 = this.F;
            int i9 = reader.read(cArr, i8, cArr.length - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.F + i9;
            this.F = i2;
            if (this.G == 0 && (i3 = this.H) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.E++;
                this.H = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    public final String I(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (true) {
            int i2 = this.N;
            if (i >= i2) {
                return sb.toString();
            }
            int i3 = this.M[i];
            if (i3 == 1 || i3 == 2) {
                int i4 = this.P[i];
                if (z && i4 > 0 && i == i2 - 1) {
                    i4--;
                }
                sb.append('[');
                sb.append(i4);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = this.O[i];
                if (str != null) {
                    sb.append(str);
                }
            }
            i++;
        }
    }

    public final void K0(int i) {
        int i2 = this.N;
        int[] iArr = this.M;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.M = Arrays.copyOf(iArr, i3);
            this.P = Arrays.copyOf(this.P, i3);
            this.O = (String[]) Arrays.copyOf(this.O, i3);
        }
        int[] iArr2 = this.M;
        int i4 = this.N;
        this.N = i4 + 1;
        iArr2[i4] = i;
    }

    public boolean N() throws IOException {
        int iL = this.I;
        if (iL == 0) {
            iL = l();
        }
        return (iL == 2 || iL == 4 || iL == 17) ? false : true;
    }

    public final char Q0() throws IOException {
        int i;
        if (this.E == this.F && !F(1)) {
            throw c1("Unterminated escape sequence");
        }
        char[] cArr = this.D;
        int i2 = this.E;
        int i3 = i2 + 1;
        this.E = i3;
        char c = cArr[i2];
        if (c == '\n') {
            this.G++;
            this.H = i3;
            return c;
        }
        if (c == '\"' || c == '\'' || c == '/' || c == '\\') {
            return c;
        }
        if (c == 'b') {
            return '\b';
        }
        if (c == 'f') {
            return '\f';
        }
        if (c == 'n') {
            return '\n';
        }
        if (c == 'r') {
            return '\r';
        }
        if (c == 't') {
            return '\t';
        }
        if (c != 'u') {
            throw c1("Invalid escape sequence");
        }
        if (i2 + 5 > this.F && !F(4)) {
            throw c1("Unterminated escape sequence");
        }
        int i4 = this.E;
        int i5 = i4 + 4;
        char c2 = 0;
        while (i4 < i5) {
            char c3 = this.D[i4];
            char c4 = (char) (c2 << 4);
            if (c3 >= '0' && c3 <= '9') {
                i = c3 - '0';
            } else if (c3 >= 'a' && c3 <= 'f') {
                i = c3 - 'W';
            } else {
                if (c3 < 'A' || c3 > 'F') {
                    throw new NumberFormatException("\\u" + new String(this.D, this.E, 4));
                }
                i = c3 - '7';
            }
            c2 = (char) (c4 + i);
            i4++;
        }
        this.E += 4;
        return c2;
    }

    public final boolean R(char c) throws IOException {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case ModuleDescriptor.MODULE_VERSION /* 92 */:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        d();
        return false;
    }

    public String U() {
        return " at line " + (this.G + 1) + " column " + ((this.E - this.H) + 1) + " path " + i();
    }

    public boolean W() throws IOException {
        int iL = this.I;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 5) {
            this.I = 0;
            int[] iArr = this.P;
            int i = this.N - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iL == 6) {
            this.I = 0;
            int[] iArr2 = this.P;
            int i2 = this.N - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + y0() + U());
    }

    public double Y() throws IOException {
        int iL = this.I;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 15) {
            this.I = 0;
            int[] iArr = this.P;
            int i = this.N - 1;
            iArr[i] = iArr[i] + 1;
            return this.J;
        }
        if (iL == 16) {
            this.L = new String(this.D, this.E, this.K);
            this.E += this.K;
        } else if (iL == 8 || iL == 9) {
            this.L = s0(iL == 8 ? '\'' : '\"');
        } else if (iL == 10) {
            this.L = x0();
        } else if (iL != 11) {
            throw new IllegalStateException("Expected a double but was " + y0() + U());
        }
        this.I = 11;
        double d = Double.parseDouble(this.L);
        if (!this.C && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new C4899gg0("JSON forbids NaN and infinities: " + d + U());
        }
        this.L = null;
        this.I = 0;
        int[] iArr2 = this.P;
        int i2 = this.N - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d;
    }

    public final boolean Y0(String str) {
        int length = str.length();
        while (true) {
            if (this.E + length > this.F && !F(length)) {
                return false;
            }
            char[] cArr = this.D;
            int i = this.E;
            if (cArr[i] != '\n') {
                for (int i2 = 0; i2 < length; i2++) {
                    if (this.D[this.E + i2] != str.charAt(i2)) {
                        break;
                    }
                }
                return true;
            }
            this.G++;
            this.H = i + 1;
            this.E++;
        }
    }

    public void a() throws IOException {
        int iL = this.I;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 3) {
            K0(1);
            this.P[this.N - 1] = 0;
            this.I = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + y0() + U());
        }
    }

    public final void b1() {
        char c;
        do {
            if (this.E >= this.F && !F(1)) {
                return;
            }
            char[] cArr = this.D;
            int i = this.E;
            int i2 = i + 1;
            this.E = i2;
            c = cArr[i];
            if (c == '\n') {
                this.G++;
                this.H = i2;
                return;
            }
        } while (c != '\r');
    }

    public void c() throws IOException {
        int iL = this.I;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 1) {
            K0(3);
            this.I = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + y0() + U());
        }
    }

    public final IOException c1(String str) throws C4899gg0 {
        throw new C4899gg0(str + U());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.I = 0;
        this.M[0] = 8;
        this.N = 1;
        this.B.close();
    }

    public final void d() throws IOException {
        if (!this.C) {
            throw c1("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    public String i() {
        return I(false);
    }

    public final void j() throws IOException {
        p0(true);
        int i = this.E;
        this.E = i - 1;
        if (i + 4 <= this.F || F(5)) {
            int i2 = this.E;
            char[] cArr = this.D;
            if (cArr[i2] == ')' && cArr[i2 + 1] == ']' && cArr[i2 + 2] == '}' && cArr[i2 + 3] == '\'' && cArr[i2 + 4] == '\n') {
                this.E = i2 + 5;
            }
        }
    }

    public int l() throws IOException {
        int iP0;
        int[] iArr = this.M;
        int i = this.N;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int iP02 = p0(true);
            if (iP02 != 44) {
                if (iP02 != 59) {
                    if (iP02 != 93) {
                        throw c1("Unterminated array");
                    }
                    this.I = 4;
                    return 4;
                }
                d();
            }
        } else {
            if (i2 == 3 || i2 == 5) {
                iArr[i - 1] = 4;
                if (i2 == 5 && (iP0 = p0(true)) != 44) {
                    if (iP0 != 59) {
                        if (iP0 != 125) {
                            throw c1("Unterminated object");
                        }
                        this.I = 2;
                        return 2;
                    }
                    d();
                }
                int iP03 = p0(true);
                if (iP03 == 34) {
                    this.I = 13;
                    return 13;
                }
                if (iP03 == 39) {
                    d();
                    this.I = 12;
                    return 12;
                }
                if (iP03 == 125) {
                    if (i2 == 5) {
                        throw c1("Expected name");
                    }
                    this.I = 2;
                    return 2;
                }
                d();
                this.E--;
                if (!R((char) iP03)) {
                    throw c1("Expected name");
                }
                this.I = 14;
                return 14;
            }
            if (i2 == 4) {
                iArr[i - 1] = 5;
                int iP04 = p0(true);
                if (iP04 != 58) {
                    if (iP04 != 61) {
                        throw c1("Expected ':'");
                    }
                    d();
                    if (this.E < this.F || F(1)) {
                        char[] cArr = this.D;
                        int i3 = this.E;
                        if (cArr[i3] == '>') {
                            this.E = i3 + 1;
                        }
                    }
                }
            } else if (i2 == 6) {
                if (this.C) {
                    j();
                }
                this.M[this.N - 1] = 7;
            } else if (i2 == 7) {
                if (p0(false) == -1) {
                    this.I = 17;
                    return 17;
                }
                d();
                this.E--;
            } else if (i2 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iP05 = p0(true);
        if (iP05 == 34) {
            this.I = 9;
            return 9;
        }
        if (iP05 == 39) {
            d();
            this.I = 8;
            return 8;
        }
        if (iP05 != 44 && iP05 != 59) {
            if (iP05 == 91) {
                this.I = 3;
                return 3;
            }
            if (iP05 != 93) {
                if (iP05 == 123) {
                    this.I = 1;
                    return 1;
                }
                this.E--;
                int iB0 = B0();
                if (iB0 != 0) {
                    return iB0;
                }
                int iE0 = E0();
                if (iE0 != 0) {
                    return iE0;
                }
                if (!R(this.D[this.E])) {
                    throw c1("Expected value");
                }
                d();
                this.I = 10;
                return 10;
            }
            if (i2 == 1) {
                this.I = 4;
                return 4;
            }
        }
        if (i2 != 1 && i2 != 2) {
            throw c1("Unexpected value");
        }
        d();
        this.E--;
        this.I = 7;
        return 7;
    }

    public void o() throws IOException {
        int iL = this.I;
        if (iL == 0) {
            iL = l();
        }
        if (iL != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + y0() + U());
        }
        int i = this.N;
        this.N = i - 1;
        int[] iArr = this.P;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.I = 0;
    }

    public String o0() throws IOException {
        String strS0;
        int iL = this.I;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 14) {
            strS0 = x0();
        } else if (iL == 12) {
            strS0 = s0('\'');
        } else {
            if (iL != 13) {
                throw new IllegalStateException("Expected a name but was " + y0() + U());
            }
            strS0 = s0('\"');
        }
        this.I = 0;
        this.O[this.N - 1] = strS0;
        return strS0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int p0(boolean r9) throws java.io.IOException {
        /*
            r8 = this;
            char[] r0 = r8.D
            int r1 = r8.E
            int r2 = r8.F
        L6:
            r3 = 1
            if (r1 != r2) goto L34
            r8.E = r1
            boolean r1 = r8.F(r3)
            if (r1 != 0) goto L30
            if (r9 != 0) goto L15
            r9 = -1
            return r9
        L15:
            java.io.EOFException r9 = new java.io.EOFException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "End of input"
            r0.append(r1)
            java.lang.String r1 = r8.U()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L30:
            int r1 = r8.E
            int r2 = r8.F
        L34:
            int r4 = r1 + 1
            char r5 = r0[r1]
            r6 = 10
            if (r5 != r6) goto L45
            int r1 = r8.G
            int r1 = r1 + r3
            r8.G = r1
            r8.H = r4
            goto Lb2
        L45:
            r6 = 32
            if (r5 == r6) goto Lb2
            r6 = 13
            if (r5 == r6) goto Lb2
            r6 = 9
            if (r5 != r6) goto L52
            goto Lb2
        L52:
            r6 = 47
            if (r5 != r6) goto L9d
            r8.E = r4
            r7 = 2
            if (r4 != r2) goto L69
            r8.E = r1
            boolean r1 = r8.F(r7)
            int r2 = r8.E
            int r2 = r2 + r3
            r8.E = r2
            if (r1 != 0) goto L69
            goto L76
        L69:
            r8.d()
            int r1 = r8.E
            char r2 = r0[r1]
            r3 = 42
            if (r2 == r3) goto L83
            if (r2 == r6) goto L77
        L76:
            return r5
        L77:
            int r1 = r1 + 1
            r8.E = r1
            r8.b1()
            int r1 = r8.E
            int r2 = r8.F
            goto L6
        L83:
            int r1 = r1 + 1
            r8.E = r1
        */
        //  java.lang.String r1 = "*/"
        /*
            boolean r1 = r8.Y0(r1)
            if (r1 == 0) goto L96
            int r1 = r8.E
            int r1 = r1 + r7
            int r2 = r8.F
            goto L6
        L96:
            java.lang.String r9 = "Unterminated comment"
            java.io.IOException r9 = r8.c1(r9)
            throw r9
        L9d:
            r1 = 35
            if (r5 != r1) goto Laf
            r8.E = r4
            r8.d()
            r8.b1()
            int r1 = r8.E
            int r2 = r8.F
            goto L6
        Laf:
            r8.E = r4
            return r5
        Lb2:
            r1 = r4
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C7256p40.p0(boolean):int");
    }

    public void q0() throws IOException {
        int iL = this.I;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 7) {
            this.I = 0;
            int[] iArr = this.P;
            int i = this.N - 1;
            iArr[i] = iArr[i] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + y0() + U());
    }

    public void s() throws IOException {
        int iL = this.I;
        if (iL == 0) {
            iL = l();
        }
        if (iL != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + y0() + U());
        }
        int i = this.N;
        int i2 = i - 1;
        this.N = i2;
        this.O[i2] = null;
        int[] iArr = this.P;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.I = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        r1.append(r0, r3, r2 - r3);
        r9.E = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String s0(char r10) throws java.io.IOException {
        /*
            r9 = this;
            char[] r0 = r9.D
            r1 = 0
        L3:
            int r2 = r9.E
            int r3 = r9.F
        L7:
            r4 = r3
            r3 = r2
        L9:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L5a
            int r7 = r2 + 1
            char r2 = r0[r2]
            if (r2 != r10) goto L28
            r9.E = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L20
            java.lang.String r10 = new java.lang.String
            r10.<init>(r0, r3, r7)
            return r10
        L20:
            r1.append(r0, r3, r7)
            java.lang.String r10 = r1.toString()
            return r10
        L28:
            r8 = 92
            if (r2 != r8) goto L4d
            r9.E = r7
            int r7 = r7 - r3
            int r2 = r7 + (-1)
            if (r1 != 0) goto L3e
            int r7 = r7 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r7, r5)
            r1.<init>(r4)
        L3e:
            r1.append(r0, r3, r2)
            char r2 = r9.Q0()
            r1.append(r2)
            int r2 = r9.E
            int r3 = r9.F
            goto L7
        L4d:
            r5 = 10
            if (r2 != r5) goto L58
            int r2 = r9.G
            int r2 = r2 + r6
            r9.G = r2
            r9.H = r7
        L58:
            r2 = r7
            goto L9
        L5a:
            if (r1 != 0) goto L6a
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L6a:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r9.E = r2
            boolean r2 = r9.F(r6)
            if (r2 == 0) goto L78
            goto L3
        L78:
            java.lang.String r10 = "Unterminated string"
            java.io.IOException r10 = r9.c1(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C7256p40.s0(char):java.lang.String");
    }

    public String toString() {
        return getClass().getSimpleName() + U();
    }

    public String w0() throws IOException {
        String str;
        int iL = this.I;
        if (iL == 0) {
            iL = l();
        }
        if (iL == 10) {
            str = x0();
        } else if (iL == 8) {
            str = s0('\'');
        } else if (iL == 9) {
            str = s0('\"');
        } else if (iL == 11) {
            str = this.L;
            this.L = null;
        } else if (iL == 15) {
            str = Long.toString(this.J);
        } else {
            if (iL != 16) {
                throw new IllegalStateException("Expected a string but was " + y0() + U());
            }
            str = new String(this.D, this.E, this.K);
            this.E += this.K;
        }
        this.I = 0;
        int[] iArr = this.P;
        int i = this.N - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        d();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String x0() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 0
        L3:
            int r3 = r6.E
            int r4 = r3 + r2
            int r5 = r6.F
            if (r4 >= r5) goto L4e
            char[] r4 = r6.D
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.d()
            goto L5c
        L4e:
            char[] r3 = r6.D
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.F(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r1 = r2
            goto L7e
        L5e:
            if (r0 != 0) goto L6b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L6b:
            char[] r3 = r6.D
            int r4 = r6.E
            r0.append(r3, r4, r2)
            int r3 = r6.E
            int r3 = r3 + r2
            r6.E = r3
            r2 = 1
            boolean r2 = r6.F(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r0 != 0) goto L8a
            java.lang.String r0 = new java.lang.String
            char[] r2 = r6.D
            int r3 = r6.E
            r0.<init>(r2, r3, r1)
            goto L95
        L8a:
            char[] r2 = r6.D
            int r3 = r6.E
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L95:
            int r2 = r6.E
            int r2 = r2 + r1
            r6.E = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C7256p40.x0():java.lang.String");
    }

    public EnumC8092s40 y0() throws IOException {
        int iL = this.I;
        if (iL == 0) {
            iL = l();
        }
        switch (iL) {
            case 1:
                return EnumC8092s40.BEGIN_OBJECT;
            case 2:
                return EnumC8092s40.END_OBJECT;
            case 3:
                return EnumC8092s40.BEGIN_ARRAY;
            case 4:
                return EnumC8092s40.END_ARRAY;
            case 5:
            case 6:
                return EnumC8092s40.BOOLEAN;
            case 7:
                return EnumC8092s40.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return EnumC8092s40.STRING;
            case 12:
            case 13:
            case 14:
                return EnumC8092s40.NAME;
            case 15:
            case 16:
                return EnumC8092s40.NUMBER;
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return EnumC8092s40.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }
}
