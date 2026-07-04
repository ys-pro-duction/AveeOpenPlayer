package com.daaw;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.mz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6672mz extends C7509pz {
    public final List B;

    public C6672mz(List list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.B = list;
    }
}
