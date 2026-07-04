package com.daaw;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.zzad;
import java.nio.ByteBuffer;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: com.daaw.cn1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3810cn1 {
    public static final int[] a = {1, 2, 3, 6};
    public static final int[] b = {48000, 44100, 32000};
    public static final int[] c = {24000, 22050, 16000};
    public static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 320, 384, 448, AdRequest.MAX_CONTENT_URL_LENGTH, 576, 640};
    public static final int[] f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int a(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        return 1536;
    }

    public static int b(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b2 = bArr[4];
            return f((b2 & 192) >> 6, b2 & 63);
        }
        int i = bArr[2] & 7;
        int i2 = ((bArr[3] & 255) | (i << 8)) + 1;
        return i2 + i2;
    }

    public static C2485Ut1 c(C5900kE2 c5900kE2, String str, String str2, zzad zzadVar) {
        GD2 gd2 = new GD2();
        gd2.h(c5900kE2);
        int i = b[gd2.d(2)];
        gd2.l(8);
        int i2 = d[gd2.d(3)];
        if (gd2.d(1) != 0) {
            i2++;
        }
        int i3 = e[gd2.d(5)] * 1000;
        gd2.e();
        c5900kE2.g(gd2.b());
        C1106Hs1 c1106Hs1 = new C1106Hs1();
        c1106Hs1.j(str);
        c1106Hs1.u("audio/ac3");
        c1106Hs1.k0(i2);
        c1106Hs1.v(i);
        c1106Hs1.d(zzadVar);
        c1106Hs1.m(str2);
        c1106Hs1.j0(i3);
        c1106Hs1.q(i3);
        return c1106Hs1.D();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.daaw.C2485Ut1 d(com.daaw.C5900kE2 r7, java.lang.String r8, java.lang.String r9, com.google.android.gms.internal.ads.zzad r10) {
        /*
            com.daaw.GD2 r0 = new com.daaw.GD2
            r0.<init>()
            r0.h(r7)
            r1 = 13
            int r1 = r0.d(r1)
            int r1 = r1 * 1000
            r2 = 3
            r0.l(r2)
            r3 = 2
            int r3 = r0.d(r3)
            int[] r4 = com.daaw.AbstractC3810cn1.b
            r3 = r4[r3]
            r4 = 10
            r0.l(r4)
            int[] r4 = com.daaw.AbstractC3810cn1.d
            int r5 = r0.d(r2)
            r4 = r4[r5]
            r5 = 1
            int r6 = r0.d(r5)
            if (r6 == 0) goto L33
            int r4 = r4 + 1
        L33:
            r0.l(r2)
            r2 = 4
            int r2 = r0.d(r2)
            r0.l(r5)
            if (r2 <= 0) goto L4f
            r2 = 6
            r0.l(r2)
            int r2 = r0.d(r5)
            if (r2 == 0) goto L4c
            int r4 = r4 + 2
        L4c:
            r0.l(r5)
        L4f:
            int r2 = r0.a()
            r6 = 7
            if (r2 <= r6) goto L62
            r0.l(r6)
            int r2 = r0.d(r5)
            if (r2 == 0) goto L62
            java.lang.String r2 = "audio/eac3-joc"
            goto L64
        L62:
            java.lang.String r2 = "audio/eac3"
        L64:
            r0.e()
            int r0 = r0.b()
            r7.g(r0)
            com.daaw.Hs1 r7 = new com.daaw.Hs1
            r7.<init>()
            r7.j(r8)
            r7.u(r2)
            r7.k0(r4)
            r7.v(r3)
            r7.d(r10)
            r7.m(r9)
            r7.q(r1)
            com.daaw.Ut1 r7 = r7.D()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC3810cn1.d(com.daaw.kE2, java.lang.String, java.lang.String, com.google.android.gms.internal.ads.zzad):com.daaw.Ut1");
    }

    public static C3532bn1 e(GD2 gd2) {
        int iF;
        int i;
        int i2;
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int iC = gd2.c();
        gd2.l(40);
        int iD = gd2.d(5);
        gd2.j(iC);
        int i10 = -1;
        if (iD > 10) {
            gd2.l(16);
            int iD2 = gd2.d(2);
            if (iD2 == 0) {
                i10 = 0;
            } else if (iD2 == 1) {
                i10 = 1;
            } else if (iD2 == 2) {
                i10 = 2;
            }
            gd2.l(3);
            int iD3 = gd2.d(11) + 1;
            int iD4 = gd2.d(2);
            if (iD4 == 3) {
                i = c[gd2.d(2)];
                i6 = 3;
                i7 = 6;
            } else {
                int iD5 = gd2.d(2);
                int i11 = a[iD5];
                i6 = iD5;
                i = b[iD4];
                i7 = i11;
            }
            iF = iD3 + iD3;
            int i12 = (iF * i) / (i7 * 32);
            int iD6 = gd2.d(3);
            boolean zN = gd2.n();
            i2 = d[iD6] + (zN ? 1 : 0);
            gd2.l(10);
            if (gd2.n()) {
                gd2.l(8);
            }
            if (iD6 == 0) {
                gd2.l(5);
                if (gd2.n()) {
                    gd2.l(8);
                }
                i8 = 0;
                iD6 = 0;
            } else {
                i8 = iD6;
            }
            if (i10 == 1) {
                if (gd2.n()) {
                    gd2.l(16);
                }
                i9 = 1;
            } else {
                i9 = i10;
            }
            if (gd2.n()) {
                if (i8 > 2) {
                    gd2.l(2);
                }
                if ((i8 & 1) != 0 && i8 > 2) {
                    gd2.l(6);
                }
                if ((i8 & 4) != 0) {
                    gd2.l(6);
                }
                if (zN && gd2.n()) {
                    gd2.l(5);
                }
                if (i9 == 0) {
                    if (gd2.n()) {
                        gd2.l(6);
                    }
                    if (i8 == 0 && gd2.n()) {
                        gd2.l(6);
                    }
                    if (gd2.n()) {
                        gd2.l(6);
                    }
                    int iD7 = gd2.d(2);
                    if (iD7 == 1) {
                        gd2.l(5);
                    } else if (iD7 == 2) {
                        gd2.l(12);
                    } else if (iD7 == 3) {
                        int iD8 = gd2.d(5);
                        if (gd2.n()) {
                            gd2.l(5);
                            if (gd2.n()) {
                                gd2.l(4);
                            }
                            if (gd2.n()) {
                                gd2.l(4);
                            }
                            if (gd2.n()) {
                                gd2.l(4);
                            }
                            if (gd2.n()) {
                                gd2.l(4);
                            }
                            if (gd2.n()) {
                                gd2.l(4);
                            }
                            if (gd2.n()) {
                                gd2.l(4);
                            }
                            if (gd2.n()) {
                                gd2.l(4);
                            }
                            if (gd2.n()) {
                                if (gd2.n()) {
                                    gd2.l(4);
                                }
                                if (gd2.n()) {
                                    gd2.l(4);
                                }
                            }
                        }
                        if (gd2.n()) {
                            gd2.l(5);
                            if (gd2.n()) {
                                gd2.l(7);
                                if (gd2.n()) {
                                    gd2.l(8);
                                }
                            }
                        }
                        gd2.l((iD8 + 2) * 8);
                        gd2.e();
                    }
                    if (i8 < 2) {
                        if (gd2.n()) {
                            gd2.l(14);
                        }
                        if (iD6 == 0 && gd2.n()) {
                            gd2.l(14);
                        }
                    }
                    if (!gd2.n()) {
                        i9 = 0;
                    } else if (i6 == 0) {
                        gd2.l(5);
                        i9 = 0;
                        i6 = 0;
                    } else {
                        for (int i13 = 0; i13 < i7; i13++) {
                            if (gd2.n()) {
                                gd2.l(5);
                            }
                        }
                        i9 = 0;
                    }
                }
            }
            if (gd2.n()) {
                gd2.l(5);
                if (i8 == 2) {
                    gd2.l(4);
                    i8 = 2;
                }
                if (i8 >= 6) {
                    gd2.l(2);
                }
                if (gd2.n()) {
                    gd2.l(8);
                }
                if (i8 == 0 && gd2.n()) {
                    gd2.l(8);
                }
                if (iD4 < 3) {
                    gd2.k();
                }
            }
            if (i9 == 0 && i6 != 3) {
                gd2.k();
            }
            if (i9 == 2 && (i6 == 3 || gd2.n())) {
                gd2.l(6);
            }
            str = (gd2.n() && gd2.d(6) == 1 && gd2.d(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i4 = i10;
            i5 = i7 * PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            i3 = i12;
        } else {
            gd2.l(32);
            int iD9 = gd2.d(2);
            String str2 = iD9 == 3 ? null : "audio/ac3";
            int iD10 = gd2.d(6);
            int i14 = e[iD10 / 2] * 1000;
            iF = f(iD9, iD10);
            gd2.l(8);
            int iD11 = gd2.d(3);
            if ((iD11 & 1) != 0 && iD11 != 1) {
                gd2.l(2);
            }
            if ((iD11 & 4) != 0) {
                gd2.l(2);
            }
            if (iD11 == 2) {
                gd2.l(2);
            }
            i = iD9 < 3 ? b[iD9] : -1;
            i2 = d[iD11] + (gd2.n() ? 1 : 0);
            str = str2;
            i3 = i14;
            i4 = -1;
            i5 = 1536;
        }
        return new C3532bn1(str, i4, i2, i, iF, i5, i3, null);
    }

    public static int f(int i, int i2) {
        int i3;
        if (i < 0 || i >= 3 || i2 < 0 || (i3 = i2 >> 1) >= 19) {
            return -1;
        }
        int i4 = b[i];
        if (i4 == 44100) {
            int i5 = f[i3] + (i2 & 1);
            return i5 + i5;
        }
        int i6 = e[i3];
        return i4 == 32000 ? i6 * 6 : i6 * 4;
    }
}
