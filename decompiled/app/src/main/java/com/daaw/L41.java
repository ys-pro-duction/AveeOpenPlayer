package com.daaw;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class L41 extends AbstractC8651u41 {
    public final TopicsManager b;

    public static final class a extends AbstractC1623Ms {
        public Object E;
        public /* synthetic */ Object F;
        public int H;

        public a(InterfaceC1416Ks interfaceC1416Ks) {
            super(interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) {
            this.F = obj;
            this.H |= Integer.MIN_VALUE;
            return L41.e(L41.this, null, this);
        }
    }

    public L41(TopicsManager topicsManager) {
        G10.g(topicsManager, "mTopicsManager");
        this.b = topicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object e(com.daaw.L41 r4, com.daaw.C9595xS r5, com.daaw.InterfaceC1416Ks r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof com.daaw.L41.a
            if (r0 == 0) goto L13
            r0 = r6
            com.daaw.L41$a r0 = (com.daaw.L41.a) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            com.daaw.L41$a r0 = new com.daaw.L41$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.F
            java.lang.Object r1 = com.daaw.I10.c()
            int r2 = r0.H
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.E
            com.daaw.L41 r4 = (com.daaw.L41) r4
            com.daaw.AbstractC4801gJ0.b(r6)
            goto L47
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            com.daaw.AbstractC4801gJ0.b(r6)
            android.adservices.topics.GetTopicsRequest r5 = r4.c(r5)
            r0.E = r4
            r0.H = r3
            java.lang.Object r6 = r4.f(r5, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            android.adservices.topics.GetTopicsResponse r5 = com.daaw.E41.a(r6)
            com.daaw.yS r4 = r4.d(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.L41.e(com.daaw.L41, com.daaw.xS, com.daaw.Ks):java.lang.Object");
    }

    @Override // com.daaw.AbstractC8651u41
    public Object a(C9595xS c9595xS, InterfaceC1416Ks interfaceC1416Ks) {
        return e(this, c9595xS, interfaceC1416Ks);
    }

    public GetTopicsRequest c(C9595xS c9595xS) {
        G10.g(c9595xS, "request");
        GetTopicsRequest getTopicsRequestBuild = AbstractC9774y41.a().setAdsSdkName(c9595xS.a()).build();
        G10.f(getTopicsRequestBuild, "Builder()\n            .s…ame)\n            .build()");
        return getTopicsRequestBuild;
    }

    public final C9874yS d(GetTopicsResponse getTopicsResponse) {
        G10.g(getTopicsResponse, "response");
        ArrayList arrayList = new ArrayList();
        Iterator it = getTopicsResponse.getTopics().iterator();
        while (it.hasNext()) {
            Topic topicA = G41.a(it.next());
            arrayList.add(new C8372t41(topicA.getTaxonomyVersion(), topicA.getModelVersion(), topicA.getTopicId()));
        }
        return new C9874yS(arrayList);
    }

    public final Object f(GetTopicsRequest getTopicsRequest, InterfaceC1416Ks interfaceC1416Ks) {
        C4067dj c4067dj = new C4067dj(H10.b(interfaceC1416Ks), 1);
        c4067dj.y();
        this.b.getTopics(getTopicsRequest, new ExecutorC2748Xh0(), AbstractC7475pr0.a(c4067dj));
        Object objU = c4067dj.u();
        if (objU == I10.c()) {
            AbstractC7497pw.c(interfaceC1416Ks);
        }
        return objU;
    }
}
