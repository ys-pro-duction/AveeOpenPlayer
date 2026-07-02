package com.daaw;

/* JADX INFO: renamed from: com.daaw.wc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C9359wc0 implements InterfaceC9080vc0 {
    public final C10129zM a;
    public final C6736nC0 b;
    public final C8509tb c;

    public C9359wc0(C10129zM c10129zM, C6736nC0 c6736nC0, C8509tb c8509tb) {
        this.a = c10129zM;
        this.b = c6736nC0;
        this.c = c8509tb;
    }

    @Override // com.daaw.InterfaceC9080vc0
    public void remove() {
        this.c.c();
        this.a.m(this.b);
    }
}
