package com.daaw;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.daaw.x2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9483x2 implements InterfaceC1141Ib0 {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    public boolean b;
    public boolean c;

    @Override // com.daaw.InterfaceC1141Ib0
    public void a(InterfaceC1556Mb0 interfaceC1556Mb0) {
        this.a.add(interfaceC1556Mb0);
        if (this.c) {
            interfaceC1556Mb0.onDestroy();
        } else if (this.b) {
            interfaceC1556Mb0.b();
        } else {
            interfaceC1556Mb0.a();
        }
    }

    public void b() {
        this.c = true;
        Iterator it = AbstractC6559mb1.h(this.a).iterator();
        while (it.hasNext()) {
            ((InterfaceC1556Mb0) it.next()).onDestroy();
        }
    }

    public void c() {
        this.b = true;
        Iterator it = AbstractC6559mb1.h(this.a).iterator();
        while (it.hasNext()) {
            ((InterfaceC1556Mb0) it.next()).b();
        }
    }

    public void d() {
        this.b = false;
        Iterator it = AbstractC6559mb1.h(this.a).iterator();
        while (it.hasNext()) {
            ((InterfaceC1556Mb0) it.next()).a();
        }
    }
}
