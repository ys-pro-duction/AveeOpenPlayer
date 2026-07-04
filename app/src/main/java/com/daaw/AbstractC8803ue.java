package com.daaw;

import java.util.Queue;

/* JADX INFO: renamed from: com.daaw.ue, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8803ue {
    public final Queue a = AbstractC6559mb1.d(20);

    public abstract InterfaceC0813Ex0 a();

    public InterfaceC0813Ex0 b() {
        InterfaceC0813Ex0 interfaceC0813Ex0 = (InterfaceC0813Ex0) this.a.poll();
        return interfaceC0813Ex0 == null ? a() : interfaceC0813Ex0;
    }

    public void c(InterfaceC0813Ex0 interfaceC0813Ex0) {
        if (this.a.size() < 20) {
            this.a.offer(interfaceC0813Ex0);
        }
    }
}
