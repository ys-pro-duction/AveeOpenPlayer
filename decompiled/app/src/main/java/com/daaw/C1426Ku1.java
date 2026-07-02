package com.daaw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Ku1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1426Ku1 extends AbstractC8327su1 {
    public static List a(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new C2171Rt1((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }
}
