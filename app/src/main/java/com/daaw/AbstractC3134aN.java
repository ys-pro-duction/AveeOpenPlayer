package com.daaw;

import com.google.android.gms.ads.AdRequest;

/* JADX INFO: renamed from: com.daaw.aN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3134aN implements Comparable {
    public static final a B = new a(null);
    public static final short C = c(5120);
    public static final short D = c(-1025);
    public static final short E = c(31743);
    public static final short F = c(1024);
    public static final short G = c(1);
    public static final short H = c(32256);
    public static final short I = c(-1024);
    public static final short J = c(Short.MIN_VALUE);
    public static final short K = c(31744);
    public static final short L = c(0);
    public static final short M = a(1.0f);
    public static final short N = a(-1.0f);
    public static final float O;

    /* JADX INFO: renamed from: com.daaw.aN$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final short b(float f) {
            int i;
            int iFloatToRawIntBits = Float.floatToRawIntBits(f);
            int i2 = iFloatToRawIntBits >>> 31;
            int i3 = (iFloatToRawIntBits >>> 23) & 255;
            int i4 = 8388607 & iFloatToRawIntBits;
            int i5 = 31;
            int i6 = 0;
            if (i3 != 255) {
                int i7 = i3 - 112;
                if (i7 >= 31) {
                    i5 = 49;
                } else if (i7 <= 0) {
                    if (i7 >= -10) {
                        int i8 = (8388608 | i4) >> (1 - i7);
                        if ((i8 & 4096) != 0) {
                            i8 += 8192;
                        }
                        i6 = i8 >> 13;
                    }
                    i5 = 0;
                } else {
                    i6 = i4 >> 13;
                    if ((iFloatToRawIntBits & 4096) != 0) {
                        i = (((i7 << 10) | i6) + 1) | (i2 << 15);
                        return (short) i;
                    }
                    i5 = i7;
                }
            } else if (i4 != 0) {
                i6 = AdRequest.MAX_CONTENT_URL_LENGTH;
            }
            i = (i2 << 15) | (i5 << 10) | i6;
            return (short) i;
        }

        public a() {
        }
    }

    static {
        C3970dN c3970dN = C3970dN.a;
        O = Float.intBitsToFloat(1056964608);
    }

    public static short a(float f) {
        return c(B.b(f));
    }

    public static final float g(short s) {
        int i;
        int i2;
        int i3 = Short.MIN_VALUE & s;
        int i4 = ((65535 & s) >>> 10) & 31;
        int i5 = s & 1023;
        if (i4 != 0) {
            int i6 = i5 << 13;
            if (i4 == 31) {
                if (i6 != 0) {
                    i6 |= 4194304;
                }
                i = i6;
                i2 = 255;
            } else {
                int i7 = i4 + 112;
                i = i6;
                i2 = i7;
            }
        } else {
            if (i5 != 0) {
                C3970dN c3970dN = C3970dN.a;
                float fIntBitsToFloat = Float.intBitsToFloat(i5 + 1056964608) - O;
                return i3 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i2 = 0;
            i = 0;
        }
        int i8 = (i2 << 23) | (i3 << 16) | i;
        C3970dN c3970dN2 = C3970dN.a;
        return Float.intBitsToFloat(i8);
    }

    public static short c(short s) {
        return s;
    }
}
