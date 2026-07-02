package com.daaw;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.zH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C10109zH implements C71 {
    public final AH a;
    public final String[] b;
    public final String c;

    public C10109zH(AH ah, String... strArr) {
        G10.g(ah, "kind");
        G10.g(strArr, "formatParams");
        this.a = ah;
        this.b = strArr;
        String strC = EnumC7592qH.H.c();
        String strC2 = ah.c();
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        String str = String.format(strC2, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        G10.f(str, "format(...)");
        String str2 = String.format(strC, Arrays.copyOf(new Object[]{str}, 1));
        G10.f(str2, "format(...)");
        this.c = str2;
    }

    @Override // com.daaw.C71
    public C71 a(Q80 q80) {
        G10.g(q80, "kotlinTypeRefiner");
        return this;
    }

    @Override // com.daaw.C71
    public Collection b() {
        return AbstractC1599Mm.k();
    }

    @Override // com.daaw.C71
    public InterfaceC10240zl c() {
        return BH.a.h();
    }

    @Override // com.daaw.C71
    public boolean d() {
        return false;
    }

    public final AH f() {
        return this.a;
    }

    public final String g(int i) {
        return this.b[i];
    }

    @Override // com.daaw.C71
    public List getParameters() {
        return AbstractC1599Mm.k();
    }

    @Override // com.daaw.C71
    public AbstractC8670u80 p() {
        return C2181Rw.h.a();
    }

    public String toString() {
        return this.c;
    }
}
