package com.daaw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class UI0 extends AbstractC0840Fe {
    public static final UI0 C = new UI0(Collections.EMPTY_LIST);

    public UI0(List list) {
        super(list);
    }

    public static UI0 t(List list) {
        return list.isEmpty() ? C : new UI0(list);
    }

    public static UI0 u(String str) {
        if (str.contains("//")) {
            throw new IllegalArgumentException("Invalid path (" + str + "). Paths must not contain // in them.");
        }
        String[] strArrSplit = str.split("/");
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str2 : strArrSplit) {
            if (!str2.isEmpty()) {
                arrayList.add(str2);
            }
        }
        return new UI0(arrayList);
    }

    @Override // com.daaw.AbstractC0840Fe
    public String g() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.B.size(); i++) {
            if (i > 0) {
                sb.append("/");
            }
            sb.append((String) this.B.get(i));
        }
        return sb.toString();
    }

    @Override // com.daaw.AbstractC0840Fe
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public UI0 k(List list) {
        return new UI0(list);
    }
}
