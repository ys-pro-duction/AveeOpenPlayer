package com.daaw;

import com.daaw.InterfaceC1583Mi;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.bl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3520bl extends AbstractC8747uR implements InterfaceC3241al {
    public final boolean f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3520bl(InterfaceC4923gl interfaceC4923gl, InterfaceC7195or interfaceC7195or, InterfaceC3072a8 interfaceC3072a8, boolean z, InterfaceC1583Mi.a aVar, RU0 ru0) {
        super(interfaceC4923gl, interfaceC7195or, interfaceC3072a8, C7091oV0.j, aVar, ru0);
        if (interfaceC4923gl == null) {
            F(0);
        }
        if (interfaceC3072a8 == null) {
            F(1);
        }
        if (aVar == null) {
            F(2);
        }
        if (ru0 == null) {
            F(3);
        }
        this.f0 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void F(int r8) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C3520bl.F(int):void");
    }

    public static C3520bl n1(InterfaceC4923gl interfaceC4923gl, InterfaceC3072a8 interfaceC3072a8, boolean z, RU0 ru0) {
        if (interfaceC4923gl == null) {
            F(4);
        }
        if (interfaceC3072a8 == null) {
            F(5);
        }
        if (ru0 == null) {
            F(6);
        }
        return new C3520bl(interfaceC4923gl, null, interfaceC3072a8, z, InterfaceC1583Mi.a.DECLARATION, ru0);
    }

    @Override // com.daaw.InterfaceC7195or
    public InterfaceC4923gl A() {
        InterfaceC4923gl interfaceC4923glB = b();
        if (interfaceC4923glB == null) {
            F(18);
        }
        return interfaceC4923glB;
    }

    @Override // com.daaw.AbstractC8747uR, com.daaw.InterfaceC8468tR, com.daaw.InterfaceC1583Mi, com.daaw.InterfaceC1376Ki
    public Collection e() {
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            F(21);
        }
        return set;
    }

    @Override // com.daaw.AbstractC8747uR, com.daaw.InterfaceC8612tw
    public Object h0(InterfaceC9735xw interfaceC9735xw, Object obj) {
        return interfaceC9735xw.c(this, obj);
    }

    public final List k1() {
        InterfaceC4923gl interfaceC4923glB = b();
        if (interfaceC4923glB.H0().isEmpty()) {
            List list = Collections.EMPTY_LIST;
            if (list == null) {
                F(16);
            }
            return list;
        }
        List listH0 = interfaceC4923glB.H0();
        if (listH0 == null) {
            F(15);
        }
        return listH0;
    }

    public RE0 l1() {
        InterfaceC4923gl interfaceC4923glB = b();
        if (!interfaceC4923glB.K()) {
            return null;
        }
        InterfaceC8612tw interfaceC8612twB = interfaceC4923glB.b();
        if (interfaceC8612twB instanceof InterfaceC4923gl) {
            return ((InterfaceC4923gl) interfaceC8612twB).J0();
        }
        return null;
    }

    @Override // com.daaw.InterfaceC1583Mi
    /* JADX INFO: renamed from: m1, reason: merged with bridge method [inline-methods] */
    public InterfaceC3241al I(InterfaceC8612tw interfaceC8612tw, EnumC0336Ak0 enumC0336Ak0, AbstractC8965vA abstractC8965vA, InterfaceC1583Mi.a aVar, boolean z) {
        InterfaceC3241al interfaceC3241al = (InterfaceC3241al) super.K0(interfaceC8612tw, enumC0336Ak0, abstractC8965vA, aVar, z);
        if (interfaceC3241al == null) {
            F(27);
        }
        return interfaceC3241al;
    }

    @Override // com.daaw.AbstractC8747uR
    public C3520bl o1(InterfaceC8612tw interfaceC8612tw, InterfaceC8468tR interfaceC8468tR, InterfaceC1583Mi.a aVar, C2352Tm0 c2352Tm0, InterfaceC3072a8 interfaceC3072a8, RU0 ru0) {
        if (interfaceC8612tw == null) {
            F(23);
        }
        if (aVar == null) {
            F(24);
        }
        if (interfaceC3072a8 == null) {
            F(25);
        }
        if (ru0 == null) {
            F(26);
        }
        InterfaceC1583Mi.a aVar2 = InterfaceC1583Mi.a.DECLARATION;
        if (aVar == aVar2 || aVar == InterfaceC1583Mi.a.SYNTHESIZED) {
            return new C3520bl((InterfaceC4923gl) interfaceC8612tw, this, interfaceC3072a8, this.f0, aVar2, ru0);
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + interfaceC8612tw + "\nkind: " + aVar);
    }

    @Override // com.daaw.AbstractC9456ww, com.daaw.InterfaceC8612tw
    /* JADX INFO: renamed from: p1, reason: merged with bridge method [inline-methods] */
    public InterfaceC4923gl b() {
        InterfaceC4923gl interfaceC4923gl = (InterfaceC4923gl) super.b();
        if (interfaceC4923gl == null) {
            F(17);
        }
        return interfaceC4923gl;
    }

    public C3520bl q1(List list, AbstractC8965vA abstractC8965vA) {
        if (list == null) {
            F(13);
        }
        if (abstractC8965vA == null) {
            F(14);
        }
        r1(list, abstractC8965vA, b().v());
        return this;
    }

    public C3520bl r1(List list, AbstractC8965vA abstractC8965vA, List list2) {
        if (list == null) {
            F(10);
        }
        if (abstractC8965vA == null) {
            F(11);
        }
        if (list2 == null) {
            F(12);
        }
        super.R0(null, l1(), k1(), list2, list, null, EnumC0336Ak0.C, abstractC8965vA);
        return this;
    }

    @Override // com.daaw.AbstractC8747uR, com.daaw.InterfaceC1583Mi
    public void v0(Collection collection) {
        if (collection == null) {
            F(22);
        }
    }

    @Override // com.daaw.InterfaceC7195or
    public boolean z() {
        return this.f0;
    }

    @Override // com.daaw.AbstractC8747uR, com.daaw.InterfaceC4297eZ0
    public InterfaceC3241al c(C8957v81 c8957v81) {
        if (c8957v81 == null) {
            F(20);
        }
        return (InterfaceC3241al) super.c(c8957v81);
    }

    @Override // com.daaw.AbstractC9456ww
    public InterfaceC3241al a() {
        InterfaceC3241al interfaceC3241al = (InterfaceC3241al) super.a();
        if (interfaceC3241al == null) {
            F(19);
        }
        return interfaceC3241al;
    }
}
