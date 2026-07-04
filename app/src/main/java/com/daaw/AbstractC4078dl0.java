package com.daaw;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.dl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4078dl0 {
    public static final Set a(List list) {
        G10.g(list, "modules");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C1863Pa c1863Pa = new C1863Pa(AbstractC2247Sm.P(list));
        while (!c1863Pa.isEmpty()) {
            C2030Qk0 c2030Qk0 = (C2030Qk0) c1863Pa.removeLast();
            if (linkedHashSet.add(c2030Qk0)) {
                for (C2030Qk0 c2030Qk02 : c2030Qk0.b()) {
                    if (!linkedHashSet.contains(c2030Qk02)) {
                        c1863Pa.add(c2030Qk02);
                    }
                }
            }
        }
        return linkedHashSet;
    }

    public static final void b(AbstractC8072s00 abstractC8072s00, String str) throws C9743xy {
        G10.g(abstractC8072s00, "factory");
        G10.g(str, "mapping");
        throw new C9743xy("Already existing definition for " + abstractC8072s00.c() + " at " + str);
    }
}
