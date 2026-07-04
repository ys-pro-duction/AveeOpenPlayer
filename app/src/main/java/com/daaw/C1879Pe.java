package com.daaw;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Pe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1879Pe implements InterfaceC1157If0 {
    public final C6415m31 a = new C6415m31();
    public final InheritableThreadLocal b = new a();

    /* JADX INFO: renamed from: com.daaw.Pe$a */
    public class a extends InheritableThreadLocal {
        public a() {
        }

        @Override // java.lang.InheritableThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map childValue(Map map) {
            if (map == null) {
                return null;
            }
            return new HashMap(map);
        }
    }
}
