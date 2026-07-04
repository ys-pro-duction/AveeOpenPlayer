package com.daaw;

import com.daaw.InterfaceC9611xW;
import j$.util.Objects;

/* JADX INFO: renamed from: com.daaw.Uk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2447Uk {
    public static boolean a(com.google.android.exoplayer2.trackselection.c cVar, int i, Exception exc) {
        return b(cVar, i, exc, 60000L);
    }

    public static boolean b(com.google.android.exoplayer2.trackselection.c cVar, int i, Exception exc, long j) {
        if (!c(exc)) {
            return false;
        }
        boolean zC = cVar.c(i, j);
        int i2 = ((InterfaceC9611xW.d) exc).D;
        if (zC) {
            Objects.toString(cVar.d(i));
            return zC;
        }
        Objects.toString(cVar.d(i));
        return zC;
    }

    public static boolean c(Exception exc) {
        if (!(exc instanceof InterfaceC9611xW.d)) {
            return false;
        }
        int i = ((InterfaceC9611xW.d) exc).D;
        return i == 404 || i == 410;
    }
}
