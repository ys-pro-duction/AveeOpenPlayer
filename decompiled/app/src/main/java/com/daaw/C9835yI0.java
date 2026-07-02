package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.daaw.yI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9835yI0 {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    public final List b = new ArrayList();
    public boolean c;

    public void a() {
        Iterator it = AbstractC6559mb1.h(this.a).iterator();
        while (it.hasNext()) {
            ((InterfaceC7039oI0) it.next()).clear();
        }
        this.b.clear();
    }

    public void b() {
        this.c = true;
        for (InterfaceC7039oI0 interfaceC7039oI0 : AbstractC6559mb1.h(this.a)) {
            if (interfaceC7039oI0.isRunning()) {
                interfaceC7039oI0.b();
                this.b.add(interfaceC7039oI0);
            }
        }
    }

    public void c(InterfaceC7039oI0 interfaceC7039oI0) {
        this.a.remove(interfaceC7039oI0);
        this.b.remove(interfaceC7039oI0);
    }

    public void d() {
        for (InterfaceC7039oI0 interfaceC7039oI0 : AbstractC6559mb1.h(this.a)) {
            if (!interfaceC7039oI0.i() && !interfaceC7039oI0.isCancelled()) {
                interfaceC7039oI0.b();
                if (this.c) {
                    this.b.add(interfaceC7039oI0);
                } else {
                    interfaceC7039oI0.g();
                }
            }
        }
    }

    public void e() {
        this.c = false;
        for (InterfaceC7039oI0 interfaceC7039oI0 : AbstractC6559mb1.h(this.a)) {
            if (!interfaceC7039oI0.i() && !interfaceC7039oI0.isCancelled() && !interfaceC7039oI0.isRunning()) {
                interfaceC7039oI0.g();
            }
        }
        this.b.clear();
    }

    public void f(InterfaceC7039oI0 interfaceC7039oI0) {
        this.a.add(interfaceC7039oI0);
        if (this.c) {
            this.b.add(interfaceC7039oI0);
        } else {
            interfaceC7039oI0.g();
        }
    }
}
