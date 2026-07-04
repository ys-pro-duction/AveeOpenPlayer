package com.daaw;

import android.os.Bundle;
import androidx.lifecycle.g;
import com.daaw.FM0;
import com.daaw.ZE0;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class YM0 {
    public static final b g = new b(null);
    public boolean b;
    public Bundle c;
    public boolean d;
    public ZE0.b e;
    public final FM0 a = new FM0();
    public boolean f = true;

    public interface a {
        void a(InterfaceC3135aN0 interfaceC3135aN0);
    }

    public static final class b {
        public /* synthetic */ b(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public b() {
        }
    }

    public interface c {
        Bundle a();
    }

    public static final void d(YM0 ym0, InterfaceC1764Ob0 interfaceC1764Ob0, g.a aVar) {
        G10.g(ym0, "this$0");
        G10.g(interfaceC1764Ob0, "<anonymous parameter 0>");
        G10.g(aVar, "event");
        if (aVar == g.a.ON_START) {
            ym0.f = true;
        } else if (aVar == g.a.ON_STOP) {
            ym0.f = false;
        }
    }

    public final Bundle b(String str) {
        G10.g(str, SubscriberAttributeKt.JSON_NAME_KEY);
        if (!this.d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.c;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.c = null;
        return bundle2;
    }

    public final c c(String str) {
        G10.g(str, SubscriberAttributeKt.JSON_NAME_KEY);
        for (Map.Entry entry : this.a) {
            G10.f(entry, "components");
            String str2 = (String) entry.getKey();
            c cVar = (c) entry.getValue();
            if (G10.c(str2, str)) {
                return cVar;
            }
        }
        return null;
    }

    public final void e(androidx.lifecycle.g gVar) {
        G10.g(gVar, "lifecycle");
        if (this.b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        gVar.a(new androidx.lifecycle.j() { // from class: com.daaw.XM0
            @Override // androidx.lifecycle.j
            public final void c(InterfaceC1764Ob0 interfaceC1764Ob0, g.a aVar) {
                YM0.d(this.B, interfaceC1764Ob0, aVar);
            }
        });
        this.b = true;
    }

    public final void f(Bundle bundle) {
        if (!this.b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (this.d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        this.c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.d = true;
    }

    public final void g(Bundle bundle) {
        G10.g(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        FM0.d dVarP = this.a.p();
        G10.f(dVarP, "this.components.iteratorWithAdditions()");
        while (dVarP.hasNext()) {
            Map.Entry entry = (Map.Entry) dVarP.next();
            bundle2.putBundle((String) entry.getKey(), ((c) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public final void h(String str, c cVar) {
        G10.g(str, SubscriberAttributeKt.JSON_NAME_KEY);
        G10.g(cVar, "provider");
        if (((c) this.a.v(str, cVar)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void i(Class cls) {
        G10.g(cls, "clazz");
        if (!this.f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        ZE0.b bVar = this.e;
        if (bVar == null) {
            bVar = new ZE0.b(this);
        }
        this.e = bVar;
        try {
            cls.getDeclaredConstructor(null);
            ZE0.b bVar2 = this.e;
            if (bVar2 != null) {
                String name = cls.getName();
                G10.f(name, "clazz.name");
                bVar2.b(name);
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public final void j(String str) {
        G10.g(str, SubscriberAttributeKt.JSON_NAME_KEY);
        this.a.w(str);
    }
}
