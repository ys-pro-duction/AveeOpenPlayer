package com.daaw;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.sZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C8221sZ extends AbstractC8392t81 {
    public final Z71[] c;
    public final InterfaceC6440m81[] d;
    public final boolean e;

    public /* synthetic */ C8221sZ(Z71[] z71Arr, InterfaceC6440m81[] interfaceC6440m81Arr, boolean z, int i, AbstractC2911Yw abstractC2911Yw) {
        this(z71Arr, interfaceC6440m81Arr, (i & 4) != 0 ? false : z);
    }

    @Override // com.daaw.AbstractC8392t81
    public boolean b() {
        return this.e;
    }

    @Override // com.daaw.AbstractC8392t81
    public InterfaceC6440m81 e(I80 i80) {
        G10.g(i80, SubscriberAttributeKt.JSON_NAME_KEY);
        InterfaceC10240zl interfaceC10240zlC = i80.N0().c();
        Z71 z71 = interfaceC10240zlC instanceof Z71 ? (Z71) interfaceC10240zlC : null;
        if (z71 == null) {
            return null;
        }
        int index = z71.getIndex();
        Z71[] z71Arr = this.c;
        if (index >= z71Arr.length || !G10.c(z71Arr[index].k(), z71.k())) {
            return null;
        }
        return this.d[index];
    }

    @Override // com.daaw.AbstractC8392t81
    public boolean f() {
        return this.d.length == 0;
    }

    public final InterfaceC6440m81[] i() {
        return this.d;
    }

    public final Z71[] j() {
        return this.c;
    }

    public C8221sZ(Z71[] z71Arr, InterfaceC6440m81[] interfaceC6440m81Arr, boolean z) {
        G10.g(z71Arr, "parameters");
        G10.g(interfaceC6440m81Arr, "arguments");
        this.c = z71Arr;
        this.d = interfaceC6440m81Arr;
        this.e = z;
        int length = z71Arr.length;
        int length2 = interfaceC6440m81Arr.length;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8221sZ(List list, List list2) {
        this((Z71[]) list.toArray(new Z71[0]), (InterfaceC6440m81[]) list2.toArray(new InterfaceC6440m81[0]), false, 4, null);
        G10.g(list, "parameters");
        G10.g(list2, "argumentsList");
    }
}
