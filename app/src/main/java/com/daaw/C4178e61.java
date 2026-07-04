package com.daaw;

import com.daaw.AbstractC9089ve;
import com.daaw.BR0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.e61, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4178e61 implements InterfaceC2371Tr, AbstractC9089ve.b {
    public final String a;
    public final boolean b;
    public final List c = new ArrayList();
    public final BR0.a d;
    public final AbstractC9089ve e;
    public final AbstractC9089ve f;
    public final AbstractC9089ve g;

    public C4178e61(AbstractC9647xe abstractC9647xe, BR0 br0) {
        this.a = br0.c();
        this.b = br0.g();
        this.d = br0.f();
        AbstractC9089ve abstractC9089veH = br0.e().h();
        this.e = abstractC9089veH;
        AbstractC9089ve abstractC9089veH2 = br0.b().h();
        this.f = abstractC9089veH2;
        AbstractC9089ve abstractC9089veH3 = br0.d().h();
        this.g = abstractC9089veH3;
        abstractC9647xe.j(abstractC9089veH);
        abstractC9647xe.j(abstractC9089veH2);
        abstractC9647xe.j(abstractC9089veH3);
        abstractC9089veH.a(this);
        abstractC9089veH2.a(this);
        abstractC9089veH3.a(this);
    }

    @Override // com.daaw.AbstractC9089ve.b
    public void a() {
        for (int i = 0; i < this.c.size(); i++) {
            ((AbstractC9089ve.b) this.c.get(i)).a();
        }
    }

    public void c(AbstractC9089ve.b bVar) {
        this.c.add(bVar);
    }

    public AbstractC9089ve f() {
        return this.f;
    }

    public AbstractC9089ve h() {
        return this.g;
    }

    public AbstractC9089ve j() {
        return this.e;
    }

    public BR0.a k() {
        return this.d;
    }

    public boolean l() {
        return this.b;
    }

    @Override // com.daaw.InterfaceC2371Tr
    public void b(List list, List list2) {
    }
}
