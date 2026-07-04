package com.daaw;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Region;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes.dex */
public final class SE {
    public static final byte[] h = {0, 7, 8, 15};
    public static final byte[] i = {0, 119, -120, -1};
    public static final byte[] j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public final Paint a;
    public final Paint b;
    public final Canvas c;
    public final b d;
    public final a e;
    public final h f;
    public Bitmap g;

    public static final class a {
        public final int a;
        public final int[] b;
        public final int[] c;
        public final int[] d;

        public a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.a = i;
            this.b = iArr;
            this.c = iArr2;
            this.d = iArr3;
        }
    }

    public static final class b {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
        }
    }

    public static final class c {
        public final int a;
        public final boolean b;
        public final byte[] c;
        public final byte[] d;

        public c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.a = i;
            this.b = z;
            this.c = bArr;
            this.d = bArr2;
        }
    }

    public static final class d {
        public final int a;
        public final int b;
        public final int c;
        public final SparseArray d;

        public d(int i, int i2, int i3, SparseArray sparseArray) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = sparseArray;
        }
    }

    public static final class e {
        public final int a;
        public final int b;

        public e(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public static final class f {
        public final int a;
        public final boolean b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final int j;
        public final SparseArray k;

        public f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray sparseArray) {
            this.a = i;
            this.b = z;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
            this.h = i7;
            this.i = i8;
            this.j = i9;
            this.k = sparseArray;
        }

        public void a(f fVar) {
            if (fVar == null) {
                return;
            }
            SparseArray sparseArray = fVar.k;
            for (int i = 0; i < sparseArray.size(); i++) {
                this.k.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
            }
        }
    }

    public static final class g {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public g(int i, int i2, int i3, int i4, int i5, int i6) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
        }
    }

    public static final class h {
        public final int a;
        public final int b;
        public final SparseArray c = new SparseArray();
        public final SparseArray d = new SparseArray();
        public final SparseArray e = new SparseArray();
        public final SparseArray f = new SparseArray();
        public final SparseArray g = new SparseArray();
        public b h;
        public d i;

        public h(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public void a() {
            this.c.clear();
            this.d.clear();
            this.e.clear();
            this.f.clear();
            this.g.clear();
            this.h = null;
            this.i = null;
        }
    }

    public SE(int i2, int i3) {
        Paint paint = new Paint();
        this.a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.c = new Canvas();
        this.d = new b(719, 575, 0, 719, 0, 575);
        this.e = new a(0, c(), d(), e());
        this.f = new h(i2, i3);
    }

    public static byte[] a(int i2, int i3, C2480Us0 c2480Us0) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) c2480Us0.h(i3);
        }
        return bArr;
    }

    public static int[] c() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    public static int[] d() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = f(255, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i2] = f(255, (i2 & 1) != 0 ? 127 : 0, (i2 & 2) != 0 ? 127 : 0, (i2 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] e() {
        int[] iArr = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = f(63, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & 136;
                if (i3 == 0) {
                    iArr[i2] = f(255, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 8) {
                    iArr[i2] = f(127, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 128) {
                    iArr[i2] = f(255, ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = f(255, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int f(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0078 A[LOOP:0: B:3:0x0002->B:33:0x0078, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int g(com.daaw.C2480Us0 r9, int[] r10, byte[] r11, int r12, int r13, android.graphics.Paint r14, android.graphics.Canvas r15) {
        /*
            r6 = 0
            r0 = 0
        L2:
            r1 = 2
            int r2 = r9.h(r1)
            r3 = 1
            if (r2 == 0) goto Ld
            r7 = r0
        Lb:
            r8 = 1
            goto L5a
        Ld:
            boolean r2 = r9.g()
            r4 = 3
            if (r2 == 0) goto L21
            int r2 = r9.h(r4)
            int r2 = r2 + r4
            int r1 = r9.h(r1)
        L1d:
            r7 = r0
            r8 = r2
            r2 = r1
            goto L5a
        L21:
            boolean r2 = r9.g()
            if (r2 == 0) goto L2a
            r7 = r0
            r2 = 0
            goto Lb
        L2a:
            int r2 = r9.h(r1)
            if (r2 == 0) goto L57
            if (r2 == r3) goto L53
            if (r2 == r1) goto L47
            if (r2 == r4) goto L3a
            r7 = r0
            r2 = 0
        L38:
            r8 = 0
            goto L5a
        L3a:
            r2 = 8
            int r2 = r9.h(r2)
            int r2 = r2 + 29
            int r1 = r9.h(r1)
            goto L1d
        L47:
            r2 = 4
            int r2 = r9.h(r2)
            int r2 = r2 + 12
            int r1 = r9.h(r1)
            goto L1d
        L53:
            r7 = r0
            r2 = 0
            r8 = 2
            goto L5a
        L57:
            r2 = 0
            r7 = 1
            goto L38
        L5a:
            if (r8 == 0) goto L74
            if (r14 == 0) goto L74
            if (r11 == 0) goto L62
            r2 = r11[r2]
        L62:
            r0 = r10[r2]
            r14.setColor(r0)
            float r1 = (float) r12
            float r2 = (float) r13
            int r0 = r12 + r8
            float r0 = (float) r0
            int r3 = r3 + r13
            float r4 = (float) r3
            r5 = r14
            r3 = r0
            r0 = r15
            r0.drawRect(r1, r2, r3, r4, r5)
        L74:
            int r12 = r12 + r8
            if (r7 == 0) goto L78
            return r12
        L78:
            r0 = r7
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.SE.g(com.daaw.Us0, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085 A[LOOP:0: B:3:0x0002->B:36:0x0085, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0084 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int h(com.daaw.C2480Us0 r9, int[] r10, byte[] r11, int r12, int r13, android.graphics.Paint r14, android.graphics.Canvas r15) {
        /*
            r6 = 0
            r0 = 0
        L2:
            r1 = 4
            int r2 = r9.h(r1)
            r3 = 1
            if (r2 == 0) goto Le
            r7 = r0
        Lb:
            r8 = 1
            goto L67
        Le:
            boolean r2 = r9.g()
            r4 = 3
            if (r2 != 0) goto L25
            int r1 = r9.h(r4)
            if (r1 == 0) goto L21
            int r1 = r1 + 2
            r7 = r0
            r8 = r1
            r2 = 0
            goto L67
        L21:
            r2 = 0
            r7 = 1
        L23:
            r8 = 0
            goto L67
        L25:
            boolean r2 = r9.g()
            r7 = 2
            if (r2 != 0) goto L39
            int r2 = r9.h(r7)
            int r2 = r2 + r1
            int r1 = r9.h(r1)
        L35:
            r7 = r0
            r8 = r2
            r2 = r1
            goto L67
        L39:
            int r2 = r9.h(r7)
            if (r2 == 0) goto L64
            if (r2 == r3) goto L60
            if (r2 == r7) goto L55
            if (r2 == r4) goto L48
            r7 = r0
            r2 = 0
            goto L23
        L48:
            r2 = 8
            int r2 = r9.h(r2)
            int r2 = r2 + 25
            int r1 = r9.h(r1)
            goto L35
        L55:
            int r2 = r9.h(r1)
            int r2 = r2 + 9
            int r1 = r9.h(r1)
            goto L35
        L60:
            r7 = r0
            r2 = 0
            r8 = 2
            goto L67
        L64:
            r7 = r0
            r2 = 0
            goto Lb
        L67:
            if (r8 == 0) goto L81
            if (r14 == 0) goto L81
            if (r11 == 0) goto L6f
            r2 = r11[r2]
        L6f:
            r0 = r10[r2]
            r14.setColor(r0)
            float r1 = (float) r12
            float r2 = (float) r13
            int r0 = r12 + r8
            float r0 = (float) r0
            int r3 = r3 + r13
            float r4 = (float) r3
            r5 = r14
            r3 = r0
            r0 = r15
            r0.drawRect(r1, r2, r3, r4, r5)
        L81:
            int r12 = r12 + r8
            if (r7 == 0) goto L85
            return r12
        L85:
            r0 = r7
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.SE.h(com.daaw.Us0, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    public static int i(C2480Us0 c2480Us0, int[] iArr, byte[] bArr, int i2, int i3, Paint paint, Canvas canvas) {
        boolean z;
        int iH;
        boolean z2 = false;
        while (true) {
            int iH2 = c2480Us0.h(8);
            if (iH2 != 0) {
                z = z2;
                iH = 1;
            } else if (c2480Us0.g()) {
                z = z2;
                iH = c2480Us0.h(7);
                iH2 = c2480Us0.h(8);
            } else {
                int iH3 = c2480Us0.h(7);
                if (iH3 != 0) {
                    z = z2;
                    iH = iH3;
                    iH2 = 0;
                } else {
                    iH2 = 0;
                    z = true;
                    iH = 0;
                }
            }
            if (iH != 0 && paint != null) {
                if (bArr != null) {
                    iH2 = bArr[iH2];
                }
                paint.setColor(iArr[iH2]);
                canvas.drawRect(i2, i3, i2 + iH, 1 + i3, paint);
            }
            i2 += iH;
            if (z) {
                return i2;
            }
            z2 = z;
        }
    }

    public static void j(byte[] bArr, int[] iArr, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        int[] iArr2;
        Paint paint2;
        Canvas canvas2;
        byte[] bArr2;
        byte[] bArr3;
        C2480Us0 c2480Us0 = new C2480Us0(bArr);
        byte[] bArrA = null;
        int iG = i3;
        int i5 = i4;
        byte[] bArrA2 = null;
        while (c2480Us0.b() != 0) {
            int iH = c2480Us0.h(8);
            if (iH != 240) {
                switch (iH) {
                    case 16:
                        iArr2 = iArr;
                        Paint paint3 = paint;
                        canvas2 = canvas;
                        if (i2 == 3) {
                            bArr3 = bArrA2 == null ? i : bArrA2;
                        } else if (i2 != 2) {
                            bArr2 = null;
                            paint2 = paint3;
                            iG = g(c2480Us0, iArr2, bArr2, iG, i5, paint2, canvas2);
                            c2480Us0.c();
                        } else {
                            bArr3 = bArrA == null ? h : bArrA;
                        }
                        paint2 = paint3;
                        bArr2 = bArr3;
                        iG = g(c2480Us0, iArr2, bArr2, iG, i5, paint2, canvas2);
                        c2480Us0.c();
                        break;
                    case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        iArr2 = iArr;
                        canvas2 = canvas;
                        paint2 = paint;
                        iG = h(c2480Us0, iArr2, i2 == 3 ? j : null, iG, i5, paint2, canvas2);
                        c2480Us0.c();
                        break;
                    case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        iG = i(c2480Us0, iArr2, null, iG, i5, paint2, canvas2);
                        break;
                    default:
                        switch (iH) {
                            case 32:
                                bArrA = a(4, 4, c2480Us0);
                                break;
                            case 33:
                                bArrA2 = a(4, 8, c2480Us0);
                                break;
                            case 34:
                                bArrA2 = a(16, 8, c2480Us0);
                                break;
                        }
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        break;
                }
            } else {
                iArr2 = iArr;
                paint2 = paint;
                canvas2 = canvas;
                i5 += 2;
                iG = i3;
            }
            iArr = iArr2;
            paint = paint2;
            canvas = canvas2;
        }
    }

    public static void k(c cVar, a aVar, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        int[] iArr = i2 == 3 ? aVar.d : i2 == 2 ? aVar.c : aVar.b;
        j(cVar.c, iArr, i2, i3, i4, paint, canvas);
        j(cVar.d, iArr, i2, i3, i4 + 1, paint, canvas);
    }

    public static a l(C2480Us0 c2480Us0, int i2) {
        int iH;
        int i3;
        int iH2;
        int iH3;
        int iH4;
        int i4 = 8;
        int iH5 = c2480Us0.h(8);
        c2480Us0.o(8);
        int i5 = 2;
        int i6 = i2 - 2;
        int[] iArrC = c();
        int[] iArrD = d();
        int[] iArrE = e();
        while (i6 > 0) {
            int iH6 = c2480Us0.h(i4);
            int iH7 = c2480Us0.h(i4);
            int[] iArr = (iH7 & 128) != 0 ? iArrC : (iH7 & 64) != 0 ? iArrD : iArrE;
            if ((iH7 & 1) != 0) {
                iH3 = c2480Us0.h(i4);
                iH4 = c2480Us0.h(i4);
                iH = c2480Us0.h(i4);
                iH2 = c2480Us0.h(i4);
                i3 = i6 - 6;
            } else {
                int iH8 = c2480Us0.h(6) << i5;
                int iH9 = c2480Us0.h(4) << 4;
                iH = c2480Us0.h(4) << 4;
                i3 = i6 - 4;
                iH2 = c2480Us0.h(i5) << 6;
                iH3 = iH8;
                iH4 = iH9;
            }
            if (iH3 == 0) {
                iH4 = 0;
                iH = 0;
                iH2 = 255;
            }
            double d2 = iH3;
            double d3 = iH4 - 128;
            double d4 = iH - 128;
            iArr[iH6] = f((byte) (255 - (iH2 & 255)), AbstractC6280lb1.l((int) (d2 + (1.402d * d3)), 0, 255), AbstractC6280lb1.l((int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d)), 0, 255), AbstractC6280lb1.l((int) (d2 + (d4 * 1.772d)), 0, 255));
            i6 = i3;
            iH5 = iH5;
            i4 = 8;
            i5 = 2;
        }
        return new a(iH5, iArrC, iArrD, iArrE);
    }

    public static b m(C2480Us0 c2480Us0) {
        int i2;
        int iH;
        int i3;
        int i4;
        c2480Us0.o(4);
        boolean zG = c2480Us0.g();
        c2480Us0.o(3);
        int iH2 = c2480Us0.h(16);
        int iH3 = c2480Us0.h(16);
        if (zG) {
            int iH4 = c2480Us0.h(16);
            int iH5 = c2480Us0.h(16);
            int iH6 = c2480Us0.h(16);
            iH = c2480Us0.h(16);
            i2 = iH5;
            i4 = iH6;
            i3 = iH4;
        } else {
            i2 = iH2;
            iH = iH3;
            i3 = 0;
            i4 = 0;
        }
        return new b(iH2, iH3, i3, i2, i4, iH);
    }

    public static c n(C2480Us0 c2480Us0) {
        byte[] bArr;
        int iH = c2480Us0.h(16);
        c2480Us0.o(4);
        int iH2 = c2480Us0.h(2);
        boolean zG = c2480Us0.g();
        c2480Us0.o(1);
        byte[] bArr2 = null;
        if (iH2 != 1) {
            if (iH2 == 0) {
                int iH3 = c2480Us0.h(16);
                int iH4 = c2480Us0.h(16);
                if (iH3 > 0) {
                    bArr2 = new byte[iH3];
                    c2480Us0.j(bArr2, 0, iH3);
                }
                if (iH4 > 0) {
                    bArr = new byte[iH4];
                    c2480Us0.j(bArr, 0, iH4);
                }
            }
            return new c(iH, zG, bArr2, bArr);
        }
        c2480Us0.o(c2480Us0.h(8) * 16);
        bArr = bArr2;
        return new c(iH, zG, bArr2, bArr);
    }

    public static d o(C2480Us0 c2480Us0, int i2) {
        int iH = c2480Us0.h(8);
        int iH2 = c2480Us0.h(4);
        int iH3 = c2480Us0.h(2);
        c2480Us0.o(2);
        int i3 = i2 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i3 > 0) {
            int iH4 = c2480Us0.h(8);
            c2480Us0.o(8);
            i3 -= 6;
            sparseArray.put(iH4, new e(c2480Us0.h(16), c2480Us0.h(16)));
        }
        return new d(iH, iH2, iH3, sparseArray);
    }

    public static f p(C2480Us0 c2480Us0, int i2) {
        int iH;
        int iH2;
        int iH3 = c2480Us0.h(8);
        int i3 = 4;
        c2480Us0.o(4);
        boolean zG = c2480Us0.g();
        c2480Us0.o(3);
        int i4 = 16;
        int iH4 = c2480Us0.h(16);
        int iH5 = c2480Us0.h(16);
        int iH6 = c2480Us0.h(3);
        int iH7 = c2480Us0.h(3);
        int i5 = 2;
        c2480Us0.o(2);
        int iH8 = c2480Us0.h(8);
        int iH9 = c2480Us0.h(8);
        int iH10 = c2480Us0.h(4);
        int iH11 = c2480Us0.h(2);
        c2480Us0.o(2);
        int i6 = i2 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i6 > 0) {
            int iH12 = c2480Us0.h(i4);
            int iH13 = c2480Us0.h(i5);
            int iH14 = c2480Us0.h(i5);
            int iH15 = c2480Us0.h(12);
            c2480Us0.o(i3);
            int iH16 = c2480Us0.h(12);
            int i7 = i6 - 6;
            if (iH13 == 1 || iH13 == 2) {
                i6 -= 8;
                iH2 = c2480Us0.h(8);
                iH = c2480Us0.h(8);
            } else {
                i6 = i7;
                iH2 = 0;
                iH = 0;
            }
            sparseArray.put(iH12, new g(iH13, iH14, iH15, iH16, iH2, iH));
            i3 = 4;
            i4 = 16;
            i5 = 2;
        }
        return new f(iH3, zG, iH4, iH5, iH6, iH7, iH8, iH9, iH10, iH11, sparseArray);
    }

    public static void q(C2480Us0 c2480Us0, h hVar) {
        int iH = c2480Us0.h(8);
        int iH2 = c2480Us0.h(16);
        int iH3 = c2480Us0.h(16);
        int iD = c2480Us0.d() + iH3;
        if (iH3 * 8 > c2480Us0.b()) {
            c2480Us0.o(c2480Us0.b());
            return;
        }
        switch (iH) {
            case 16:
                if (iH2 == hVar.a) {
                    d dVar = hVar.i;
                    d dVarO = o(c2480Us0, iH3);
                    if (dVarO.c != 0) {
                        hVar.i = dVarO;
                        hVar.c.clear();
                        hVar.d.clear();
                        hVar.e.clear();
                    } else if (dVar != null && dVar.b != dVarO.b) {
                        hVar.i = dVarO;
                    }
                }
                break;
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                d dVar2 = hVar.i;
                if (iH2 == hVar.a && dVar2 != null) {
                    f fVarP = p(c2480Us0, iH3);
                    if (dVar2.c == 0) {
                        fVarP.a((f) hVar.c.get(fVarP.a));
                    }
                    hVar.c.put(fVarP.a, fVarP);
                }
                break;
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                if (iH2 == hVar.a) {
                    a aVarL = l(c2480Us0, iH3);
                    hVar.d.put(aVarL.a, aVarL);
                } else if (iH2 == hVar.b) {
                    a aVarL2 = l(c2480Us0, iH3);
                    hVar.f.put(aVarL2.a, aVarL2);
                }
                break;
            case 19:
                if (iH2 == hVar.a) {
                    c cVarN = n(c2480Us0);
                    hVar.e.put(cVarN.a, cVarN);
                } else if (iH2 == hVar.b) {
                    c cVarN2 = n(c2480Us0);
                    hVar.g.put(cVarN2.a, cVarN2);
                }
                break;
            case 20:
                if (iH2 == hVar.a) {
                    hVar.h = m(c2480Us0);
                }
                break;
        }
        c2480Us0.p(iD - c2480Us0.d());
    }

    public List b(byte[] bArr, int i2) {
        C2480Us0 c2480Us0 = new C2480Us0(bArr, i2);
        while (c2480Us0.b() >= 48 && c2480Us0.h(8) == 15) {
            q(c2480Us0, this.f);
        }
        h hVar = this.f;
        if (hVar.i == null) {
            return Collections.EMPTY_LIST;
        }
        b bVar = hVar.h;
        if (bVar == null) {
            bVar = this.d;
        }
        Bitmap bitmap = this.g;
        if (bitmap == null || bVar.a + 1 != bitmap.getWidth() || bVar.b + 1 != this.g.getHeight()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bVar.a + 1, bVar.b + 1, Bitmap.Config.ARGB_8888);
            this.g = bitmapCreateBitmap;
            this.c.setBitmap(bitmapCreateBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.f.i.d;
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            e eVar = (e) sparseArray.valueAt(i3);
            f fVar = (f) this.f.c.get(sparseArray.keyAt(i3));
            int i4 = eVar.a + bVar.c;
            int i5 = eVar.b + bVar.e;
            float f2 = i4;
            float f3 = i5;
            this.c.clipRect(f2, f3, Math.min(fVar.c + i4, bVar.d), Math.min(fVar.d + i5, bVar.f), Region.Op.REPLACE);
            a aVar = (a) this.f.d.get(fVar.g);
            if (aVar == null && (aVar = (a) this.f.f.get(fVar.g)) == null) {
                aVar = this.e;
            }
            a aVar2 = aVar;
            SparseArray sparseArray2 = fVar.k;
            int i6 = 0;
            while (i6 < sparseArray2.size()) {
                int iKeyAt = sparseArray2.keyAt(i6);
                g gVar = (g) sparseArray2.valueAt(i6);
                c cVar = (c) this.f.e.get(iKeyAt);
                if (cVar == null) {
                    cVar = (c) this.f.g.get(iKeyAt);
                }
                if (cVar != null) {
                    k(cVar, aVar2, fVar.f, i4 + gVar.c, i5 + gVar.d, cVar.b ? null : this.a, this.c);
                }
                i6++;
                aVar2 = aVar2;
            }
            a aVar3 = aVar2;
            if (fVar.b) {
                int i7 = fVar.f;
                this.b.setColor(i7 == 3 ? aVar3.d[fVar.h] : i7 == 2 ? aVar3.c[fVar.i] : aVar3.b[fVar.j]);
                this.c.drawRect(f2, f3, fVar.c + i4, fVar.d + i5, this.b);
            }
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.g, i4, i5, fVar.c, fVar.d);
            int i8 = bVar.a;
            int i9 = bVar.b;
            arrayList.add(new C1631Mu(bitmapCreateBitmap2, f2 / i8, 0, f3 / i9, 0, fVar.c / i8, fVar.d / i9));
            this.c.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        return arrayList;
    }

    public void r() {
        this.f.a();
    }
}
