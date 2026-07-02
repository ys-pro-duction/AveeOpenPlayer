package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.g;
import com.daaw.AbstractC8526te1;
import com.daaw.C0313Ae1;
import com.daaw.G10;
import com.daaw.InterfaceC0417Be1;
import com.daaw.InterfaceC1764Ob0;
import com.daaw.InterfaceC3135aN0;
import com.daaw.YM0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final f a = new f();

    public static final class a implements YM0.a {
        @Override // com.daaw.YM0.a
        public void a(InterfaceC3135aN0 interfaceC3135aN0) {
            G10.g(interfaceC3135aN0, "owner");
            if (!(interfaceC3135aN0 instanceof InterfaceC0417Be1)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            C0313Ae1 c0313Ae1N = ((InterfaceC0417Be1) interfaceC3135aN0).n();
            YM0 ym0P = interfaceC3135aN0.p();
            Iterator it = c0313Ae1N.c().iterator();
            while (it.hasNext()) {
                AbstractC8526te1 abstractC8526te1B = c0313Ae1N.b((String) it.next());
                G10.d(abstractC8526te1B);
                f.a(abstractC8526te1B, ym0P, interfaceC3135aN0.w());
            }
            if (c0313Ae1N.c().isEmpty()) {
                return;
            }
            ym0P.i(a.class);
        }
    }

    public static final class b implements j {
        public final /* synthetic */ g B;
        public final /* synthetic */ YM0 C;

        public b(g gVar, YM0 ym0) {
            this.B = gVar;
            this.C = ym0;
        }

        @Override // androidx.lifecycle.j
        public void c(InterfaceC1764Ob0 interfaceC1764Ob0, g.a aVar) {
            G10.g(interfaceC1764Ob0, "source");
            G10.g(aVar, "event");
            if (aVar == g.a.ON_START) {
                this.B.d(this);
                this.C.i(a.class);
            }
        }
    }

    public static final void a(AbstractC8526te1 abstractC8526te1, YM0 ym0, g gVar) {
        G10.g(abstractC8526te1, "viewModel");
        G10.g(ym0, "registry");
        G10.g(gVar, "lifecycle");
        t tVar = (t) abstractC8526te1.c("androidx.lifecycle.savedstate.vm.tag");
        if (tVar == null || tVar.j()) {
            return;
        }
        tVar.a(ym0, gVar);
        a.c(ym0, gVar);
    }

    public static final t b(YM0 ym0, g gVar, String str, Bundle bundle) {
        G10.g(ym0, "registry");
        G10.g(gVar, "lifecycle");
        G10.d(str);
        t tVar = new t(str, r.f.a(ym0.b(str), bundle));
        tVar.a(ym0, gVar);
        a.c(ym0, gVar);
        return tVar;
    }

    public final void c(YM0 ym0, g gVar) {
        g.b bVarB = gVar.b();
        if (bVarB == g.b.INITIALIZED || bVarB.c(g.b.STARTED)) {
            ym0.i(a.class);
        } else {
            gVar.a(new b(gVar, ym0));
        }
    }
}
