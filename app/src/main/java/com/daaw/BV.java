package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BV {
    public static final FU a;
    public static final FU b;
    public static final FU c;
    public static final FU d;
    public static final FU e;
    public static final FU f;

    static {
        C4908gi c4908gi = FU.g;
        a = new FU(c4908gi, "https");
        b = new FU(c4908gi, "http");
        C4908gi c4908gi2 = FU.e;
        c = new FU(c4908gi2, "POST");
        d = new FU(c4908gi2, "GET");
        e = new FU(AbstractC7365pU.j.d(), "application/grpc");
        f = new FU("te", "trailers");
    }

    public static List a(List list, C2756Xj0 c2756Xj0) {
        byte[][] bArrD = K51.d(c2756Xj0);
        for (int i = 0; i < bArrD.length; i += 2) {
            C4908gi c4908giO = C4908gi.o(bArrD[i]);
            if (c4908giO.s() != 0 && c4908giO.k(0) != 58) {
                list.add(new FU(c4908giO, C4908gi.o(bArrD[i + 1])));
            }
        }
        return list;
    }

    public static List b(C2756Xj0 c2756Xj0, String str, String str2, String str3, boolean z, boolean z2) {
        AbstractC7785qy0.o(c2756Xj0, "headers");
        AbstractC7785qy0.o(str, "defaultPath");
        AbstractC7785qy0.o(str2, "authority");
        c(c2756Xj0);
        ArrayList arrayList = new ArrayList(AbstractC6962o10.a(c2756Xj0) + 7);
        if (z2) {
            arrayList.add(b);
        } else {
            arrayList.add(a);
        }
        if (z) {
            arrayList.add(d);
        } else {
            arrayList.add(c);
        }
        arrayList.add(new FU(FU.h, str2));
        arrayList.add(new FU(FU.f, str));
        arrayList.add(new FU(AbstractC7365pU.l.d(), str3));
        arrayList.add(e);
        arrayList.add(f);
        return a(arrayList, c2756Xj0);
    }

    public static void c(C2756Xj0 c2756Xj0) {
        c2756Xj0.e(AbstractC7365pU.j);
        c2756Xj0.e(AbstractC7365pU.k);
        c2756Xj0.e(AbstractC7365pU.l);
    }
}
