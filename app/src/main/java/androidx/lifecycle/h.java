package androidx.lifecycle;

import androidx.lifecycle.g;
import com.daaw.AbstractC1349Kb0;
import com.daaw.AbstractC3332b40;
import com.daaw.AbstractC4801gJ0;
import com.daaw.AbstractC9104vh;
import com.daaw.C7850rC;
import com.daaw.G10;
import com.daaw.G91;
import com.daaw.I10;
import com.daaw.InterfaceC1416Ks;
import com.daaw.InterfaceC1764Ob0;
import com.daaw.InterfaceC3429bR;
import com.daaw.InterfaceC4684ft;
import com.daaw.InterfaceC7484pt;
import com.daaw.SZ0;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractC1349Kb0 implements j {
    public final g B;
    public final InterfaceC4684ft C;

    public static final class a extends SZ0 implements InterfaceC3429bR {
        public int F;
        public /* synthetic */ Object G;

        public a(InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            a aVar = h.this.new a(interfaceC1416Ks);
            aVar.G = obj;
            return aVar;
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            I10.c();
            if (this.F != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4801gJ0.b(obj);
            InterfaceC7484pt interfaceC7484pt = (InterfaceC7484pt) this.G;
            if (h.this.a().b().compareTo(g.b.INITIALIZED) >= 0) {
                h.this.a().a(h.this);
            } else {
                AbstractC3332b40.e(interfaceC7484pt.i(), null, 1, null);
            }
            return G91.a;
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
            return ((a) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
        }
    }

    public h(g gVar, InterfaceC4684ft interfaceC4684ft) {
        G10.g(gVar, "lifecycle");
        G10.g(interfaceC4684ft, "coroutineContext");
        this.B = gVar;
        this.C = interfaceC4684ft;
        if (a().b() == g.b.DESTROYED) {
            AbstractC3332b40.e(i(), null, 1, null);
        }
    }

    public g a() {
        return this.B;
    }

    public final void b() {
        AbstractC9104vh.d(this, C7850rC.c().m1(), null, new a(null), 2, null);
    }

    @Override // androidx.lifecycle.j
    public void c(InterfaceC1764Ob0 interfaceC1764Ob0, g.a aVar) {
        G10.g(interfaceC1764Ob0, "source");
        G10.g(aVar, "event");
        if (a().b().compareTo(g.b.DESTROYED) <= 0) {
            a().d(this);
            AbstractC3332b40.e(i(), null, 1, null);
        }
    }

    @Override // com.daaw.InterfaceC7484pt
    public InterfaceC4684ft i() {
        return this.C;
    }
}
