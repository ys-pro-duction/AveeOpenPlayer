package com.daaw;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.xu1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9729xu1 {
    public long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final List h;

    /* JADX WARN: Illegal instructions before constructor call */
    public C9729xu1(String str, C1214It1 c1214It1) {
        String str2 = c1214It1.b;
        long j = c1214It1.c;
        long j2 = c1214It1.d;
        long j3 = c1214It1.e;
        long j4 = c1214It1.f;
        List arrayList = c1214It1.h;
        if (arrayList == null) {
            Map map = c1214It1.g;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new C2171Rt1((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j, j2, j3, j4, arrayList);
    }

    public static C9729xu1 a(C0802Eu1 c0802Eu1) throws IOException {
        if (C1010Gu1.c(c0802Eu1) != 538247942) {
            throw new IOException();
        }
        String strF = C1010Gu1.f(c0802Eu1);
        String strF2 = C1010Gu1.f(c0802Eu1);
        long jD = C1010Gu1.d(c0802Eu1);
        long jD2 = C1010Gu1.d(c0802Eu1);
        long jD3 = C1010Gu1.d(c0802Eu1);
        long jD4 = C1010Gu1.d(c0802Eu1);
        int iC = C1010Gu1.c(c0802Eu1);
        if (iC < 0) {
            throw new IOException("readHeaderList size=" + iC);
        }
        List arrayList = iC == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i = 0; i < iC; i++) {
            arrayList.add(new C2171Rt1(C1010Gu1.f(c0802Eu1).intern(), C1010Gu1.f(c0802Eu1).intern()));
        }
        return new C9729xu1(strF, strF2, jD, jD2, jD3, jD4, arrayList);
    }

    public C9729xu1(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.b = str;
        this.c = true == "".equals(str2) ? null : str2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = list;
    }
}
