package com.daaw;

import com.daaw.AbstractC4512fJ0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: com.daaw.pW0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C7374pW0 extends AbstractC6956o0 {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(C7374pW0.class, Object.class, "_state");
    private volatile Object _state;

    @Override // com.daaw.AbstractC6956o0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(C6816nW0 c6816nW0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, AbstractC7095oW0.a);
        return true;
    }

    public final Object e(InterfaceC1416Ks interfaceC1416Ks) {
        C4067dj c4067dj = new C4067dj(H10.b(interfaceC1416Ks), 1);
        c4067dj.y();
        if (!AbstractC5549j0.a(a, this, AbstractC7095oW0.a, c4067dj)) {
            AbstractC4512fJ0.a aVar = AbstractC4512fJ0.B;
            c4067dj.x(AbstractC4512fJ0.a(G91.a));
        }
        Object objU = c4067dj.u();
        if (objU == I10.c()) {
            AbstractC7497pw.c(interfaceC1416Ks);
        }
        return objU == I10.c() ? objU : G91.a;
    }

    @Override // com.daaw.AbstractC6956o0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC1416Ks[] b(C6816nW0 c6816nW0) {
        a.set(this, null);
        return AbstractC6677n0.a;
    }

    public final void g() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null || obj == AbstractC7095oW0.b) {
                return;
            }
            if (obj == AbstractC7095oW0.a) {
                if (AbstractC5549j0.a(a, this, obj, AbstractC7095oW0.b)) {
                    return;
                }
            } else if (AbstractC5549j0.a(a, this, obj, AbstractC7095oW0.a)) {
                AbstractC4512fJ0.a aVar = AbstractC4512fJ0.B;
                ((C4067dj) obj).x(AbstractC4512fJ0.a(G91.a));
                return;
            }
        }
    }

    public final boolean h() {
        Object andSet = a.getAndSet(this, AbstractC7095oW0.a);
        G10.d(andSet);
        return andSet == AbstractC7095oW0.b;
    }
}
