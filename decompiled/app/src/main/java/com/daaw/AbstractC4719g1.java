package com.daaw;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.gms.ads.AdRequest;
import java.nio.ByteBuffer;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: com.daaw.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4719g1 {
    public static final int[] a = {1, 2, 3, 6};
    public static final int[] b = {48000, 44100, 32000};
    public static final int[] c = {24000, 22050, 16000};
    public static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 320, 384, 448, AdRequest.MAX_CONTENT_URL_LENGTH, 576, 640};
    public static final int[] f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: com.daaw.g1$b */
    public static final class b {
        public final String a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public b(String str, int i, int i2, int i3, int i4, int i5) {
            this.a = str;
            this.b = i;
            this.d = i2;
            this.c = i3;
            this.e = i4;
            this.f = i5;
        }
    }

    public static int a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i = iPosition; i <= iLimit; i++) {
            if ((byteBuffer.getInt(i + 4) & (-16777217)) == -1167101192) {
                return i - iPosition;
            }
        }
        return -1;
    }

    public static int b() {
        return 1536;
    }

    public static int c(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = b;
        if (i >= iArr.length || i2 < 0) {
            return -1;
        }
        int[] iArr2 = f;
        if (i3 >= iArr2.length) {
            return -1;
        }
        int i4 = iArr[i];
        if (i4 == 44100) {
            return (iArr2[i3] + (i2 % 2)) * 2;
        }
        int i5 = e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    public static Format d(C2584Vs0 c2584Vs0, String str, String str2, DrmInitData drmInitData) {
        int i = b[(c2584Vs0.x() & 192) >> 6];
        int iX = c2584Vs0.x();
        int i2 = d[(iX & 56) >> 3];
        if ((iX & 4) != 0) {
            i2++;
        }
        return Format.k(str, "audio/ac3", null, -1, -1, i2, i, null, drmInitData, 0, str2);
    }

    public static b e(C2480Us0 c2480Us0) {
        int iC;
        int i;
        int i2;
        String str;
        int i3;
        int i4;
        int iH;
        int i5;
        int i6;
        int iE = c2480Us0.e();
        c2480Us0.o(40);
        boolean z = c2480Us0.h(5) == 16;
        c2480Us0.m(iE);
        int i7 = -1;
        if (z) {
            c2480Us0.o(16);
            int iH2 = c2480Us0.h(2);
            if (iH2 == 0) {
                i7 = 0;
            } else if (iH2 == 1) {
                i7 = 1;
            } else if (iH2 == 2) {
                i7 = 2;
            }
            c2480Us0.o(3);
            iC = (c2480Us0.h(11) + 1) * 2;
            int iH3 = c2480Us0.h(2);
            if (iH3 == 3) {
                i = c[c2480Us0.h(2)];
                iH = 3;
                i5 = 6;
            } else {
                iH = c2480Us0.h(2);
                i5 = a[iH];
                i = b[iH3];
            }
            int i8 = i5 * PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            int iH4 = c2480Us0.h(3);
            boolean zG = c2480Us0.g();
            i2 = d[iH4] + (zG ? 1 : 0);
            c2480Us0.o(10);
            if (c2480Us0.g()) {
                c2480Us0.o(8);
            }
            if (iH4 == 0) {
                c2480Us0.o(5);
                if (c2480Us0.g()) {
                    c2480Us0.o(8);
                }
            }
            if (i7 == 1 && c2480Us0.g()) {
                c2480Us0.o(16);
            }
            if (c2480Us0.g()) {
                if (iH4 > 2) {
                    c2480Us0.o(2);
                }
                if ((iH4 & 1) != 0 && iH4 > 2) {
                    c2480Us0.o(6);
                }
                if ((iH4 & 4) != 0) {
                    c2480Us0.o(6);
                }
                if (zG && c2480Us0.g()) {
                    c2480Us0.o(5);
                }
                if (i7 == 0) {
                    if (c2480Us0.g()) {
                        c2480Us0.o(6);
                    }
                    if (iH4 == 0 && c2480Us0.g()) {
                        c2480Us0.o(6);
                    }
                    if (c2480Us0.g()) {
                        c2480Us0.o(6);
                    }
                    int iH5 = c2480Us0.h(2);
                    if (iH5 == 1) {
                        c2480Us0.o(5);
                    } else if (iH5 == 2) {
                        c2480Us0.o(12);
                    } else if (iH5 == 3) {
                        int iH6 = c2480Us0.h(5);
                        if (c2480Us0.g()) {
                            c2480Us0.o(5);
                            if (c2480Us0.g()) {
                                c2480Us0.o(4);
                            }
                            if (c2480Us0.g()) {
                                c2480Us0.o(4);
                            }
                            if (c2480Us0.g()) {
                                c2480Us0.o(4);
                            }
                            if (c2480Us0.g()) {
                                c2480Us0.o(4);
                            }
                            if (c2480Us0.g()) {
                                c2480Us0.o(4);
                            }
                            if (c2480Us0.g()) {
                                c2480Us0.o(4);
                            }
                            if (c2480Us0.g()) {
                                c2480Us0.o(4);
                            }
                            if (c2480Us0.g()) {
                                if (c2480Us0.g()) {
                                    c2480Us0.o(4);
                                }
                                if (c2480Us0.g()) {
                                    c2480Us0.o(4);
                                }
                            }
                        }
                        if (c2480Us0.g()) {
                            c2480Us0.o(5);
                            if (c2480Us0.g()) {
                                c2480Us0.o(7);
                                if (c2480Us0.g()) {
                                    c2480Us0.o(8);
                                }
                            }
                        }
                        c2480Us0.o((iH6 + 2) * 8);
                        c2480Us0.c();
                    }
                    if (iH4 < 2) {
                        if (c2480Us0.g()) {
                            c2480Us0.o(14);
                        }
                        if (iH4 == 0 && c2480Us0.g()) {
                            c2480Us0.o(14);
                        }
                    }
                    if (c2480Us0.g()) {
                        if (iH == 0) {
                            c2480Us0.o(5);
                        } else {
                            for (int i9 = 0; i9 < i5; i9++) {
                                if (c2480Us0.g()) {
                                    c2480Us0.o(5);
                                }
                            }
                        }
                    }
                }
            }
            if (c2480Us0.g()) {
                c2480Us0.o(5);
                if (iH4 == 2) {
                    c2480Us0.o(4);
                }
                if (iH4 >= 6) {
                    c2480Us0.o(2);
                }
                if (c2480Us0.g()) {
                    c2480Us0.o(8);
                }
                if (iH4 == 0 && c2480Us0.g()) {
                    c2480Us0.o(8);
                }
                i6 = 3;
                if (iH3 < 3) {
                    c2480Us0.n();
                }
            } else {
                i6 = 3;
            }
            if (i7 == 0 && iH != i6) {
                c2480Us0.n();
            }
            if (i7 == 2 && (iH == i6 || c2480Us0.g())) {
                c2480Us0.o(6);
            }
            str = (c2480Us0.g() && c2480Us0.h(6) == 1 && c2480Us0.h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i3 = i7;
            i4 = i8;
        } else {
            c2480Us0.o(32);
            int iH7 = c2480Us0.h(2);
            iC = c(iH7, c2480Us0.h(6));
            c2480Us0.o(8);
            int iH8 = c2480Us0.h(3);
            if ((iH8 & 1) != 0 && iH8 != 1) {
                c2480Us0.o(2);
            }
            if ((iH8 & 4) != 0) {
                c2480Us0.o(2);
            }
            if (iH8 == 2) {
                c2480Us0.o(2);
            }
            i = b[iH7];
            i2 = d[iH8] + (c2480Us0.g() ? 1 : 0);
            str = "audio/ac3";
            i3 = -1;
            i4 = 1536;
        }
        return new b(str, i3, i2, i, iC, i4);
    }

    public static int f(byte[] bArr) {
        if (bArr.length < 5) {
            return -1;
        }
        byte b2 = bArr[4];
        return c((b2 & 192) >> 6, b2 & 63);
    }

    public static Format g(C2584Vs0 c2584Vs0, String str, String str2, DrmInitData drmInitData) {
        c2584Vs0.K(2);
        int i = b[(c2584Vs0.x() & 192) >> 6];
        int iX = c2584Vs0.x();
        int i2 = d[(iX & 14) >> 1];
        if ((iX & 1) != 0) {
            i2++;
        }
        if (((c2584Vs0.x() & 30) >> 1) > 0 && (2 & c2584Vs0.x()) != 0) {
            i2 += 2;
        }
        return Format.k(str, (c2584Vs0.a() <= 0 || (c2584Vs0.x() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc", null, -1, -1, i2, i, null, drmInitData, 0, str2);
    }

    public static int h(ByteBuffer byteBuffer) {
        return (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4] : 6) * PSKKeyManager.MAX_KEY_LENGTH_BYTES;
    }

    public static int i(ByteBuffer byteBuffer, int i) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + ((byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int j(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b2 = bArr[7];
            if ((b2 & 254) == 186) {
                return 40 << ((bArr[(b2 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }
}
