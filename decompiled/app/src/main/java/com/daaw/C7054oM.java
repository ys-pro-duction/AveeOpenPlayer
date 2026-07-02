package com.daaw;

import com.daaw.AbstractC1699Nl;

/* JADX INFO: renamed from: com.daaw.oM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7054oM extends AbstractC1699Nl.a {
    public final /* synthetic */ InterfaceC4585fZ a;
    public final /* synthetic */ AbstractC1699Nl[] b;
    public final /* synthetic */ C7612qM c;

    public C7054oM(C7612qM c7612qM, InterfaceC4585fZ interfaceC4585fZ, AbstractC1699Nl[] abstractC1699NlArr) {
        this.c = c7612qM;
        this.a = interfaceC4585fZ;
        this.b = abstractC1699NlArr;
    }

    @Override // com.daaw.AbstractC1699Nl.a
    public void a(C6262lX0 c6262lX0, C2756Xj0 c2756Xj0) {
        try {
            this.a.b(c6262lX0);
        } catch (Throwable th) {
            this.c.a.l(th);
        }
    }

    @Override // com.daaw.AbstractC1699Nl.a
    public void b(C2756Xj0 c2756Xj0) {
        try {
            this.a.c(c2756Xj0);
        } catch (Throwable th) {
            this.c.a.l(th);
        }
    }

    @Override // com.daaw.AbstractC1699Nl.a
    public void c(Object obj) {
        try {
            this.a.d(obj);
            this.b[0].c(1);
        } catch (Throwable th) {
            this.c.a.l(th);
        }
    }

    @Override // com.daaw.AbstractC1699Nl.a
    public void d() {
    }
}
