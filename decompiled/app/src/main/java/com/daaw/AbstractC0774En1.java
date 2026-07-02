package com.daaw;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.zzad;
import java.util.Arrays;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: com.daaw.En1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0774En1 {
    public static final int[] a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] c = {64, 112, 128, 192, 224, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 384, 448, AdRequest.MAX_CONTENT_URL_LENGTH, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static C2485Ut1 a(byte[] bArr, String str, String str2, zzad zzadVar) {
        GD2 gd2;
        if (bArr[0] == 127) {
            gd2 = new GD2(bArr, bArr.length);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            byte b2 = bArrCopyOf[0];
            if (b2 == -2 || b2 == -1) {
                for (int i = 0; i < bArrCopyOf.length - 1; i += 2) {
                    byte b3 = bArrCopyOf[i];
                    int i2 = i + 1;
                    bArrCopyOf[i] = bArrCopyOf[i2];
                    bArrCopyOf[i2] = b3;
                }
            }
            int length = bArrCopyOf.length;
            gd2 = new GD2(bArrCopyOf, length);
            if (bArrCopyOf[0] == 31) {
                GD2 gd22 = new GD2(bArrCopyOf, length);
                while (gd22.a() >= 16) {
                    gd22.l(2);
                    gd2.f(gd22.d(14), 14);
                }
            }
            gd2.i(bArrCopyOf, bArrCopyOf.length);
        }
        gd2.l(60);
        int i3 = a[gd2.d(6)];
        int i4 = b[gd2.d(4)];
        int iD = gd2.d(5);
        int i5 = iD < 29 ? (c[iD] * 1000) / 2 : -1;
        gd2.l(10);
        int i6 = i3 + (gd2.d(2) > 0 ? 1 : 0);
        C1106Hs1 c1106Hs1 = new C1106Hs1();
        c1106Hs1.j(str);
        c1106Hs1.u("audio/vnd.dts");
        c1106Hs1.j0(i5);
        c1106Hs1.k0(i6);
        c1106Hs1.v(i4);
        c1106Hs1.d(null);
        c1106Hs1.m(str2);
        return c1106Hs1.D();
    }
}
