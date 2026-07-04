package com.daaw;

import com.daaw.C1296Jo;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.daaw.Jo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1296Jo implements InterfaceC8295so, InterfaceC10255zo {
    public static final InterfaceC7569qB0 h = new InterfaceC7569qB0() { // from class: com.daaw.Fo
        @Override // com.daaw.InterfaceC7569qB0
        public final Object get() {
            return Collections.EMPTY_SET;
        }
    };
    public final Map a;
    public final Map b;
    public final Map c;
    public final List d;
    public final IH e;
    public final AtomicReference f;
    public final InterfaceC0776Eo g;

    /* JADX INFO: renamed from: com.daaw.Jo$b */
    public static final class b {
        public final Executor a;
        public final List b = new ArrayList();
        public final List c = new ArrayList();
        public InterfaceC0776Eo d = InterfaceC0776Eo.a;

        public b(Executor executor) {
            this.a = executor;
        }

        public static /* synthetic */ ComponentRegistrar a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        public b b(C3535bo c3535bo) {
            this.c.add(c3535bo);
            return this;
        }

        public b c(final ComponentRegistrar componentRegistrar) {
            this.b.add(new InterfaceC7569qB0() { // from class: com.daaw.Ko
                @Override // com.daaw.InterfaceC7569qB0
                public final Object get() {
                    return C1296Jo.b.a(componentRegistrar);
                }
            });
            return this;
        }

        public b d(Collection collection) {
            this.b.addAll(collection);
            return this;
        }

        public C1296Jo e() {
            return new C1296Jo(this.a, this.b, this.c, this.d);
        }

        public b f(InterfaceC0776Eo interfaceC0776Eo) {
            this.d = interfaceC0776Eo;
            return this;
        }
    }

    public static /* synthetic */ Object j(C1296Jo c1296Jo, C3535bo c3535bo) {
        c1296Jo.getClass();
        return c3535bo.h().a(new C3676cJ0(c3535bo, c1296Jo));
    }

    public static b m(Executor executor) {
        return new b(executor);
    }

    public static List q(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    @Override // com.daaw.InterfaceC8295so
    public /* synthetic */ Object a(Class cls) {
        return AbstractC8016ro.b(this, cls);
    }

    @Override // com.daaw.InterfaceC8295so
    public synchronized InterfaceC7569qB0 b(C4205eC0 c4205eC0) {
        C5432ib0 c5432ib0 = (C5432ib0) this.c.get(c4205eC0);
        if (c5432ib0 != null) {
            return c5432ib0;
        }
        return h;
    }

    @Override // com.daaw.InterfaceC8295so
    public /* synthetic */ Object c(C4205eC0 c4205eC0) {
        return AbstractC8016ro.a(this, c4205eC0);
    }

    @Override // com.daaw.InterfaceC8295so
    public /* synthetic */ InterfaceC7569qB0 d(Class cls) {
        return AbstractC8016ro.d(this, cls);
    }

    @Override // com.daaw.InterfaceC8295so
    public /* synthetic */ Set e(C4205eC0 c4205eC0) {
        return AbstractC8016ro.e(this, c4205eC0);
    }

    @Override // com.daaw.InterfaceC8295so
    public /* synthetic */ Set f(Class cls) {
        return AbstractC8016ro.f(this, cls);
    }

    @Override // com.daaw.InterfaceC8295so
    public synchronized InterfaceC7569qB0 g(C4205eC0 c4205eC0) {
        AbstractC8063ry0.c(c4205eC0, "Null interface requested.");
        return (InterfaceC7569qB0) this.b.get(c4205eC0);
    }

    @Override // com.daaw.InterfaceC8295so
    public InterfaceC7784qy h(C4205eC0 c4205eC0) {
        InterfaceC7569qB0 interfaceC7569qB0G = g(c4205eC0);
        return interfaceC7569qB0G == null ? C3829cr0.e() : interfaceC7569qB0G instanceof C3829cr0 ? (C3829cr0) interfaceC7569qB0G : C3829cr0.f(interfaceC7569qB0G);
    }

    @Override // com.daaw.InterfaceC8295so
    public /* synthetic */ InterfaceC7784qy i(Class cls) {
        return AbstractC8016ro.c(this, cls);
    }

    public final void n(List list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((InterfaceC7569qB0) it.next()).get();
                    if (componentRegistrar != null) {
                        list.addAll(this.g.a(componentRegistrar));
                        it.remove();
                    }
                } catch (R10 unused) {
                    it.remove();
                }
            }
            if (this.a.isEmpty()) {
                AbstractC0379Av.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.a.keySet());
                arrayList2.addAll(list);
                AbstractC0379Av.a(arrayList2);
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                final C3535bo c3535bo = (C3535bo) it2.next();
                this.a.put(c3535bo, new P90(new InterfaceC7569qB0() { // from class: com.daaw.Go
                    @Override // com.daaw.InterfaceC7569qB0
                    public final Object get() {
                        return C1296Jo.j(this.a, c3535bo);
                    }
                }));
            }
            arrayList.addAll(t(list));
            arrayList.addAll(u());
            s();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((Runnable) it3.next()).run();
        }
        r();
    }

    public final void o(Map map, boolean z) {
        for (Map.Entry entry : map.entrySet()) {
            C3535bo c3535bo = (C3535bo) entry.getKey();
            InterfaceC7569qB0 interfaceC7569qB0 = (InterfaceC7569qB0) entry.getValue();
            if (c3535bo.n() || (c3535bo.o() && z)) {
                interfaceC7569qB0.get();
            }
        }
        this.e.c();
    }

    public void p(boolean z) {
        HashMap map;
        if (AbstractC0552Cm0.a(this.f, null, Boolean.valueOf(z))) {
            synchronized (this) {
                map = new HashMap(this.a);
            }
            o(map, z);
        }
    }

    public final void r() {
        Boolean bool = (Boolean) this.f.get();
        if (bool != null) {
            o(this.a, bool.booleanValue());
        }
    }

    public final void s() {
        for (C3535bo c3535bo : this.a.keySet()) {
            for (C6114kz c6114kz : c3535bo.g()) {
                if (c6114kz.g() && !this.c.containsKey(c6114kz.c())) {
                    this.c.put(c6114kz.c(), C5432ib0.b(Collections.EMPTY_SET));
                } else if (this.b.containsKey(c6114kz.c())) {
                    continue;
                } else {
                    if (c6114kz.f()) {
                        throw new C9957yk0(String.format("Unsatisfied dependency for component %s: %s", c3535bo, c6114kz.c()));
                    }
                    if (!c6114kz.g()) {
                        this.b.put(c6114kz.c(), C3829cr0.e());
                    }
                }
            }
        }
    }

    public final List t(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3535bo c3535bo = (C3535bo) it.next();
            if (c3535bo.p()) {
                final InterfaceC7569qB0 interfaceC7569qB0 = (InterfaceC7569qB0) this.a.get(c3535bo);
                for (C4205eC0 c4205eC0 : c3535bo.j()) {
                    if (this.b.containsKey(c4205eC0)) {
                        final C3829cr0 c3829cr0 = (C3829cr0) ((InterfaceC7569qB0) this.b.get(c4205eC0));
                        arrayList.add(new Runnable() { // from class: com.daaw.Ho
                            @Override // java.lang.Runnable
                            public final void run() {
                                c3829cr0.g(interfaceC7569qB0);
                            }
                        });
                    } else {
                        this.b.put(c4205eC0, interfaceC7569qB0);
                    }
                }
            }
        }
        return arrayList;
    }

    public final List u() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.a.entrySet()) {
            C3535bo c3535bo = (C3535bo) entry.getKey();
            if (!c3535bo.p()) {
                InterfaceC7569qB0 interfaceC7569qB0 = (InterfaceC7569qB0) entry.getValue();
                for (C4205eC0 c4205eC0 : c3535bo.j()) {
                    if (!map.containsKey(c4205eC0)) {
                        map.put(c4205eC0, new HashSet());
                    }
                    ((Set) map.get(c4205eC0)).add(interfaceC7569qB0);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.c.containsKey(entry2.getKey())) {
                final C5432ib0 c5432ib0 = (C5432ib0) this.c.get(entry2.getKey());
                for (final InterfaceC7569qB0 interfaceC7569qB02 : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: com.daaw.Io
                        @Override // java.lang.Runnable
                        public final void run() {
                            c5432ib0.a(interfaceC7569qB02);
                        }
                    });
                }
            } else {
                this.c.put((C4205eC0) entry2.getKey(), C5432ib0.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    public C1296Jo(Executor executor, Iterable iterable, Collection collection, InterfaceC0776Eo interfaceC0776Eo) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.f = new AtomicReference();
        IH ih = new IH(executor);
        this.e = ih;
        this.g = interfaceC0776Eo;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C3535bo.q(ih, IH.class, InterfaceC3740cZ0.class, InterfaceC9528xB0.class));
        arrayList.add(C3535bo.q(this, InterfaceC10255zo.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C3535bo c3535bo = (C3535bo) it.next();
            if (c3535bo != null) {
                arrayList.add(c3535bo);
            }
        }
        this.d = q(iterable);
        n(arrayList);
    }
}
