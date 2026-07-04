package com.daaw;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.ib0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5432ib0 implements InterfaceC7569qB0 {
    public volatile Set b = null;
    public volatile Set a = Collections.newSetFromMap(new ConcurrentHashMap());

    public C5432ib0(Collection collection) {
        this.a.addAll(collection);
    }

    public static C5432ib0 b(Collection collection) {
        return new C5432ib0((Set) collection);
    }

    public synchronized void a(InterfaceC7569qB0 interfaceC7569qB0) {
        try {
            if (this.b == null) {
                this.a.add(interfaceC7569qB0);
            } else {
                this.b.add(interfaceC7569qB0.get());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.daaw.InterfaceC7569qB0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set get() {
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        this.b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } finally {
                }
            }
        }
        return DesugarCollections.unmodifiableSet(this.b);
    }

    public final synchronized void d() {
        try {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                this.b.add(((InterfaceC7569qB0) it.next()).get());
            }
            this.a = null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
