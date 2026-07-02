package com.daaw;

import com.daaw.InterfaceC3072a8;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class DA implements InterfaceC3072a8 {
    public static final /* synthetic */ W60[] C = {AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(DA.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    public final InterfaceC0881Fo0 B;

    public DA(InterfaceC10174zX0 interfaceC10174zX0, LQ lq) {
        G10.g(interfaceC10174zX0, "storageManager");
        G10.g(lq, "compute");
        this.B = interfaceC10174zX0.h(lq);
    }

    private final List e() {
        return (List) AbstractC9895yX0.a(this.B, this, C[0]);
    }

    @Override // com.daaw.InterfaceC3072a8
    public O7 i(AP ap) {
        return InterfaceC3072a8.b.a(this, ap);
    }

    @Override // com.daaw.InterfaceC3072a8
    public boolean isEmpty() {
        return e().isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return e().iterator();
    }

    @Override // com.daaw.InterfaceC3072a8
    public boolean z(AP ap) {
        return InterfaceC3072a8.b.b(this, ap);
    }
}
