package com.daaw;

import android.util.Base64;
import com.google.android.gms.internal.ads.zzaem;
import com.google.android.gms.internal.ads.zzafz;
import com.google.android.gms.internal.ads.zzby;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.zo1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10257zo1 {
    public static int a(int i) {
        int i2 = 0;
        while (i > 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    public static zzby b(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i2 = AbstractC9004vJ2.a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                AbstractC3305ay2.f("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzaem.a(new C5900kE2(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e) {
                    AbstractC3305ay2.g("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new zzafz(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzby(arrayList);
    }

    public static C9420wo1 c(C5900kE2 c5900kE2, boolean z, boolean z2) throws QT1 {
        if (z) {
            d(3, c5900kE2, false);
        }
        String strH = c5900kE2.H((int) c5900kE2.A(), UN2.c);
        int length = strH.length();
        long jA = c5900kE2.A();
        String[] strArr = new String[(int) jA];
        int length2 = length + 15;
        for (int i = 0; i < jA; i++) {
            String strH2 = c5900kE2.H((int) c5900kE2.A(), UN2.c);
            strArr[i] = strH2;
            length2 = length2 + 4 + strH2.length();
        }
        if (z2 && (c5900kE2.u() & 1) == 0) {
            throw QT1.a("framing bit expected to be set", null);
        }
        return new C9420wo1(strH, strArr, length2 + 1);
    }

    public static boolean d(int i, C5900kE2 c5900kE2, boolean z) throws QT1 {
        if (c5900kE2.j() < 7) {
            if (z) {
                return false;
            }
            throw QT1.a("too short header: " + c5900kE2.j(), null);
        }
        if (c5900kE2.u() != i) {
            if (z) {
                return false;
            }
            throw QT1.a("expected header type ".concat(String.valueOf(Integer.toHexString(i))), null);
        }
        if (c5900kE2.u() == 118 && c5900kE2.u() == 111 && c5900kE2.u() == 114 && c5900kE2.u() == 98 && c5900kE2.u() == 105 && c5900kE2.u() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw QT1.a("expected characters 'vorbis'", null);
    }
}
