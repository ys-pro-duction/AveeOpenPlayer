package com.daaw;

import android.os.Handler;
import com.daaw.InterfaceC1792Oi0;
import com.daaw.InterfaceC1896Pi0;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.daaw.De, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0632De implements InterfaceC1792Oi0 {
    public final ArrayList B = new ArrayList(1);
    public final InterfaceC1896Pi0.a C = new InterfaceC1896Pi0.a();
    public WI D;
    public L31 E;
    public Object F;

    @Override // com.daaw.InterfaceC1792Oi0
    public final void c(Handler handler, InterfaceC1896Pi0 interfaceC1896Pi0) {
        this.C.a(handler, interfaceC1896Pi0);
    }

    @Override // com.daaw.InterfaceC1792Oi0
    public final void f(WI wi, boolean z, InterfaceC1792Oi0.b bVar) {
        WI wi2 = this.D;
        AbstractC7115ob.a(wi2 == null || wi2 == wi);
        this.B.add(bVar);
        if (this.D == null) {
            this.D = wi;
            m(wi, z);
        } else {
            L31 l31 = this.E;
            if (l31 != null) {
                bVar.d(this, l31, this.F);
            }
        }
    }

    @Override // com.daaw.InterfaceC1792Oi0
    public final void h(InterfaceC1792Oi0.b bVar) {
        this.B.remove(bVar);
        if (this.B.isEmpty()) {
            this.D = null;
            this.E = null;
            this.F = null;
            o();
        }
    }

    @Override // com.daaw.InterfaceC1792Oi0
    public final void i(InterfaceC1896Pi0 interfaceC1896Pi0) {
        this.C.u(interfaceC1896Pi0);
    }

    public final InterfaceC1896Pi0.a j(InterfaceC1792Oi0.a aVar) {
        return this.C.x(0, aVar, 0L);
    }

    public final InterfaceC1896Pi0.a l(InterfaceC1792Oi0.a aVar, long j) {
        AbstractC7115ob.a(aVar != null);
        return this.C.x(0, aVar, j);
    }

    public abstract void m(WI wi, boolean z);

    public final void n(L31 l31, Object obj) {
        this.E = l31;
        this.F = obj;
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            ((InterfaceC1792Oi0.b) it.next()).d(this, l31, obj);
        }
    }

    public abstract void o();
}
