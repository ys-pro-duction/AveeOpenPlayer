package com.daaw;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: com.daaw.bD1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3375bD1 implements Comparator {
    public final /* synthetic */ AbstractC9435wr1 B;
    public final /* synthetic */ ES2 C;

    public C3375bD1(AbstractC9435wr1 abstractC9435wr1, ES2 es2) {
        this.B = abstractC9435wr1;
        this.C = es2;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        InterfaceC1637Mv1 interfaceC1637Mv1 = (InterfaceC1637Mv1) obj;
        boolean z = interfaceC1637Mv1 instanceof C2401Ty1;
        InterfaceC1637Mv1 interfaceC1637Mv12 = (InterfaceC1637Mv1) obj2;
        AbstractC9435wr1 abstractC9435wr1 = this.B;
        ES2 es2 = this.C;
        if (z) {
            return !(interfaceC1637Mv12 instanceof C2401Ty1) ? 1 : 0;
        }
        if (interfaceC1637Mv12 instanceof C2401Ty1) {
            return -1;
        }
        return abstractC9435wr1 == null ? interfaceC1637Mv1.zzi().compareTo(interfaceC1637Mv12.zzi()) : (int) AbstractC7831r73.a(abstractC9435wr1.a(es2, Arrays.asList(interfaceC1637Mv1, interfaceC1637Mv12)).zzh().doubleValue());
    }
}
