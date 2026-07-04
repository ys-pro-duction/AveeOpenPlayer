package com.daaw;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: com.daaw.us, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8873us {
    public final Set a = new CopyOnWriteArraySet();
    public volatile Context b;

    public final void a(InterfaceC6075kq0 interfaceC6075kq0) {
        G10.g(interfaceC6075kq0, "listener");
        Context context = this.b;
        if (context != null) {
            interfaceC6075kq0.a(context);
        }
        this.a.add(interfaceC6075kq0);
    }

    public final void b() {
        this.b = null;
    }

    public final void c(Context context) {
        G10.g(context, "context");
        this.b = context;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((InterfaceC6075kq0) it.next()).a(context);
        }
    }
}
