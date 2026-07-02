package com.daaw;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.daaw.wI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9276wI {
    public static Executor a() {
        return new HM0(Executors.newSingleThreadExecutor());
    }
}
