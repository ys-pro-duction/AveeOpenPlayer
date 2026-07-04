package com.daaw;

import com.daaw.InterfaceC6319lj0;

/* JADX INFO: renamed from: com.daaw.Ff0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0845Ff0 extends C9374wf0 implements InterfaceC6319lj0 {
    public InterfaceC6319lj0.a e;

    public C0845Ff0(int i) {
        super(i);
    }

    @Override // com.daaw.InterfaceC6319lj0
    public /* bridge */ /* synthetic */ KI0 a(H70 h70, KI0 ki0) {
        return (KI0) super.k(h70, ki0);
    }

    @Override // com.daaw.InterfaceC6319lj0
    public /* bridge */ /* synthetic */ KI0 b(H70 h70) {
        return (KI0) super.l(h70);
    }

    @Override // com.daaw.InterfaceC6319lj0
    public void c(int i) {
        if (i >= 60) {
            d();
        } else if (i >= 40) {
            m(h() / 2);
        }
    }

    @Override // com.daaw.InterfaceC6319lj0
    public void e(InterfaceC6319lj0.a aVar) {
        this.e = aVar;
    }

    @Override // com.daaw.C9374wf0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public int i(KI0 ki0) {
        return ki0.a();
    }

    @Override // com.daaw.C9374wf0
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void j(H70 h70, KI0 ki0) {
        InterfaceC6319lj0.a aVar = this.e;
        if (aVar != null) {
            aVar.b(ki0);
        }
    }
}
