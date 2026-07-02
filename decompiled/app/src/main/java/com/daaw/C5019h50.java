package com.daaw;

import com.daaw.AbstractC7261p50;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.h50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5019h50 extends AbstractC5298i50 {
    public final AbstractC7261p50.e h;

    /* JADX WARN: Illegal instructions before constructor call */
    public C5019h50(AbstractC7261p50.e eVar, String[] strArr) {
        Set setQ0;
        G10.g(eVar, "types");
        G10.g(strArr, "strings");
        List listA = eVar.A();
        if (listA.isEmpty()) {
            setQ0 = AbstractC9867yQ0.d();
        } else {
            G10.d(listA);
            setQ0 = AbstractC2455Um.Q0(listA);
        }
        List listB = eVar.B();
        G10.f(listB, "getRecordList(...)");
        super(strArr, setQ0, AbstractC5575j50.a(listB));
        this.h = eVar;
    }
}
