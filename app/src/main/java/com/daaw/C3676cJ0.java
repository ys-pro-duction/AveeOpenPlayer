package com.daaw;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.cJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3676cJ0 implements InterfaceC8295so {
    public final Set a;
    public final Set b;
    public final Set c;
    public final Set d;
    public final Set e;
    public final Set f;
    public final InterfaceC8295so g;

    /* JADX INFO: renamed from: com.daaw.cJ0$a */
    public static class a implements InterfaceC9528xB0 {
        public final Set a;
        public final InterfaceC9528xB0 b;

        public a(Set set, InterfaceC9528xB0 interfaceC9528xB0) {
            this.a = set;
            this.b = interfaceC9528xB0;
        }
    }

    public C3676cJ0(C3535bo c3535bo, InterfaceC8295so interfaceC8295so) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (C6114kz c6114kz : c3535bo.g()) {
            if (c6114kz.e()) {
                if (c6114kz.g()) {
                    hashSet4.add(c6114kz.c());
                } else {
                    hashSet.add(c6114kz.c());
                }
            } else if (c6114kz.d()) {
                hashSet3.add(c6114kz.c());
            } else if (c6114kz.g()) {
                hashSet5.add(c6114kz.c());
            } else {
                hashSet2.add(c6114kz.c());
            }
        }
        if (!c3535bo.k().isEmpty()) {
            hashSet.add(C4205eC0.b(InterfaceC9528xB0.class));
        }
        this.a = DesugarCollections.unmodifiableSet(hashSet);
        this.b = DesugarCollections.unmodifiableSet(hashSet2);
        this.c = DesugarCollections.unmodifiableSet(hashSet3);
        this.d = DesugarCollections.unmodifiableSet(hashSet4);
        this.e = DesugarCollections.unmodifiableSet(hashSet5);
        this.f = c3535bo.k();
        this.g = interfaceC8295so;
    }

    @Override // com.daaw.InterfaceC8295so
    public Object a(Class cls) {
        if (!this.a.contains(C4205eC0.b(cls))) {
            throw new C7509pz(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        Object objA = this.g.a(cls);
        return !cls.equals(InterfaceC9528xB0.class) ? objA : new a(this.f, (InterfaceC9528xB0) objA);
    }

    @Override // com.daaw.InterfaceC8295so
    public InterfaceC7569qB0 b(C4205eC0 c4205eC0) {
        if (this.e.contains(c4205eC0)) {
            return this.g.b(c4205eC0);
        }
        throw new C7509pz(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", c4205eC0));
    }

    @Override // com.daaw.InterfaceC8295so
    public Object c(C4205eC0 c4205eC0) {
        if (this.a.contains(c4205eC0)) {
            return this.g.c(c4205eC0);
        }
        throw new C7509pz(String.format("Attempting to request an undeclared dependency %s.", c4205eC0));
    }

    @Override // com.daaw.InterfaceC8295so
    public InterfaceC7569qB0 d(Class cls) {
        return g(C4205eC0.b(cls));
    }

    @Override // com.daaw.InterfaceC8295so
    public Set e(C4205eC0 c4205eC0) {
        if (this.d.contains(c4205eC0)) {
            return this.g.e(c4205eC0);
        }
        throw new C7509pz(String.format("Attempting to request an undeclared dependency Set<%s>.", c4205eC0));
    }

    @Override // com.daaw.InterfaceC8295so
    public /* synthetic */ Set f(Class cls) {
        return AbstractC8016ro.f(this, cls);
    }

    @Override // com.daaw.InterfaceC8295so
    public InterfaceC7569qB0 g(C4205eC0 c4205eC0) {
        if (this.b.contains(c4205eC0)) {
            return this.g.g(c4205eC0);
        }
        throw new C7509pz(String.format("Attempting to request an undeclared dependency Provider<%s>.", c4205eC0));
    }

    @Override // com.daaw.InterfaceC8295so
    public InterfaceC7784qy h(C4205eC0 c4205eC0) {
        if (this.c.contains(c4205eC0)) {
            return this.g.h(c4205eC0);
        }
        throw new C7509pz(String.format("Attempting to request an undeclared dependency Deferred<%s>.", c4205eC0));
    }

    @Override // com.daaw.InterfaceC8295so
    public InterfaceC7784qy i(Class cls) {
        return h(C4205eC0.b(cls));
    }
}
