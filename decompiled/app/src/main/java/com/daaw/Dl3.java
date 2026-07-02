package com.daaw;

import android.content.Context;
import android.media.AudioFormat;

/* JADX INFO: loaded from: classes3.dex */
public final class Dl3 {
    public Boolean a;

    public Dl3(Context context) {
    }

    public final C6606mk3 a(C2485Ut1 c2485Ut1, C7965rd3 c7965rd3) {
        c2485Ut1.getClass();
        c7965rd3.getClass();
        int i = AbstractC9004vJ2.a;
        if (i < 29 || c2485Ut1.z == -1) {
            return C6606mk3.d;
        }
        if (this.a == null) {
            this.a = Boolean.FALSE;
        }
        String str = c2485Ut1.l;
        str.getClass();
        int iA = AbstractC5959kT1.a(str, c2485Ut1.i);
        if (iA == 0 || i < AbstractC9004vJ2.r(iA)) {
            return C6606mk3.d;
        }
        int iS = AbstractC9004vJ2.s(c2485Ut1.y);
        if (iS == 0) {
            return C6606mk3.d;
        }
        try {
            AudioFormat audioFormatG = AbstractC9004vJ2.G(c2485Ut1.z, iS, iA);
            return i >= 31 ? Bl3.a(audioFormatG, c7965rd3.a().a, false) : AbstractC9965yl3.a(audioFormatG, c7965rd3.a().a, false);
        } catch (IllegalArgumentException unused) {
            return C6606mk3.d;
        }
    }
}
