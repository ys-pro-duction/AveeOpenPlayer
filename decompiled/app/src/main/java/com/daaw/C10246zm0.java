package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.zm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10246zm0 {
    public final C9967ym0 a;
    public final CU0 b;
    public final List c;
    public final AbstractC4340ei d;
    public final SY e;

    public C10246zm0(C9967ym0 c9967ym0, CU0 cu0, List list, AbstractC4340ei abstractC4340ei, SY sy) {
        this.a = c9967ym0;
        this.b = cu0;
        this.c = list;
        this.d = abstractC4340ei;
        this.e = sy;
    }

    public static C10246zm0 a(C9967ym0 c9967ym0, CU0 cu0, List list, AbstractC4340ei abstractC4340ei) {
        AbstractC6557mb.d(c9967ym0.h().size() == list.size(), "Mutations sent %d must equal results received %d", Integer.valueOf(c9967ym0.h().size()), Integer.valueOf(list.size()));
        SY syB = NC.b();
        List listH = c9967ym0.h();
        SY syV = syB;
        for (int i = 0; i < listH.size(); i++) {
            syV = syV.v(((AbstractC9688xm0) listH.get(i)).g(), ((C0448Bm0) list.get(i)).b());
        }
        return new C10246zm0(c9967ym0, cu0, list, abstractC4340ei, syV);
    }

    public C9967ym0 b() {
        return this.a;
    }

    public CU0 c() {
        return this.b;
    }

    public SY d() {
        return this.e;
    }

    public List e() {
        return this.c;
    }

    public AbstractC4340ei f() {
        return this.d;
    }
}
