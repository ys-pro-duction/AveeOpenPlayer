package com.daaw;

import java.util.Map;

/* JADX INFO: renamed from: com.daaw.dh2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4060dh2 implements InterfaceC6244lS2 {
    public final /* synthetic */ String a = "sendMessageToNativeJs";
    public final /* synthetic */ Map b;

    public C4060dh2(C6023kh2 c6023kh2, String str, Map map) {
        this.b = map;
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((InterfaceC9334wW1) obj).U(this.a, this.b);
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final void b(Throwable th) {
    }
}
