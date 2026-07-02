package com.daaw;

import android.content.Context;
import com.daaw.C2756Xj0;

/* JADX INFO: renamed from: com.daaw.qM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7612qM {
    public static final C2756Xj0.g g;
    public static final C2756Xj0.g h;
    public static final C2756Xj0.g i;
    public static volatile String j;
    public final C9632xb a;
    public final AbstractC5806ju b;
    public final AbstractC5806ju c;
    public final C6807nU d;
    public final String e;
    public final InterfaceC7086oU f;

    /* JADX INFO: renamed from: com.daaw.qM$a */
    public class a extends AbstractC5941kP {
        public final /* synthetic */ AbstractC1699Nl[] a;
        public final /* synthetic */ AbstractC6963o11 b;

        public a(AbstractC1699Nl[] abstractC1699NlArr, AbstractC6963o11 abstractC6963o11) {
            this.a = abstractC1699NlArr;
            this.b = abstractC6963o11;
        }

        @Override // com.daaw.AbstractC5941kP, com.daaw.AbstractC3839ct0, com.daaw.AbstractC1699Nl
        public void b() {
            if (this.a[0] == null) {
                this.b.e(C7612qM.this.a.j(), new InterfaceC0464Bq0() { // from class: com.daaw.pM
                    @Override // com.daaw.InterfaceC0464Bq0
                    public final void onSuccess(Object obj) {
                        ((AbstractC1699Nl) obj).b();
                    }
                });
            } else {
                super.b();
            }
        }

        @Override // com.daaw.AbstractC5941kP, com.daaw.AbstractC3839ct0
        public AbstractC1699Nl f() {
            AbstractC6557mb.d(this.a[0] != null, "ClientCall used before onOpen() callback", new Object[0]);
            return this.a[0];
        }
    }

    static {
        C2756Xj0.d dVar = C2756Xj0.e;
        g = C2756Xj0.g.e("x-goog-api-client", dVar);
        h = C2756Xj0.g.e("google-cloud-resource-prefix", dVar);
        i = C2756Xj0.g.e("x-goog-request-params", dVar);
        j = "gl-java/";
    }

    public C7612qM(C9632xb c9632xb, Context context, AbstractC5806ju abstractC5806ju, AbstractC5806ju abstractC5806ju2, C4129dw c4129dw, InterfaceC7086oU interfaceC7086oU) {
        this.a = c9632xb;
        this.f = interfaceC7086oU;
        this.b = abstractC5806ju;
        this.c = abstractC5806ju2;
        this.d = new C6807nU(c9632xb, context, c4129dw, new C6496mM(abstractC5806ju, abstractC5806ju2));
        C3851cw c3851cwA = c4129dw.a();
        this.e = String.format("projects/%s/databases/%s", c3851cwA.k(), c3851cwA.h());
    }

    public static /* synthetic */ void a(C7612qM c7612qM, AbstractC1699Nl[] abstractC1699NlArr, InterfaceC4585fZ interfaceC4585fZ, AbstractC6963o11 abstractC6963o11) {
        c7612qM.getClass();
        AbstractC1699Nl abstractC1699Nl = (AbstractC1699Nl) abstractC6963o11.k();
        abstractC1699NlArr[0] = abstractC1699Nl;
        abstractC1699Nl.e(new C7054oM(c7612qM, interfaceC4585fZ, abstractC1699NlArr), c7612qM.e());
        interfaceC4585fZ.a();
        abstractC1699NlArr[0].c(1);
    }

    public static void g(String str) {
        j = str;
    }

    public final String c() {
        return String.format("%s fire/%s grpc/", j, "24.6.1");
    }

    public void d() {
        this.b.b();
        this.c.b();
    }

    public final C2756Xj0 e() {
        C2756Xj0 c2756Xj0 = new C2756Xj0();
        c2756Xj0.p(g, c());
        c2756Xj0.p(h, this.e);
        c2756Xj0.p(i, this.e);
        InterfaceC7086oU interfaceC7086oU = this.f;
        if (interfaceC7086oU != null) {
            interfaceC7086oU.a(c2756Xj0);
        }
        return c2756Xj0;
    }

    public AbstractC1699Nl f(C6882nk0 c6882nk0, final InterfaceC4585fZ interfaceC4585fZ) {
        final AbstractC1699Nl[] abstractC1699NlArr = {null};
        AbstractC6963o11 abstractC6963o11I = this.d.i(c6882nk0);
        abstractC6963o11I.c(this.a.j(), new InterfaceC5228hq0() { // from class: com.daaw.nM
            @Override // com.daaw.InterfaceC5228hq0
            public final void a(AbstractC6963o11 abstractC6963o11) {
                C7612qM.a(this.a, abstractC1699NlArr, interfaceC4585fZ, abstractC6963o11);
            }
        });
        return new a(abstractC1699NlArr, abstractC6963o11I);
    }
}
