package com.daaw;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzad;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.tq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8586tq1 {
    public byte[] N;
    public C8855uo1 T;
    public boolean U;
    public InterfaceC8576to1 X;
    public int Y;
    public String a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public byte[] i;
    public C8297so1 j;
    public byte[] k;
    public zzad l;
    public int m = -1;
    public int n = -1;
    public int o = -1;
    public int p = -1;
    public int q = 0;
    public int r = -1;
    public float s = 0.0f;
    public float t = 0.0f;
    public float u = 0.0f;
    public byte[] v = null;
    public int w = -1;
    public boolean x = false;
    public int y = -1;
    public int z = -1;
    public int A = -1;
    public int B = 1000;
    public int C = RCHTTPStatusCodes.SUCCESS;
    public float D = -1.0f;
    public float E = -1.0f;
    public float F = -1.0f;
    public float G = -1.0f;
    public float H = -1.0f;
    public float I = -1.0f;
    public float J = -1.0f;
    public float K = -1.0f;
    public float L = -1.0f;
    public float M = -1.0f;
    public int O = 1;
    public int P = -1;
    public int Q = 8000;
    public long R = 0;
    public long S = 0;
    public boolean V = true;
    public String W = "eng";

    public static Pair f(C5900kE2 c5900kE2) throws QT1 {
        try {
            c5900kE2.h(16);
            long jA = c5900kE2.A();
            if (jA == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (jA == 859189832) {
                return new Pair("video/3gpp", null);
            }
            if (jA != 826496599) {
                AbstractC3305ay2.f("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", null);
            }
            int iL = c5900kE2.l() + 20;
            byte[] bArrI = c5900kE2.i();
            while (true) {
                int length = bArrI.length;
                if (iL >= length - 4) {
                    throw QT1.a("Failed to find FourCC VC1 initialization data", null);
                }
                int i = iL + 1;
                if (bArrI[iL] == 0 && bArrI[i] == 0 && bArrI[iL + 2] == 1 && bArrI[iL + 3] == 15) {
                    return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrI, iL, length)));
                }
                iL = i;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw QT1.a("Error parsing FourCC private data", null);
        }
    }

    public static List g(byte[] bArr) throws QT1 {
        int i;
        int i2;
        try {
            if (bArr[0] != 2) {
                throw QT1.a("Error parsing vorbis codec private", null);
            }
            int i3 = 1;
            int i4 = 0;
            while (true) {
                int i5 = bArr[i3];
                i3++;
                i = i5 & 255;
                if (i != 255) {
                    break;
                }
                i4 += 255;
            }
            int i6 = i4 + i;
            int i7 = 0;
            while (true) {
                int i8 = bArr[i3];
                i3++;
                i2 = i8 & 255;
                if (i2 != 255) {
                    break;
                }
                i7 += 255;
            }
            int i9 = i7 + i2;
            if (bArr[i3] != 1) {
                throw QT1.a("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i6];
            System.arraycopy(bArr, i3, bArr2, 0, i6);
            int i10 = i3 + i6;
            if (bArr[i10] != 3) {
                throw QT1.a("Error parsing vorbis codec private", null);
            }
            int i11 = i10 + i9;
            if (bArr[i11] != 5) {
                throw QT1.a("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i11;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i11, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw QT1.a("Error parsing vorbis codec private", null);
        }
    }

    public static boolean h(C5900kE2 c5900kE2) throws QT1 {
        try {
            int iS = c5900kE2.s();
            if (iS == 1) {
                return true;
            }
            if (iS == 65534) {
                c5900kE2.g(24);
                if (c5900kE2.B() == C8865uq1.h0.getMostSignificantBits()) {
                    if (c5900kE2.B() == C8865uq1.h0.getLeastSignificantBits()) {
                        return true;
                    }
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw QT1.a("Error parsing MS/ACM codec private", null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x05bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(com.daaw.InterfaceC1398Kn1 r19, int r20) throws com.daaw.QT1 {
        /*
            Method dump skipped, instruction units count: 1738
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C8586tq1.e(com.daaw.Kn1, int):void");
    }

    public final byte[] i(String str) throws QT1 {
        byte[] bArr = this.k;
        if (bArr != null) {
            return bArr;
        }
        throw QT1.a("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }
}
