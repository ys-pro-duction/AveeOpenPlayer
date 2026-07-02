package com.daaw;

import com.daaw.InterfaceC4188e81;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.ya0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9907ya0 implements InterfaceC3277as0 {
    public final C0504Ca0 a;
    public final InterfaceC7986ri b;

    public C9907ya0(C7251p30 c7251p30) {
        G10.g(c7251p30, "components");
        C0504Ca0 c0504Ca0 = new C0504Ca0(c7251p30, InterfaceC4188e81.a.a, AbstractC3471bb0.c(null));
        this.a = c0504Ca0;
        this.b = c0504Ca0.e().d();
    }

    public static final C9349wa0 f(C9907ya0 c9907ya0, InterfaceC5565j30 interfaceC5565j30) {
        G10.g(c9907ya0, "this$0");
        G10.g(interfaceC5565j30, "$jPackage");
        return new C9349wa0(c9907ya0.a, interfaceC5565j30);
    }

    @Override // com.daaw.InterfaceC3277as0
    public boolean a(AP ap) {
        G10.g(ap, "fqName");
        return G20.a(this.a.a().d(), ap, false, 2, null) == null;
    }

    @Override // com.daaw.InterfaceC3277as0
    public void b(AP ap, Collection collection) {
        G10.g(ap, "fqName");
        G10.g(collection, "packageFragments");
        AbstractC1392Km.a(collection, e(ap));
    }

    @Override // com.daaw.InterfaceC2580Vr0
    public List c(AP ap) {
        G10.g(ap, "fqName");
        return AbstractC1599Mm.o(e(ap));
    }

    public final C9349wa0 e(AP ap) {
        InterfaceC5565j30 interfaceC5565j30A = G20.a(this.a.a().d(), ap, false, 2, null);
        if (interfaceC5565j30A == null) {
            return null;
        }
        return (C9349wa0) this.b.a(ap, new C9628xa0(this, interfaceC5565j30A));
    }

    @Override // com.daaw.InterfaceC2580Vr0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public List u(AP ap, NQ nq) {
        G10.g(ap, "fqName");
        G10.g(nq, "nameFilter");
        C9349wa0 c9349wa0E = e(ap);
        List listQ0 = c9349wa0E != null ? c9349wa0E.Q0() : null;
        return listQ0 == null ? AbstractC1599Mm.k() : listQ0;
    }

    public String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.a.a().m();
    }
}
