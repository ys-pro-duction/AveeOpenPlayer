package com.daaw;

import com.daaw.InterfaceC3072a8;
import com.daaw.YV0;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.ba0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3466ba0 implements InterfaceC3072a8 {
    public final C0504Ca0 B;
    public final InterfaceC9205w20 C;
    public final boolean D;
    public final InterfaceC5752jj0 E;

    public C3466ba0(C0504Ca0 c0504Ca0, InterfaceC9205w20 interfaceC9205w20, boolean z) {
        G10.g(c0504Ca0, "c");
        G10.g(interfaceC9205w20, "annotationOwner");
        this.B = c0504Ca0;
        this.C = interfaceC9205w20;
        this.D = z;
        this.E = c0504Ca0.a().u().b(new C3187aa0(this));
    }

    public static final O7 m(C3466ba0 c3466ba0, InterfaceC7525q20 interfaceC7525q20) {
        G10.g(c3466ba0, "this$0");
        G10.g(interfaceC7525q20, "annotation");
        return C8926v20.a.e(interfaceC7525q20, c3466ba0.B, c3466ba0.D);
    }

    @Override // com.daaw.InterfaceC3072a8
    public O7 i(AP ap) {
        O7 o7;
        G10.g(ap, "fqName");
        InterfaceC7525q20 interfaceC7525q20I = this.C.i(ap);
        return (interfaceC7525q20I == null || (o7 = (O7) this.E.invoke(interfaceC7525q20I)) == null) ? C8926v20.a.a(ap, this.C, this.B) : o7;
    }

    @Override // com.daaw.InterfaceC3072a8
    public boolean isEmpty() {
        return this.C.getAnnotations().isEmpty() && !this.C.n();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return UP0.p(UP0.x(UP0.t(AbstractC2455Um.V(this.C.getAnnotations()), this.E), C8926v20.a.a(YV0.a.y, this.C, this.B))).iterator();
    }

    @Override // com.daaw.InterfaceC3072a8
    public boolean z(AP ap) {
        return InterfaceC3072a8.b.b(this, ap);
    }

    public /* synthetic */ C3466ba0(C0504Ca0 c0504Ca0, InterfaceC9205w20 interfaceC9205w20, boolean z, int i, AbstractC2911Yw abstractC2911Yw) {
        this(c0504Ca0, interfaceC9205w20, (i & 4) != 0 ? false : z);
    }
}
