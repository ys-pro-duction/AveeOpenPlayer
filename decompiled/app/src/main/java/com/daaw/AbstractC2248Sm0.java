package com.daaw;

import java.nio.ByteBuffer;
import java.util.Arrays;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: com.daaw.Sm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2248Sm0 {
    public static final byte[] a = {0, 0, 0, 1};
    public static final float[] b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object c = new Object();
    public static int[] d = new int[10];

    /* JADX INFO: renamed from: com.daaw.Sm0$a */
    public static final class a {
        public final int a;
        public final int b;
        public final boolean c;

        public a(int i, int i2, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Sm0$b */
    public static final class b {
        public final int a;
        public final int b;
        public final int c;
        public final float d;
        public final boolean e;
        public final boolean f;
        public final int g;
        public final int h;
        public final int i;
        public final boolean j;

        public b(int i, int i2, int i3, float f, boolean z, boolean z2, int i4, int i5, int i6, boolean z3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = f;
            this.e = z;
            this.f = z2;
            this.g = i4;
            this.h = i5;
            this.i = i6;
            this.j = z3;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 >= iPosition) {
                byteBuffer.clear();
                return;
            }
            int i4 = byteBuffer.get(i) & 255;
            if (i2 == 3) {
                if (i4 == 1 && (byteBuffer.get(i3) & 31) == 7) {
                    ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                    byteBufferDuplicate.position(i - 3);
                    byteBufferDuplicate.limit(iPosition);
                    byteBuffer.position(0);
                    byteBuffer.put(byteBufferDuplicate);
                    return;
                }
            } else if (i4 == 0) {
                i2++;
            }
            if (i4 != 0) {
                i2 = 0;
            }
            i = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x007a, code lost:
    
        r9 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(byte[] r8, int r9, int r10, boolean[] r11) {
        /*
            int r0 = r10 - r9
            r1 = 0
            r2 = 1
            if (r0 < 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = 0
        L9:
            com.daaw.AbstractC7115ob.f(r3)
            if (r0 != 0) goto L10
            goto Lbc
        L10:
            r3 = 2
            if (r11 == 0) goto L41
            boolean r4 = r11[r1]
            if (r4 == 0) goto L1d
            a(r11)
            int r9 = r9 + (-3)
            return r9
        L1d:
            if (r0 <= r2) goto L2c
            boolean r4 = r11[r2]
            if (r4 == 0) goto L2c
            r4 = r8[r9]
            if (r4 != r2) goto L2c
            a(r11)
            int r9 = r9 - r3
            return r9
        L2c:
            if (r0 <= r3) goto L41
            boolean r4 = r11[r3]
            if (r4 == 0) goto L41
            r4 = r8[r9]
            if (r4 != 0) goto L41
            int r4 = r9 + 1
            r4 = r8[r4]
            if (r4 != r2) goto L41
            a(r11)
            int r9 = r9 - r2
            return r9
        L41:
            int r4 = r10 + (-1)
            int r9 = r9 + r3
        L44:
            if (r9 >= r4) goto L66
            r5 = r8[r9]
            r6 = r5 & 254(0xfe, float:3.56E-43)
            if (r6 == 0) goto L4d
            goto L63
        L4d:
            int r6 = r9 + (-2)
            r7 = r8[r6]
            if (r7 != 0) goto L61
            int r7 = r9 + (-1)
            r7 = r8[r7]
            if (r7 != 0) goto L61
            if (r5 != r2) goto L61
            if (r11 == 0) goto L60
            a(r11)
        L60:
            return r6
        L61:
            int r9 = r9 + (-2)
        L63:
            int r9 = r9 + 3
            goto L44
        L66:
            if (r11 == 0) goto Lbc
            if (r0 <= r3) goto L7e
            int r9 = r10 + (-3)
            r9 = r8[r9]
            if (r9 != 0) goto L7c
            int r9 = r10 + (-2)
            r9 = r8[r9]
            if (r9 != 0) goto L7c
            r9 = r8[r4]
            if (r9 != r2) goto L7c
        L7a:
            r9 = 1
            goto L98
        L7c:
            r9 = 0
            goto L98
        L7e:
            if (r0 != r3) goto L8f
            boolean r9 = r11[r3]
            if (r9 == 0) goto L7c
            int r9 = r10 + (-2)
            r9 = r8[r9]
            if (r9 != 0) goto L7c
            r9 = r8[r4]
            if (r9 != r2) goto L7c
            goto L7a
        L8f:
            boolean r9 = r11[r2]
            if (r9 == 0) goto L7c
            r9 = r8[r4]
            if (r9 != r2) goto L7c
            goto L7a
        L98:
            r11[r1] = r9
            if (r0 <= r2) goto Laa
            int r9 = r10 + (-2)
            r9 = r8[r9]
            if (r9 != 0) goto La8
            r9 = r8[r4]
            if (r9 != 0) goto La8
        La6:
            r9 = 1
            goto Lb3
        La8:
            r9 = 0
            goto Lb3
        Laa:
            boolean r9 = r11[r3]
            if (r9 == 0) goto La8
            r9 = r8[r4]
            if (r9 != 0) goto La8
            goto La6
        Lb3:
            r11[r2] = r9
            r8 = r8[r4]
            if (r8 != 0) goto Lba
            r1 = 1
        Lba:
            r11[r3] = r1
        Lbc:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC2248Sm0.c(byte[], int, int, boolean[]):int");
    }

    public static int d(byte[] bArr, int i, int i2) {
        while (i < i2 - 2) {
            if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 3) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int e(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    public static int f(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    public static boolean g(String str, byte b2) {
        return ("video/avc".equals(str) && (b2 & 31) == 6) || ("video/hevc".equals(str) && ((b2 & 126) >> 1) == 39);
    }

    public static a h(byte[] bArr, int i, int i2) {
        C2688Ws0 c2688Ws0 = new C2688Ws0(bArr, i, i2);
        c2688Ws0.l(8);
        int iH = c2688Ws0.h();
        int iH2 = c2688Ws0.h();
        c2688Ws0.k();
        return new a(iH, iH2, c2688Ws0.d());
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.daaw.AbstractC2248Sm0.b i(byte[] r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC2248Sm0.i(byte[], int, int):com.daaw.Sm0$b");
    }

    public static void j(C2688Ws0 c2688Ws0, int i) {
        int iG = 8;
        int i2 = 8;
        for (int i3 = 0; i3 < i; i3++) {
            if (iG != 0) {
                iG = ((c2688Ws0.g() + i2) + PSKKeyManager.MAX_KEY_LENGTH_BYTES) % PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
            if (iG != 0) {
                i2 = iG;
            }
        }
    }

    public static int k(byte[] bArr, int i) {
        int i2;
        synchronized (c) {
            int iD = 0;
            int i3 = 0;
            while (iD < i) {
                try {
                    iD = d(bArr, iD, i);
                    if (iD < i) {
                        int[] iArr = d;
                        if (iArr.length <= i3) {
                            d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        d[i3] = iD;
                        iD += 3;
                        i3++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i2 = i - i3;
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i3; i6++) {
                int i7 = d[i6] - i5;
                System.arraycopy(bArr, i5, bArr, i4, i7);
                int i8 = i4 + i7;
                int i9 = i8 + 1;
                bArr[i8] = 0;
                i4 = i8 + 2;
                bArr[i9] = 0;
                i5 += i7 + 3;
            }
            System.arraycopy(bArr, i5, bArr, i4, i2 - i4);
        }
        return i2;
    }
}
