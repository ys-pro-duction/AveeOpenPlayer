package com.daaw;

import com.daaw.AbstractC2560Vm0;
import com.daaw.AbstractC5636jJ0;
import com.daaw.C6262lX0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.daaw.dQ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3983dQ0 {

    /* JADX INFO: renamed from: com.daaw.dQ0$a */
    public static final class a {
        public final String a;
        public final Map b;

        public a(String str, Map map) {
            this.a = (String) AbstractC7785qy0.o(str, "policyName");
            this.b = (Map) AbstractC7785qy0.o(map, "rawConfigValue");
        }

        public String a() {
            return this.a;
        }

        public Map b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.a.equals(aVar.a) && this.b.equals(aVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return AbstractC8301sp0.b(this.a, this.b);
        }

        public String toString() {
            return AbstractC6329ll0.b(this).d("policyName", this.a).d("rawConfigValue", this.b).toString();
        }
    }

    /* JADX INFO: renamed from: com.daaw.dQ0$b */
    public static final class b {
        public final AbstractC0408Bc0 a;
        public final Object b;

        public b(AbstractC0408Bc0 abstractC0408Bc0, Object obj) {
            this.a = (AbstractC0408Bc0) AbstractC7785qy0.o(abstractC0408Bc0, "provider");
            this.b = obj;
        }

        public Object a() {
            return this.b;
        }

        public AbstractC0408Bc0 b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (AbstractC8301sp0.a(this.a, bVar.a) && AbstractC8301sp0.a(this.b, bVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return AbstractC8301sp0.b(this.a, this.b);
        }

        public String toString() {
            return AbstractC6329ll0.b(this).d("provider", this.a).d("config", this.b).toString();
        }
    }

    public static List A(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(z((Map) it.next()));
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static Double a(Map map) {
        return AbstractC8650u40.h(map, "backoffMultiplier");
    }

    public static Map b(Map map) {
        if (map == null) {
            return null;
        }
        return AbstractC8650u40.j(map, "healthCheckConfig");
    }

    public static Long c(Map map) {
        return AbstractC8650u40.l(map, "hedgingDelay");
    }

    public static Map d(Map map) {
        return AbstractC8650u40.j(map, "hedgingPolicy");
    }

    public static Long e(Map map) {
        return AbstractC8650u40.l(map, "initialBackoff");
    }

    public static Set f(Map map, String str) {
        List listE = AbstractC8650u40.e(map, str);
        if (listE == null) {
            return null;
        }
        return u(listE);
    }

    public static List g(Map map) {
        String strK;
        ArrayList arrayList = new ArrayList();
        if (map.containsKey("loadBalancingConfig")) {
            arrayList.addAll(AbstractC8650u40.f(map, "loadBalancingConfig"));
        }
        if (arrayList.isEmpty() && (strK = AbstractC8650u40.k(map, "loadBalancingPolicy")) != null) {
            arrayList.add(Collections.singletonMap(strK.toLowerCase(Locale.ROOT), Collections.EMPTY_MAP));
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static Integer h(Map map) {
        return AbstractC8650u40.i(map, "maxAttempts");
    }

    public static Integer i(Map map) {
        return AbstractC8650u40.i(map, "maxAttempts");
    }

    public static Long j(Map map) {
        return AbstractC8650u40.l(map, "maxBackoff");
    }

    public static Integer k(Map map) {
        return AbstractC8650u40.i(map, "maxRequestMessageBytes");
    }

    public static Integer l(Map map) {
        return AbstractC8650u40.i(map, "maxResponseMessageBytes");
    }

    public static List m(Map map) {
        return AbstractC8650u40.f(map, "methodConfig");
    }

    public static String n(Map map) {
        return AbstractC8650u40.k(map, "method");
    }

    public static List o(Map map) {
        return AbstractC8650u40.f(map, "name");
    }

    public static Set p(Map map) {
        Set setF = f(map, "nonFatalStatusCodes");
        if (setF == null) {
            return DesugarCollections.unmodifiableSet(EnumSet.noneOf(C6262lX0.b.class));
        }
        AbstractC9365wd1.a(!setF.contains(C6262lX0.b.OK), "%s must not contain OK", "nonFatalStatusCodes");
        return setF;
    }

    public static Long q(Map map) {
        return AbstractC8650u40.l(map, "perAttemptRecvTimeout");
    }

    public static Map r(Map map) {
        return AbstractC8650u40.j(map, "retryPolicy");
    }

    public static Set s(Map map) {
        Set setF = f(map, "retryableStatusCodes");
        AbstractC9365wd1.a(setF != null, "%s is required in retry policy", "retryableStatusCodes");
        AbstractC9365wd1.a(true ^ setF.contains(C6262lX0.b.OK), "%s must not contain OK", "retryableStatusCodes");
        return setF;
    }

    public static String t(Map map) {
        return AbstractC8650u40.k(map, "service");
    }

    public static Set u(List list) {
        C6262lX0.b bVarValueOf;
        EnumSet enumSetNoneOf = EnumSet.noneOf(C6262lX0.b.class);
        for (Object obj : list) {
            if (obj instanceof Double) {
                Double d = (Double) obj;
                int iIntValue = d.intValue();
                AbstractC9365wd1.a(((double) iIntValue) == d.doubleValue(), "Status code %s is not integral", obj);
                bVarValueOf = C6262lX0.h(iIntValue).m();
                AbstractC9365wd1.a(bVarValueOf.g() == d.intValue(), "Status code %s is not valid", obj);
            } else {
                if (!(obj instanceof String)) {
                    throw new C9644xd1("Can not convert status code " + obj + " to Status.Code, because its type is " + obj.getClass());
                }
                try {
                    bVarValueOf = C6262lX0.b.valueOf((String) obj);
                } catch (IllegalArgumentException e) {
                    throw new C9644xd1("Status code " + obj + " is not valid", e);
                }
            }
            enumSetNoneOf.add(bVarValueOf);
        }
        return DesugarCollections.unmodifiableSet(enumSetNoneOf);
    }

    public static AbstractC5636jJ0.C v(Map map) {
        Map mapJ;
        if (map == null || (mapJ = AbstractC8650u40.j(map, "retryThrottling")) == null) {
            return null;
        }
        float fFloatValue = AbstractC8650u40.h(mapJ, "maxTokens").floatValue();
        float fFloatValue2 = AbstractC8650u40.h(mapJ, "tokenRatio").floatValue();
        AbstractC7785qy0.u(fFloatValue > 0.0f, "maxToken should be greater than zero");
        AbstractC7785qy0.u(fFloatValue2 > 0.0f, "tokenRatio should be greater than zero");
        return new AbstractC5636jJ0.C(fFloatValue, fFloatValue2);
    }

    public static Long w(Map map) {
        return AbstractC8650u40.l(map, "timeout");
    }

    public static Boolean x(Map map) {
        return AbstractC8650u40.d(map, "waitForReady");
    }

    public static AbstractC2560Vm0.b y(List list, C0512Cc0 c0512Cc0) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            String strA = aVar.a();
            AbstractC0408Bc0 abstractC0408Bc0D = c0512Cc0.d(strA);
            if (abstractC0408Bc0D != null) {
                if (!arrayList.isEmpty()) {
                    Logger.getLogger(AbstractC3983dQ0.class.getName()).log(Level.FINEST, "{0} specified by Service Config are not available", arrayList);
                }
                AbstractC2560Vm0.b bVarE = abstractC0408Bc0D.e(aVar.b());
                return bVarE.d() != null ? bVarE : AbstractC2560Vm0.b.a(new b(abstractC0408Bc0D, bVarE.c()));
            }
            arrayList.add(strA);
        }
        return AbstractC2560Vm0.b.b(C6262lX0.h.q("None of " + arrayList + " specified by Service Config are available."));
    }

    public static a z(Map map) {
        if (map.size() == 1) {
            String str = (String) ((Map.Entry) map.entrySet().iterator().next()).getKey();
            return new a(str, AbstractC8650u40.j(map, str));
        }
        throw new RuntimeException("There are " + map.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + map);
    }
}
