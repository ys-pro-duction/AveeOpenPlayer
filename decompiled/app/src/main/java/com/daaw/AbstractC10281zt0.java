package com.daaw;

import android.graphics.Path;
import com.google.ads.AdSize;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.zt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10281zt0 {

    /* JADX INFO: renamed from: com.daaw.zt0$a */
    public static class a {
        public int a;
        public boolean b;
    }

    public static void a(ArrayList arrayList, char c, float[] fArr) {
        arrayList.add(new b(c, fArr));
    }

    public static boolean b(b[] bVarArr, b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i = 0; i < bVarArr.length; i++) {
            if (bVarArr[i].a != bVarArr2[i].a || bVarArr[i].b.length != bVarArr2[i].b.length) {
                return false;
            }
        }
        return true;
    }

    public static float[] c(float[] fArr, int i, int i2) {
        if (i > i2) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i < 0 || i > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = i2 - i;
        int iMin = Math.min(i3, length - i);
        float[] fArr2 = new float[i3];
        System.arraycopy(fArr, i, fArr2, 0, iMin);
        return fArr2;
    }

    public static b[] d(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            int i3 = i(str, i);
            String strTrim = str.substring(i2, i3).trim();
            if (!strTrim.isEmpty()) {
                a(arrayList, strTrim.charAt(0), h(strTrim));
            }
            i2 = i3;
            i = i3 + 1;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            a(arrayList, str.charAt(i2), new float[0]);
        }
        return (b[]) arrayList.toArray(new b[0]);
    }

    public static Path e(String str) {
        Path path = new Path();
        try {
            b.i(d(str), path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing " + str, e);
        }
    }

    public static b[] f(b[] bVarArr) {
        b[] bVarArr2 = new b[bVarArr.length];
        for (int i = 0; i < bVarArr.length; i++) {
            bVarArr2[i] = new b(bVarArr[i]);
        }
        return bVarArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039 A[LOOP:0: B:3:0x0007->B:24:0x0039, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(java.lang.String r8, int r9, com.daaw.AbstractC10281zt0.a r10) {
        /*
            r0 = 0
            r10.b = r0
            r1 = r9
            r2 = 0
            r3 = 0
            r4 = 0
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3c
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L29
            r6 = 69
            if (r5 == r6) goto L35
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L35
            switch(r5) {
                case 44: goto L29;
                case 45: goto L2c;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L33
        L22:
            if (r3 != 0) goto L27
            r2 = 0
            r3 = 1
            goto L36
        L27:
            r10.b = r7
        L29:
            r2 = 0
            r4 = 1
            goto L36
        L2c:
            if (r1 == r9) goto L33
            if (r2 != 0) goto L33
            r10.b = r7
            goto L29
        L33:
            r2 = 0
            goto L36
        L35:
            r2 = 1
        L36:
            if (r4 == 0) goto L39
            goto L3c
        L39:
            int r1 = r1 + 1
            goto L7
        L3c:
            r10.a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC10281zt0.g(java.lang.String, int, com.daaw.zt0$a):void");
    }

    public static float[] h(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            a aVar = new a();
            int length = str.length();
            int i = 1;
            int i2 = 0;
            while (i < length) {
                g(str, i, aVar);
                int i3 = aVar.a;
                if (i < i3) {
                    fArr[i2] = Float.parseFloat(str.substring(i, i3));
                    i2++;
                }
                i = aVar.b ? i3 : i3 + 1;
            }
            return c(fArr, 0, i2);
        } catch (NumberFormatException e) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e);
        }
    }

    public static int i(String str, int i) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                break;
            }
            i++;
        }
        return i;
    }

    public static void j(b[] bVarArr, Path path) {
        float[] fArr = new float[6];
        char c = 'm';
        for (b bVar : bVarArr) {
            b.e(path, fArr, c, bVar.a, bVar.b);
            c = bVar.a;
        }
    }

    public static void k(b[] bVarArr, b[] bVarArr2) {
        for (int i = 0; i < bVarArr2.length; i++) {
            bVarArr[i].a = bVarArr2[i].a;
            for (int i2 = 0; i2 < bVarArr2[i].b.length; i2++) {
                bVarArr[i].b[i2] = bVarArr2[i].b[i2];
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.zt0$b */
    public static class b {
        public char a;
        public final float[] b;

        public b(char c, float[] fArr) {
            this.a = c;
            this.b = fArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static void e(Path path, float[] fArr, char c, char c2, float[] fArr2) {
            int i;
            int i2;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12;
            float f13;
            Path path2 = path;
            float f14 = fArr[0];
            float f15 = fArr[1];
            float f16 = fArr[2];
            float f17 = fArr[3];
            float f18 = fArr[4];
            float f19 = fArr[5];
            switch (c2) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case AdSize.LARGE_AD_HEIGHT /* 90 */:
                case 'z':
                    path2.close();
                    path2.moveTo(f18, f19);
                    f14 = f18;
                    f16 = f14;
                    f15 = f19;
                    f17 = f15;
                    i = 2;
                    break;
            }
            float f20 = f14;
            float f21 = f15;
            float f22 = f18;
            float f23 = f19;
            int i3 = 0;
            char c3 = c;
            while (i3 < fArr2.length) {
                if (c2 == 'A') {
                    i2 = i3;
                    int i4 = i2 + 5;
                    int i5 = i2 + 6;
                    g(path, f20, f21, fArr2[i4], fArr2[i5], fArr2[i2], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3] != 0.0f, fArr2[i2 + 4] != 0.0f);
                    f16 = fArr2[i4];
                    f20 = f16;
                    f17 = fArr2[i5];
                    f21 = f17;
                } else if (c2 == 'C') {
                    i2 = i3;
                    int i6 = i2 + 2;
                    int i7 = i2 + 3;
                    int i8 = i2 + 4;
                    int i9 = i2 + 5;
                    path2.cubicTo(fArr2[i2], fArr2[i2 + 1], fArr2[i6], fArr2[i7], fArr2[i8], fArr2[i9]);
                    float f24 = fArr2[i8];
                    float f25 = fArr2[i9];
                    float f26 = fArr2[i6];
                    float f27 = fArr2[i7];
                    f20 = f24;
                    f21 = f25;
                    f17 = f27;
                    f16 = f26;
                } else if (c2 != 'H') {
                    if (c2 != 'Q') {
                        if (c2 == 'V') {
                            i2 = i3;
                            path2.lineTo(f20, fArr2[i2]);
                            f3 = fArr2[i2];
                        } else if (c2 != 'a') {
                            if (c2 == 'c') {
                                int i10 = i3 + 2;
                                int i11 = i3 + 3;
                                int i12 = i3 + 4;
                                int i13 = i3 + 5;
                                path2.rCubicTo(fArr2[i3], fArr2[i3 + 1], fArr2[i10], fArr2[i11], fArr2[i12], fArr2[i13]);
                                float f28 = fArr2[i10] + f20;
                                float f29 = fArr2[i11] + f21;
                                f20 += fArr2[i12];
                                f21 += fArr2[i13];
                                f16 = f28;
                                f17 = f29;
                            } else if (c2 != 'h') {
                                if (c2 != 'q') {
                                    if (c2 != 'v') {
                                        if (c2 != 'L') {
                                            if (c2 == 'M') {
                                                f8 = fArr2[i3];
                                                f9 = fArr2[i3 + 1];
                                                if (i3 > 0) {
                                                    path2.lineTo(f8, f9);
                                                } else {
                                                    path2.moveTo(f8, f9);
                                                    f20 = f8;
                                                    f22 = f20;
                                                    f21 = f9;
                                                }
                                            } else if (c2 == 'S') {
                                                if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                                    f20 = (f20 * 2.0f) - f16;
                                                    f21 = (f21 * 2.0f) - f17;
                                                }
                                                float f30 = f20;
                                                float f31 = f21;
                                                int i14 = i3 + 1;
                                                int i15 = i3 + 2;
                                                int i16 = i3 + 3;
                                                path2.cubicTo(f30, f31, fArr2[i3], fArr2[i14], fArr2[i15], fArr2[i16]);
                                                f = fArr2[i3];
                                                f2 = fArr2[i14];
                                                f20 = fArr2[i15];
                                                f21 = fArr2[i16];
                                                i2 = i3;
                                            } else if (c2 == 'T') {
                                                if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                                    f20 = (f20 * 2.0f) - f16;
                                                    f21 = (f21 * 2.0f) - f17;
                                                }
                                                int i17 = i3 + 1;
                                                path2.quadTo(f20, f21, fArr2[i3], fArr2[i17]);
                                                float f32 = fArr2[i3];
                                                f3 = fArr2[i17];
                                                f16 = f20;
                                                f17 = f21;
                                                i2 = i3;
                                                f20 = f32;
                                            } else if (c2 == 'l') {
                                                int i18 = i3 + 1;
                                                path2.rLineTo(fArr2[i3], fArr2[i18]);
                                                f20 += fArr2[i3];
                                                f7 = fArr2[i18];
                                            } else if (c2 == 'm') {
                                                float f33 = fArr2[i3];
                                                f20 += f33;
                                                float f34 = fArr2[i3 + 1];
                                                f21 += f34;
                                                if (i3 > 0) {
                                                    path2.rLineTo(f33, f34);
                                                } else {
                                                    path2.rMoveTo(f33, f34);
                                                    f22 = f20;
                                                }
                                            } else if (c2 == 's') {
                                                if (c3 == 'c' || c3 == 's' || c3 == 'C' || c3 == 'S') {
                                                    f10 = f21 - f17;
                                                    f11 = f20 - f16;
                                                } else {
                                                    f11 = 0.0f;
                                                    f10 = 0.0f;
                                                }
                                                int i19 = i3 + 1;
                                                int i20 = i3 + 2;
                                                int i21 = i3 + 3;
                                                path2.rCubicTo(f11, f10, fArr2[i3], fArr2[i19], fArr2[i20], fArr2[i21]);
                                                f4 = fArr2[i3] + f20;
                                                f5 = fArr2[i19] + f21;
                                                f20 += fArr2[i20];
                                                f6 = fArr2[i21];
                                            } else if (c2 == 't') {
                                                if (c3 == 'q' || c3 == 't' || c3 == 'Q' || c3 == 'T') {
                                                    f12 = f20 - f16;
                                                    f13 = f21 - f17;
                                                } else {
                                                    f13 = 0.0f;
                                                    f12 = 0.0f;
                                                }
                                                int i22 = i3 + 1;
                                                path2.rQuadTo(f12, f13, fArr2[i3], fArr2[i22]);
                                                float f35 = f12 + f20;
                                                float f36 = f13 + f21;
                                                f20 += fArr2[i3];
                                                f21 += fArr2[i22];
                                                f17 = f36;
                                                f16 = f35;
                                            }
                                            f23 = f21;
                                        } else {
                                            int i23 = i3 + 1;
                                            path2.lineTo(fArr2[i3], fArr2[i23]);
                                            f8 = fArr2[i3];
                                            f9 = fArr2[i23];
                                        }
                                        f20 = f8;
                                        f21 = f9;
                                    } else {
                                        path2.rLineTo(0.0f, fArr2[i3]);
                                        f7 = fArr2[i3];
                                    }
                                    f21 += f7;
                                } else {
                                    int i24 = i3 + 1;
                                    int i25 = i3 + 2;
                                    int i26 = i3 + 3;
                                    path2.rQuadTo(fArr2[i3], fArr2[i24], fArr2[i25], fArr2[i26]);
                                    f4 = fArr2[i3] + f20;
                                    f5 = fArr2[i24] + f21;
                                    f20 += fArr2[i25];
                                    f6 = fArr2[i26];
                                }
                                f21 += f6;
                                f16 = f4;
                                f17 = f5;
                            } else {
                                path2.rLineTo(fArr2[i3], 0.0f);
                                f20 += fArr2[i3];
                            }
                            i2 = i3;
                        } else {
                            int i27 = i3 + 5;
                            int i28 = i3 + 6;
                            float f37 = f21;
                            i2 = i3;
                            float f38 = f20;
                            g(path, f38, f37, fArr2[i27] + f20, fArr2[i28] + f21, fArr2[i3], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != 0.0f, fArr2[i3 + 4] != 0.0f);
                            f20 = f38 + fArr2[i27];
                            f21 = f37 + fArr2[i28];
                            f16 = f20;
                            f17 = f21;
                        }
                        f21 = f3;
                    } else {
                        i2 = i3;
                        int i29 = i2 + 1;
                        int i30 = i2 + 2;
                        int i31 = i2 + 3;
                        path2.quadTo(fArr2[i2], fArr2[i29], fArr2[i30], fArr2[i31]);
                        f = fArr2[i2];
                        f2 = fArr2[i29];
                        f20 = fArr2[i30];
                        f21 = fArr2[i31];
                    }
                    f16 = f;
                    f17 = f2;
                } else {
                    i2 = i3;
                    path2.lineTo(fArr2[i2], f21);
                    f20 = fArr2[i2];
                }
                i3 = i2 + i;
                path2 = path;
                c3 = c2;
            }
            fArr[0] = f20;
            fArr[1] = f21;
            fArr[2] = f16;
            fArr[3] = f17;
            fArr[4] = f22;
            fArr[5] = f23;
        }

        public static void f(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
            double d10 = d3;
            int iCeil = (int) Math.ceil(Math.abs((d9 * 4.0d) / 3.141592653589793d));
            double dCos = Math.cos(d7);
            double dSin = Math.sin(d7);
            double dCos2 = Math.cos(d8);
            double dSin2 = Math.sin(d8);
            double d11 = -d10;
            double d12 = d11 * dCos;
            double d13 = d4 * dSin;
            double d14 = (d12 * dSin2) - (d13 * dCos2);
            double d15 = d11 * dSin;
            double d16 = d4 * dCos;
            double d17 = (dSin2 * d15) + (dCos2 * d16);
            double d18 = d9 / ((double) iCeil);
            double d19 = d8;
            double d20 = d17;
            double d21 = d14;
            int i = 0;
            double d22 = d5;
            double d23 = d6;
            while (i < iCeil) {
                double d24 = d19 + d18;
                double dSin3 = Math.sin(d24);
                double dCos3 = Math.cos(d24);
                double d25 = (d + ((d10 * dCos) * dCos3)) - (d13 * dSin3);
                int i2 = i;
                double d26 = d2 + (d3 * dSin * dCos3) + (d16 * dSin3);
                double d27 = (d12 * dSin3) - (d13 * dCos3);
                double d28 = (dSin3 * d15) + (dCos3 * d16);
                double d29 = d24 - d19;
                double dTan = Math.tan(d29 / 2.0d);
                double dSin4 = (Math.sin(d29) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
                double d30 = d22 + (d21 * dSin4);
                int i3 = iCeil;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d30, (float) (d23 + (d20 * dSin4)), (float) (d25 - (dSin4 * d27)), (float) (d26 - (dSin4 * d28)), (float) d25, (float) d26);
                dSin = dSin;
                d18 = d18;
                d22 = d25;
                d15 = d15;
                d19 = d24;
                d20 = d28;
                dCos = dCos;
                d10 = d3;
                d23 = d26;
                i = i2 + 1;
                iCeil = i3;
                d21 = d27;
            }
        }

        public static void g(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d;
            double d2;
            double radians = Math.toRadians(f7);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d3 = f;
            double d4 = f2;
            double d5 = f5;
            double d6 = ((d3 * dCos) + (d4 * dSin)) / d5;
            double d7 = f6;
            double d8 = ((((double) (-f)) * dSin) + (d4 * dCos)) / d7;
            double d9 = f4;
            double d10 = ((((double) f3) * dCos) + (d9 * dSin)) / d5;
            double d11 = ((((double) (-f3)) * dSin) + (d9 * dCos)) / d7;
            double d12 = d6 - d10;
            double d13 = d8 - d11;
            double d14 = (d6 + d10) / 2.0d;
            double d15 = (d8 + d11) / 2.0d;
            double d16 = (d12 * d12) + (d13 * d13);
            if (d16 == 0.0d) {
                return;
            }
            double d17 = (1.0d / d16) - 0.25d;
            if (d17 < 0.0d) {
                float fSqrt = (float) (Math.sqrt(d16) / 1.99999d);
                g(path, f, f2, f3, f4, f5 * fSqrt, fSqrt * f6, f7, z, z2);
                return;
            }
            double dSqrt = Math.sqrt(d17);
            double d18 = d12 * dSqrt;
            double d19 = dSqrt * d13;
            if (z == z2) {
                d = d14 - d19;
                d2 = d15 + d18;
            } else {
                d = d14 + d19;
                d2 = d15 - d18;
            }
            double dAtan2 = Math.atan2(d8 - d2, d6 - d);
            double dAtan22 = Math.atan2(d11 - d2, d10 - d) - dAtan2;
            if (z2 != (dAtan22 >= 0.0d)) {
                dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
            }
            double d20 = d * d5;
            double d21 = d2 * d7;
            f(path, (d20 * dCos) - (d21 * dSin), (d20 * dSin) + (d21 * dCos), d5, d7, d3, d4, radians, dAtan2, dAtan22);
        }

        public static void i(b[] bVarArr, Path path) {
            AbstractC10281zt0.j(bVarArr, path);
        }

        public void h(b bVar, b bVar2, float f) {
            this.a = bVar.a;
            int i = 0;
            while (true) {
                float[] fArr = bVar.b;
                if (i >= fArr.length) {
                    return;
                }
                this.b[i] = (fArr[i] * (1.0f - f)) + (bVar2.b[i] * f);
                i++;
            }
        }

        public b(b bVar) {
            this.a = bVar.a;
            float[] fArr = bVar.b;
            this.b = AbstractC10281zt0.c(fArr, 0, fArr.length);
        }
    }
}
