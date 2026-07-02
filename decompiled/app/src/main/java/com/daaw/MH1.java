package com.daaw;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class MH1 {
    public static final String i = Integer.toString(0, 36);
    public static final String j = Integer.toString(1, 36);
    public static final String k = Integer.toString(2, 36);
    public static final String l = Integer.toString(3, 36);
    public static final String m = Integer.toString(4, 36);
    public static final String n = Integer.toString(5, 36);
    public static final String o = Integer.toString(6, 36);
    public static final String p = Integer.toString(7, 36);
    public static final InterfaceC9666xh3 q = new InterfaceC9666xh3() { // from class: com.daaw.HG1
    };
    public final Uri a;
    public final List c;
    public final OP2 e;
    public final List f;
    public final Object g;
    public final long h;
    public final String b = null;
    public final String d = null;

    public /* synthetic */ MH1(Uri uri, String str, FD1 fd1, AbstractC7778qw1 abstractC7778qw1, List list, String str2, OP2 op2, Object obj, long j2, AbstractC6199lH1 abstractC6199lH1) {
        this.a = uri;
        this.c = list;
        this.e = op2;
        LP2 lp2 = new LP2();
        if (op2.size() > 0) {
            AbstractC6314li0.a(op2.get(0));
            throw null;
        }
        this.f = lp2.j();
        this.g = null;
        this.h = -9223372036854775807L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MH1)) {
            return false;
        }
        MH1 mh1 = (MH1) obj;
        return this.a.equals(mh1.a) && AbstractC9004vJ2.e(null, null) && AbstractC9004vJ2.e(null, null) && AbstractC9004vJ2.e(null, null) && this.c.equals(mh1.c) && AbstractC9004vJ2.e(null, null) && this.e.equals(mh1.e) && AbstractC9004vJ2.e(null, null) && AbstractC9004vJ2.e(-9223372036854775807L, -9223372036854775807L);
    }

    public final int hashCode() {
        return (int) ((((long) (((((this.a.hashCode() * 923521) + this.c.hashCode()) * 961) + this.e.hashCode()) * 31)) * 31) - Long.MAX_VALUE);
    }
}
