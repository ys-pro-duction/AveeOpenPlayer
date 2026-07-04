package com.daaw;

/* JADX INFO: renamed from: com.daaw.yl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9961yl implements C71 {
    public int a;

    @Override // com.daaw.C71
    public abstract InterfaceC10240zl c();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C71) || obj.hashCode() != hashCode()) {
            return false;
        }
        C71 c71 = (C71) obj;
        if (c71.getParameters().size() != getParameters().size()) {
            return false;
        }
        InterfaceC10240zl interfaceC10240zlC = c();
        InterfaceC10240zl interfaceC10240zlC2 = c71.c();
        if (interfaceC10240zlC2 != null && g(interfaceC10240zlC) && g(interfaceC10240zlC2)) {
            return h(interfaceC10240zlC2);
        }
        return false;
    }

    public final boolean f(InterfaceC10240zl interfaceC10240zl, InterfaceC10240zl interfaceC10240zl2) {
        G10.g(interfaceC10240zl, "first");
        G10.g(interfaceC10240zl2, "second");
        if (!G10.c(interfaceC10240zl.getName(), interfaceC10240zl2.getName())) {
            return false;
        }
        InterfaceC8612tw interfaceC8612twB = interfaceC10240zl.b();
        for (InterfaceC8612tw interfaceC8612twB2 = interfaceC10240zl2.b(); interfaceC8612twB != null && interfaceC8612twB2 != null; interfaceC8612twB2 = interfaceC8612twB2.b()) {
            if (interfaceC8612twB instanceof InterfaceC2968Zk0) {
                return interfaceC8612twB2 instanceof InterfaceC2968Zk0;
            }
            if (interfaceC8612twB2 instanceof InterfaceC2968Zk0) {
                return false;
            }
            if (interfaceC8612twB instanceof InterfaceC2372Tr0) {
                return (interfaceC8612twB2 instanceof InterfaceC2372Tr0) && G10.c(((InterfaceC2372Tr0) interfaceC8612twB).d(), ((InterfaceC2372Tr0) interfaceC8612twB2).d());
            }
            if ((interfaceC8612twB2 instanceof InterfaceC2372Tr0) || !G10.c(interfaceC8612twB.getName(), interfaceC8612twB2.getName())) {
                return false;
            }
            interfaceC8612twB = interfaceC8612twB.b();
        }
        return true;
    }

    public final boolean g(InterfaceC10240zl interfaceC10240zl) {
        return (BH.m(interfaceC10240zl) || AbstractC7006oA.E(interfaceC10240zl)) ? false : true;
    }

    public abstract boolean h(InterfaceC10240zl interfaceC10240zl);

    public int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        InterfaceC10240zl interfaceC10240zlC = c();
        int iHashCode = g(interfaceC10240zlC) ? AbstractC7006oA.m(interfaceC10240zlC).hashCode() : System.identityHashCode(this);
        this.a = iHashCode;
        return iHashCode;
    }
}
