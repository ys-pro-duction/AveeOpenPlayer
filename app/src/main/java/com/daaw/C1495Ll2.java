package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ll2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1495Ll2 implements InterfaceC6244lS2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ BinderC1702Nl2 b;

    public C1495Ll2(BinderC1702Nl2 binderC1702Nl2, String str) {
        this.b = binderC1702Nl2;
        this.a = str;
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((C4080dl2) obj).c();
        this.b.E.e(this.a);
    }

    @Override // com.daaw.InterfaceC6244lS2
    public final void b(Throwable th) {
    }
}
