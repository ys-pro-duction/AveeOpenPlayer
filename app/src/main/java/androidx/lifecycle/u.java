package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.g;
import androidx.lifecycle.y;
import com.daaw.AbstractC5247hu;
import com.daaw.AbstractC8526te1;
import com.daaw.AbstractC9091ve1;
import com.daaw.G10;
import com.daaw.InterfaceC0417Be1;
import com.daaw.InterfaceC3135aN0;
import com.daaw.J50;
import com.daaw.VM0;
import com.daaw.WM0;
import com.daaw.YM0;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {
    public static final AbstractC5247hu.b a = new b();
    public static final AbstractC5247hu.b b = new c();
    public static final AbstractC5247hu.b c = new a();

    public static final class a implements AbstractC5247hu.b {
    }

    public static final class b implements AbstractC5247hu.b {
    }

    public static final class c implements AbstractC5247hu.b {
    }

    public static final class d implements y.c {
        @Override // androidx.lifecycle.y.c
        public /* synthetic */ AbstractC8526te1 a(Class cls) {
            return AbstractC9091ve1.b(this, cls);
        }

        @Override // androidx.lifecycle.y.c
        public /* synthetic */ AbstractC8526te1 b(J50 j50, AbstractC5247hu abstractC5247hu) {
            return AbstractC9091ve1.a(this, j50, abstractC5247hu);
        }

        @Override // androidx.lifecycle.y.c
        public AbstractC8526te1 c(Class cls, AbstractC5247hu abstractC5247hu) {
            G10.g(cls, "modelClass");
            G10.g(abstractC5247hu, "extras");
            return new WM0();
        }
    }

    public static final r a(AbstractC5247hu abstractC5247hu) {
        G10.g(abstractC5247hu, "<this>");
        InterfaceC3135aN0 interfaceC3135aN0 = (InterfaceC3135aN0) abstractC5247hu.a(a);
        if (interfaceC3135aN0 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        InterfaceC0417Be1 interfaceC0417Be1 = (InterfaceC0417Be1) abstractC5247hu.a(b);
        if (interfaceC0417Be1 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) abstractC5247hu.a(c);
        String str = (String) abstractC5247hu.a(y.d.c);
        if (str != null) {
            return b(interfaceC3135aN0, interfaceC0417Be1, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    public static final r b(InterfaceC3135aN0 interfaceC3135aN0, InterfaceC0417Be1 interfaceC0417Be1, String str, Bundle bundle) {
        VM0 vm0D = d(interfaceC3135aN0);
        WM0 wm0E = e(interfaceC0417Be1);
        r rVar = (r) wm0E.e().get(str);
        if (rVar != null) {
            return rVar;
        }
        r rVarA = r.f.a(vm0D.b(str), bundle);
        wm0E.e().put(str, rVarA);
        return rVarA;
    }

    public static final void c(InterfaceC3135aN0 interfaceC3135aN0) {
        G10.g(interfaceC3135aN0, "<this>");
        g.b bVarB = interfaceC3135aN0.w().b();
        if (bVarB != g.b.INITIALIZED && bVarB != g.b.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (interfaceC3135aN0.p().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            VM0 vm0 = new VM0(interfaceC3135aN0.p(), (InterfaceC0417Be1) interfaceC3135aN0);
            interfaceC3135aN0.p().h("androidx.lifecycle.internal.SavedStateHandlesProvider", vm0);
            interfaceC3135aN0.w().a(new s(vm0));
        }
    }

    public static final VM0 d(InterfaceC3135aN0 interfaceC3135aN0) {
        G10.g(interfaceC3135aN0, "<this>");
        YM0.c cVarC = interfaceC3135aN0.p().c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        VM0 vm0 = cVarC instanceof VM0 ? (VM0) cVarC : null;
        if (vm0 != null) {
            return vm0;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final WM0 e(InterfaceC0417Be1 interfaceC0417Be1) {
        G10.g(interfaceC0417Be1, "<this>");
        return (WM0) new y(interfaceC0417Be1, new d()).c("androidx.lifecycle.internal.SavedStateHandlesVM", WM0.class);
    }
}
