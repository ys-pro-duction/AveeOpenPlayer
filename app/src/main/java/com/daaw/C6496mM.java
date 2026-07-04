package com.daaw;

import com.daaw.AbstractC0960Gi;
import com.daaw.C2756Xj0;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.mM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6496mM extends AbstractC0960Gi {
    public static final C2756Xj0.g c;
    public static final C2756Xj0.g d;
    public final AbstractC5806ju a;
    public final AbstractC5806ju b;

    static {
        C2756Xj0.d dVar = C2756Xj0.e;
        c = C2756Xj0.g.e("Authorization", dVar);
        d = C2756Xj0.g.e("x-firebase-appcheck", dVar);
    }

    public C6496mM(AbstractC5806ju abstractC5806ju, AbstractC5806ju abstractC5806ju2) {
        this.a = abstractC5806ju;
        this.b = abstractC5806ju2;
    }

    public static /* synthetic */ void b(AbstractC6963o11 abstractC6963o11, AbstractC0960Gi.a aVar, AbstractC6963o11 abstractC6963o112, AbstractC6963o11 abstractC6963o113) {
        C2756Xj0 c2756Xj0 = new C2756Xj0();
        if (abstractC6963o11.n()) {
            String str = (String) abstractC6963o11.k();
            AbstractC2212Sd0.a("FirestoreCallCredentials", "Successfully fetched auth token.", new Object[0]);
            if (str != null) {
                c2756Xj0.p(c, "Bearer " + str);
            }
        } else {
            Exception excJ = abstractC6963o11.j();
            if (!(excJ instanceof C6213lL)) {
                AbstractC2212Sd0.d("FirestoreCallCredentials", "Failed to get auth token: %s.", excJ);
                aVar.b(C6262lX0.n.p(excJ));
                return;
            }
            AbstractC2212Sd0.a("FirestoreCallCredentials", "Firebase Auth API not available, not using authentication.", new Object[0]);
        }
        if (abstractC6963o112.n()) {
            String str2 = (String) abstractC6963o112.k();
            if (str2 != null && !str2.isEmpty()) {
                AbstractC2212Sd0.a("FirestoreCallCredentials", "Successfully fetched AppCheck token.", new Object[0]);
                c2756Xj0.p(d, str2);
            }
        } else {
            Exception excJ2 = abstractC6963o112.j();
            if (!(excJ2 instanceof C6213lL)) {
                AbstractC2212Sd0.d("FirestoreCallCredentials", "Failed to get AppCheck token: %s.", excJ2);
                aVar.b(C6262lX0.n.p(excJ2));
                return;
            }
            AbstractC2212Sd0.a("FirestoreCallCredentials", "Firebase AppCheck API not available.", new Object[0]);
        }
        aVar.a(c2756Xj0);
    }

    @Override // com.daaw.AbstractC0960Gi
    public void a(AbstractC0960Gi.b bVar, Executor executor, final AbstractC0960Gi.a aVar) {
        final AbstractC6963o11 abstractC6963o11A = this.a.a();
        final AbstractC6963o11 abstractC6963o11A2 = this.b.a();
        A11.g(abstractC6963o11A, abstractC6963o11A2).c(EI.b, new InterfaceC5228hq0() { // from class: com.daaw.lM
            @Override // com.daaw.InterfaceC5228hq0
            public final void a(AbstractC6963o11 abstractC6963o11) {
                C6496mM.b(abstractC6963o11A, aVar, abstractC6963o11A2, abstractC6963o11);
            }
        });
    }
}
