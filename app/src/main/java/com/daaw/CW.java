package com.daaw;

import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class CW {
    public static final char[] e = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String a;
    public final String b;
    public final int c;
    public final String d;

    public static final class b {
        public String a;
        public String b;
        public int c = -1;

        public static String b(String str, int i, int i2) {
            String strD = CW.d(str, i, i2, false);
            if (!strD.startsWith("[") || !strD.endsWith("]")) {
                return f(strD);
            }
            InetAddress inetAddressE = e(strD, 1, strD.length() - 1);
            if (inetAddressE == null) {
                return null;
            }
            byte[] address = inetAddressE.getAddress();
            if (address.length == 16) {
                return i(address);
            }
            throw new AssertionError();
        }

        public static boolean c(String str) {
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt <= 31 || cCharAt >= 127 || " #%/:?@[\\]".indexOf(cCharAt) != -1) {
                    return true;
                }
            }
            return false;
        }

        public static boolean d(String str, int i, int i2, byte[] bArr, int i3) {
            int i4 = i3;
            while (i < i2) {
                if (i4 == bArr.length) {
                    return false;
                }
                if (i4 != i3) {
                    if (str.charAt(i) != '.') {
                        return false;
                    }
                    i++;
                }
                int i5 = i;
                int i6 = 0;
                while (i5 < i2) {
                    char cCharAt = str.charAt(i5);
                    if (cCharAt < '0' || cCharAt > '9') {
                        break;
                    }
                    if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + cCharAt) - 48) > 255) {
                        return false;
                    }
                    i5++;
                }
                if (i5 - i == 0) {
                    return false;
                }
                bArr[i4] = (byte) i6;
                i4++;
                i = i5;
            }
            return i4 == i3 + 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x0079, code lost:
        
            if (r4 == 16) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x007b, code lost:
        
            if (r5 != (-1)) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x007d, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x007e, code lost:
        
            r12 = r4 - r5;
            java.lang.System.arraycopy(r1, r5, r1, 16 - r12, r12);
            java.util.Arrays.fill(r1, r5, (16 - r4) + r5, (byte) 0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x008e, code lost:
        
            return java.net.InetAddress.getByAddress(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0094, code lost:
        
            throw new java.lang.AssertionError();
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x004f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.net.InetAddress e(java.lang.String r12, int r13, int r14) {
            /*
                r0 = 16
                byte[] r1 = new byte[r0]
                r2 = 0
                r3 = -1
                r4 = 0
                r5 = -1
                r6 = -1
            L9:
                r7 = 0
                if (r13 >= r14) goto L79
                if (r4 != r0) goto Lf
                return r7
            Lf:
                int r8 = r13 + 2
                r9 = 2
                if (r8 > r14) goto L27
                java.lang.String r10 = "::"
                boolean r10 = r12.regionMatches(r13, r10, r2, r9)
                if (r10 == 0) goto L27
                if (r5 == r3) goto L1f
                return r7
            L1f:
                int r4 = r4 + 2
                r5 = r4
                if (r8 != r14) goto L25
                goto L79
            L25:
                r6 = r8
                goto L4b
            L27:
                if (r4 == 0) goto L34
                java.lang.String r8 = ":"
                r10 = 1
                boolean r8 = r12.regionMatches(r13, r8, r2, r10)
                if (r8 == 0) goto L36
                int r13 = r13 + 1
            L34:
                r6 = r13
                goto L4b
            L36:
                java.lang.String r8 = "."
                boolean r13 = r12.regionMatches(r13, r8, r2, r10)
                if (r13 == 0) goto L4a
                int r13 = r4 + (-2)
                boolean r12 = d(r12, r6, r14, r1, r13)
                if (r12 != 0) goto L47
                return r7
            L47:
                int r4 = r4 + 2
                goto L79
            L4a:
                return r7
            L4b:
                r13 = r6
                r8 = 0
            L4d:
                if (r13 >= r14) goto L60
                char r10 = r12.charAt(r13)
                int r10 = com.daaw.CW.a(r10)
                if (r10 != r3) goto L5a
                goto L60
            L5a:
                int r8 = r8 << 4
                int r8 = r8 + r10
                int r13 = r13 + 1
                goto L4d
            L60:
                int r10 = r13 - r6
                if (r10 == 0) goto L78
                r11 = 4
                if (r10 <= r11) goto L68
                goto L78
            L68:
                int r7 = r4 + 1
                int r10 = r8 >>> 8
                r10 = r10 & 255(0xff, float:3.57E-43)
                byte r10 = (byte) r10
                r1[r4] = r10
                int r4 = r4 + r9
                r8 = r8 & 255(0xff, float:3.57E-43)
                byte r8 = (byte) r8
                r1[r7] = r8
                goto L9
            L78:
                return r7
            L79:
                if (r4 == r0) goto L8a
                if (r5 != r3) goto L7e
                return r7
            L7e:
                int r12 = r4 - r5
                int r13 = 16 - r12
                java.lang.System.arraycopy(r1, r5, r1, r13, r12)
                int r0 = r0 - r4
                int r0 = r0 + r5
                java.util.Arrays.fill(r1, r5, r0, r2)
            L8a:
                java.net.InetAddress r12 = java.net.InetAddress.getByAddress(r1)     // Catch: java.net.UnknownHostException -> L8f
                return r12
            L8f:
                java.lang.AssertionError r12 = new java.lang.AssertionError
                r12.<init>()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.CW.b.e(java.lang.String, int, int):java.net.InetAddress");
        }

        public static String f(String str) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.isEmpty()) {
                    return null;
                }
                if (c(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public static String i(byte[] bArr) {
            int i = -1;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i3 < bArr.length) {
                int i5 = i3;
                while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                    i5 += 2;
                }
                int i6 = i5 - i3;
                if (i6 > i4) {
                    i = i3;
                    i4 = i6;
                }
                i3 = i5 + 2;
            }
            C4057dh c4057dh = new C4057dh();
            while (i2 < bArr.length) {
                if (i2 == i) {
                    c4057dh.L(58);
                    i2 += i4;
                    if (i2 == 16) {
                        c4057dh.L(58);
                    }
                } else {
                    if (i2 > 0) {
                        c4057dh.L(58);
                    }
                    c4057dh.n1(((bArr[i2] & 255) << 8) | (bArr[i2 + 1] & 255));
                    i2 += 2;
                }
            }
            return c4057dh.E0();
        }

        public CW a() {
            if (this.a == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.b != null) {
                return new CW(this);
            }
            throw new IllegalStateException("host == null");
        }

        public int g() {
            int i = this.c;
            return i != -1 ? i : CW.b(this.a);
        }

        public b h(String str) {
            if (str == null) {
                throw new IllegalArgumentException("host == null");
            }
            String strB = b(str, 0, str.length());
            if (strB != null) {
                this.b = strB;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        public b j(int i) {
            if (i > 0 && i <= 65535) {
                this.c = i;
                return this;
            }
            throw new IllegalArgumentException("unexpected port: " + i);
        }

        public b k(String str) {
            if (str == null) {
                throw new IllegalArgumentException("scheme == null");
            }
            if (str.equalsIgnoreCase("http")) {
                this.a = "http";
                return this;
            }
            if (str.equalsIgnoreCase("https")) {
                this.a = "https";
                return this;
            }
            throw new IllegalArgumentException("unexpected scheme: " + str);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append("://");
            if (this.b.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.b);
                sb.append(']');
            } else {
                sb.append(this.b);
            }
            int iG = g();
            if (iG != CW.b(this.a)) {
                sb.append(':');
                sb.append(iG);
            }
            return sb.toString();
        }
    }

    public static int a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    public static int b(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public static String d(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                C4057dh c4057dh = new C4057dh();
                c4057dh.n0(str, i, i3);
                e(c4057dh, str, i3, i2, z);
                return c4057dh.E0();
            }
        }
        return str.substring(i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(com.daaw.C4057dh r5, java.lang.String r6, int r7, int r8, boolean r9) {
        /*
        L0:
            if (r7 >= r8) goto L42
            int r0 = r6.codePointAt(r7)
            r1 = 37
            if (r0 != r1) goto L2d
            int r1 = r7 + 2
            if (r1 >= r8) goto L2d
            int r2 = r7 + 1
            char r2 = r6.charAt(r2)
            int r2 = a(r2)
            char r3 = r6.charAt(r1)
            int r3 = a(r3)
            r4 = -1
            if (r2 == r4) goto L39
            if (r3 == r4) goto L39
            int r7 = r2 << 4
            int r7 = r7 + r3
            r5.L(r7)
            r7 = r1
            goto L3c
        L2d:
            r1 = 43
            if (r0 != r1) goto L39
            if (r9 == 0) goto L39
            r1 = 32
            r5.L(r1)
            goto L3c
        L39:
            r5.t1(r0)
        L3c:
            int r0 = java.lang.Character.charCount(r0)
            int r7 = r7 + r0
            goto L0
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.CW.e(com.daaw.dh, java.lang.String, int, int, boolean):void");
    }

    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof CW) && ((CW) obj).d.equals(this.d);
    }

    public int f() {
        return this.c;
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public String toString() {
        return this.d;
    }

    public CW(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.g();
        this.d = bVar.toString();
    }
}
