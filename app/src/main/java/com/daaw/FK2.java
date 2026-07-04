package com.daaw;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FK2 extends GK2 {
    public final HashSet c;
    public final JSONObject d;
    public final long e;

    public FK2(C9008vK2 c9008vK2, HashSet hashSet, JSONObject jSONObject, long j) {
        super(c9008vK2);
        this.c = new HashSet(hashSet);
        this.d = jSONObject;
        this.e = j;
    }
}
