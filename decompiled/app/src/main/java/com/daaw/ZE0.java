package com.daaw;

import android.os.Bundle;
import androidx.lifecycle.g;
import com.daaw.YM0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ZE0 implements androidx.lifecycle.j {
    public static final a C = new a(null);
    public final InterfaceC3135aN0 B;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    public static final class b implements YM0.c {
        public final Set a;

        public b(YM0 ym0) {
            G10.g(ym0, "registry");
            this.a = new LinkedHashSet();
            ym0.h("androidx.savedstate.Restarter", this);
        }

        @Override // com.daaw.YM0.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.a));
            return bundle;
        }

        public final void b(String str) {
            G10.g(str, "className");
            this.a.add(str);
        }
    }

    public ZE0(InterfaceC3135aN0 interfaceC3135aN0) {
        G10.g(interfaceC3135aN0, "owner");
        this.B = interfaceC3135aN0;
    }

    public final void a(String str) {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str, false, ZE0.class.getClassLoader()).asSubclass(YM0.a.class);
            G10.f(clsAsSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                try {
                    Object objNewInstance = declaredConstructor.newInstance(null);
                    G10.f(objNewInstance, "{\n                constr…wInstance()\n            }");
                    ((YM0.a) objNewInstance).a(this.B);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to instantiate " + str, e);
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Class " + str + " wasn't found", e3);
        }
    }

    @Override // androidx.lifecycle.j
    public void c(InterfaceC1764Ob0 interfaceC1764Ob0, g.a aVar) {
        G10.g(interfaceC1764Ob0, "source");
        G10.g(aVar, "event");
        if (aVar != g.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        interfaceC1764Ob0.w().d(this);
        Bundle bundleB = this.B.p().b("androidx.savedstate.Restarter");
        if (bundleB == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleB.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }
}
