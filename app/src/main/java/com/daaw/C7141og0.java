package com.daaw;

import com.daaw.AbstractC0304Ac0;
import com.daaw.AbstractC5278i10;
import com.daaw.AbstractC5636jJ0;
import com.daaw.C1168Ii;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.og0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7141og0 {
    public final b a;
    public final Map b;
    public final Map c;
    public final AbstractC5636jJ0.C d;
    public final Object e;
    public final Map f;

    /* JADX INFO: renamed from: com.daaw.og0$b */
    public static final class b {
        public static final C1168Ii.c g = C1168Ii.c.b("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo");
        public final Long a;
        public final Boolean b;
        public final Integer c;
        public final Integer d;
        public final C6485mJ0 e;
        public final LV f;

        public b(Map map, boolean z, int i, int i2) {
            this.a = AbstractC3983dQ0.w(map);
            this.b = AbstractC3983dQ0.x(map);
            Integer numL = AbstractC3983dQ0.l(map);
            this.c = numL;
            if (numL != null) {
                AbstractC7785qy0.j(numL.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", numL);
            }
            Integer numK = AbstractC3983dQ0.k(map);
            this.d = numK;
            if (numK != null) {
                AbstractC7785qy0.j(numK.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", numK);
            }
            Map mapR = z ? AbstractC3983dQ0.r(map) : null;
            this.e = mapR == null ? null : b(mapR, i);
            Map mapD = z ? AbstractC3983dQ0.d(map) : null;
            this.f = mapD != null ? a(mapD, i2) : null;
        }

        public static LV a(Map map, int i) {
            int iIntValue = ((Integer) AbstractC7785qy0.o(AbstractC3983dQ0.h(map), "maxAttempts cannot be empty")).intValue();
            AbstractC7785qy0.h(iIntValue >= 2, "maxAttempts must be greater than 1: %s", iIntValue);
            int iMin = Math.min(iIntValue, i);
            long jLongValue = ((Long) AbstractC7785qy0.o(AbstractC3983dQ0.c(map), "hedgingDelay cannot be empty")).longValue();
            AbstractC7785qy0.i(jLongValue >= 0, "hedgingDelay must not be negative: %s", jLongValue);
            return new LV(iMin, jLongValue, AbstractC3983dQ0.p(map));
        }

        public static C6485mJ0 b(Map map, int i) {
            int iIntValue = ((Integer) AbstractC7785qy0.o(AbstractC3983dQ0.i(map), "maxAttempts cannot be empty")).intValue();
            AbstractC7785qy0.h(iIntValue >= 2, "maxAttempts must be greater than 1: %s", iIntValue);
            int iMin = Math.min(iIntValue, i);
            long jLongValue = ((Long) AbstractC7785qy0.o(AbstractC3983dQ0.e(map), "initialBackoff cannot be empty")).longValue();
            AbstractC7785qy0.i(jLongValue > 0, "initialBackoffNanos must be greater than 0: %s", jLongValue);
            long jLongValue2 = ((Long) AbstractC7785qy0.o(AbstractC3983dQ0.j(map), "maxBackoff cannot be empty")).longValue();
            AbstractC7785qy0.i(jLongValue2 > 0, "maxBackoff must be greater than 0: %s", jLongValue2);
            Double d = (Double) AbstractC7785qy0.o(AbstractC3983dQ0.a(map), "backoffMultiplier cannot be empty");
            double dDoubleValue = d.doubleValue();
            AbstractC7785qy0.j(dDoubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", d);
            Long lQ = AbstractC3983dQ0.q(map);
            AbstractC7785qy0.j(lQ == null || lQ.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", lQ);
            Set setS = AbstractC3983dQ0.s(map);
            AbstractC7785qy0.e((lQ == null && setS.isEmpty()) ? false : true, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            return new C6485mJ0(iMin, jLongValue, jLongValue2, dDoubleValue, lQ, setS);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC8301sp0.a(this.a, bVar.a) && AbstractC8301sp0.a(this.b, bVar.b) && AbstractC8301sp0.a(this.c, bVar.c) && AbstractC8301sp0.a(this.d, bVar.d) && AbstractC8301sp0.a(this.e, bVar.e) && AbstractC8301sp0.a(this.f, bVar.f);
        }

        public int hashCode() {
            return AbstractC8301sp0.b(this.a, this.b, this.c, this.d, this.e, this.f);
        }

        public String toString() {
            return AbstractC6329ll0.b(this).d("timeoutNanos", this.a).d("waitForReady", this.b).d("maxInboundMessageSize", this.c).d("maxOutboundMessageSize", this.d).d("retryPolicy", this.e).d("hedgingPolicy", this.f).toString();
        }
    }

    /* JADX INFO: renamed from: com.daaw.og0$c */
    public static final class c extends AbstractC5278i10 {
        public final C7141og0 b;

        @Override // com.daaw.AbstractC5278i10
        public AbstractC5278i10.b a(AbstractC0304Ac0.f fVar) {
            return AbstractC5278i10.b.d().b(this.b).a();
        }

        public c(C7141og0 c7141og0) {
            this.b = c7141og0;
        }
    }

    public C7141og0(b bVar, Map map, Map map2, AbstractC5636jJ0.C c2, Object obj, Map map3) {
        this.a = bVar;
        this.b = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.c = DesugarCollections.unmodifiableMap(new HashMap(map2));
        this.d = c2;
        this.e = obj;
        this.f = map3 != null ? DesugarCollections.unmodifiableMap(new HashMap(map3)) : null;
    }

    public static C7141og0 a() {
        return new C7141og0(null, new HashMap(), new HashMap(), null, null, null);
    }

    public static C7141og0 b(Map map, boolean z, int i, int i2, Object obj) {
        AbstractC5636jJ0.C cV = z ? AbstractC3983dQ0.v(map) : null;
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        Map mapB = AbstractC3983dQ0.b(map);
        List<Map> listM = AbstractC3983dQ0.m(map);
        if (listM == null) {
            return new C7141og0(null, map2, map3, cV, obj, mapB);
        }
        b bVar = null;
        for (Map map4 : listM) {
            b bVar2 = new b(map4, z, i, i2);
            List<Map> listO = AbstractC3983dQ0.o(map4);
            if (listO != null && !listO.isEmpty()) {
                for (Map map5 : listO) {
                    String strT = AbstractC3983dQ0.t(map5);
                    String strN = AbstractC3983dQ0.n(map5);
                    if (AbstractC7939rY0.a(strT)) {
                        AbstractC7785qy0.j(AbstractC7939rY0.a(strN), "missing service name for method %s", strN);
                        AbstractC7785qy0.j(bVar == null, "Duplicate default method config in service config %s", map);
                        bVar = bVar2;
                    } else if (AbstractC7939rY0.a(strN)) {
                        AbstractC7785qy0.j(!map3.containsKey(strT), "Duplicate service %s", strT);
                        map3.put(strT, bVar2);
                    } else {
                        String strB = C6882nk0.b(strT, strN);
                        AbstractC7785qy0.j(!map2.containsKey(strB), "Duplicate method name %s", strB);
                        map2.put(strB, bVar2);
                    }
                }
            }
        }
        return new C7141og0(bVar, map2, map3, cV, obj, mapB);
    }

    public AbstractC5278i10 c() {
        if (this.c.isEmpty() && this.b.isEmpty() && this.a == null) {
            return null;
        }
        return new c();
    }

    public Map d() {
        return this.f;
    }

    public Object e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7141og0.class == obj.getClass()) {
            C7141og0 c7141og0 = (C7141og0) obj;
            if (AbstractC8301sp0.a(this.a, c7141og0.a) && AbstractC8301sp0.a(this.b, c7141og0.b) && AbstractC8301sp0.a(this.c, c7141og0.c) && AbstractC8301sp0.a(this.d, c7141og0.d) && AbstractC8301sp0.a(this.e, c7141og0.e)) {
                return true;
            }
        }
        return false;
    }

    public b f(C6882nk0 c6882nk0) {
        b bVar = (b) this.b.get(c6882nk0.c());
        if (bVar == null) {
            bVar = (b) this.c.get(c6882nk0.d());
        }
        return bVar == null ? this.a : bVar;
    }

    public AbstractC5636jJ0.C g() {
        return this.d;
    }

    public int hashCode() {
        return AbstractC8301sp0.b(this.a, this.b, this.c, this.d, this.e);
    }

    public String toString() {
        return AbstractC6329ll0.b(this).d("defaultMethodConfig", this.a).d("serviceMethodMap", this.b).d("serviceMap", this.c).d("retryThrottling", this.d).d("loadBalancingConfig", this.e).toString();
    }
}
