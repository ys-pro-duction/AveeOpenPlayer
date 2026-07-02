package com.daaw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: renamed from: com.daaw.ru1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8048ru1 implements InterfaceC4691fu1 {
    public final Map a = new HashMap();
    public final C1525Lt1 b;
    public final BlockingQueue c;
    public final C2067Qt1 d;

    public C8048ru1(C1525Lt1 c1525Lt1, BlockingQueue blockingQueue, C2067Qt1 c2067Qt1) {
        this.d = c2067Qt1;
        this.b = c1525Lt1;
        this.c = blockingQueue;
    }

    @Override // com.daaw.InterfaceC4691fu1
    public final void a(AbstractC4970gu1 abstractC4970gu1, C6096ku1 c6096ku1) {
        List list;
        C1214It1 c1214It1 = c6096ku1.b;
        if (c1214It1 == null || c1214It1.a(System.currentTimeMillis())) {
            zza(abstractC4970gu1);
            return;
        }
        String strZzj = abstractC4970gu1.zzj();
        synchronized (this) {
            list = (List) this.a.remove(strZzj);
        }
        if (list != null) {
            if (AbstractC7770qu1.a) {
                AbstractC7770qu1.d("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), strZzj);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.d.b((AbstractC4970gu1) it.next(), c6096ku1, null);
            }
        }
    }

    public final synchronized boolean b(AbstractC4970gu1 abstractC4970gu1) {
        try {
            Map map = this.a;
            String strZzj = abstractC4970gu1.zzj();
            if (!map.containsKey(strZzj)) {
                this.a.put(strZzj, null);
                abstractC4970gu1.n(this);
                if (AbstractC7770qu1.a) {
                    AbstractC7770qu1.a("new request, sending to network %s", strZzj);
                }
                return false;
            }
            List arrayList = (List) this.a.get(strZzj);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            abstractC4970gu1.zzm("waiting-for-response");
            arrayList.add(abstractC4970gu1);
            this.a.put(strZzj, arrayList);
            if (AbstractC7770qu1.a) {
                AbstractC7770qu1.a("Request for cacheKey=%s is in flight, putting on hold.", strZzj);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.daaw.InterfaceC4691fu1
    public final synchronized void zza(AbstractC4970gu1 abstractC4970gu1) {
        try {
            Map map = this.a;
            String strZzj = abstractC4970gu1.zzj();
            List list = (List) map.remove(strZzj);
            if (list == null || list.isEmpty()) {
                return;
            }
            if (AbstractC7770qu1.a) {
                AbstractC7770qu1.d("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), strZzj);
            }
            AbstractC4970gu1 abstractC4970gu12 = (AbstractC4970gu1) list.remove(0);
            this.a.put(strZzj, list);
            abstractC4970gu12.n(this);
            try {
                this.c.put(abstractC4970gu12);
            } catch (InterruptedException e) {
                AbstractC7770qu1.b("Couldn't add request to queue. %s", e.toString());
                Thread.currentThread().interrupt();
                this.b.b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
