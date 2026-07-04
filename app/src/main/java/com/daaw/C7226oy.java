package com.daaw;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.oy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7226oy implements InterfaceC0826Fa1 {
    public final String a;
    public final C5678jT b;

    public C7226oy(Set set, C5678jT c5678jT) {
        this.a = d(set);
        this.b = c5678jT;
    }

    public static /* synthetic */ InterfaceC0826Fa1 b(InterfaceC8295so interfaceC8295so) {
        return new C7226oy(interfaceC8295so.f(AbstractC0725Eb0.class), C5678jT.a());
    }

    public static C3535bo c() {
        return C3535bo.e(InterfaceC0826Fa1.class).b(C6114kz.m(AbstractC0725Eb0.class)).f(new InterfaceC9976yo() { // from class: com.daaw.ny
            @Override // com.daaw.InterfaceC9976yo
            public final Object a(InterfaceC8295so interfaceC8295so) {
                return C7226oy.b(interfaceC8295so);
            }
        }).d();
    }

    public static String d(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AbstractC0725Eb0 abstractC0725Eb0 = (AbstractC0725Eb0) it.next();
            sb.append(abstractC0725Eb0.b());
            sb.append('/');
            sb.append(abstractC0725Eb0.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // com.daaw.InterfaceC0826Fa1
    public String a() {
        if (this.b.b().isEmpty()) {
            return this.a;
        }
        return this.a + ' ' + d(this.b.b());
    }
}
