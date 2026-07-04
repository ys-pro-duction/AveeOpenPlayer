package com.daaw;

/* JADX INFO: renamed from: com.daaw.c40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3610c40 extends AbstractC2251Sn implements InterfaceC9531xC, InterfaceC5143hZ {
    public C3889d40 E;

    @Override // com.daaw.InterfaceC9531xC
    public void a() {
        x().C0(this);
    }

    @Override // com.daaw.InterfaceC5143hZ
    public boolean d() {
        return true;
    }

    @Override // com.daaw.InterfaceC5143hZ
    public C7460po0 h() {
        return null;
    }

    @Override // com.daaw.C9922yd0
    public String toString() {
        return AbstractC8054rw.a(this) + '@' + AbstractC8054rw.b(this) + "[job@" + AbstractC8054rw.b(x()) + ']';
    }

    public final C3889d40 x() {
        C3889d40 c3889d40 = this.E;
        if (c3889d40 != null) {
            return c3889d40;
        }
        G10.u("job");
        return null;
    }

    public final void z(C3889d40 c3889d40) {
        this.E = c3889d40;
    }
}
