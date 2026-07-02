package com.daaw;

/* JADX INFO: renamed from: com.daaw.r31, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C7809r31 {
    public final InterfaceC4684ft a;
    public final Object[] b;
    public final InterfaceC4731g31[] c;
    public int d;

    public C7809r31(InterfaceC4684ft interfaceC4684ft, int i) {
        this.a = interfaceC4684ft;
        this.b = new Object[i];
        this.c = new InterfaceC4731g31[i];
    }

    public final void a(InterfaceC4731g31 interfaceC4731g31, Object obj) {
        Object[] objArr = this.b;
        int i = this.d;
        objArr[i] = obj;
        InterfaceC4731g31[] interfaceC4731g31Arr = this.c;
        this.d = i + 1;
        G10.e(interfaceC4731g31, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        interfaceC4731g31Arr[i] = interfaceC4731g31;
    }

    public final void b(InterfaceC4684ft interfaceC4684ft) {
        int length = this.c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            InterfaceC4731g31 interfaceC4731g31 = this.c[length];
            G10.d(interfaceC4731g31);
            interfaceC4731g31.W(interfaceC4684ft, this.b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}
